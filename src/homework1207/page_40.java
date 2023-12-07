package homework1207;
import java.io.*;

public class page_40 {

	public static void main(String[] args)
	{
		if(args.length != 1)
		{
			System.out.println("Page_40.txt");
			System.exit(1);
		}
		
		try 
		{
			BufferedReader br = new BufferedReader(new FileReader(args[0]));
			
			String str;
			while((str = br.readLine())!=null)
			{
				System.out.println(str);
			}
			
			br.close();
		} 
		catch (Exception e) 
		{
			System.out.println("輸出入錯誤");
		}
	}
}
