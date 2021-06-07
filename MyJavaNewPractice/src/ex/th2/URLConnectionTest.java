package ex.th2;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class URLConnectionTest {

	public static void main(String[] args) {
		
		try {
			URL url = new URL("https://google.com");
		//URLConnection : url.openConnection();
			// stream이 만들어짐
			URLConnection conn = url.openConnection();
			
			InputStream in = conn.getInputStream();
			
			int i = 0;
			
			while(true) {
				i = in.read();
				if(i == -1) {
					break;
				}
				System.out.print((char)i);				
			}
			
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}	
	}
}