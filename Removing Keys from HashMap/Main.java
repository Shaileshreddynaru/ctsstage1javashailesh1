import java.util.Scanner;
import java.util.HashMap;

public class Main{

	public static void main(String args[])
	{

		Scanner sc=new Scanner(System.in);

		int size = sc.nextInt();

		HashMap<Integer,String> hm = new HashMap<Integer,String>();

		for(int i=0 ; i<size ; i++)
		{
			int key = sc.nextInt();
			sc.nextLine();
			String value = sc.nextLine();

			hm.put(key,value);
		}

		System.out.println(UserMainCode.sizeOfResultandHashMap(hm));

	}
}