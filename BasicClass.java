import java.util.Scanner;

public class BasicClass {
	public static class Date
	{
	    Scanner obj=new Scanner(System.in);
		private  int date;
		private  int month;
		private  int year;
		public  void acceptinfo()
		{
			System.out.println("Enter the date");
			date=obj.nextInt();
			System.out.println("Enter the month");
			month=obj.nextInt();
			System.out.println("Enter the year");
			year=obj.nextInt();
		}
		public void display()
		{
			System.out.println("Date: "+date+"/"+month+"/"+year);
		}
	}
	public static void main(String[] args) {
		//Scanner obj=new Scanner(System.in);
				Date d1=new Date();
				d1.acceptinfo();
				d1.display();
				Date d2=new Date();
				d2.display();
				
		        //obj.close();

	}

}
