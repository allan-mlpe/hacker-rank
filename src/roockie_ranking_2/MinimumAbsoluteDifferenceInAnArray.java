package roockie_ranking_2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.Vector;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MinimumAbsoluteDifferenceInAnArray {
	
	static Integer[] arr = null;
	static Integer n = null;
	static Integer index = 0;
	static Integer minimumDifference = Integer.MAX_VALUE;
	
	synchronized static Integer getIndex() {
		return index++;
	}
	
	static class ThreadAux implements Runnable {

		@Override
		public void run() {
			int startIndex;
			while((startIndex = getIndex()) < arr.length) {
				int x = arr[startIndex];
				for (int i = startIndex+1; i < arr.length; i++) {
					int y = arr[i];
					int r = Math.abs(x-y);
					if(r < minimumDifference) {
						minimumDifference = r;
						if(minimumDifference == 1) break;
					}
				}
				if(minimumDifference == 1) break;
			}
		}
	}

	public static void main(String[] args) {
		
			try {
				BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				int aux = Integer.parseInt(br.readLine());
				StringTokenizer st = new StringTokenizer(br.readLine(), " ");
				
				Vector<Integer> arrAux = new Vector<Integer>();
				while (st.hasMoreTokens()) {
					int a = Integer.parseInt(st.nextToken());
					arrAux.add(a);
				}
				
				arr = arrAux.toArray(new Integer[aux]);
			} catch(Exception e) {
				e.printStackTrace();
			}
	        
	        Set<Integer> set = new HashSet<Integer>(Arrays.asList(arr));
	        
	        if(set.size() < arr.length) {
	        	System.out.println(0);
	        	
	        } else {
				/*int minimumAbsoluteDifference = Integer.MAX_VALUE;
				for (int i = 0; i < arr.length-1; i++) {
					int x = arr[i];
					for (int j = i+1; j < arr.length; j++) {
						int y = arr[j];
						int partialResult = Math.abs(x-y);
						if(partialResult < minimumAbsoluteDifference) {
							minimumAbsoluteDifference = partialResult;
							if (minimumAbsoluteDifference == 1)break;
						}
					}
					if(minimumAbsoluteDifference == 1) break;
				}*/
	        	
	        	ThreadAux t1 = new ThreadAux();
	        	ThreadAux t2 = new ThreadAux();
	        	ThreadAux t3 = new ThreadAux();
	        	ThreadAux t4 = new ThreadAux();
	        	ThreadAux t5 = new ThreadAux();
	        	
	        	ExecutorService es = Executors.newFixedThreadPool(5);
	        	es.execute(t1);
	        	es.execute(t2);
	        	es.execute(t3);
	        	es.execute(t4);
	        	es.execute(t5);
	        	
	        	es.shutdown();
		
				System.out.println(minimumDifference);
	        }
	}
}
