package com.github.demo.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.github.demo.dao.HeroMapper;
import com.github.demo.service.HeroService;
import com.github.demo.vo.Hero;

@Service
public class HeroServiceImpl implements HeroService{
	
	@Resource
	private HeroMapper heroMapper;

	public List<Hero> getHeroInformation(Hero hero) {
		return heroMapper.getHeroInformation(hero);
	}
	

	
}
