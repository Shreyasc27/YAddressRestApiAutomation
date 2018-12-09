package pojo;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "ErrorCode", "ErrorMessage", "AddressLine1", "AddressLine2", "Number", "PreDir", "Street",
		"Suffix", "PostDir", "Sec", "SecNumber", "City", "State", "Zip", "Zip4", "County", "StateFP", "CountyFP",
		"CensusTract", "CensusBlock", "Latitude", "Longitude", "GeoPrecision" })
public class Yaddress {

	@JsonProperty("ErrorCode")
	private Integer errorCode;
	@JsonProperty("ErrorMessage")
	private String errorMessage;
	@JsonProperty("AddressLine1")
	private String addressLine1;
	@JsonProperty("AddressLine2")
	private String addressLine2;
	@JsonProperty("Number")
	private String number;
	@JsonProperty("PreDir")
	private String preDir;
	@JsonProperty("Street")
	private String street;
	@JsonProperty("Suffix")
	private String suffix;
	@JsonProperty("PostDir")
	private String postDir;
	@JsonProperty("Sec")
	private String sec;
	@JsonProperty("SecNumber")
	private String secNumber;
	@JsonProperty("City")
	private String city;
	@JsonProperty("State")
	private String state;
	@JsonProperty("Zip")
	private String zip;
	@JsonProperty("Zip4")
	private String zip4;
	@JsonProperty("County")
	private String county;
	@JsonProperty("StateFP")
	private String stateFP;
	@JsonProperty("CountyFP")
	private String countyFP;
	@JsonProperty("CensusTract")
	private String censusTract;
	@JsonProperty("CensusBlock")
	private String censusBlock;
	@JsonProperty("Latitude")
	private Double latitude;
	@JsonProperty("Longitude")
	private Double longitude;
	@JsonProperty("GeoPrecision")
	private Integer geoPrecision;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("ErrorCode")
	public Integer getErrorCode() {
		return errorCode;
	}

	@JsonProperty("ErrorCode")
	public void setErrorCode(Integer errorCode) {
		this.errorCode = errorCode;
	}

	@JsonProperty("ErrorMessage")
	public String getErrorMessage() {
		return errorMessage;
	}

	@JsonProperty("ErrorMessage")
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	@JsonProperty("AddressLine1")
	public String getAddressLine1() {
		return addressLine1;
	}

	@JsonProperty("AddressLine1")
	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}

	@JsonProperty("AddressLine2")
	public String getAddressLine2() {
		return addressLine2;
	}

	@JsonProperty("AddressLine2")
	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}

	@JsonProperty("Number")
	public String getNumber() {
		return number;
	}

	@JsonProperty("Number")
	public void setNumber(String number) {
		this.number = number;
	}

	@JsonProperty("PreDir")
	public String getPreDir() {
		return preDir;
	}

	@JsonProperty("PreDir")
	public void setPreDir(String preDir) {
		this.preDir = preDir;
	}

	@JsonProperty("Street")
	public String getStreet() {
		return street;
	}

	@JsonProperty("Street")
	public void setStreet(String street) {
		this.street = street;
	}

	@JsonProperty("Suffix")
	public String getSuffix() {
		return suffix;
	}

	@JsonProperty("Suffix")
	public void setSuffix(String suffix) {
		this.suffix = suffix;
	}

	@JsonProperty("PostDir")
	public String getPostDir() {
		return postDir;
	}

	@JsonProperty("PostDir")
	public void setPostDir(String postDir) {
		this.postDir = postDir;
	}

	@JsonProperty("Sec")
	public String getSec() {
		return sec;
	}

	@JsonProperty("Sec")
	public void setSec(String sec) {
		this.sec = sec;
	}

	@JsonProperty("SecNumber")
	public String getSecNumber() {
		return secNumber;
	}

	@JsonProperty("SecNumber")
	public void setSecNumber(String secNumber) {
		this.secNumber = secNumber;
	}

	@JsonProperty("City")
	public String getCity() {
		return city;
	}

	@JsonProperty("City")
	public void setCity(String city) {
		this.city = city;
	}

	@JsonProperty("State")
	public String getState() {
		return state;
	}

	@JsonProperty("State")
	public void setState(String state) {
		this.state = state;
	}

	@JsonProperty("Zip")
	public String getZip() {
		return zip;
	}

	@JsonProperty("Zip")
	public void setZip(String zip) {
		this.zip = zip;
	}

	@JsonProperty("Zip4")
	public String getZip4() {
		return zip4;
	}

	@JsonProperty("Zip4")
	public void setZip4(String zip4) {
		this.zip4 = zip4;
	}

	@JsonProperty("County")
	public String getCounty() {
		return county;
	}

	@JsonProperty("County")
	public void setCounty(String county) {
		this.county = county;
	}

	@JsonProperty("StateFP")
	public String getStateFP() {
		return stateFP;
	}

	@JsonProperty("StateFP")
	public void setStateFP(String stateFP) {
		this.stateFP = stateFP;
	}

	@JsonProperty("CountyFP")
	public String getCountyFP() {
		return countyFP;
	}

	@JsonProperty("CountyFP")
	public void setCountyFP(String countyFP) {
		this.countyFP = countyFP;
	}

	@JsonProperty("CensusTract")
	public String getCensusTract() {
		return censusTract;
	}

	@JsonProperty("CensusTract")
	public void setCensusTract(String censusTract) {
		this.censusTract = censusTract;
	}

	@JsonProperty("CensusBlock")
	public String getCensusBlock() {
		return censusBlock;
	}

	@JsonProperty("CensusBlock")
	public void setCensusBlock(String censusBlock) {
		this.censusBlock = censusBlock;
	}

	@JsonProperty("Latitude")
	public Double getLatitude() {
		return latitude;
	}

	@JsonProperty("Latitude")
	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}

	@JsonProperty("Longitude")
	public Double getLongitude() {
		return longitude;
	}

	@JsonProperty("Longitude")
	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}

	@JsonProperty("GeoPrecision")
	public Integer getGeoPrecision() {
		return geoPrecision;
	}

	@JsonProperty("GeoPrecision")
	public void setGeoPrecision(Integer geoPrecision) {
		this.geoPrecision = geoPrecision;
	}

	@JsonAnyGetter
	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}

	@JsonAnySetter
	public void setAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
	}

}