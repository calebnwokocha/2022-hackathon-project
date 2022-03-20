public class Simulation {
    public Simulation(int upperarmDirectionX, int upperarmDirectionY, int forearmDirectionX,
                      int forearmDirectionY, int handDirectionX, int handDirectionY, int frontRightWheel,
                      int frontLeftWheel, int backRightWheel, int backLeftWheel)
    {
        this.upperarmDirectionX = upperarmDirectionX;
        this.upperarmDirectionY = upperarmDirectionY;
        this.forearmDirectionX = forearmDirectionX;
        this.forearmDirectionY = forearmDirectionY;
        this.handDirectionX = handDirectionX;
        this.handDirectionY = handDirectionY;
        this.frontRightWheel = frontRightWheel;
        this.frontLeftWheel = frontLeftWheel;
        this.backRightWheel = backRightWheel;
        this.backLeftWheel = backLeftWheel;
    }

    // Arm directions
    private int upperarmDirectionX;
    private int upperarmDirectionY;
    private int forearmDirectionX;
    private int forearmDirectionY;
    private int handDirectionX;
    private int handDirectionY;

    // Wheel directions
    private int frontRightWheel;
    private int frontLeftWheel;
    private int backRightWheel;
    private int backLeftWheel;

    public void start () {
        Map map = new Map();
        map.drawMap();
    }
}
