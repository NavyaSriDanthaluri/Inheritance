package p1;
import java.util.Scanner;

public class Employee {

	String name;
	int salary;
	int medicalInsurance;
	
	public Employee() {
		super();
	}
	
	public Employee(String name, int salary, int medicalInsurance) {
		super();
		this.name = name;
		this.salary = salary;
		this.medicalInsurance=medicalInsurance;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public int getMedicalInsurance() {
		return medicalInsurance;
	}

	public void setMedicalInsurance(int medicalInsurance) {
		this.medicalInsurance = medicalInsurance;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", salary=" + salary + ",medicalInsurance="+ medicalInsurance+ "]";
	}
	public void Login()
	{
		Scanner os=new Scanner(System.in);
		Scanner osStr=new Scanner(System.in);
		System.out.println("enter the name:");
		String name=osStr.nextLine();
		System.out.println("enter the salary:");
		int salary=os.nextInt();

	}
}