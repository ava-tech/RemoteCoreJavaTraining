package org.mypackage;

/*
 * byte, short, int, long are called Integer type.
 * these four type differ on number of bits
 * 
 * The letter L or l, indicating a long type
 * The prefix 0x or 0X, indicating hexadecimal(16 base)
 * The prefix 0, indicating octal(8 base)(digits 0-7)
 * 
 */

public class IntegerTypeExample1 {

	public static void main(String[] args) {
		
		byte b1 = 127; // Min:-128 Max: 127
         
        int i1 = 28;
        int i2 = 0x1c; //hexadecimal 28
        int i3 = 034; // octal 28
        int i4 = 0xCAFEBABE; //magic number used to identify Java class files
         
        long l1 = 12345L; //a long value
        long l2 = 12345l; //a long value
        long l3 = 0xffL; // a long value
        
        System.out.println("b1: " + b1);
              
        System.out.println("i1: " + i1);
        System.out.println("i2: " + i2);
        System.out.println("i3: " + i3);
        System.out.println("i4: " + i4);
        
        System.out.println("l1: " + l1);
        System.out.println("l2: " + l2);
        System.out.println("l3: " + l3);

        
        //byte b2 = 2;
        //byte sum = b1 + b2;
        //System.out.println(b1 + b2);

	}

}
