package ex.th2;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressTest {

	public static void main(String[] args) {
		String urlStr = "www.naver.com";
		
		try {
			
			InetAddress ip = InetAddress.getByName(urlStr);
			//domain 이름을 알고 싶을 때
			System.out.println("호스트 이름:" + ip.getHostName() );
			//도메인 주소의 ip
			System.out.println("IP address :" + ip.getHostAddress());
		
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
	}

}
