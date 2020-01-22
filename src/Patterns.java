
public class Patterns {

	public static void main(String[] args) {
		
		
		/*Logic to print patterns
		1: First figure out how many rows to be printed.
		2: Next figure out what has to be done on each row
		3: So one loop is required for specifying number of columns to be printed in each row.
		*/
		
	//Pattern 1	
	/* a)  #                                        b)     # 
	  	   # #                                           # #      
           # # #                 Or                    # # #        
           # # # #                                   # # # #                 
           # # # # #                               # # # # #                   
        
        //Pattern 2
         
        * * * * * * * * * *
        * * * * * * * * * *
        * * * * * * * * * *
        * * * * * * * * * *
        * * * * * * * * * *
        * * * * * * * * * *
        * * * * * * * * * *
        * * * * * * * * * *
        * * * * * * * * * *
        * * * * * * * * * *
  
     */
		//Pattern 2 code 
		
//		for(int j=1;j<=10;j++) {
//			
//			for(int i=1;i<=10;i++) {
//				System.out.print(" * ");
//				
//			}
//			System.out.println();
//		}
		
		//Pattern 1 a)
		
//		for(int rows=1;rows<=5;rows++) {
//			for(int columns=1;columns<=rows;columns++) {
//				System.out.print(" * ");	
//			}
//			System.out.println();
//		}
		
//		for(int rows=1;rows<=5;rows++) {
//			for(int columns=5;columns>=rows;columns--) {
//				System.out.print(" * ");
//			}
//			System.out.println();
//		}
		
		//Code for pattern 1b
	/*	for(int rows=1;rows<=5;rows++) {
			
			for(int spaces=1;spaces<=5-rows;spaces++) {
				System.out.print(" ");
			}
			for(int columns=1;columns<=rows;columns++) {
				System.out.print("*");
				//System.out.print(" ");//If i remove this it will become a left triangle otherwise it will become a pyramid
			}
			System.out.println();
					}
		System.out.println(); */
		
		//Diamond Pattern
		
	/*	for(int rows=1;rows<=5;rows++) {
			for(int spaces=1;spaces<=5-rows;spaces++) {
				System.out.print(" ");//Space
			}
			for(int columns=1;columns<=(2*rows-1);columns++) {
				
					System.out.print("*");			
			}
			System.out.println();
		}
			//System.out.println();
	        	
	 		for(int rows2=4;rows2>=1;rows2--) {
				for(int spaces2=4;spaces2>=rows2;spaces2--) {
					System.out.print(" ");//Space
				}
				for(int columns2=1;columns2<=2*rows2-1;columns2++) {
					System.out.print("*");
				}
				System.out.println();
			} */
		
		for(int rows=1;rows<=5;rows++) {
		       for(int spaces=1;spaces<=rows-1;spaces++) {
		    	   System.out.print(" ");
		       }
		       for(int columns=1;columns<=1;columns++) {
                    System.out.print("*");		    	   
		       }
		       System.out.println();
		}
		for(int rows=1;rows<=5;rows++) {
			for(int spaces=4;spaces>=rows;spaces--) {
				System.out.print(" ");
			}
			for(int columns=1;columns<=1;columns++) {
				System.out.print("#");
			}
			System.out.println();
		}
	
	/*	1
		01
		101
		0101  */
		
		for(int i=1;i<=4;i++){
		    for(int j=1;j<=i;j++){
		        if((i+j)%2==0){
		           System.out.print("1"); 
		        }else{
		            System.out.print("0");
		        }
		    }
		    System.out.println();
		}
}
}


