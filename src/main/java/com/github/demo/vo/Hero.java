package com.github.demo.vo;

/**
 * 英雄的基本信息
 * @author yangxitong
 *
 */
public class Hero {
	//id
	private int id;
	//英雄名字
	private String heroName;
	//英雄技能
	private String heroSkills;
	//技能加点
	private String skillPlusPoint;
	//英雄出装
	private String heroOutOfThePack;
	//英雄故事
	private String heroLegendStory;
	//英雄位置
	private String heroOrientation;
	//英雄属性
	private String heroAttribute;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getHeroName() {
		return heroName;
	}
	public void setHeroName(String heroName) {
		this.heroName = heroName;
	}
	public String getHeroSkills() {
		return heroSkills;
	}
	public void setHeroSkills(String heroSkills) {
		this.heroSkills = heroSkills;
	}
	public String getSkillPlusPoint() {
		return skillPlusPoint;
	}
	public void setSkillPlusPoint(String skillPlusPoint) {
		this.skillPlusPoint = skillPlusPoint;
	}
	public String getHeroOutOfThePack() {
		return heroOutOfThePack;
	}
	public void setHeroOutOfThePack(String heroOutOfThePack) {
		this.heroOutOfThePack = heroOutOfThePack;
	}
	public String getHeroLegendStory() {
		return heroLegendStory;
	}
	public void setHeroLegendStory(String heroLegendStory) {
		this.heroLegendStory = heroLegendStory;
	}
	public String getHeroOrientation() {
		return heroOrientation;
	}
	public void setHeroOrientation(String heroOrientation) {
		this.heroOrientation = heroOrientation;
	}
	public String getHeroAttribute() {
		return heroAttribute;
	}
	public void setHeroAttribute(String heroAttribute) {
		this.heroAttribute = heroAttribute;
	}
	@Override
	public String toString() {
		return "Hero [id=" + id + ", heroName=" + heroName + ", heroSkills=" + heroSkills + ", skillPlusPoint="
				+ skillPlusPoint + ", heroOutOfThePack=" + heroOutOfThePack + ", heroLegendStory=" + heroLegendStory
				+ ", heroOrientation=" + heroOrientation + ", heroAttribute=" + heroAttribute + ", getId()=" + getId()
				+ ", getHeroName()=" + getHeroName() + ", getHeroSkills()=" + getHeroSkills() + ", getSkillPlusPoint()="
				+ getSkillPlusPoint() + ", getHeroOutOfThePack()=" + getHeroOutOfThePack() + ", getHeroLegendStory()="
				+ getHeroLegendStory() + ", getHeroOrientation()=" + getHeroOrientation() + ", getHeroAttribute()="
				+ getHeroAttribute() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	
}
