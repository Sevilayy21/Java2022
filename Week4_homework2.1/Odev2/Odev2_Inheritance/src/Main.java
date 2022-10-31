
public class Main {
// inheritance = miras / class lar arası yapılabilir.
	
	
	public static void main(String[] args) {
		Customer customer = new Customer();
		Employee employee = new Employee();

		CustomerManager customerManager = new CustomerManager();
		EmployeeManager employeeManager = new EmployeeManager();
		customerManager.List();
		employeeManager.Add();
		employeeManager.BestEmpployee();
	}

}
