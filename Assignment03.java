// CSE 110     : ONLINE
// Assignment  : Assignment03
// Author      : Joel M. Crenshaw
// Description : A program that takes user input and advises them to buy, sell, or hold their shares.
import java.util.Scanner;

public class Assignment03 {

	public static void main(String[] args) {
		// Declare and instantiate a Scanner
		Scanner in = new Scanner(System.in);
		
		// Declare and initialize variables
		final double transaction_fee = 10; // Any transaction (buy or sell) is charged this fee
    	double purchasePrice; // (Per Share) paid for current stock in the account
    	double marketPrice; // (Per Share) of this stock. The current market price for buy/selling
    	double availableFunds; // Amount the client is willing to spend on a transaction
    	double numOfSharesToBuy;
    	double numOfSharesToSell;
    	double totalBuyValue;
    	double totalShareBuyValue;
    	double totalBuyCost;
    	double totalShareValue;
    	double currentShares;
    	double perShareSellValue = 0;
    	double perSellShareValue = 0;

    	
    	// Prompt to collect inputs
    	System.out.print("Current Shares : ");
    	currentShares = in.nextDouble();
    	System.out.print("Purchase Price : ");
    	purchasePrice = in.nextDouble();
    	System.out.print("Market Price : ");
    	marketPrice = in.nextDouble();
    	System.out.print("Available Funds : ");
    	availableFunds = in.nextDouble();
    	System.out.println();
    	
    	
    	// Compute required values
    		
    		// Formulas for buy values
    	double numSharesToBuy = Math.floor((availableFunds - transaction_fee / marketPrice));
    	double perShareBuyValue = purchasePrice - marketPrice;
    	totalBuyValue = perShareBuyValue * numSharesToBuy;
    	
    		// Formulas for sell values
    	double totalSellValue = perShareSellValue * currentShares;
		double numberOfSharesToSell = Math.floor(totalSellValue / perSellShareValue);
    	perShareSellValue = marketPrice - purchasePrice;

    	
    	
    	// Display required outputs
    	
    	// Sell or hold shares if purchasePrice < marketPrice
    	if (purchasePrice < marketPrice) {
    		// Sells shares if transaction is profitable after the transaction fee
    		if (totalSellValue > 10) {
    		System.out.println("Sell " + (int)numberOfSharesToSell + "Shares");
    	}
    		// Hold shares if otherwise
    		else {
    			System.out.println("Hold Shares");
    		}
    	}
    	
    	// Buy or hold shares if purchasePrice > marketPrice
    	else if (purchasePrice > marketPrice) {
    		// Buy shares if value of transaction > transactionFee
    		if (totalBuyValue > 10) {
    			System.out.println("Buy " + (int)numSharesToBuy + " Shares");
    		}
    		// Hold shares if otherwise 
    		else {
    			System.out.println("Hold Shares");
    		}
    	}
    		
    	// Hold shares if purchasePrice == marketPrice 
    	
    	else {
    		System.out.println("Hold Shares");
    	}
    	
	} // End of main 

} // End of class
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
 
