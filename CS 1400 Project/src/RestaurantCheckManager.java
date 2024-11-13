public class RestaurantCheckManager {
        public static double[] breakdownTips(double tipAmount, int breakdownStyle) {
        double[] tipDistribution = new double[6];
        double[] tipPercentage = new double[6];
        
        // breakdownStyle 1 represents the split given in document
        // breakdownStyle 3 represents the split we created
        // anything else will cause breakdownTips to return 0s
        switch (breakdownStyle) {
            case 1:
                tipPercentage[0] = 0.30 * 0.50;
                tipPercentage[1] = 0.30 * 0.30;
                tipPercentage[2] = 0.30 * 0.20;
                tipPercentage[3] = 0.10;
                tipPercentage[4] = 0.10;
                tipPercentage[5] = 0.50;
                break;
            case 3:
                tipPercentage[0] = 0.36 * 0.50;
                tipPercentage[1] = 0.36 * 0.30;
                tipPercentage[2] = 0.36 * 0.20;
                tipPercentage[3] = 0.12;
                tipPercentage[4] = 0.12;
                tipPercentage[5] = 0.40;
                break;
        }

        // Find the dollar amount given to each position and round it to nearest cent
        for (int i = 0; i < tipDistribution.length; ++i) {
            tipDistribution[i] = Math.round(tipPercentage[i] * tipAmount * 100.0) / 100.0;
        }

        /* Each index in tipDistribution represents the amount of money (in dollars) given to each position (not person)
            0 = Chef
            1 = Sous chef
            2 = Kitchen aid
            3 = Host / hostess
            4 = Busser
            5 = Server
        */
        return tipDistribution;
    }
    public static void main(String[] args) throws Exception {
        
        // Create Variables
        double saleAmount = 0.0, tipAmount = 0.0, totalAmount = 0.0;
        double totalSaleAmount = 0.0, totalTipAmount = 0.0;
        int numChecks = 0;


        // Start of Loop
        saleAmount = 15.34;
        tipAmount = 4.66;
        totalAmount = 20.00;

        totalSaleAmount = saleAmount;
        totalTipAmount = tipAmount;
        numChecks++;
        
        // Print


        
        // Call Method for Breakdowns of Tips

        


        // Call Method for Individual Breakdown
    
    
        // Testing Employee creation
        Employee person = new Employee();
        person.printInfo();
        Employee person2 = new Employee("Anna", 1);
        person2.printInfo();
    
    }
}
