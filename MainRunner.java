package p1;

public class MainRunner {
	public void main(String[] args)
	{
		
		Accountant accountant=new Accountant("Ramesh", 50000, 1000,"TaxFile");
		accountant.worksOnTaxFile();

		Project faceBook=new Project("FaceBook Advertisents", 15);
		Developer developer=new Developer(faceBook, "Meta", "Ramesh",1500,1000);
		developer.worksOnProject();
		
		SalesManager salesmanager=new SalesManager("Ramesh",55000,"Furniture",1000);
		salesmanager.worksOnSales();
		salesmanager.setSalary(200);
		int x=salesmanager.getSalary();
		System.out.println("  "+x);
		salesmanager.setMedicalInsurance(500);
		int y=salesmanager.getMedicalInsurance();
		System.out.println("  "+y);
		
	}

}
