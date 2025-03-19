public class Car extends Vehicle {
    private boolean isEngineRunning = false;

    public Car(String make, String model, int productionYear) {
        super(make, model, productionYear);
    }

    @Override
    public void start() {
        isEngineRunning = true;
    }

    @Override
    public void stop() {
        if (isEngineRunning) {
            isEngineRunning = false;
        } else {
            System.out.println("There's nothing to stop!");
        }
    }

    @Override
    public String getStatusDescription() {
        return "Engine is " + (isEngineRunning ? "" : "NOT") + " running";
    }

    @Override
    public void flex(){
        System.out.printf("This is my car from " + this.getProductionYear() + " and it's the best.\n");
    }

    public void horn() {
        System.out.println("TrąbTrąb");
    }

    public void horn(String sound) {
        System.out.println(sound.toUpperCase());
    }
}
