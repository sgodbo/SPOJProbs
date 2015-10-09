package com.shan.spoj;

import java.util.*;

public class PiggyBank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		HashMap<Integer,Integer> coinMultipliers = new HashMap<Integer,Integer>();
		int problems = in.nextInt();
		while(problems != 0){
			String[] startingAndEndingWeights = in.nextLine().split(" ");
			int totalCoinsWeight = Integer.parseInt(startingAndEndingWeights[1]) - Integer.parseInt(startingAndEndingWeights[0]);
			int typeOfCoins = in.nextInt();
			while(typeOfCoins != 0){
				String[] valueAndIndvidualWeights = in.nextLine().split(" ");
				coinMultipliers.put(Integer.parseInt(valueAndIndvidualWeights[0]), Integer.parseInt(valueAndIndvidualWeights[1]));
				--typeOfCoins;
			}
			
			--problems;
		}
	}

}
