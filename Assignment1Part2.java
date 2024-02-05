package Assignment1Part2;

import java.util.Scanner;

public class Calculator {
	
	Input input=new Input();
	double number[]=new double[2];
	
	 public double addition() {
		 number=input.inputNumbers();
		 return number[0]+number[1];
	 }
	 public double subtratcion() {
		 number=input.inputNumbers();
		 return number[0]-number[1];
	 }
	 
	 public double multiplication()
	    {
		 	number=input.inputNumbers();
		 	return number[0]*number[1];
	    }

	 public double division()
	    {
		 number=input.inputNumbers();
		 	return number[0]/number[1];
	    }

	 public double power()
	    {
		 	number=input.inputNumbers(); 
		 	return Math.pow(number[0],number[1]);
	    }

	 public void squareroot() {
		    double[] numbers = input.inputNumbers();
		    double sqrt1 = Math.sqrt(numbers[0]);
		    double sqrt2 = Math.sqrt(numbers[1]);
		    
		    System.out.println("Square root of number 1: " + sqrt1);
		    System.out.println("Square root of number 2: " + sqrt2);

		}
	
	
	public void mean()
	{
		Scanner sc =new Scanner(System.in);
		String str;
		int ctr=0;
		double result=0,no;
		
		do
		{
			System.out.println("Enter data");
			str=sc.next();
			if(str.equals("end"))
				break;
			else
			{
				no=Double.parseDouble(str);
				result+=no;
				ctr++;
			}
			
		}while(true);
		System.out.println("Mean is"+(result/ctr));
	}
	
}
package Assignment1Part2;

import java.util.Scanner;
public class Input {
	public  double[] inputNumbers()
	{
		Scanner sc = new Scanner(System.in);
		double no[]=new double[2];
		System.out.println("Enter Numbers");
		no[0]=sc.nextDouble();
		no[1]=sc.nextDouble();
		return no;
	}
}

package Assignment1Part2;

import java.util.Scanner;

public class Operations {
	public static void main(String[] args) {
		
		
		Calculator calc= new Calculator();
		Scanner sc = new Scanner(System.in);
		int option=0;
		System.out.println("------------- Operations-----");
		System.out.println("Addition");
		System.out.println("Subtration");
		System.out.println("Mean");
		System.out.println("Multiplication");
		System.out.println("Division");
		System.out.println("power");
		System.out.println("squareroot");
		System.out.println("Enter option for operation");
		option=sc.nextInt();
		
		switch(option)
		{
		case 1:
			System.out.println("Addition is "+
					calc.addition());
			break;
		case 2:
			System.out.println("Subtraction is "+
					calc.subtratcion());
			break;
			
		case 3:calc.mean();
			break;
			
		case 4:
			System.out.println("Multiplication is "+
					calc.multiplication());
			break;
		case 5:
			System.out.println("Division is "+
					calc.division());
			break;
		case 6:
			System.out.println("power is "+
					calc.power());
			break;
		case 7:
				calc.squareroot();
			break;
		
		}
}}
