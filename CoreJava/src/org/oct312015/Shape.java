package org.oct312015;

public class Shape {
	
	private int len = 10;
	private int wed = 5;
	
	
	public int getLen() {
		return len;
	}

	public void setLen(int len) {
			this.len = len;			
	}

	public int getWed() {
		return wed;
	}

	public void setWed(int wed) {
		this.wed = wed;
	}


	public int getSize(){
		return this.len * this.wed;
	}
	
	
}
