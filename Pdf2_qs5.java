//The straight-line method of computing the early depreciation of the value of an item is 
//given by:
//Depreciation = Purchase price - Salvage value 
// Years of service
// Write a program to determine the salvage value of an item when the purchase price years 
//of service & the annual preciation is given.



package java_info_cls1;
import java.util.Scanner;

class ItemDetails{
	private double purchasePrice=0;
	private int yearsOfService=0;
	private double annualDepreciation=0;
	private double salvageValue=0;
	
	
	public double getPurchasePrice() {
		return purchasePrice;
	}

	public void setPurchasePrice(double purchasePrice) {
		this.purchasePrice = purchasePrice;
	}

	public int getYearsOfService() {
		return yearsOfService;
	}

	public void setYearsOfService(int yearsOfService) {
		this.yearsOfService = yearsOfService;
	}

	public double getAnnualDepreciation() {
		return annualDepreciation;
	}

	public void setAnnualDepreciation(double annualDepreciation) {
		this.annualDepreciation = annualDepreciation;
	}

	public double getSalvageValue() {
		return salvageValue;
	}

	public void setSalvageValue(double salvageValue) {
		this.salvageValue = salvageValue;
	}

	
	
}

public class  Pdf2_qs5{
	
	static double calculateSalvageValue(double purchasePrice, int yearsOfService, double annualDepreciation) {
	    return purchasePrice - (yearsOfService * annualDepreciation);
	}

	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		
		ItemDetails obj = new ItemDetails();
	    
	    System.out.print("Enter the purchase price: ");
	    obj.setPurchasePrice(scanner.nextDouble());
	
	    System.out.print("Enter the years of service: ");
	    obj.setYearsOfService(scanner.nextInt());
	
	    System.out.print("Enter the annual depreciation: ");
	    obj.setAnnualDepreciation(scanner.nextDouble());
	
	    // Calculate the salvage value
	    double salvageValue = calculateSalvageValue(obj.getPurchasePrice(), obj.getYearsOfService(), obj.getAnnualDepreciation());
	
	    // Output the result
	    System.out.println("Salvage Value: " + salvageValue);
	
	    scanner.close();
}

	
}

//Output:
//	Set 1:
//	Enter the purchase price: 1000
//	Enter the years of service: 3
//	Enter the annual depreciation: 100
//	Salvage Value: 700.0
//	Set 2:
//	Enter the purchase price: 10000
//	Enter the years of service: 4
//	Enter the annual depreciation: 1000
//	Salvage Value: 6000.0

