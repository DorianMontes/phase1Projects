package increasing;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import java.util.ArrayList;

class LongestIncreasing {
	

	public static void main(String[] args) {

		int n = 100; 
		SequenceGenerator sg = new SequenceGenerator(n);
		ArrayList<Integer> sequence = sg.GenerateSequence();
		
		
		ArrayList<Integer> longestArrayList = new ArrayList<Integer>();
		ArrayList<Integer> currentArrayList = new ArrayList<Integer>();
		
		int i=0;
		
		int current = sequence.get(i);
		longestArrayList.add(current);
		currentArrayList.add(current);
		
		while(i<n) {
			if(i+1 < sequence.size()){
				if(sequence.get(i) < sequence.get(i+1)) {
					currentArrayList.add(sequence.get(i+1));
					if(currentArrayList.size() > longestArrayList.size()){
						longestArrayList.clear();
						longestArrayList.addAll(currentArrayList);
					}
				} else {
					currentArrayList.clear();
					currentArrayList.add(sequence.get(i+1));
				}
			}
			i++;
		}
		System.out.println("\n");
		for(int k : longestArrayList){
			System.out.println(k);
		}
		

	}
}

