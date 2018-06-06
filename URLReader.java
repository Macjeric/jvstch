import java.net.*;
import java.io.*;

public class URLReader{
	public static void main(String[] args) throws Exception {

		URL football = new URL("http://www.football-data.co.uk/mmz4281/1617/E0.csv");
		BufferedReader in = new BufferedReader(
			new InputStreamReader(football-data.openStream()));

			String inputLine;
			while ((inputLine = in.readLine())!=null)
			System.out.println(inputLine);
			in.close();
		}
	}