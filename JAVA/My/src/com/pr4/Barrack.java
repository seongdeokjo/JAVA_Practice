package com.pr4;

public class Barrack extends Building implements Liftable {
		Barrack() {
			super(250);
		}
		LiftableTemp l = new LiftableTemp();
		public void liftoff() {
			l.liftoff();
		}
		public void move(int x, int y) {
			l.move(x, y);
		}
		public void stop() {
			l.stop();
		}
		public void land() {
			l.land();
		}
		void makeTank() {
			
		}
		
}
