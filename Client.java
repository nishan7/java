import java.net.*;
import java.util.Scanner;
import java.io.*;

public class Client {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		try {
			Socket client = new Socket(args[0], Integer.parseInt(args[1]));
			PrintStream output = new PrintStream(client.getOutputStream());
			DataInputStream input = new DataInputStream(client.getInputStream());
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String str = input.readLine();
			System.out.println(str);
			str = br.readLine();
			output.println(str);
			
			while((str=input.readLine())!=null)
				System.out.println(str);
			client.close();
		}catch(Exception e) {
			System.out.println(e);
		}
		
		
	}

}
