package com.study.runtime.polymorphism;

public class Program3 {
	public static void main(String[] args)
	{
		Eventorganiser E1 = new Eventorganiser();
		E1.picksupevent(new Marriage());
		E1.picksupevent(new Birthdayevent());
	}

}
