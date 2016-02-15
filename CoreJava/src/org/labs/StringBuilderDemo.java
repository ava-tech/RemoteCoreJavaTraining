package org.labs;

public class StringBuilderDemo {

	public static void main(String[] args) {
		
		StringBuilder sb = new StringBuilder("Java");
		
		sb.append(" SE 6");
		sb.delete(8, 9);
		sb.insert(8, "7");
		
		System.out.println(sb.length());
		System.out.println(sb);
		
		sb.setLength(8);
		
		System.out.println(sb.length());
		System.out.println(sb);
		
		
		System.out.println(sb.charAt(0));
		System.out.println(sb.indexOf("J"));
		
		String s = "Java";
		s.concat(" SE 6");
		
		StringBuilder ssb = new StringBuilder();
		FolderClass fc = new FolderClass();
		ssb.append(fc);
		
		
		
				
		
	}

}
