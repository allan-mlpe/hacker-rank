package roockie_ranking_2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.Vector;


public class MigratoryBirds {
	public static void main(String[] args) {
		
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			br.readLine();
			
			String[] birdTypes = br.readLine().split(" ");
			List<String> auxList = Arrays.asList(birdTypes);
			List<String> typesList = new Vector<String>(auxList);
			Set<String> typesSet = new HashSet<String>(auxList);
			
			int mostCommomType = Integer.parseInt(birdTypes[0]);
			int occurencesOfMostCommomType = 1;
			
			Iterator<String> it = typesSet.iterator();
			
			while(it.hasNext()) {
				String currentType = it.next();
				int occurences = 0;
				for (int i = 0; i < typesList.size(); i++) {
					if(currentType.equals(typesList.get(i))) occurences++;
				}
				
				if(occurences >= occurencesOfMostCommomType) {
					int aux = Integer.parseInt(currentType);
					if(occurences == occurencesOfMostCommomType) {
						mostCommomType = Math.min(aux, mostCommomType);
					} else {
						mostCommomType = aux;
						occurencesOfMostCommomType = occurences;
					}
					
				}
				
				typesList.removeIf(currentType::equals);
			}
			
			System.out.println(mostCommomType);
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
