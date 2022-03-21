package com.simplilearn.demo;
import java.util.Scanner;
public class Calculator {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter First No:");
		int num1=s.nextInt();	
		System.out.print("Enter Second No:");
		int num2=s.nextInt();
		System.out.print("Select Symbol(+,-,*,/):");
		String sym=s.next();
		int ans;
		switch(sym) {
		case"+": ans = num1+num2;
		System.out.println("Answer is:"+ans);
		break;
		case"-": ans = num1-num2;
		System.out.println("Answer is:"+ans);
		break;
		case"*": ans = num1*num2;
		System.out.println("Answer is:"+ans);
		break;
		case"/": ans = num1/num2;
		System.out.println("Answer is:"+ans);
		break;
		default:System.out.println("Invalid Symbol");
		break;
		}
	}	
}

