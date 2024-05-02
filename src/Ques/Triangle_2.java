package Ques;

public class Triangle_2 {
	double S1=3,S2=4,S3=5;
	
	void getperimeter()
	{
		Double Perimeter=S1+S2+S3;
		System.out.println("Perimeter of Triangle is "+ Perimeter);
	}
	void getarea()
	{
		Double SP=(S1+S2+S3)/2;
		Double Area=Math.sqrt(SP*(SP-S1)*(SP-S2)*(SP-S3));
		System.out.print("Area of Triangle is "+ Area);
	}
	public static void main(String[] args)
	{
		Triangle_2 T=new Triangle_2();
		
		T.getperimeter();
		T.getarea();
}}
