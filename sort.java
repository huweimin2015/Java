/*
��Java��дһ���ܶ�����Ƚϵĳ�����Ҫ���������������Ľ�� ������
1 2 5 4 8
�����
1 2 4 5 8
Ҫ��������ͨ��sort����Ĳ������롣
*/                                 
   import java.util.Arrays;                                        
   public class sort{                                              
	 public static void main(String[] args){                      
		                                                            
		 int[] sorted = new int[args.length];                       
		                                                            
		 //String����תint����                                       
                                                 
		 for(int i=0;i<args.length;i++){                                     
			   sorted[i] = Integer.parseInt(args[i]);  
     }
		 
		
		 //ð������                                                 
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