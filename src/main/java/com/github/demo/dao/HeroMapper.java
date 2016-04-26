package com.github.demo.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.github.demo.vo.Hero;

public interface HeroMapper {
	
	//根据条件查询hero
	public List<Hero> getHeroInformation(@Param("hero") Hero hero);
	
}
