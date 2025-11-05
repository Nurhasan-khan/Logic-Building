package conditional_thinking;

public class Temperature {
    public static void main(String[] args) {
        System.out.println("Enter the temperature in Celsius: ");
        double input = new java.util.Scanner(System.in).nextDouble();
        System.out.println(checkTemperature(input));
    }
    private static String checkTemperature(double temperature){
        if(temperature < 15.5)
            return "Cold";
        else if (temperature >=32.0 && temperature <= 43.0)
            return "Warm";
        else
            return "Hot";
    }
}
