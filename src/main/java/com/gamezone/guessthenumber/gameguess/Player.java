package com.gamezone.guessthenumber.gameguess;

public class Player {
	int number = 0;
	public void guess () {
		number = (int) (Math.random()* 11);
	}

}
