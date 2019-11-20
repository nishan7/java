import java.io.*;
import java.net.*;

public class Server {
	public static void main(String[] args) {
		try {
			ServerSocket server = new ServerSocket(Integer.parseInt(args[0]));
			Socket client = server.accept();
			PrintStream output = new PrintStream(client.getOutputStream());
			DataInputStream input = new DataInputStream(client.getInputStream());
			output.println("Get filename ");
			String str = input.readLine();
			output.println("Requested file is: " + str);
			File f = new File(str);
			BufferedReader br = new BufferedReader(new FileReader(f));
			while ((str = br.readLine()) != null)
				output.println(str);
			client.close();
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
