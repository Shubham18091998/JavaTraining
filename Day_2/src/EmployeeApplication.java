import java.util.*;
public class EmployeeApplication {
	
	void input() {                  //Taking input from user
		Scanner sc = new Scanner(System.in);
		int empno,salary;
		String name;
		
		System.out.print("Enter employee numbner:");
		empno=sc.nextInt();
		sc.nextLine();
		System.out.print("Enter name:");
		name=sc.nextLine();        //used to read string with spaces
		//String name=sc.next();   //used to read string without spaces
		System.out.print("Enter salary:");
		salary=sc.nextInt();
		
		Employee emp=new Employee(empno,name,salary);
		emp.displayDetails();
		emp.calculatePF();
		emp.calculateGratuity();
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeApplication empApp=new EmployeeApplication();
		for(int i=0;i<5;i++) {
			empApp.input();
		}
		
		System.out.println("------------------------------------");
		Employee emp1=new Employee(101,"Ajay",10100);// Memory allocated at run time on heap
		// emp1.init(101,"Ajay",10500);
		emp1.displayDetails();
		emp1.calculatePF();
		emp1.calculateGratuity();
		
		Employee emp2=new Employee(102,"Abhimanyu",10550);
		emp2.displayDetails();
		emp2.calculatePF();
		emp2.calculateGratuity();
		
		Employee emp3=new Employee(102,"Divyansh",20550);
		emp3.displayDetails();
		emp3.calculatePF();
		emp3.calculateGratuity();
		
		Employee emp4=new Employee(102,"Sachin",10250);
		emp4.displayDetails();
		emp4.calculatePF();
		emp4.calculateGratuity();
	}

}
