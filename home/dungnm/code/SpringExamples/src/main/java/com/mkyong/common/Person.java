package com.mkyong.common;
 
public class Person 
{
	private Ability ability;
	public Person(Ability _ab) {
		this.ability = _ab;
	}
//	public Ability getAbility() {
//		return ability;
//	}
//
//	public void setAbility(Ability ability) {
//		this.ability = ability;
//	}

	@Override
	public String toString() {
		return "Person [ability=" + ability + "]";
	}

}