package week1.assignment1;

public class RemoveDuplicates {

	public static void main(String[] args) {
		String str= "We learn java basics as part of java sessions in java week1";
		
		int count=0;
		
		String[] str1=str.split(" ");
		
		for(int i=0;i<str1.length;i++) 
		{
			for(int j=0;j<str1.length;j++)
			{
				if(str1[i].equals(str1[j])) 
				{
					count++;
				}
				
			}
				if(count>1) 
				{
					
					str=str.replace(str1[i]," ");
				}
				count=0;
			}
		
			System.out.println(str);
			
				}
	
			}
			
		
	


