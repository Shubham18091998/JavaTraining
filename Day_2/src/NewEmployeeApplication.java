
public class NewEmployeeApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp1=new Employee();
		emp1.displayDetails();
		Employee emp2=new Employee(101,"Akshita",25000);
		emp2.displayDetails();
		Employee emp3=new Employee(102,"Suman",3000);
		emp3.displayDetails();
		System.out.println("Salary of "+emp2.getName()+" is "+emp2.getSalary());
		emp1.setName("Shubham");
		System.out.println(emp1.getName());
		//System.out.println("Count="+Employee.count);
		Employee.showCount();
		

	}

}
