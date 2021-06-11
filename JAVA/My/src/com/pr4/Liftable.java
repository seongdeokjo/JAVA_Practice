package com.pr4;

public interface Liftable {
	void liftoff(); //public abstract  생략되어있다.
	void move(int x, int y);
	void stop();
	void land();
}
