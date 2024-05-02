package Ques;

import java.util.Scanner;

public class Area {

	int length,breadth;
	void setdim(int l,int b) 
	{
		length=l;
		breadth=b;
		}
	void getarea()
	{
		int result= length*breadth;
		System.out.print("Area of rectangle is = " + result);
		}
	public static void main(String[] args)
	{
		Area A= new Area();
		int p,q;
		Scanner S= new Scanner(System.in);
		System.out.print("Enter first number : ");
		p =S.nextInt();
		System.out.print("Enter second number : ");
		q =S.nextInt();
//		A.setdim(4,5);
		
		A.setdim(p,q);
		A.getarea();
}}
