package com.pr4;

public class Factory extends Building implements Liftable {
	Factory() {
		super(300);
	}
	LiftableTemp l = new LiftableTemp();
	@Override
	public void liftoff() {
		l.liftoff();
	}
	@Override
	public void move(int x, int y) {
		l.move(x, y);
	}
	@Override
	public void stop() {
		l.stop();
	}
	@Override
	public void land() {
		l.land();
	}
}
