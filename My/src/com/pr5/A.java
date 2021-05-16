package com.pr5;

public class A {
	void autoPlay() {
		I i1 = InstanceManager.getInstance();
		i1.play();
		System.out.println(i1.toString());
		System.out.println();
//		i.play();
	}
}
