package org.offline.labs;

public class Hammer {
	
	private String head;
	private String face;
	private String claw;
	private String handle;
	private String name;
	
	
	
	public Hammer(String name) {
		this.name = name;
	}
	
	

	public String getName() {
		return name;
	}



	public void canBreak(){
		System.out.println("Breaking things");
		
	}

	public String getHead() {
		return head;
	}

	public void setHead(String head) {
		this.head = head;
	}

	public String getFacce() {
		return face;
	}

	public void setFace(String face) {
		this.face = face;
	}

	public String getClaw() {
		return claw;
	}

	public void setClaw(String claw) {
		this.claw = claw;
	}

	public String getHandle() {
		return handle;
	}

	public void setHandle(String handle) {
		this.handle = handle;
	}

	@Override
	public String toString() {
		
		return "I am a Hammer";
	}
	
	

}
