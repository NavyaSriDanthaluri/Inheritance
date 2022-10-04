package p1;

public class SalesManager extends Employee {
	
	String sales;
	
   public SalesManager() {
	   super();
   }
   public SalesManager(String name,int salary, String sales,int medicalInsurance ) {
	   super(name,salary,medicalInsurance);
		this.sales = sales;
   }
	public String getSales() {
		return sales;
	}
	public void setSales(String sales) {
		this.sales = sales;
	}
	  public void worksOnSales()
	  {
		  System.out.println(name); 
		  System.out.println(salary);	
		  System.out.println(sales);
		  System.out.println(medicalInsurance);
	}
	  
	 @Override
	public String toString() {
    return "SalesManager[sales=" + sales + "]";
	}
	@Override
	public int getSalary() {
		int previousSalary=super.getSalary();
		int incentive=(int)(previousSalary*0.1);
		super.setSalary(previousSalary+incentive);
		return super.getSalary();
	}
	@Override
	public int getMedicalInsurance() {
		int previousMedicalInsurance=super.getMedicalInsurance();
		int tmedicalInsurance=(int)(previousMedicalInsurance*0.2);
		super.setMedicalInsurance(previousMedicalInsurance+tmedicalInsurance);
		return super.getMedicalInsurance();
	}
	
	 
}
