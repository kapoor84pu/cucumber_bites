package customer.retail;

public class CustomerType {

	private int years;
	

	public void withUsFrom(int years) {
		this.years = years;		
	}



	public String getCustomerType(double money) {
		if(years>=10 && money >=2000){
			return "Diamond";
		}
		if(years >= 10 && money <=2000){
			return "Gold";
		}
		
		if(years >= 5 && money >= 1000){
			return "Silver";
		} else{
			return "Bronze";
		} 
	}

}
