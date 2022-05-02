
public class Employee {
	private int empno;             //instance variable
	private String name;
	private int salary;
	public static int count;       //class variable
	
	Employee(){                                   //Default constructor
		count++;
		empno=0;
		name="";
		salary=0;
	}
	
	Employee(int empno, String name, int salary){ //Parameterized constructor
		count++;
		this.empno=empno;
		this.name=name;
		if(salary>=2000 && salary<=10000)
			this.salary=salary;
		else
			System.out.println("Invalid salary");
	}
	
	/*void init(int no ,String n ,int s) {
		empno=no;
		name=n;
		salary=s;
	}*/
	
	
	//Getter Function
	public int getEmpno() {
		return empno;
	}
	
	public String getName() {
		return name;
	}
	
	public int getSalary() {
		return salary;
	}
	
	//Setter Function
	void setName(String name) {
		this.name=name;
	}
	
	void setSalary(int salary) {
		
		this.salary=salary;
	}
	
	
	public void displayDetails() {
		System.out.println("Employee No:"+empno);
		System.out.println("Employee Name:"+name);
		System.out.println("Employee Salary:"+salary);
	}
	
	static void showCount() {           //Static methods can be called without creation of objects
		System.out.println("Total objects="+count);//static method can access only static data members
	}
	
	public void calculatePF() {
		double pf=salary*0.18;
		System.out.println("PF="+pf);
	}
	public void calculateGratuity() {
		double amt=(salary*15)*0.15;
		System.out.println("Gratuity="+amt);
	}

}
