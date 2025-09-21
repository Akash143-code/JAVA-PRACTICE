import java.io.*;
import java.util.*;

public class Input
{
	public static void main(String[] args) throws IOException
	{
		//to get input from BufferedReader.

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("To get Input by BufferedReader:");

		String b = br.readLine();

		System.out.println(b+"  [ Input from BufferedReader:) ]");





		//to get input from Scanner.

		Scanner s = new Scanner(System.in);

		System.out.println("To get Input by Scanner:");

		String Scan = s.nextLine();

		System.out.println(Scan+"  [ Input from Scanner:) ]");





		//to get input from console.

		System.out.println("To get input by Console():");

		String num = System.console().readLine();

		int co = Integer.parseInt(num);

		System.out.println(co+"  [ Input from console:) ]");




		//to get input from DataInputStream.

		System.out.println("To get input by DataInputStream");

		DataInputStream ds = new DataInputStream(System.in);

		String d = ds.readLine();

		float nu = Float.parseFloat(d);

		System.out.println(nu+" [ Input from DataInputStream:) ]");



		System.out.println("The Input from all sources are to gather ---> "+b+" "+Scan+" "+nu+" "+co);


	}
}
