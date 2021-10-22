package com.revature.model;

public class ActionFigure extends Doll {
private  String skill;
public ActionFigure() {
	this.eyeColor = "blue";
	this.skill= "arrow shooting";
	this.name = "Oliver Queen";
}

public String getSkill() {
	return skill;
}

public void setSkill(String skill) {
	this.skill = skill;
}

public ActionFigure( String name, String eyeColor,String skill) {
	this.skill = skill;
	this.eyeColor =  eyeColor;
	this.name = name;
}

public void useSkill() {
	System.out.println("Ka Pow! I'm using my skill, " + this.skill);
}
}
