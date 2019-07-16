package polling;

import java.util.Scanner;
public class main {

	Scanner input=new Scanner(System.in);
	connect con=new connect();
	chitty obj=new chitty();
	public void more() {
		for(int i=1;i<=5;i++) {
			
			System.out.println("enter the user name ");
			obj.setUser(input.nextLine());
			System.out.println("enter the password");
			obj.setPassword(input.nextInt());
			System.out.println("enter aadhar number");
			obj.setAadhar(input.nextInt());
			System.out.println("enter age");
			int age=input.nextInt();
			if(age >=18)
			{
				System.out.println("wel come to polling area");
			}else
			{
				System.out.println("your not eligible for voting");
			}
			
			
		}
	}
	public static void main (String[]args) {
		robo obj1=new robo();
		obj1.more();
	}
	public int getname() {
		// TODO Auto-generated method stub
		return 0;
	}
	public String getpassword() {
		// TODO Auto-generated method stub
		return null;
	}
	public String getaadhar() {
		// TODO Auto-generated method stub
		return null;
	}
	public String getage() {
		// TODO Auto-generated method stub
		return null;
	}


}
