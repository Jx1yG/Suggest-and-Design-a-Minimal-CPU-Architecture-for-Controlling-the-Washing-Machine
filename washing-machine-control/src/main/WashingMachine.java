package main;

public class WashingMachine {
    private boolean waterIntake;
    private boolean washCycle;
    private boolean rinseCycle;
    private boolean spinCycle;

    public WashingMachine() {
        this.waterIntake = false;
        this.washCycle = false;
        this.rinseCycle = false;
        this.spinCycle = false;
    }

    public void startWaterIntake() {
        System.out.println("Water intake started...");
        waterIntake = true;
    }

    public void stopWaterIntake() {
        System.out.println("Water intake stopped...");
        waterIntake = false;
    }

    public void startWashCycle() {
        System.out.println("Wash cycle started...");
        washCycle = true;
    }

    public void stopWashCycle() {
        System.out.println("Wash cycle stopped...");
        washCycle = false;
    }

    public void startRinseCycle() {
        System.out.println("Rinse cycle started...");
        rinseCycle = true;
    }

    public void stopRinseCycle() {
        System.out.println("Rinse cycle stopped...");
        rinseCycle = false;
    }

    public void startSpinCycle() {
        System.out.println("Spin cycle started...");
        spinCycle = true;
    }

    public void stopSpinCycle() {
        System.out.println("Spin cycle stopped...");
        spinCycle = false;
    }

    public boolean isWaterIntake() {
        return waterIntake;
    }

    public boolean isWashCycle() {
        return washCycle;
    }

    public boolean isRinseCycle() {
        return rinseCycle;
    }

    public boolean isSpinCycle() {
        return spinCycle;
    }
}
