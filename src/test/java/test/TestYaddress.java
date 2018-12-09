package test;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.testng.ITestContext;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import api.YaddressDetails.GetAddressDetails;
import pojo.Yaddress;
import utils.Constants;
import utils.PropertiesManager;

public class TestYaddress extends BaseTest {
	
	public static final Logger logger = Logger.getLogger(TestYaddress.class);
	SoftAssert softAssertion = null;

	@Test
	@Parameters({"protocol", "addressLineOne","addressLineTwo"})
	public void verify_Response_For_AddressLineOne_And_AddressLineTwo_Inputs(String protocol, String addressLineOne, String addressLineTwo, ITestContext context) throws IOException {
		
		softAssertion = new SoftAssert();
		String yaddressbaseURI = null;
		
		switch (protocol) {

	        case "http":
	        	yaddressbaseURI = PropertiesManager.getProperty("yaddressBaseURIHttp");
	            break;
	        case "https":
	        	yaddressbaseURI = PropertiesManager.getProperty("yaddressBaseURIHttps");
	            break;
            
		}
		
        GetAddressDetails getAddressDetails = new GetAddressDetails(yaddressbaseURI);
        getAddressDetails.setAddressLineOne(addressLineOne);
        getAddressDetails.setAddressLineTwo(addressLineTwo);
        getAddressDetails.setExpectedStatusCode(200);
        getAddressDetails.perform();
        
        Yaddress yaddressActual = getAddressDetails.getAPIResponseAsPOJO(Yaddress.class);
        Yaddress yaddressExpected = getAddressDetails.getExpectedAddressDetails(context.getName());
        
        softAssertion.assertEquals(yaddressActual.getErrorCode(), yaddressExpected.getErrorCode(), "Error Code" + Constants.DOES_NOT_MATCH);
        softAssertion.assertEquals(yaddressActual.getErrorMessage(), yaddressExpected.getErrorMessage(), "Error Message" + Constants.DOES_NOT_MATCH);
        softAssertion.assertEquals(yaddressActual.getAddressLine1(), yaddressExpected.getAddressLine1(), "Address Line 1" + Constants.DOES_NOT_MATCH);
        softAssertion.assertEquals(yaddressActual.getAddressLine2(), yaddressExpected.getAddressLine2(), "Address Line 2" + Constants.DOES_NOT_MATCH);
        softAssertion.assertEquals(yaddressActual.getNumber(), yaddressExpected.getNumber(), "Number" + Constants.DOES_NOT_MATCH);
        softAssertion.assertEquals(yaddressActual.getPreDir(), yaddressExpected.getPreDir(), "PerDir" + Constants.DOES_NOT_MATCH);
        softAssertion.assertEquals(yaddressActual.getStreet(), yaddressExpected.getStreet(), "Street" + Constants.DOES_NOT_MATCH);
        softAssertion.assertEquals(yaddressActual.getSuffix(), yaddressExpected.getSuffix(), "Suffix" + Constants.DOES_NOT_MATCH);
        softAssertion.assertEquals(yaddressActual.getPostDir(), yaddressExpected.getPostDir(), "PosrDir" + Constants.DOES_NOT_MATCH);
        softAssertion.assertEquals(yaddressActual.getSec(), yaddressExpected.getSec(), "Sec" + Constants.DOES_NOT_MATCH);
        softAssertion.assertEquals(yaddressActual.getSecNumber(), yaddressExpected.getSecNumber(), "Sec Number" + Constants.DOES_NOT_MATCH);
        softAssertion.assertEquals(yaddressActual.getCity(), yaddressExpected.getCity(), "City" + Constants.DOES_NOT_MATCH);
        softAssertion.assertEquals(yaddressActual.getState(), yaddressExpected.getState(), "State" + Constants.DOES_NOT_MATCH);
        softAssertion.assertEquals(yaddressActual.getZip(), yaddressExpected.getZip(), "Zip" + Constants.DOES_NOT_MATCH);
        softAssertion.assertEquals(yaddressActual.getZip4(), yaddressExpected.getZip4(), "Zip4" + Constants.DOES_NOT_MATCH);
        softAssertion.assertEquals(yaddressActual.getCounty(), yaddressExpected.getCounty(), "County" + Constants.DOES_NOT_MATCH);
        softAssertion.assertEquals(yaddressActual.getStateFP(), yaddressExpected.getStateFP(), "StateFP" + Constants.DOES_NOT_MATCH);
        softAssertion.assertEquals(yaddressActual.getCountyFP(), yaddressExpected.getCountyFP(), "CountFP" + Constants.DOES_NOT_MATCH);
        softAssertion.assertEquals(yaddressActual.getCensusTract(), yaddressExpected.getCensusTract(), "Census Tract" + Constants.DOES_NOT_MATCH);
        softAssertion.assertEquals(yaddressActual.getCensusBlock(), yaddressExpected.getCensusBlock(), "Census Block" + Constants.DOES_NOT_MATCH);
        softAssertion.assertEquals(yaddressActual.getLatitude(), yaddressExpected.getLatitude(), "Latitude" + Constants.DOES_NOT_MATCH);
        softAssertion.assertEquals(yaddressActual.getLongitude(), yaddressExpected.getLongitude(), "Longitude" + Constants.DOES_NOT_MATCH);
        softAssertion.assertEquals(yaddressActual.getGeoPrecision(), yaddressExpected.getGeoPrecision(), "Geo Precision" + Constants.DOES_NOT_MATCH);
        
        softAssertion.assertAll();
        
	}
	
}
