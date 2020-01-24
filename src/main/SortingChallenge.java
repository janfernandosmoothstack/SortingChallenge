package main;

public class SortingChallenge {
	static int result = 0;

	public static void main(String[] args) {
		String[] names = {"Adams", "Quincy", "Washington", "Allison", "Jones", "Ward", 
				"Johnson", "Barnes", "Calvin", "Zigler", "Ball"};
		
		String temp;
		int idx = 0;
		
		for (int i = 0; i < names.length; i++) {
			
			for(int j = i + 1; j < names.length; j++) {
				int charIdx = 0;
				
				check(names[i], names[j], charIdx);
				
				if (result == 1) {
					temp = names[i];
					names[i] = names[j];
					names[j] = temp;
				} 
			}
		}
		
        System.out.println("Names in Sorted Order:");
        for (int i = 0; i < names.length; i++) 
        {
            System.out.println(names[i]);
        }
        
        for (int i = 0; i < names.length; i++) {
        	if (names[i].charAt(0) == 'W') {
        		idx = i;
        		break;
        	}
        }
        
        System.out.println();
        System.out.println("The index of the name with W");
        System.out.println(idx);
	}
	
	public static int check(String name1, String name2, int idx) {
		char char1 = name1.charAt(idx);
		char char2 = name2.charAt(idx);
		result = 0;
		
		if (char1 > char2) {
			result = 1;
		} else if (char1 == char2) {
			check(name1, name2, idx + 1);
		}
		
		return result;
	}
}
