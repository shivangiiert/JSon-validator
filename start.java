import java.io.*;
public class start 
{
	static String a;
	static int k=0;
	static int i=-1;
	static char ch;
	public static void main(String args[])throws IOException
	{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		 a=br.readLine();
		
		 
		 a=a.replaceAll("\\s","");
		 
		k=value();
		if(k==1)
			System.out.println("VALID");
		else 
			System.out.println("NOT VALID");
		
	}
	static int value()
	{
		k=0;
//		System.out.println(ch);
		if(function()==1)
		{
			switch(ch)
			{
			case '{':
				k=object();
				break;
			case '"':
				k=string();
				break;
			case '[':
				k=array();
				break;
			case 't':
			case 'f':
				k=bool();
				break;
			case '0':
			case '1':
			case '2':
			case '3':
			case '4':
			case '5':
			case '6':
			case '7':
			case '8':
			case '9':
				k=number();
				break;
			default:
				k=0;
				
			}
		}
		return k;
	}
	static int object()
	{
		k=0;
		k=property(); 
		
		while(function()==1 )
		{
			
			if(a.charAt(i)==',')
			{
			k=property();
			if(k==0)
				break;
			}
			else
				break;
				
		}
		
		if(k==1 && a.charAt(i)=='}')
			k=1;
		else
			k=0;
		
		return k;
	}
	static int  property()
	{
		
		if(function()==1) {
		k=string();
		if(k==1)
		{
			
			
			
			if(function()==1)
			{
				
				if(a.charAt(i)==':')
				{
					
					k=value();
					
					
					
				}
				else
					k=0;
			}
				
			
		}
		}
		
		return k;
		
		
	}
	static int function()
	{
		if(i+1>=a.length())
			k=0;
		else
		{
			i++;
			ch=a.charAt(i);
			k=1;
			
		}
		
		return k;
	}
	static int array()
	{
		
		k=0;
		k=value();
		while(function()==1 )
		{
			
			if(a.charAt(i)==',')
			{
			k=value();
			if(k==0)
				break;
			}
			else
				break;
				
		}
		
		if(k==1 && a.charAt(i)==']')
			k=1;
		else
			k=0;
		
		return k;
	}
	
	
	
	
	
	
	
	
	
	static int string ()
	{
		k=0;
		
			
			if(a.charAt(i)=='"')
			{
				
				while( function()==1 && a.charAt(i)!='"');
				
				if(a.charAt(i)=='"')
					k=1;
					
			}
			
		return k;
	}
	
	
	
	
	static int bool()
	{
		
			if(i+4<=a.length() && a.substring(i,i+4).equals("true"))
			{
				k=1;
				i=i+3;
				
			}
			else if(i+5<=a.length() && (a.substring(i,i+5).equals("false")))
			{
					k=1;
					i=i+4;
			}
			else
				k=0;
		
		return k;
	}
	static int number()
	{
		k=0;
		
		while(function()==1 )
		{
			
			
			 if(a.charAt(i)==',' || a.charAt(i)=='}' || a.charAt(i)==']')
			{
				k=1;
				i=i-1;
				break;
			}
			 else if(!Character.isDigit(a.charAt(i)))
				{
			
					k=0;
					break;
					
				}
		}
		
		return k;
	}
	
	
	
	
	
}
