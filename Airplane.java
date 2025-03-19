public class Airplane extends Vehicle {
    private boolean[] engines;
    private static final int MAX_AGE = 30;

    public Airplane(String make, String model, int productionYear, int numberOfEngines) {
        super(make, model, productionYear);
        this.engines = new boolean[numberOfEngines];
    }

    public int getTotalEngines() {
        return engines.length;
    }

    public int getRunningEngines() {
        int runningCount = 0;
        for (boolean engine : engines) {
            if (engine) {
                runningCount++;
            }
        }
        return runningCount;
    }

    @Override
    public void start() {
        int startedEngines = 0;
        for (int i = 0; i < engines.length; i++) {
            if (!engines[i]) {
                engines[i] = true;
                startedEngines++;
            }
        }
        System.out.println("Started " + startedEngines + " out of " + engines.length + " engines.");
    }

    @Override
    public void stop() {
        int stoppedEngines = 0;
        for (int i = 0; i < engines.length; i++) {
            if (engines[i]) {
                engines[i] = false;
                stoppedEngines++;
            }
        }
        if (stoppedEngines > 0) {
            System.out.println("Stopped " + stoppedEngines + " out of " + engines.length + " engines.");
        } else {
            System.out.println("All engines are already stopped!");
        }
    }

    @Override
    public String getStatusDescription() {
        return "Running engines: " + getRunningEngines() + " out of " + engines.length;
    }

    public boolean isRetired() {
        int age = 2025 - getProductionYear();
        return age > MAX_AGE;
    }

    @Override
    public void flex() {
        System.out.println("This airplane has " + engines.length + " engines and it's still flying strong.");
    }
}
