package org.mypackage;

public class Stack {
	
	int stack[] = new int[10];
	int tos;
	
	
	public Stack(){
		tos = -1;
	}
	
	public void pushItemIntoStack(int item){
		
		if(tos == 9){
			System.out.println("Stack is full !!!");
		}
		else{
			stack[++tos] = item;
		}
		
	}
	
	public int popItemIntoStack(){
		
		if(tos > 0){
			return stack[tos--];
		}
		else{
			System.out.println("Stack is empty !!!");
			return 0;
		}
		
		
	}

	public static void main(String[] args) {
		
		Stack s = new Stack();
		
		for(int i=0; i<11; i++){
			s.pushItemIntoStack(i);
		}
		
		for(int i=0; i<10; i++){
			System.out.println(s.popItemIntoStack());
		}

	}

}
