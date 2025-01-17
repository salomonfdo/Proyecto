package apiStepDefinitions;

import org.testng.Assert;

import apiPageObjects.GetEmployees;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;

public class EmployeeStepDefinitions {
	
	Response resp;
	GetEmployees employees;
	int id;
	
	@Given("User set valid auth key")
	public void user_set_valid_auth_key() {
	    System.out.println("Correct auth");
	}

	@When("User send a Get request on {string}")
	public void user_send_a_Get_request_on(String endPoint) {
	   employees = new GetEmployees(endPoint);
	}

	@Then("User should get Status code {int}")
	public void user_should_get_Status_code(Integer int1) {
	   System.out.println("Mundo");
	   //Assert.assertTrue(employees.response.getStatusCode());
	}
	
	@Given("User send an id of {int}")
	public void user_send_an_id_of(Integer int1) {
		this.id = int1;
	    
	}

}
