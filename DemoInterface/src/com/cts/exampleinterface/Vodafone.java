package com.cts.exampleinterface;

public class Vodafone implements Sim{
	public void makeCall()
	{
		System.out.println("Making a call with Vodafone.");
	}

	@Override
	public void setPin(String pin) {
		// TODO Auto-generated method stub
		System.out.println(pin+"is set");
	}

}
