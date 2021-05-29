import java.util.Scanner;

public class Employee {
	Scanner obj=new Scanner(System.in);
	private int EmpyId;
	private String Name;
	private double BasicSalary;
	private double HRA;
	private double Medical;
	private double PF;
	private double PT;
	private double NetSalary;
	private double GrossSalary;
	public void acceptInfo()
	    {
		   System.out.println("Enter Empyid:");
		   EmpyId=obj.nextInt();
		   obj.nextLine();
		   System.out.println("Enter employee name");
		   Name=obj.nextLine();
		   System.out.println("Enter your basic salary");
		   BasicSalary=obj.nextDouble();
		   HRA=(50.0/100)*BasicSalary;
		   PF=(12.0/100)*BasicSalary;
		   PT=200;
		   Medical=100;
		   GrossSalary=BasicSalary+HRA+Medical;
		   NetSalary=GrossSalary-(PT+PF);
		}
	public void display()
	{
		System.out.println("EmpyID:"+EmpyId);
		System.out.println("Name:"+Name);
		System.out.println("Basic salary:"+BasicSalary);
		System.out.println("Net salary:"+NetSalary);
		System.out.println("Gross salary:"+GrossSalary);
		System.out.println("HRA:"+HRA);
		System.out.println("PF:"+PF);
		System.out.println("PT:"+PT);
		System.out.println("Medical:"+Medical);
	}
}
