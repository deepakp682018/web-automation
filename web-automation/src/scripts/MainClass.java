package scripts;

import java.util.HashSet;

public class MainClass {
	
	public static void main(String[] args) {
		
		String[] strarray = {"java", "jsp", "php", "react", "java"};
		
		HashSet<String> set = new HashSet<String>();
		
		for(String arryelement : strarray){
			if(!set.add(arryelement)){
				System.out.println("Duplicate array is " +arryelement);
			}
		}
		
		
		
		
	}

}
