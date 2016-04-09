package com.github.demo.util;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.http.HttpEntity;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;



public class HttpClientUtil {
	
		private static int SOTIMEOUT = 50000;
		private static int CONNECTTIMEOUT = 3000;
		
		public static String sendPost(String url,Map<String,String> paramsMap,String encode,int sotimeout,int connecttimeout) {
			String content  = null;
			CloseableHttpClient httpClient = HttpClients.createDefault();
			try{
				HttpPost httpPost = new HttpPost(url);
				RequestConfig requestConfig = RequestConfig.custom().setSocketTimeout(sotimeout).setConnectTimeout(connecttimeout).build();
				httpPost.setConfig(requestConfig);
				
				if(null!=paramsMap){
					List<BasicNameValuePair> postData = new ArrayList<BasicNameValuePair>();  
		            for (Map.Entry<String, String> entry : paramsMap.entrySet()) {  
		                postData.add(new BasicNameValuePair(entry.getKey(),  
		                        entry.getValue()));  
		            }  
		            UrlEncodedFormEntity entitys = new UrlEncodedFormEntity(postData, encode); 
		            httpPost.setEntity(entitys); 
				}
				CloseableHttpResponse response = httpClient.execute(httpPost);
				
				int status = response.getStatusLine().getStatusCode();
				if(200!=status){
					throw new RuntimeException("http response error，http status:"+status);
				}
				HttpEntity entity = response.getEntity();
				byte[] contentBytes = EntityUtils.toByteArray(entity);
				content = new String(contentBytes,encode);
	            try {
	                EntityUtils.consume(response.getEntity());
	            } finally {
	                response.close();
	            }
			}catch (Exception e){
				throw new RuntimeException(e.getMessage());
			}finally{
				try {
					httpClient.close();
				} catch (IOException e) {
					throw new RuntimeException(e.getMessage());
				}
			}
			return content;
		}
		
		public static String sendGet(String url,String encode,int sotimeout,int connecttimeout) {
			String content  = null;
			CloseableHttpClient httpClient = HttpClients.createDefault();
			try{
				HttpGet httpGet = new HttpGet(url);
				RequestConfig requestConfig = RequestConfig.custom().setSocketTimeout(sotimeout).setConnectTimeout(connecttimeout).build();
				httpGet.setConfig(requestConfig);
				
				CloseableHttpResponse response = httpClient.execute(httpGet);
				
				int status = response.getStatusLine().getStatusCode();
				if(200!=status){
					throw new RuntimeException("http response error，http status:"+status);
				}
				HttpEntity entity = response.getEntity();
				byte[] contentBytes = EntityUtils.toByteArray(entity);
				content = new String(contentBytes,encode);
	            try {
	                EntityUtils.consume(response.getEntity());
	            } finally {
	                response.close();
	            }
			}catch (Exception e){
				throw new RuntimeException(e.getMessage());
			}finally{
				try {
					httpClient.close();
				} catch (IOException e) {
					throw new RuntimeException(e.getMessage());
				}
			}
			return content;
		}
	
	    /**
	     * http post
	     * @param url
	     * @param paramsMap
	     * @param encode
	     * @return
	     */
		public static String sendPost(String url,Map<String,String> paramsMap,String encode) {
			 return sendPost(url,paramsMap,encode,SOTIMEOUT,CONNECTTIMEOUT);
		}
		
		/**
	     * http post
	     * @param url
	     * @param paramsMap
	     * @param encode
	     * @return
	     */
		public static String sendGet(String url,String encode) {
			 return sendGet(url,encode,SOTIMEOUT,CONNECTTIMEOUT);
		}
}
