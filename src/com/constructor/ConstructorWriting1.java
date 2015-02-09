package com.constructor;

public class ConstructorWriting1 {
	//declaring variables
		int value1, value2, value3,value4;
		ConstructorWriting1(){
		value1= 15;
		value2 = 25;
		value3= value1+value2;
		
		}
		
		ConstructorWriting1(int a){
			value1 = a;
			value4=value1*value3;
			value3=value1+value4;
			
		}
		ConstructorWriting1(int a, int b){
			value1 = a;
			value2=b;
			value3= a+b;
			value4= a+b*a;
		
		}
		public void display(){
			System.out.println("value1 == "+ value1);
			System.out.println("value2 == "+ value2);
			value3= value1+value2;
			System.out.println("value1 + value2 == " + value3);
			value4 = value1*value3; 
			System.out.println("The result of multiplication is :" + value4);
		}
		public static void main(String[] args) {
			ConstructorWriting1  wc1= new ConstructorWriting1();
			ConstructorWriting1 wc2 = new ConstructorWriting1(35);
			ConstructorWriting1 wc3 = new ConstructorWriting1(35,15);
			System.out.println("Inside 1st the constructor is: ");
			wc1.display();
			System.out.println("Inside the 2nd constructor ");
			wc2.display();
			System.out.println("Inside the 3rd constructor");
			wc3.display();

		}

}
