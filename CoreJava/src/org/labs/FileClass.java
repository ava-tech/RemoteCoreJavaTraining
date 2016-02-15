package org.labs;

public class FileClass extends FolderClass {
	
	String name = "My File";

	@Override
	public String toString() {
		return "FileClass [name=" + name + "]";
	}
	
	
	
	
	/*public static void main(String[] args){
		
		FolderClass fc = new FileClass();
		
		System.out.println(fc.name);
		
		FileClass fileClass = new FileClass();
		System.out.println(fileClass.name);
		
		System.out.println(new FileClass().name);
	}*/

}
