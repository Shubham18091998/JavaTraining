
public class Customer {
	private int custNumber;
	private String custName;
	private String custEmail;
	
	Customer(){
		custNumber=0;
		custName="";
		custEmail="";
	}
	
	Customer(int custNumber,String custName,String custEmail){
		this.custNumber=custNumber;
		this.custName=custName;
		this.custEmail=custEmail;
	}
	
	void showCustomerDetails() {
		System.out.println("Customer number:"+custNumber);
		System.out.println("Customer Name:"+custName);
		System.out.println("Customer Email ID:"+custEmail);
	}

}
