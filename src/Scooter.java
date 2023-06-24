public class Scooter extends Vehicle implements SmallVehicle {
    private int maxSpeed;
    public Scooter(int speed, String licensePlate, int maxSpeed) {
        super(speed, licensePlate);
        this.maxSpeed = maxSpeed;
    }

    @Override
    public boolean canGoHere(int speed) {
        return maxSpeed <= speed;
    }

    @Override
    public boolean overSpeed(int speedLimit) {
        return getSpeed() > speedLimit;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    public String toString() {
        return "Robogo " + super.toString();
    }
}
