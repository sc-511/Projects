package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class UserInferface {
	
	public static void main(String[] args) {
		
	VendingMachine myVendingMachine = new VendingMachine();	
		
	Scanner userInput = new Scanner (System.in);
		
	System.out.println("Welcome to Vendor!");
	
	System.out.println("\nPlease select of one the following by entering in the value");
	
//	System.out.println("(1) Display Vending Machine Items" + "\n(2) Purchase" + "\n(3) Exit");
	
	System.out.println(myVendingMachine.getMenuDisplay() + myVendingMachine.getMenuPurchase() + myVendingMachine.getMenuExit());
	
	String enteringNum = userInput.nextLine();
	
	double moneyFed = 0;
	
	int selector = 0;
	
	int itemCost = 0;
	
	int numQuarters = 0;
	
	int numDimes = 0;
	
	int numNickels = 0;
	
	double moneyFedBeforeChange = 0;
	
	
	boolean mainMenuRepetition = true;
	
	boolean subMenuRepetition = true;
	
//	String action = Double.toString(moneyFed)+ "totalputin" + "totalmoneyFed" + "itempurchase" + "totalmoneyFedBefore" + "totalmoneyFedAfter" + "givechange" + "total";
	String action = "";
	
	DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd/yyyy HH:mm:ss");
	
	LocalDateTime now = LocalDateTime.now();
	
	File output = new File("log.txt");
	
	
	//while (mainMenuRepetition) {
	
		if (!(enteringNum.equals("3"))) {
		
			do {
				
				try (PrintWriter pw = new PrintWriter (new FileWriter(output, true))){
					
					//pw.println(dtf.format(now) + action);
					
					
		
				if (enteringNum.equals("1")){
			
		}
		
				else {
			
			
					System.out.println(myVendingMachine.getFeedMoney() + myVendingMachine.getSelectItem() + myVendingMachine.getFinishTransaction());
			
					String optionSelecter = userInput.nextLine();
					
				if (optionSelecter.contentEquals("1") || optionSelecter.contentEquals("2") || optionSelecter.contentEquals("3")) {	
			
			
					if (optionSelecter.equals("1")) {
				
						System.out.println("Please insert a 1, 2, 5, or 10");
					
						System.out.println("\nCurrent Money Provided: " + myVendingMachine.getTotalFeedCount());
				
						String moneyInserted = userInput.nextLine();
						
//						
						
						myVendingMachine.feedMoney(Double.parseDouble(moneyInserted));
						moneyFed += Double.parseDouble(moneyInserted);
					
//							if (moneyInserted.equals(myVendingMachine.getFeedOneDollar()) | moneyInserted.equals(myVendingMachine.getFeedTwoDollars())| moneyInserted.equals(myVendingMachine.getFeedFiveDollars()) | moneyInserted.equals(myVendingMachine.getFeedTenDollars()) ) {
//									
//								
//									moneyFed += Integer.parseInt(moneyInserted);
//							
									action = " Feed Money: " +  moneyInserted + " " + Double.toString(moneyFed);
//									
//									System.out.println("\n");
//							
//									System.out.println("Current Money Provided: " + moneyFed);
//									
									pw.println(dtf.format(now) + " " + action);
//				
//					}
//					
//							else {
//									System.out.println("Invalid amount fed!!!!");
//							
//									System.out.println("\nCurrent Money Provided: " + moneyFed);
//							
//					}
			}
			
					else if(optionSelecter.equals("2")) {
					
						String productSelector = userInput.nextLine();
					
						moneyFed -= itemCost;
					
						System.out.println("\n");
					
						System.out.println("\nCurrent Money Provided: " + moneyFed);
						
						while (optionSelecter.equals("2")) {
							
						}
						
					
					
				}
			
					else {
				
						System.out.println("Thank you for your service!" + " " + "\nYour total change is: " + moneyFed);
						
						moneyFedBeforeChange = moneyFed;
						double moneyFedAfterChange = myVendingMachine.GiveChange();
						
						

							
					action = "Give Change: " + Double.toString(moneyFedBeforeChange) + " " +  Double.toString(moneyFedAfterChange);
							
					pw.println(dtf.format(now) + " " + action);
					
					//System.out.println("\nThat is " + numQuarters + " Quarters " + numDimes + " Dimes " + numNickels + " Nickels" );
					
					System.out.println("\n");
					
					subMenuRepetition = false;
					
					mainMenuRepetition = false;
					
					
						}
					}
				
				else {
					
					System.out.println("Please enter a value between the range of 1-3");
					
					}
				}
			}
			
			catch (FileNotFoundException e) {
				
				System.out.println("Wrong file type!");
			}
			
			catch (InputMismatchException e) {
				
				System.out.println("Wrong input type");
				
				} 
			catch (IOException e1) {
				
				e1.printStackTrace();
			}
			
			}
			
			while(subMenuRepetition);
		}	
	
	else {
		
		mainMenuRepetition = false;
		
		
		}
	//}
		
	
	
	
	
	
	
	
	
	
		
//		File inventoryStock = new File("vendingmachine.csv");
//		
//		try (Scanner fileScanner = new Scanner (inventoryStock)){
//			
//			while (fileScanner.hasNextLine()) {
//				
//				String line = fileScanner.nextLine();
//				
//				String [] itemValues = line.split("|");
//				
//			}
//		}
//			
//		catch (FileNotFoundException e) {
//			
//		}
//		catch (InputMismatchException e) {
//			
//		} 
//		
		
	}
}
