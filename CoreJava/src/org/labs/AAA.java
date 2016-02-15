package org.labs;

public class AAA extends GraphicObject {

	@Override
	public void resize() {
		int x = 0;
		int y = 0;
		
		System.out.println(x + y);

	}
	
	public static void main(String[] args){
		AAA a = new AAA();
		a.draw();

		System.out.println(GraphicObject.pie + DemoInterface.instanceInterfaceVar1);
		
		Person p = new Person();
		
		p.setName("John");
		
		System.out.println(p.toString());
		AAA aaa = new AAA();
		
		Day d = new Day();
		d.printMe(aaa);
		
		System.out.println(d.name + ", "+ a.instanceVarP);
	}

}
