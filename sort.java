/*
用Java编写一个能对数组比较的程序，需要输出按行升序排序的结果 如输入
1 2 5 4 8
输出：
1 2 4 5 8
要求：数组是通过sort程序的参数输入。
*/                                 
   import java.util.Arrays;                                        
   public class sort{                                              
	 public static void main(String[] args){                      
		                                                            
		 int[] sorted = new int[args.length];                       
		                                                            
		 //String数组转int数组                                       
                                                 
		 for(int i=0;i<args.length;i++){                                     
			   sorted[i] = Integer.parseInt(args[i]);  
     }
		 
		
		 //冒泡排序                                                 
		 for(int i = 0; i < sorted.length-1; i++){                      
			 for(int j = 0; j < sorted.length-1-i; j++){              
				 if(sorted[j] > sorted[j+1]){                           
					 int temp = sorted[j];                                
					 sorted[j] = sorted[j+1];                             
					 sorted[j+1] = temp;                                  
				 }                                                      
			 }                                                        
		 }                                                          
	 	
	 	 for(int i=0;i<sorted.length;i++){                                                           
		   System.out.print(sorted[i]);
		}                                                  
	}                                                             
}                                                               