public class KmToMiles {
    public static void main(String[] args) {
        double kilometers = 10.8;
        double milesPerKm = 1.6;

        double miles = (double) kilometers * (double)milesPerKm;

        System.out.println("The distance " + kilometers + " km in miles is " + miles);
    }
}
