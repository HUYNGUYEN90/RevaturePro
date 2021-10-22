package com.revature.test;
import com.revature.model.Doll;
import com.revature.model.ActionFigure;
public class playWithToys {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Doll doll = new Doll("Annabelle","blue");
	      System.out.println("Our doll "+doll.getName()
	                    +" has "+doll.getEyeColor()+" eyes.");
	      doll.play();
	      doll.makeTalk();
		
		ActionFigure newdoll = new ActionFigure("Barry Allan","blue","speed");
		System.out.println("Our action figure"+ newdoll.getName()+" has " + newdoll.getEyeColor() + " eyes and " + newdoll.getSkill() +"skill");
		newdoll.play();
		newdoll.makeTalk();
		newdoll.useSkill();
		
	}

}
