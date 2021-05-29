import java.util.Scanner;

public class Customer {
	Scanner obj=new Scanner(System.in);
	private String name;
	private String email;
	private int age;
	private double creaditLimit;
	public void acceptInfo()
	{
		System.out.println("Enter your name");
		name=obj.nextLine();
		System.out.println("Enter your email");
		email=obj.nextLine();
		System.out.println("Enter your age");
		age=obj.nextInt();
		System.out.println("Set your creadit limit");
		creaditLimit=obj.nextDouble();
		
	}
	public void setCreaditLimit(double credt)
	{
		this.creaditLimit=credt;
	}
	public double getCreaditLimit()
	{
		return creaditLimit;
	}
	public void showDetails()
	{
		System.out.println("-----------------------------------");
		System.out.println("Customer name:"+name);
		System.out.println("Creadit limit:"+creaditLimit);
		System.out.println("-----------------------------------");
	}
}
