package ex.th2;

import java.net.MalformedURLException;
import java.net.URL;

public class UrlTest {

	public static void main(String[] args) {
		
		String urlStr = "https://news.naver.com/main/read.nhn?mode=LSD&mid=shm&sid1=100&oid=021&aid=0002473477";
		
		try {
			//URL 인스턴스 생성 
			URL url = new URL(urlStr);
			
			System.out.println("Protocol : " + url.getProtocol());
			System.out.println("Host Name : "+ url.getHost());
			System.out.println("Port Number : "+ url.getPort());
			// 80port로 들어와도 기본은 443 값을 돌려준다.
			System.out.println("Default Port : "+url.getDefaultPort());
			// ?뒤쪽으로 오는 주소값 => query
			System.out.println("Query : "+ url.getQuery());
			System.out.println("Path : "+url.getPath());
			System.out.println("File : "+ url.getFile());
			
			
			
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}		
	}
}