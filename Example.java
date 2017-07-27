
public class Example {

	public static void main(String[] args) {
		Example e=new Example();
		String s="ABCtyuriop";
		try
		{
		System.out.println(e.operation(s, 32));
		}
		//System.out.println(e.op("SPRING2017",-2));
		//System.out.println(e.op(s));
		
		catch(Exception y)
		{
			y.printStackTrace();
		}
		
	
		
		
	}
		// TODO Auto-generated method stub
public String operation(String s, int i)
{
	String m;
	 String k;
	 String l;
	int o=s.length();
	if(i>o)
	{
	 System.out.println("parameter" +i+" should be less than" +o);
	 for(int q=0;q<i;q++)
	 {
		 m=s+s; 
		 k=m.substring(i,o);
		 l=m.substring(0, i);
		
	 }
			
	 
	 
	}
	else
	{
 k=s.substring(i,o);
 l=s.substring(0, i);
    return k+l;
	}
	
	
	}

public String op(String s)
{
	String h=s.substring(2);
	String a=s.substring(0,2);
	return h+a;
}




}
