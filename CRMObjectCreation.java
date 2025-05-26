package com.edify.cj;

import java.util.Scanner;
public class CRMObjectCreation {
 
    public static void main(String[] args) {
    Scanner Mine = new Scanner(System.in);


    System.out.println(" ");

    //Object for Customer 
    Customer P1 = new Customer();
   
   System.out.println("Enter your Name ");
    P1 = Mine.nextLine();
   // P1.contactNumber = 7789086;
    //P1.companyName = "Zebronics";
    //P1.accountManager = "krishna";
    //P1.customerDisplayinfo();   

    System.out.println(" ");

    //object for salesPerson
    salesPerson S1 = new salesPerson();
    S1.name="Jeevan";
    S1.experienceYears = 10;
    S1.dealsClosed = 12;
    S1.displaysalesPersoninfo();

    System.out.println(" ");

    // Object for Deal
    deal deal1 = new deal();
    deal1.dealTitle = "Enterprise Software app";
    deal1.dealValue = 70000;
    deal1.assignedSalesperson = "guranath";
    deal1.displayDealDetails();


}
}
