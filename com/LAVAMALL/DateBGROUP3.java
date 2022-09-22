package com.LAVAMALL;
public class DateBGROUP3
{
	String orderMonth, orderDay, orderYear;
public DateBGROUP3(){}

public DateBGROUP3(String month,String day,String year){
	this.orderMonth=month;
	this.orderDay=day;
	this.orderYear=year;
}
public void setorderMonth(String month){
	this.orderMonth=month;
}
public String getorderMonth(){
	return this.orderMonth;
}
public void setorderDay(String day){
	this.orderDay=day;
}
public String getorderDay(){
	return this.orderDay;
}
public void setorderYear(String year){
	this.orderYear=year;
}
public String getorderYear(){
	return this.orderYear;
}
}
