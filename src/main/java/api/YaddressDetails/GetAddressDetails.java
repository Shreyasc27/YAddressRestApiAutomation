package api.YaddressDetails;

import static io.restassured.RestAssured.given;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import api.BaseAPI;
import pojo.Yaddress;

public class GetAddressDetails extends BaseAPI {

	String apiPath="/api/address";
    String addressLineOne;
    String addressLineTwo;
	
	public GetAddressDetails(String baseURI) {
		
		super(baseURI);
		
	}

	@Override
	protected void createRequest() {
		
		requestSpecBuilder.setBaseUri(baseURI);
        requestSpecBuilder.setBasePath(apiPath);
        requestSpecBuilder.addQueryParam("AddressLine1",addressLineOne);
        requestSpecBuilder.addQueryParam("AddressLine2",addressLineTwo);
        
        requestSpecification=requestSpecBuilder.build();

	}

	@Override
	protected void executeRequest() {
		
		apiResponse = given().spec(requestSpecification).get();

	}

	@Override
	protected void validateResponse() {

		responseSpecBuilder.expectStatusCode(expectedStatusCode);
        responseSpecification=responseSpecBuilder.build();
        apiResponse.then().spec(responseSpecification);

	}

	public String getAddressLineOne() {
		return addressLineOne;
	}

	public String getAddressLineTwo() {
		return addressLineTwo;
	}

	public void setAddressLineOne(String addressLineOne) {
		this.addressLineOne = addressLineOne;
	}

	public void setAddressLineTwo(String addressLineTwo) {
		this.addressLineTwo = addressLineTwo;
	}

	public Yaddress getExpectedAddressDetails(String jsonFileToRead) throws JsonParseException, JsonMappingException, IOException {
		
		ObjectMapper objectMapper = new ObjectMapper();
		File file = new File("src\\test\\java\\testdata\\" + jsonFileToRead + ".json");
		Yaddress yaddress = objectMapper.readValue(file, Yaddress.class);
		return yaddress;
		
	}
	
}
