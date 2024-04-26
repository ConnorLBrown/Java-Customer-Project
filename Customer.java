/*
Name:Connor Brown
Email: cbrown30@una.edu
Course Information: <CIS 315-03>
Program Source File Name: Customers.java
Programming Assignment: #1
Program Description: Making healthcare system for lab test
Due Date: 12/5/2022
In keeping with the honor code policies of the University of University of
North Alabama, the
School of Business, and the Department of Computer Science and Information
Systems, I
affirm that I have neither given nor received on this programming assignment.
This
assignment
represents my individual, original effort.
... My Signature is on File.
/*Private fields will include:
Customer first name, last name, lab test category number, lab test description,
customer ID,
balance, cost of a lab test (which is $ 120), and customer ID = 1000.
Constructor:
Prompt the user to enter customer first name, last name and department number.
Call setCustomerID method here. */



import java.util.scanner;

// Customer class, generate id

public class Customer{
private String fname;
private String lname;
private int department;
public String description;
private int customerId;
private int balance = 0;
private int cost = 120;
private static int Cid = 10000;
public customer(String fname, String lname, int department, String
department, int customerId){
fname = fname;
lname = lname;
department = department;
nextCid++;
setCustomerID();
addLabTest();
ViewBalance();
}
private String setCustomerID() {
this.customerID = department+" "+Cid;
System.out.println("Customer ID is" + this.customerID;)
}
//Add the lab tests and finding the amount to be paid by the customer.
public void addLabTest() {
Scanner keyboard = new Scanner(System.in);
System.out.println("Enter in the Lab test conducted(Enter Q to quit):
");
description = keyboard.nextLine();
while description !=Q;{
balance = balance + cost;
System.out.println("Do you need to add another lab test?(Press Q to
quit): ");
String description = keyboard.nextline();
ViewBalance();
}
}
  
//View the balance
public void ViewBalance() {
System.out.println("The Balance for"+fname+" "+lname+"
"+"is"+""+balance);
}
  
//Pay the balance
public void PayBalance() {
ViewBalance();
System.out.println("Enter in amount you want to pay: ");
int amount = keyboard.nextInt();
balance = balance - amount
System.out.println("The remaining balance is"+ balance);
}
  
//Show the information
public String toString() {
return "Customer:"+this.fname+" "+this.lname+"\n"+"ID number:
"+this.customerid+"\n"+"Balance: "+this.balance+"\n"+"Department number:
"+this.department;
//return the name of customer (first name and last name), customer ID,
department number,
//the lab tests, balance.
}
}
