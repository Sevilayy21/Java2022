
public class Main {

	public static void main(String[] args) {
		
//		ICustomerDal customerDal = new OracleCustomerDal();
//		customerDal.add();
		
		CustomerManager customerManager = new CustomerManager(new SqlServerCustomerDal());
//		customerManager.customerDal = new OracleCustomerDal();
		customerManager.add();
		
	}

}
