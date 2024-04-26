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
... My Signature is on File. */


import java.util.Scanner;
public class CustomerLabTest{
public static void main (String arg[]){
System.out.println("Enter the number of customers: ");
Scanner keyboard = new Scanner(System.in);
int n = keyboard.nextInt();
String Customers
Customer[] customer = new Customer[n];
// (n=0; n< number of students , increment n by 1)
for (i=0;i<n; ;i++) {
customer[] = new Customer():
System.out.println("Enter in the customers first name:");
fname = keyboard.nextLine();
System.out.println("Enter in the customers last name:");
lname = keyboard.nextLine();
System.out.println("Enter the department in which the test was
conducted. Choose one of the following numbers.");
System.out.println("1.Microbiology\n2.Virology\n3.Hematology\
n4.Parasitology");
int department = keyboard.nextInt();
customer[n].setData(fname,lname,department,customerID);
customer[n].setCustomerID();
customer[n].addLabTest();
customer[n].ViewBalance();
customer[n].PayBalance();
customer[n].toString();
System.out.println(customer[n].toString());
}
keyboard.close();
}
}
