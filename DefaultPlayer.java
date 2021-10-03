package exercise_1;

import java.util.Random;

public class DefaultPlayer extends Player {
	
	public DefaultPlayer() {
		
	}
	
	public DefaultPlayer(String name) {
		super(name);
	}
	
	public void rollDice(Dice a) {
		Random rand = new Random();
		double prob;
		int x = 0;
		prob = rand.nextDouble();
		//System.out.println(prob);
		if(prob < a.getProbability(0)) x=1;
		for(int i =0; i<5;i++) {
			if(prob > a.getProbability(i) && prob < a.getProbability(i+1))
				x = i+2;
		}
		System.out.println(this.getName() + " get " + x + " points");
		System.out.println();
		this.setPoint(this.getPoint() + x);
	}
	
	public void frustrate() {
		Random rand = new Random();
		int i = rand.nextInt(7);
			switch(i) {
				case 0: System.out.println(this.getName() +":Ta da thua tam phuc khau phuc"); break;
				case 1: System.out.println(this.getName() +":Nhat dinh ta se phuc thu vao lan sau"); break;
				case 2: System.out.println(this.getName() +":Phong do la nhat thoi, dang cap la mai mai"); break;
				case 3: System.out.println(this.getName() +":Cam on vi mot tran dau tuyet voi!"); break;
				case 4: System.out.println(this.getName() +":Chi la an may thoi"); break;
				case 5: System.out.println(this.getName() +":Lan toi mi se khong may man nhu the dau"); break;
				case 6: System.out.println(this.getName() +":Khong the tin ta lai thua mi"); break;
				default: System.out.println(this.getName() +":Ta thua roi, Hu hu :< ");
			}
	}
}
