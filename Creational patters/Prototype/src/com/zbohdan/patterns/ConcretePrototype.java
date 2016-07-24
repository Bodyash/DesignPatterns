package com.zbohdan.patterns;

public class ConcretePrototype extends Prototype{

	@Override
	public Prototype clone() {

		return (Prototype)this.clone();
	}
}
