package org.mypackage;


/*
 * Represent Unicode type characters. It's size is 16 bits long
 * char variable must be declare with single quotes ( ' )
 * 
 * escape sequence can be used to represent character literal.
 * 
 * Unicode escape sequence always '\u05D0'
 * 
 * None printing ASCII characters
 * '\t' = horizontal tab
 * '\b' = backspace
 * '\n' = new line
 * '\f' = form feed
 * '\r' = carriage return
 * 
 */


public class CharTypeExample1 {

	public static void main(String[] args) {
		
		char c = 'A';
        char tab = '\t'; 
        char nul = ' ';
        char pi = '\u0985';
        char backslash = '\\';
        char singleQuote ='\'';
        char doubleQuote = '\"';
        
        System.out.println("c: " + c);
        System.out.println("tab: " + tab);
        System.out.println("nul: " + nul);
        System.out.println("pi: " + pi);
        System.out.println("backslash: " + backslash);
        System.out.println("singleQuote: " + singleQuote);
        System.out.println("doubleQuote: " + doubleQuote);

	}

}
