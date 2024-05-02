package Ques;

public class Student {
	String name;
	int roll_no;

	void getname()
	{
	System.out.println("Student name is " + name);
	}
	
	void getroll_no() 
	{
	System.out.print("Student roll no. is " + roll_no);
	}
	
public static void main(String[] args)
{
	Student S=new Student();
	S.name="John";
	S.roll_no=2;
	
	S.getname();
	S.getroll_no();
	
}}

