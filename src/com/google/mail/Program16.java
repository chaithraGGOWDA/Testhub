package com.google.mail;

public class Program16 {
	public static void main(String[] args)
	{
	Testprofile T1 = new Testprofile();
	T1.Seniortestengineer(new Seniortestengineer());
	T1.Seniortestengineer(new TestManager());
	T1.Juniortestengineer(new Juniortestengineer());
	T1.Juniortestengineer(new Seniortestengineer());
	T1.Juniortestengineer(new TestManager());
	}
}
