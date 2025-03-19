public class Main {
    public static void main(String[] args) {
        Airplane boeing = new Airplane("Boeing", "747", 2000, 4);
        Airplane cessna = new Airplane("Cessna", "172", 2015, 1);

        boeing.start();
        System.out.println(boeing.getStatusDescription());
        boeing.stop();
        System.out.println(boeing.getStatusDescription());
        System.out.println("Is Boeing retired? " + boeing.isRetired());

        System.out.println();

        cessna.start();
        System.out.println(cessna.getStatusDescription());
        cessna.stop();
        System.out.println(cessna.getStatusDescription());
        System.out.println("Is Cessna retired? " + cessna.isRetired());

        boeing.flex();
        cessna.flex();

        Vehicle genericVehicle = new Airplane("Airbus", "A320", 2010, 2);
        genericVehicle.start();
        System.out.println(genericVehicle.getStatusDescription());
        genericVehicle.flex();
    }
}
