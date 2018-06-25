package com.sravan.oops;

public class Airtel implements Network {

	@Override
	public void sms() {
		System.out.println("RC12 = 100 sms");
	}

	@Override
	public void data() {
		System.out.println("Rc100=2GB");
	}

	@Override
	public void calls() {
		System.out.println("Unlimited calls");

	}

}
