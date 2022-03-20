public class State {
    boolean start = false;
    boolean stop = true;

    // Arm directions
    private int shoulderDirectionX = 0;
    private int shoulderDirectionY = 0;
    private int forearmDirectionX = 0;
    private int forearmDirectionY = 0;
    private int handDirectionX = 0;
    private int handDirectionY = 0;

    // Wheel directions
    private int frontRightWheel = 0;
    private int frontLeftWheel = 0;
    private int backRightWheel = 0;
    private int backLeftWheel = 0;

    public int getPositionX(String partition, String subPartition) {
        if (partition == "arm" && subPartition == "shoulder") {
            return this.shoulderDirectionX;
        } else if (partition == "arm" && subPartition == "forearm") {
            return this.forearmDirectionX;
        } else if (partition == "arm" && subPartition == "hand") {
            return this.handDirectionX;
        } else if (partition == "wheel" && subPartition == "frontLeftWheel") {
            return this.frontLeftWheel;
        } else if (partition == "wheel" && subPartition == "frontRightWheel") {
            return this.frontRightWheel;
        } else if (partition == "wheel" && subPartition == "backLeftWheel") {
            return this.backLeftWheel;
        } else if (partition == "wheel" && subPartition == "backRightWheel") {
            return this.backRightWheel;
        }
        return 0;

    }

    public int getPositionY(String partition, String subPartition) {
        if (partition == "arm" && subPartition == "shoulder") {
            return this.shoulderDirectionY;
        } else if (partition == "arm" && subPartition == "forearm") {
            return this.forearmDirectionY;
        } else if (partition == "arm" && subPartition == "hand") {
            return this.handDirectionY;
        }
        return 0;
    }

    public void setPositionX(String partition, String subPartition, int dx) {
        if (partition == "arm" && subPartition == "shoulder") {
            this.shoulderDirectionX += dx;
        } else if (partition == "arm" && subPartition == "forearm") {
            this.forearmDirectionX += dx;
        } else if (partition == "arm" && subPartition == "hand") {
          this.handDirectionX += dx;
        }  else if (partition == "wheel" && subPartition == "frontLeftWheel") {
            this.frontLeftWheel += dx;
        } else if (partition == "wheel" && subPartition == "frontRightWheel") {
            frontRightWheel += dx;
        } else if (partition == "wheel" && subPartition == "backLeftWheel") {
            this.backLeftWheel += dx;
        } else if (partition == "wheel" && subPartition == "backRightWheel") {
            this.backRightWheel += dx;
        }
    }

    public void setPositionY(String partition, String subPartition, int dy) {
        if (partition == "arm" && subPartition == "shoulder") {
            this.shoulderDirectionY += dy;
        } else if (partition == "arm" && subPartition == "forearm") {
            this.forearmDirectionY += dy;
        } else if (partition == "arm" && subPartition == "hand") {
            this.handDirectionY += dy;
        }
    }
}
