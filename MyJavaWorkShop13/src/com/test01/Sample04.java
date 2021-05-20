package com.test01;

import java.util.*;

public class Sample04 {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(1);
		al.add(2);
		for(Integer i : al) {
			System.out.println(i+"\n");
		}
		List<Integer> al2 = new ArrayList<Integer>();
		List<Integer> al3 = new LinkedList<Integer>();
		
		Map<Integer, String> mp = new HashMap<Integer, String>();
		mp.put(1, "�ڹ�");
		mp.put(2, "�ڹٽ�");
		mp.put(3, "java");
		
		for(Integer k : mp.keySet()) { //HashMap�� ����� ��� Ű�� ����� set�� ��ȯ
			System.out.println(k);
			System.out.println(k+" ,"+mp.get(k)); // ������ key�� ��(��ü)�� ��ȯ , �� ã���� null ��ȯ
		}
		
		Set<Integer> set = mp.keySet();
		Set<Map.Entry<Integer, String>> set2 = mp.entrySet();
		Iterator itr = set2.iterator();
		while(itr.hasNext()) {
			Map.Entry<Integer, String> e = (Map.Entry<Integer, String>)itr.next();
			System.out.println(e.getKey()+e.getValue());
		}
	}

}
