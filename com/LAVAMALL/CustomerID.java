package com.LAVAMALL;

public class CustomerID
{
	String CustomerName,CustomerMobileNumber;
public CustomerID(){}
public CustomerID(String CustomerName,
String CustomerMobileNumber){
	this.CustomerName=CustomerName;
	this.CustomerMobileNumber=CustomerMobileNumber;
}
public void setCustomerName(String name){
	this.CustomerName=name;
}
public String getCustomerName(){
	return this.CustomerName;
}
public void setCustomerMobileNumber(String mobile){
	this.CustomerMobileNumber=mobile;
}
public String getCustomerMobileNumber(){
	return this.CustomerMobileNumber;
}
}
