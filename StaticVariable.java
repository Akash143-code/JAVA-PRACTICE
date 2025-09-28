public class StaticVariable
{

	String code ="code 0091";//instace variable.
	
	int emp_id =9101;//instace variable.
	
	static String Varh_id = "#009";//static variable.

	        public static void main(String []args)
    	    {
		        StaticVariable obj = new StaticVariable();
    
		         System.out.println(obj.code+ " " + obj.emp_id);
		
		         System.out.println(StaticVariable.Varh_id);
        	}
}