/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flowershop;

import java.util.*;
import java.util.Scanner;

/**
 *
 * @author Atlas
 */
public class FlowerShop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
        
        int selection;
        int flowerOrder, quantity;
        int ConsID;
        int invoiceNo;
        int monthlyCreditLimit = 10000;
        int paymentProceed;
        int yesOrNo = 0;
        int date;
        int decision;
        double finalPrice;
        
        List ConsList = new ArrayList<>();
        Consumer Cons_1 = new Consumer(001,10000, "Wai Jing Yang", "Corporate Customer");
        Consumer Cons_2 = new Consumer(002,5000,"Lim Yong Xiang", "Corporate Customer");
        Consumer Cons_3 = new Consumer(003,20000, "Tham Jia Qing", "Consumer");
        Consumer Cons_4 = new Consumer(004,8000, "MahesWar", "Consumer");
        
        List FlowerList = new ArrayList<>();
        FlowerCatalog flower_1 = new FlowerCatalog("Carnation     ", 7.00);
        FlowerCatalog flower_2 = new FlowerCatalog("Rose          ", 8.50);
        FlowerCatalog flower_3 = new FlowerCatalog("Tulip         ", 12.80);
        
        
        List PaymentList = new ArrayList<>();
        InvoicePayment payment_1 = new InvoicePayment(00001, 001, 12052018,50,8.50,425.00, "Rose", "The rose is the world’s most popular and acclaimed flower. Available in a variety of sizes, shapes and colors, roses symbolize love and happiness","Corporate Customer");
        InvoicePayment payment_2 = new InvoicePayment(00002, 002, 22052018,250,12.80,3200.00, "Tulip", "tantalizing bell-shaped flowers, thus triggering a trend known as “tulipomania", "Corporate Customer");
        InvoicePayment payment_3 = new InvoicePayment(00003, 003, 15082018,100,7.00,700, "Carnation ", "Carnations are extremely common flowers that symbolize fascination, distinction and love", "Consumer");
        
       
        do{        
            FlowerShopModuleB();//Main Menu
            selection = scan.nextInt();//select menu
            
            
            if(selection == 1){
                System.out.println("\n");
                System.out.println("ORDER");
                System.out.println("=====");
                System.out.println("1. " + flower_1);
                System.out.println("2. " + flower_2);
                System.out.println("3. " + flower_3);
                System.out.print("Pick which flower you want : ");                             
                flowerOrder = scan.nextInt();
                System.out.print("Enter the quantity         : ");
                quantity = scan.nextInt();       
                if(flowerOrder == 1){         
                    finalPrice = (flower_1.getPrice() * quantity);
                    System.out.println("\n\n");
                    System.out.println("Invoice");
                    System.out.println("=======");
                    System.out.println("The flower you order          : " + flower_1.getFlowerName());
                    System.out.println("Order quality                 : " + quantity);
                    System.out.println("Price for each flower ordered : RM " + flower_1.getPrice());
                    System.out.println("Total Price                   : RM " + finalPrice);   
                    System.out.println("\n");
                    System.out.print("Enter your customer ID : ");
                    ConsID = scan.nextInt();
                    if(ConsID == Cons_1.getConsumerID()){
                        System.out.println("Name   : " + Cons_1.getConsumerName());
                        System.out.println("Type   : " + Cons_1.getConsumerStatus());
                            if(finalPrice > monthlyCreditLimit){
                                System.out.println("Order denied");
                                System.out.println("You have a monthly credit limit of RM 10,000");
                                System.out.println("Please re-enter amount of purchase order");
                            }else{
                                System.out.println("Order success");
                                System.out.println("Thank you and please come again !");       
                            }
                    }else if(ConsID == Cons_2.getConsumerID()){
                        System.out.println("Name   : " + Cons_2.getConsumerName());
                        System.out.println("Type   : " + Cons_2.getConsumerStatus());
                         if(finalPrice > monthlyCreditLimit){
                                System.out.println("Order denied");
                                System.out.println("You have a monthly credit limit of RM 5,000");
                                System.out.println("Please re-enter amount of purchase order");
                            }else{
                                System.out.println("Order success");
                                System.out.println("Thank you and please come again !");       
                            }                          
                    }else if(ConsID == Cons_3.getConsumerID()){
                        System.out.println("Name   : " + Cons_3.getConsumerName());
                        System.out.println("Type   : " + Cons_3.getConsumerStatus());
                         if(finalPrice > monthlyCreditLimit){
                                System.out.println("Order denied");
                                System.out.println("You have a monthly credit limit of RM 20,000");
                                System.out.println("Please re-enter amount of purchase order");
                            }else{
                                System.out.println("Order success");
                                System.out.println("Thank you and please come again !");       
                            }
                    }else if(ConsID == Cons_4.getConsumerID()){
                        System.out.println("Name   : " + Cons_4.getConsumerName());
                        System.out.println("Type   : " + Cons_4.getConsumerStatus());
                            if(finalPrice > monthlyCreditLimit){
                                System.out.println("Order denied");
                                System.out.println("You have a monthly credit limit of RM 8,000");
                                System.out.println("Please re-enter amount of purchase order");
                            }else{
                                System.out.println("Order success");
                                System.out.println("Thank you and please come again !");       
                            }
                    }
                }else if(flowerOrder == 2){
                    finalPrice = (flower_2.getPrice() * quantity);
                    System.out.println("\n\n");
                    System.out.println("Invoice");
                    System.out.println("=======");
                    System.out.println("The flower you order          : " + flower_2.getFlowerName());
                    System.out.println("Order quality                 : " + quantity);
                    System.out.println("Price for each flower ordered : RM " + flower_2.getPrice());
                    System.out.println("Total Price                   : RM " + finalPrice);
                    System.out.println("\n"); 
                    System.out.print("Enter your customer ID : ");
                    ConsID = scan.nextInt();
                     if(ConsID == Cons_1.getConsumerID()){
                        System.out.println("Name   : " + Cons_1.getConsumerName());
                        System.out.println("Type   : " + Cons_1.getConsumerStatus());
                            if(finalPrice > monthlyCreditLimit){
                                System.out.println("Order denied");
                                System.out.println("You have a monthly credit limit of RM 10,000");
                                System.out.println("Please re-enter amount of purchase order");
                            }else{
                                System.out.println("Order success");
                                System.out.println("Thank you and please come again !");       
                            }
                    }else if(ConsID == Cons_2.getConsumerID()){
                        System.out.println("Name   : " + Cons_2.getConsumerName());
                        System.out.println("Type   : " + Cons_2.getConsumerStatus());
                         if(finalPrice > monthlyCreditLimit){
                                System.out.println("Order denied");
                                System.out.println("You have a monthly credit limit of RM 5,000");
                                System.out.println("Please re-enter amount of purchase order");
                            }else{
                                System.out.println("Order success");
                                System.out.println("Thank you and please come again !");       
                            }                          
                    }else if(ConsID == Cons_3.getConsumerID()){
                        System.out.println("Name   : " + Cons_3.getConsumerName());
                        System.out.println("Type   : " + Cons_3.getConsumerStatus());
                         if(finalPrice > monthlyCreditLimit){
                                System.out.println("Order denied");
                                System.out.println("You have a monthly credit limit of RM 20,000");
                                System.out.println("Please re-enter amount of purchase order");
                            }else{
                                System.out.println("Order success");
                                System.out.println("Thank you and please come again !");       
                            }
                    }else if(ConsID== Cons_4.getConsumerID()){
                        System.out.println("Name   : " + Cons_4.getConsumerName());
                        System.out.println("Type   : " + Cons_4.getConsumerStatus());
                            if(finalPrice > monthlyCreditLimit){
                                System.out.println("Order denied");
                                System.out.println("You have a monthly credit limit of RM 8,000");
                                System.out.println("Please re-enter amount of purchase order");
                            }else{
                                System.out.println("Order success");
                                System.out.println("Thank you and please come again !");       
                            }
                    }
                }else if(flowerOrder == 3){
                    finalPrice = (flower_3.getPrice() * quantity);
                    System.out.println("\n\n");
                    System.out.println("Invoice");
                    System.out.println("=======");
                    System.out.println("The flower you order         : " + flower_3.getFlowerName());
                    System.out.println("Order quality                : " + quantity);
                    System.out.println("Price for each flower ordered: RM " + flower_3.getPrice());
                    System.out.println("Total Price                  : RM " + finalPrice);
                    System.out.println("\n");
                    System.out.print("Enter your customer ID : ");
                    ConsID = scan.nextInt();
                     if(ConsID == Cons_1.getConsumerID()){
                        System.out.println("Name   : " + Cons_1.getConsumerName());
                        System.out.println("Type   : " + Cons_1.getConsumerStatus());
                            if(finalPrice > monthlyCreditLimit){
                                System.out.println("Order denied");
                                System.out.println("You have a monthly credit limit of RM 10,000");
                                System.out.println("Please re-enter amount of purchase order");
                            }else{
                                System.out.println("Order success");
                                System.out.println("Thank you and please come again !");       
                            }
                    }else if(ConsID == Cons_2.getConsumerID()){
                        System.out.println("Name   : " + Cons_2.getConsumerName());
                        System.out.println("Type   : " + Cons_2.getConsumerStatus());
                         if(finalPrice > monthlyCreditLimit){
                                System.out.println("Order denied");
                                System.out.println("You have a monthly credit limit of RM 5,000");
                                System.out.println("Please re-enter amount of purchase order");
                            }else{
                                System.out.println("Order success");
                                System.out.println("Thank you and please come again !");       
                            }                          
                    }else if(ConsID == Cons_3.getConsumerID()){
                        System.out.println("Name   : " + Cons_3.getConsumerName());
                        System.out.println("Type   : " + Cons_3.getConsumerStatus());
                         if(finalPrice > monthlyCreditLimit){
                                System.out.println("Order denied");
                                System.out.println("You have a monthly credit limit of RM 20,000");
                                System.out.println("Please re-enter amount of purchase order");
                            }else{
                                System.out.println("Order success");
                                System.out.println("Thank you and please come again !");       
                            }
                    }else if(ConsID== Cons_4.getConsumerID()){
                        System.out.println("Name   : " + Cons_4.getConsumerName());
                        System.out.println("Type   : " + Cons_4.getConsumerStatus());
                            if(finalPrice > monthlyCreditLimit){
                                System.out.println("Order denied");
                                System.out.println("You have a monthly credit limit of RM 8,000");
                                System.out.println("Please re-enter amount of purchase order");
                            }else{
                                System.out.println("Order success");
                                System.out.println("Thank you and please come again !");       
                            }
                }
                
                
            }else if(selection == 2){
                System.out.println("\n");
                invoiceGenerate();
                ConsID = scan.nextInt();
                if(ConsID == payment_1.getCustomerID()){
                    System.out.println(payment_1);
                }else if(ConsID == payment_2.getCustomerID()){
                    System.out.println(payment_2);
                }else if(ConsID== payment_3.getCustomerID()){
                    System.out.println(payment_3);
                }
            }
            }else if(selection == 3){
                System.out.println("\n");
                Payment();
                ConsID = scan.nextInt();
                if(ConsID == payment_1.getCustomerID()){
                    System.out.println("The amount u need to pay is : RM" + payment_1.getTotalprice());
                    System.out.print("Confirm to pay? (1 = Yes, 2 = No)");
                    decision = scan.nextInt();
                    if(decision == 1){
                        System.out.print("Enter today's date : ");
                        date = scan.nextInt();
                        if(date > 7){
                            System.out.println("Your account is overdue");
                            System.out.println("You are unable to make further order");
                           ;
                        }else{
                            System.out.println("Payment successful");
                            System.out.println("Thank you and please come again !");
                        }
                    }else{
                        System.out.println(":(");
                    }
                }else if(ConsID == payment_2.getCustomerID()){
                    System.out.println("The amount u need to pay is : RM" + payment_2.getTotalprice());
                    System.out.print("Confirm to pay? (1 = Yes, 2 = No)");
                    decision = scan.nextInt();
                    if(decision == 1){
                        System.out.print("Enter today date : ");
                        date = scan.nextInt();
                        if(date > 7){
                            System.out.println("Your account is overdue");
                            System.out.println("You are unable to make further order");
                            
                        }else{
                            System.out.println("Payment successful");
                            System.out.println("Thank you and please come again !");
                        }
                    }else{
                        System.out.println(":(");
                    }
                    
                }else if(ConsID == payment_3.getCustomerID()){
                    System.out.println("The amount to pay is : RM" + payment_3.getTotalprice());
                    System.out.print("Confirm Payment? (1 = Yes, 2 = No)");
                    decision = scan.nextInt();
                  if(decision == 1){
                        System.out.print("Enter today date : ");
                        date = scan.nextInt();
                        if(date > 7){
                            System.out.println("Your account is overdue");
                            System.out.println("You are unable to make further order");
                            
                        }else{
                            System.out.println("Payment successful");
                            System.out.println("Thank you and please come again !");
                        }
                    }else{
                        System.out.println(":(");
                    }
                    
                    
                }
                
                
            }
            System.out.print("\n\nAre you want to continue ? (1 = Yes | 2 = No)");
            yesOrNo = scan.nextInt();
        }while(yesOrNo == 1);
        System.out.println("Thank you and Have a good one ! ");

    } 
 
    /**
     *
     */
    public static void FlowerShopModuleB(){
        System.out.println("Customer Maintenance and Invoice Payment");
        System.out.println("========================================");
        System.out.println("1. Place Order");
        System.out.println("2. Generate Invoice");
        System.out.println("3. Payment");
        System.out.print("Your selection : ");
    }   
    
    public static void invoiceGenerate(){
        System.out.println("INVOICE and PAYMENT");
        System.out.println("===================");
        System.out.print("Enter customerID : ");
    }
    
    public static void Payment(){
        System.out.println("PAYMENT");
        System.out.println("=======");
        System.out.print("Enter your Customer ID : ");
    }
}

