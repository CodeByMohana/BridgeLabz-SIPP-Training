public class question_8 {
    public static void main(String[] args) {
        // Radius of Earth in kilometers
        double radiusKm = 6378.0;
        double kmToMiles = 0.621371;

        double volumeKm3 = (4.0 / 3) * Math.PI * Math.pow(radiusKm, 3);

        double radiusMiles = radiusKm * kmToMiles;
        double volumeMiles3 = (4.0 / 3) * Math.PI * Math.pow(radiusMiles, 3);

        System.out.printf("The volume of Earth in cubic kilometers is %.2f km³ and in cubic miles is %.2f mi³%n",
                volumeKm3, volumeMiles3);
    }
}
