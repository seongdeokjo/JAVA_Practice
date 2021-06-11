package ex.th2;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;



public class HttpURLConnectionTest {

	public static void main(String[] args) {
		
		String urlStr = "https://news.naver.com/main/read.nhn?mode=LSD&mid=shm&sid1=100&oid=021&aid=0002473477";
		
		try {
			URL url = new URL(urlStr);
			
			HttpURLConnection hcon =(HttpURLConnection)url.openConnection();
			
			for(int i = 1; i<=8; i++) {
				System.out.println(hcon.getHeaderFieldKey(i));
				
				System.out.println(" : "+ hcon.getHeaderField(i));
			}
		//이 처리를 안하면 성능저하가 올 수 있으므로 처리해주자 
		hcon.disconnect();
		
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}