package customer.retail;

import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinitionsForCustomerType {
	
	private CustomerType customerType;
	private double money;
	
	@Given("^Customer is with Tesco from (\\d+) years$")
	public void customer_is_with_tesco_from_years(int years){
		customerType= new CustomerType();
		customerType.withUsFrom(years);
	}
	
	@When("^Customer spend more than (\\d+)$")
	public void customer_spend_money(double money) throws Throwable{
		this.money = money;	
	}
	
	@Then("^Customer is (.*) type$")
	public void type_of_customer(String typeOfCustomer) throws Throwable{
		String actualCustomerType = customerType.getCustomerType(money);
		assertThat(actualCustomerType, is(equalTo(typeOfCustomer)));
		
	}
	
}
