package cucumbermap;

import java.util.Hashtable;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utility.HTMLReportGenerator;
import utility.SeleniumOperation;

public class ManageAddress 
{

	@When("^user click on manage address$")
	public void user_click_on_manage_address() throws Throwable
	{
		Thread.sleep(10000);
		//click on manage address
		Object [] input1=new Object[1];
		input1[0]="(//*[@class='NS64GK'])[1]";
		 Hashtable<String,Object> output1=SeleniumOperation.click(input1);
  HTMLReportGenerator.StepDetails(output1.get("STATUS").toString(), "^user click on manage address$", output1.get("MESSAGE").toString()); 
	}

	@When("^user click on ADD A NEW ADDRESS$")
	public void user_click_on_ADD_A_NEW_ADDRESS() throws Throwable 
	{
		
		//click on add new address
		Object [] input2=new Object[1];
		input2[0]="//*[@class='_1QhEVk']";
		 Hashtable<String,Object> output2=SeleniumOperation.click(input2);
		 HTMLReportGenerator.StepDetails(output2.get("STATUS").toString(),"^user click on ADD A NEW ADDRESS$", output2.get("MESSAGE").toString());    
	}

	@When("^user enter \"([^\"]*)\" as name$")
	public void user_enter_as_name(String name) throws Throwable 
	{		
		 //enter name
		Object []input3=new Object[2];
		input3[0]="//*[@name='name']";
		input3[1]=name;
		 Hashtable<String,Object> output3=SeleniumOperation.sendKey(input3);
		 HTMLReportGenerator.StepDetails(output3.get("STATUS").toString(),"^user enter \"([^\"]*)\" as name$", output3.get("MESSAGE").toString()); 
	}

	@When("user enter \"(.*)\" as mobile number")
	public void user_enter_mobileNumber(String mnumber) throws Throwable 
	{
		 //enter name
		Object []input4=new Object[2];
		input4[0]="//*[@name='phone']";
		input4[1]=mnumber;
		 Hashtable<String,Object> output4=	SeleniumOperation.sendKey(input4);
		 HTMLReportGenerator.StepDetails(output4.get("STATUS").toString(),"user enter \"(.*)\" as mobile number", output4.get("MESSAGE").toString()); 
	}
	@When("^user enter \"([^\"]*)\" as pincode$")
	public void user_enter_as_pincode(String pcode) throws Throwable
	{
		 //enter pcode
		Object []input5=new Object[2];
		input5[0]="//*[@name='pincode']";
		input5[1]=pcode;
		 Hashtable<String,Object> output5=SeleniumOperation.sendKey(input5);
		 HTMLReportGenerator.StepDetails(output5.get("STATUS").toString(),"^user enter \"([^\"]*)\" as pincode$", output5.get("MESSAGE").toString()); 
	}

	@When("^user enter \"([^\"]*)\" as locality$")
	public void user_enter_as_locality(String locality) throws Throwable 
	{
		 //enter locality
		Object []input6=new Object[2];
		input6[0]="(//*[@class='_1w3ZZo _2mFmU7'])[4]";
		input6[1]=locality;
		 Hashtable<String,Object> output6=SeleniumOperation.sendKey(input6);
		 HTMLReportGenerator.StepDetails(output6.get("STATUS").toString(),"^user enter \"([^\"]*)\" as locality$", output6.get("MESSAGE").toString()); 
	}

	@When("^user enter \"([^\"]*)\" as address$")
	public void user_enter_as_address(String address) throws Throwable
	{
		 //enter username
		Object []input7=new Object[2];
		input7[0]="//*[@name='addressLine1']";
		input7[1]=address;
		 Hashtable<String,Object> output7=SeleniumOperation.sendKey(input7);
		 HTMLReportGenerator.StepDetails(output7.get("STATUS").toString(), "^user enter \"([^\"]*)\" as address$", output7.get("MESSAGE").toString()); 
	}

	@When("^user click on Save button$")
	public void user_click_on_Save_button() throws Throwable
	{
		Thread.sleep(5000);
		Object [] input8=new Object[1];
		input8[0]="//*[text()='Save']";
		 Hashtable<String,Object> output8=SeleniumOperation.click(input8);
		 HTMLReportGenerator.StepDetails(output8.get("STATUS").toString(),"^user click on Save button$", output8.get("MESSAGE").toString()); 
	}

	@Then("^validate address is added successfully$")
	public void validate_address_is_added_successfully() throws Throwable 
	{
		//validate Login test case
				Object [] input9=new Object[2];
				input9[0]="9309146478";
				input9[1]="(//*[@class='_1Z7fmh _3CfVDh'])[1]";
				 Hashtable<String,Object> output9=SeleniumOperation.validation(input9);    
				 HTMLReportGenerator.StepDetails(output9.get("STATUS").toString(),"^validate address is added successfully$", output9.get("MESSAGE").toString()); 
	}


	
	
	
}
