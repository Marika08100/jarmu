public abstract class Vehicle {
    protected int speed;
    private String licensePlate;

    public Vehicle(int speed, String licensePlate) {
        this.speed = speed;
        this.licensePlate = licensePlate;
    }

    public boolean overSpeed(int speedLimit) {
        return speed > speedLimit;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    @Override
    public String toString() {
        return licensePlate + " - " + speed + " km/h";
    }
}
