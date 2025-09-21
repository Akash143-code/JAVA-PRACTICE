import java.io.*;

public class SwitchStatement
{
	public static void main(String[] args) throws IOException
	{
	   //to get input 
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   
	   System.out.println("Enter the day to set alarm");
	   String day = br.readLine();
	   
	   String result = " " ;
		
		
		//switch statement (updated at java 5).
		switch(day)
		{
		    case "sunday" -> result =" alarm rings at 6am ";
		    
		    case "monday","tuesday","wednesday" -> result = "alarm rings at 5am";
		    
		    case "thusday","saturday" -> result ="alarm rings at 7am";
		    
		    default -> result ="please enter valid day";
		}
	System.out.println(result);
	    
	}
}
