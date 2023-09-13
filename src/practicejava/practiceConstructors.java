package practicejava;

public class practiceConstructors {

	
	 int modelYear;
	  String modelName;
	  int carMilage;
	  
	double priceCar;
	

	  public practiceConstructors(int year, String name) {
	    modelYear = year;
	    modelName = name;
	  }

	  
	  public practiceConstructors() {
	  carMilage=15000;
	  
	  }
	  
	  public practiceConstructors(double amount) {
		  priceCar=amount;
		  
	  }
	  
	  
	  
	  
	  public static void main(String[] args) {
		  practiceConstructors myCar = new practiceConstructors(1969, "Mustang");
	    System.out.println(myCar.modelYear + " " + myCar.modelName);
	    
	    practiceConstructors milage= new practiceConstructors();
	    System.out.println(milage.carMilage);
	    
	    practiceConstructors price =new practiceConstructors(29000);
	    System.out.println("price Car :"+price.priceCar);
	    
	  }
	}
	
	
	
	
	
	
	
	
	
	
	

