package com.github.demo.action;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.github.demo.service.HeroService;
import com.github.demo.vo.Hero;

@Controller
public class HeroController {

	@Resource
	private HeroService heroServcie;
	
	/**
	 * 查询所有Dota2 Hero的资料 
	 * @return
	 * @throws UnsupportedEncodingException 
	 */
	@RequestMapping(value = "/heroinformation")
	public ModelAndView getHeroInformation(Hero hero) throws UnsupportedEncodingException{
		ModelAndView mv = new ModelAndView();
//		Map<String, Object> map = new HashMap<String, Object>();
//		String str1 = hero.getHeroAttribute();
//		String str2 = new String(hero.getHeroOrientation().getBytes("iso-8859-1"),"UTF-8");
//		System.out.println(str1+"__________"+str2);
		List<Hero> listHeros = new ArrayList<Hero>();
		listHeros = heroServcie.getHeroInformation(hero);
		mv.addObject("listHeros", listHeros);
		mv.setViewName("/hero/herolist");
		return mv;
		
	}
	
}
