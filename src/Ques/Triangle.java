package Ques;

public class Triangle {
	double S1,S2,S3;
	
	void setvalues(double a,double b,double c)
	{
		S1=a;
		S2=b;
		S3=c;
	}
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
		Triangle T=new Triangle();
		T.setvalues(3, 4, 5);
		
		T.getperimeter();
		T.getarea();
}}
