// Importing the scanner 
import java.util.Scanner;

public class ConstructionProject {
    
    public static void main(String[] args) {
        // declare and instantiate a Scanner
        Scanner in = new Scanner(System.in);

        // declare and initialize variables
        double roadLength = 0;
        int numLanes, asphaltDepth, daysToComplete = 0;
        final int tow_capacity = 10000; //pounds, which is 5 tons
        final int lane_width = 12; // width in feet 
        final int asphalt_cost = 200; //per ton
        final int asphalt_weight = 150; //lbs per cubic foot
        final int stoplight_cost = 25000;
        final int workday_length = 8; //hours
        final int worker_pay = 25; //dollars per hour
        final int pipe_length = 24; //feet that are only sold in this length
        final int pipe_cost = 500; 
    
       
        
        // collect inputs
        System.out.print("Length of road project (miles) : ");
        double road_length = in.nextDouble();
        System.out.print("Number of lanes : ");
        int num_lanes = in.nextInt();
        System.out.print("Depth of asphalt (inches) : ");
        int asphalt_depth = in.nextInt();
        System.out.print("Days to complete project : ");
        int days_ToComplete1 = in.nextInt();
        
        // compute required values
        
        // amounts of material needed 
        double cubicFeetNeeded = ((road_length * 5280) * lane_width * num_lanes * (asphalt_depth / 12.00));
        double truckLoads = (int)Math.ceil(((cubicFeetNeeded * asphalt_weight / tow_capacity)));
        double intersections = (int)Math.floor((road_length));
        double stoplights = ((2 * intersections) + (intersections * num_lanes));
        double conduits = (int)Math.ceil(((road_length * 5280) / pipe_length));
        double amountCrewNeeded = (int)Math.ceil(((50 * road_length * num_lanes) / days_ToComplete1));
        // costs of material needed
        double asphaltPrice = ((truckLoads * 5) * asphalt_cost);
        double stoplightPrice = (stoplights * stoplight_cost);
        double conduitPrice = (conduits * pipe_cost);
        double laborPrice = (amountCrewNeeded * days_ToComplete1 * workday_length * worker_pay);
        double totalProjectCost = (asphaltPrice + stoplightPrice + conduitPrice + laborPrice);
      
        
        // display results
        System.out.println("=== Amount of Materials Needed ===");
        System.out.println("Truckloads of asphalt : " + truckLoads);
        System.out.println("Stoplights            : " + stoplights);
        System.out.println("Conduit pipes         : " + conduits);
        System.out.println("Crew members needed   : " + amountCrewNeeded);
        System.out.println("=== Cost of Materials ===========");
        System.out.println("Cost of Asphalt       : $" + asphaltPrice);
        System.out.println("Cost of Stoplights    : $" + stoplightPrice);
        System.out.println("Cost of Conduit Pipes : $" + conduitPrice);
        System.out.println("Cost of Labor         : $" + laborPrice);
        System.out.println("=== Total Cost of Project ========");
        System.out.println("Total cost of project : $" + totalProjectCost);
        
         	

    } // End of MAIN

} // End of CLASS

