package org.ali.model;

public class user {
	private String name;
	private int agae;
	
	
	public user() {
		super();
	}

	public user(String name, int agae) {
		super();
		this.name = name;
		this.agae = agae;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAgae() {
		return agae;
	}

	public void setAgae(int agae) {
		this.agae = agae;
	}

	@Override
	public String toString() {
		return "user [name=" + name + ", agae=" + agae + "]";
	}


}
