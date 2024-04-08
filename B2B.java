import java.util.*;

public class B2B {
    public static void main(String[] args) {
    
        Scanner kb = new Scanner(System.in);
        
            
        System.out.println("Estimated Traffic Potential?");
        float trafficPotential = kb.nextFloat();
        System.out.println("Conversion Rate Percentage?");
        float conversionRate = kb.nextFloat() / 100;

        float leads = trafficPotential*conversionRate;

        System.out.println("Percent of Qualified Amount?");
        float qualifiedAmount = kb.nextFloat() / 100;

        float qualifiedLeads = leads*qualifiedAmount;

        System.out.println("Percent of Leads for Sale?");
        float leadsForSale = kb.nextFloat() / 100;

        float potentialSale = qualifiedLeads*leadsForSale;

        System.out.println("Estimated Net Sales Valule?");
        float netSaleValue = kb.nextFloat();

        float netValueOfSales = netSaleValue*potentialSale;

        System.out.println("What is the hourly rate?");
        float hourlyRate = kb.nextFloat();

        float hours = netValueOfSales / hourlyRate;
        
        System.out.printf("Your estimated net value of sales is: " + "%.2f",netValueOfSales);
        System.out.printf("%nThis is equal to: " + "%.2f",hours);
        System.out.print(" SEO hours."); 
    }
}