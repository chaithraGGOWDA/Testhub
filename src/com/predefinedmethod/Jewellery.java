package com.predefinedmethod;

public class Jewellery {
	String name;
	int cost;
	public Jewellery(String name,int cost)
	{
		this.name=name;
		this.cost=cost;
	}
	public boolean equals(Object ob)
	{
		Jewellery Jw=(Jewellery)ob;
		return this.name==Jw.name;
	}
}

	



