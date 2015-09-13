package org.mypackage;

public class OperatorExample {

	public static void main(String[] args) {
		
		int leftSide = 5;
		int rightSide = 2;
		int result;
		
		//example of + math operator
		result = leftSide + rightSide;
		System.out.println(result);
		

		//example of - math operator
		result = leftSide - rightSide;
		System.out.println(result);
		
		//example of * math operator
		result = leftSide * rightSide;
		System.out.println(result);


		//example of / math operator
		result = leftSide / rightSide;
		System.out.println(result);
		
		//example of % math operator
		result = leftSide % rightSide;
		System.out.println(result);
		
		
		//example of ++
		for(int x=0; x<10 ;x++){
			System.out.print(x);
		}
		
		System.out.println();
		
		//example of --
		for(int x=10; x>0; x--){
			System.out.print(x);
		}
		
		System.out.println();
		
		//example of logical AND which is &&		
		if (leftSide == 5 && rightSide == 2)
			System.out.println("Variable values are correct ..");
		else
			System.out.println("Variable values are incorrect ..");

	

		//example of logical OR which is ||		
		if (leftSide == 5 || rightSide == 2)
			System.out.println("Left Side: " + leftSide + " , Right Side: " + rightSide +" --->OR operator Variable values are correct ..");
		else
			System.out.println("Left Side: " + leftSide + " , Right Side: " + rightSide +" --->OR operator Variable values are incorrect ..");


		//example of logical OR which is ||		
		if (leftSide == 8 || rightSide == 3)
			System.out.println("Left Side: " + leftSide + " , Right Side: " + rightSide +" --->OR operator Variable values are correct ..");
		else
			System.out.println("Left Side: " + leftSide + " , Right Side: " + rightSide +" --->OR operator Variable values are incorrect ..");

		
		//example of logical OR which is ||		
		if (leftSide == 8 || rightSide == 2)
			System.out.println("Left Side: " + leftSide + " , Right Side: " + rightSide +" --->OR operator Variable values are correct ..");
		else
			System.out.println("Left Side: " + leftSide + " , Right Side: " + rightSide +" --->OR operator Variable values are incorrect ..");

		
		//example of logical OR which is ||		
		if (leftSide == 5 || rightSide == 3)
			System.out.println("Left Side: " + leftSide + " , Right Side: " + rightSide +" --->OR operator Variable values are correct ..");
		else
			System.out.println("Left Side: " + leftSide + " , Right Side: " + rightSide +" --->OR operator Variable values are incorrect ..");

		
		//conversion
		double lSide = (double) leftSide;
		double rSide = (double) rightSide;
		
		System.out.println("Value of LeftSide in double: " + lSide);
		System.out.println("Value of RightSide in double: " + rSide);
		
		System.out.println("Value of integer division in double: " + (double) leftSide / rightSide);

	}

}
