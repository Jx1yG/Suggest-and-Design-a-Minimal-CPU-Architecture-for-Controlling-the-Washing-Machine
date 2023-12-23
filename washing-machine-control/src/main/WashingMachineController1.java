package main;

public class WashingMachineController1 {

    public boolean isEnergyEfficientMode() {
        return energyEfficientMode;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public int getWaterTemperature() {
        return waterTemperature;
    }

    public boolean isErrorDetected() {
        return errorDetected;
    }

    public enum State {
        OFF, WATER_INTAKE, WASH, RINSE, SPIN
    }

    private State state;
    private boolean energyEfficientMode;
    private boolean errorDetected;
    private int waterTemperature;
    private int energyConsumption;
    private int waterUsage;

    public WashingMachineController1() {
        this.state = State.OFF;
        this.energyEfficientMode = false;
        this.errorDetected = false;
        this.waterTemperature = 30; // Default temperature
        this.energyConsumption = 0;
        this.waterUsage = 0;
    }

    public void start() {
        this.energyConsumption = 0;
        this.waterUsage = 0;

        if (this.waterTemperature == 25 || this.waterTemperature == 30 || this.waterTemperature == 40) {
            this.errorDetected = false;

            if (this.waterTemperature == 25) {
                this.energyConsumption += 10;
            } else if (this.waterTemperature == 30) {
                this.energyConsumption += 25;
            } else {
                this.energyConsumption += 30;
            }

            if (!this.energyEfficientMode) {
                this.energyConsumption += 10;
            }
            this.energyConsumption += 45;
        } else {
            this.detectError();
            stop();
        }

        if (!errorDetected) {
            this.state = State.WATER_INTAKE;
            controlWaterIntake(true);
        } else {
            System.out.println("Error detected. Unable to start.");
        }
    }

    public void stop() {
        this.state = State.OFF;
        controlWaterIntake(false);
        controlWash(false);
        controlRinse(false);
        controlSpin(false);
    }

    public void setEnergyEfficientMode(boolean enable) {
        this.energyEfficientMode = enable;
    }

    public void setWaterTemperature(int temperature) {
        this.waterTemperature = temperature;
    }

    public void detectError() {
        this.errorDetected = true;
        stop();
    }

    private void controlWaterIntake(boolean start) {
        if (start) {
            System.out.println("Water intake started...");
            this.waterUsage += 20;
            this.state = State.WATER_INTAKE;  // Corrected line
            controlWash(true);
        } else {
            System.out.println("Water intake stopped...");
        }
    }

    private void controlWash(boolean start) {
        if (start) {
            System.out.println("Wash cycle started...");
            this.state = State.RINSE;
            controlRinse(true);
        } else {
            System.out.println("Wash cycle stopped...");
        }
    }

    private void controlRinse(boolean start) {
        if (start) {
            System.out.println("Rinse cycle started...");
            this.state = State.SPIN;
            controlSpin(true);
        } else {
            System.out.println("Rinse cycle stopped...");
        }
    }

    private void controlSpin(boolean start) {
        if (start) {
            System.out.println("Spin cycle started...");
            this.state = State.OFF;
            stop();
        } else {
            System.out.println("Spin cycle stopped...");
        }
    }

    public void displayEnergyConsumption() {
        System.out.println("Energy consumption: " + energyConsumption + " kWh");
    }

    public void displayWaterUsage() {
        System.out.println("Water usage: " + waterUsage + " liters");
    }

    public static void main(String[] args) {
        WashingMachineController1 controller = new WashingMachineController1();

        System.out.println(
                "\n---------------------------------------------------------------------------------\nEnergy Efficient mode: ON \nWater Temperature:40\n");

        controller.setEnergyEfficientMode(true);
        controller.setWaterTemperature(40);
        controller.start();

        controller.displayEnergyConsumption();
        controller.displayWaterUsage();

        System.out.println(
                "\n---------------------------------------------------------------------------------\nEnergy Efficient mode: OFF \nWater Temperature:30\n");
        controller.setEnergyEfficientMode(false);
        controller.setWaterTemperature(30);
        controller.start();

        controller.displayEnergyConsumption();
        controller.displayWaterUsage();

        System.out.println(
                "\n---------------------------------------------------------------------------------\nEnergy Efficient mode: ON \nWater Temperature:20\n");
        controller.setEnergyEfficientMode(true);
        controller.setWaterTemperature(20);
        controller.start();

        controller.displayEnergyConsumption();
        controller.displayWaterUsage();
    }
}
