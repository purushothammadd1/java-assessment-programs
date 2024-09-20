package com.module1.oops.gameMultiplayer;

import java.util.ArrayList;
import java.util.List;

public class Lanucher {
	public static void main(String[] args) {
		List<String> playerNames = new ArrayList<>();
		playerNames.add("Rahul");
		playerNames.add("Neha");
		playerNames.add("Rohan");
		playerNames.add("Sachin");
		playerNames.add("Amit");
		playerNames.add("Nikita");
		Game g =new Game(playerNames);
		g.play();
	}

}
