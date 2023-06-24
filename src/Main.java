public class Main {
    public static void main(String[] args) {
        Scooter scooter = new Scooter(20,"HR08MMM",250);
        AudiS8 audiS8 = new AudiS8(180,"HR08MAM",true);

        System.out.println("Scooter overspeed: " + scooter.overSpeed(60));
        System.out.println("AudiS8 overspeed: " + audiS8.overSpeed(100));

        System.out.println("A scooter can go here: " + scooter.canGoHere(60));
        System.out.println(audiS8.toString());
        System.out.println(scooter.toString());

    }


}
