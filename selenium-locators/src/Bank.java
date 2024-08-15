
public class Bank {
	int getRateOfInterest(){return 0;}  
}
	class SBI extends Bank{  
		  
			int getRateOfInterest(){return 8;}  
	
	
	public static void main(String[] args) {
		SBI s=new SBI();  
		System.out.println("SBI Rate of Interest: "+s.getRateOfInterest());  

	}

	}


