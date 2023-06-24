public class AudiS8 extends Vehicle {
    private boolean laserBlocker;

    public AudiS8(int speed, String licensePlate, boolean laserBlocker) {
        super(speed, licensePlate);
        this.laserBlocker = laserBlocker;
    }

    @Override
    public boolean overSpeed(int speedLimit) {
        if (laserBlocker) {
            return false;
        }
        return getSpeed() > speedLimit;
    }

    public boolean isLaserBlocker() {
        return laserBlocker;
    }

    public void setLaserBlocker(boolean laserBlocker) {
        this.laserBlocker = laserBlocker;
    }

    @Override
    public String toString() {
        return  "Audi " + super.toString();
    }
}
