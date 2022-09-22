package com.LAVAMALL;

import java.util.Scanner;
public class LAVAMALL
{
	static int  totalNumberOfItems;
	static double totalDiscount,TotalOrder;
	static Scanner input=new Scanner(System.in);
	static CustomerID customerID=new CustomerID();
	static PriceBGROUP3 itemPrice=new PriceBGROUP3();
	static ItemsBGROUP3 itemQuantity=new ItemsBGROUP3();
	static DateBGROUP3 date=new DateBGROUP3();
	public static void main(String[] args){
		System.out.println("Welcome to Lava Shopping Mall");
		System.out.print("Please enter customer's name: ");
		customerID.setCustomerName(input.next());
		System.out.print("Please enter customer's mobile phone number: ");
		customerID.setCustomerMobileNumber(input.next());
		System.out.print("What is the price of Shirt: ");
		itemPrice.setPriceShirt(input.nextDouble());
		System.out.print("What is the price of Necklace: ");
		itemPrice.setPriceNecklace(input.nextDouble());
		System.out.print("What is the price of Sneaker: ");
		itemPrice.setPricecSneaker(input.nextDouble());
		System.out.print("What is the price of Cap: ");
		itemPrice.setPriceCap(input.nextDouble());
		System.out.print("What is the price of Watch: ");
		itemPrice.setPriceWatch(input.nextDouble());
		System.out.print("How many Shirts were ordered: ");
		itemQuantity.setQuanShirt(input.nextInt());
		System.out.print("How many Necklace were ordered: ");
		itemQuantity.setQuanNecklace(input.nextInt());
		System.out.print("How many Sneaker were ordered: ");
		itemQuantity.setQuanSneaker(input.nextInt());
		System.out.print("How many Cap were ordered: ");
		itemQuantity.setQuanCap(input.nextInt());
		System.out.print("How many Watch were ordered: ");
		itemQuantity.setQuanWatch(input.nextInt());
		System.out.println("Enter details of client's visit below");
		System.out.println("****************************************");
		System.out.println();
		System.out.print("Enter Month-number: ");
		date.setorderMonth(input.next());
		System.out.print("Enter Day-Number: ");
		date.setorderDay(input.next());
		System.out.print("Enter Year: ");
		date.setorderYear(input.next());
		totalNumberOfItems=itemQuantity.getQuanCap()+itemQuantity.getQuanNecklace()+
		itemQuantity.getQuanShirt()+itemQuantity.getQuanSneaker()+itemQuantity.getQuanWatch();
		TotalOrder=itemPrice.getPriceCap()+itemPrice.getPriceNecklace()+
		itemPrice.getPriceShirt()+itemPrice.getPriceSneaker()+itemPrice.getPriceWatch();
		totalDiscount=0.25*TotalOrder;
		createReceipt();
	}
	public static void createReceipt(){
	System.out.println("\n\n");
	System.out.println("-/- LAVAMALL Retail Shop -/-");
	System.out.println("\n");
	System.out.println("==============================================");
	System.out.println("Customer: "+customerID.getCustomerName());
	System.out.println("Mobile Phone: "+customerID.getCustomerMobileNumber());
	System.out.println("Order Date: "+date.getorderDay()+"/"+date.getorderMonth()+
	"/"+date.getorderYear());
	System.out.println("------------------------------------------------");
	System.out.println("Item Type \t Qty \t UnitPrice \t Sub-Total");
	System.out.println("Shirt     \t "+itemQuantity.getQuanShirt()+"   \t $"+
	String.format("%.2f",itemPrice.getPriceShirt())+"     \t "+String.format("%.2f",itemQuantity.getQuanShirt()*itemPrice.getPriceShirt()));
		System.out.println("Necklace  \t "+itemQuantity.getQuanNecklace()+"   \t $"+
						   String.format("%.2f",itemPrice.getPriceNecklace())+"  \t "+String.format("%.2f",itemQuantity.getQuanNecklace()*itemPrice.getPriceNecklace()));
		System.out.println("Cap     \t "+itemQuantity.getQuanCap()+"   \t $"+
						   String.format("%.2f",itemPrice.getPriceCap())+"     \t "+String.format("%.2f",itemQuantity.getQuanCap()*itemPrice.getPriceCap()));
		System.out.println("Sneaker  \t "+itemQuantity.getQuanSneaker()+"   \t $"+
						   String.format("%.2f",itemPrice.getPriceSneaker())+"     \t "+String.format("%.2f",itemQuantity.getQuanSneaker()*itemPrice.getPriceSneaker()));
		System.out.println("Watch     \t "+itemQuantity.getQuanWatch()+"   \t $"+
						   String.format("%.2f",itemPrice.getPriceWatch())+"     \t "+String.format("%.2f",itemQuantity.getQuanWatch()*itemPrice.getPriceWatch()));
		System.out.println("------------------------------------------------");
		System.out.println("Number of Items: "+totalNumberOfItems);
		System.out.println("Total Order: "+String.format("%.2f",TotalOrder)+" Total Discount: "+String.format("%.2f",totalDiscount));
		System.out.println("=======================================================================");
		System.out.println("Created by BGroup3, Index numbers{{01211849D, 01210313D, 01214056D, 01211976D, 01210011D, 01210177D, 01213130D, 01210132D, 01211710D, 01211299D}");
	}
}
