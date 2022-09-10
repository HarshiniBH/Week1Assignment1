package week1.assignment1;

public class ReverseEvenWords {

	public static void main(String[] args) {
		
		String test="I am a software tester";
		String[] str=test.split(" ");
		for(int i=0;i<str.length;i++)
		{
			if(i%2!=0)
			{
				char[] rev=str[i].toCharArray();
				for(int j=rev.length-1;j>=0;j--)
				{
					System.out.print(rev[j]);
				}
			}
				else
				{
					System.out.print(" "+str[i]+" ");
				}
				
			}
		}

	}


