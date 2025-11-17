package conditional_thinking;
//Take number of units consumed and calculate electricity bill based on slab rates.
public class ElectricityBill {
    private static final double SLAB1RATE = 5;
    private static final double SLAB2RATE = 6.50;
    private static final double SLAB3RATE = 8.00;
    public static void main(String[] args) {
        try {
            System.out.println("Enter Number of Units Consumed: ");
            int units = new java.util.Scanner(System.in).nextInt();
            if(units < 0) throw new RuntimeException("Units cannot be negative");
            System.out.printf("Total Bill Amount: $%.2f" , getBill(units));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    /* slab1 rates = $5 per unit for first 50 units
         slab2 rates = $6.50 per unit for first 100 units
         slab3 rates = $8.00 per unit for first 150 units */
    private static double getBill(int units){
        double bill;
        if (units>=50 && units < 100)
            bill = units*SLAB1RATE;
        else if (units >= 100 && units < 150)
            bill = (50*SLAB1RATE) + ((units-50) * SLAB2RATE);
        else
            bill = (50*SLAB1RATE) + (100*SLAB2RATE) + ((units-150)*SLAB3RATE);
        return bill;
    }
}
