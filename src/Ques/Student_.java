package Ques;

public class Student_ {
	int roll_no;
	long phone_no;
	String name,address;
	
	void getDetails()
	{
		System.out.println("Student Name is " + name);
		System.out.println("Student Roll_no is " + roll_no);
		System.out.println("Student Phone_no is " + phone_no);
		System.out.println("Student Address is " + address);
		System.out.println();
	}
	public static void main(String[] args)
	{
		Student_ First =new Student_();
		First.name="Sam";
		First.roll_no=5;
		First.phone_no= 927863456;
		First.address= "malikmau";
		
		Student_ Second =new Student_();
		Second.name="John";
		Second.roll_no=7;
		Second.phone_no=6892422;
		Second.address="raebareli";
		
		First.getDetails();
		Second.getDetails();

}}
