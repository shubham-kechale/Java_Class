
public class TestCustomer {

	public static void main(String[] args) {
		Customer c1=new Customer();
		Customer c2=new Customer();
		c1.acceptInfo();
		c1.showDetails();
		c2.acceptInfo();
		c2.showDetails();
		c2.setCreaditLimit(100000);
		System.out.println("New creadit limit:"+c2.getCreaditLimit());

	}

}
