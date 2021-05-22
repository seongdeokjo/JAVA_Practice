package com.test2;
class ShopService {
	private static ShopService singleton = new ShopService();
	private ShopService() {
		
	}
	static ShopService getInstance() {
		return singleton;
	}
}
public class Sample09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
