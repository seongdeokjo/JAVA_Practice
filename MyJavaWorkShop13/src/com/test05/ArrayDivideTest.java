package com.test05;
import java.util.*;

import com.test05.CustomerException;
public class ArrayDivideTest {

	public static void main(String[] args) {

		ArrayList arrayOne = new ArrayList();
		arrayOne.add(10);
		arrayOne.add(20);
		arrayOne.add(13);
		arrayOne.add(25);
		ArrayList arrayTwo = new ArrayList();
		arrayTwo.add(2);
		arrayTwo.add(5);
		arrayTwo.add(0);
		arrayTwo.add(3);
		arrayTwo.add(1);
		arrayTwo.add(7);
		if(arrayOne.size() < arrayTwo.size()) {
			
			for(int i=0; i <arrayTwo.size(); i++) {
				for(int j = 0; j<arrayTwo.size();j++ ) {
					if(i == j) {
				 	Iterator itr = arrayOne.iterator();
				 	Iterator itr1 = arrayTwo.iterator();
				 	while(itr.hasNext()) {
				 		System.out.println(itr.next());
				 		
				 	}
				 	while(itr1.hasNext()) {
				 		itr1.next();
				 		System.out.println(itr1.g);
				 	}
				 	
				 
				}
					
					
				
			}
		}
		}	
//			System.out.println(num1);
//		}
		
		
		
	
				
		
		
//		try {
			
			
			
			
			
			
			
			
//		}catch(CustomerException e) {
			
//		}
	}

}
