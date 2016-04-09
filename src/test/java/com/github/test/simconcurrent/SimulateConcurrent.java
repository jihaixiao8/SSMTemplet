package com.github.test.simconcurrent;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SimulateConcurrent {
	
	private static int THREAD_COUNT = 500;
	
	static Map<String, String> map = new HashMap<String, String>();
	
	public static void main(String[] args) {
		CyclicBarrier barrier = new CyclicBarrier(THREAD_COUNT);
		ExecutorService executor = Executors.newFixedThreadPool(THREAD_COUNT);
        for(int i=1;i<THREAD_COUNT+1;i++){
       	 executor.submit(new Thread(new Runner(barrier, i+"号选手")));  
       }
       executor.shutdown();
	}
	
	static class Runner implements Runnable{
		
		//一个同步辅助类，它允许一组线程互相等待，直到到达某个公共屏障点 (common barrier point)
		private CyclicBarrier barrier;
		
		private String name;
		
		public Runner(CyclicBarrier barrier,String name){
			super();
			this.barrier = barrier;
			this.name = name;
		}

		@Override
		public void run() {
			System.out.println(name + " 准备好了...");
			// barrier的await方法，在所有参与者都已经在此 barrier 上调用 await 方法之前，将一直等待。
			try {
				barrier.await();
			} catch (InterruptedException | BrokenBarrierException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			Date now = new Date();
    		long pretime = now.getTime();
    		//TODO 此处添加想要测并发的代码
    		map.put("1", "2");
    		now = new Date();
     		long endtime = now.getTime();
 	        System.out.println(name + " 起跑！"+ pretime + ","+ endtime);
		}
		
	}
}
