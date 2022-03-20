public class Controller {
    public State state = new State();

    private String partition;
    private String subPartition;
    private String direction;

    public void commandTransformer(StringBuilder command) {
        for (int i = 0; i < command.length(); i++) {
            if (command.charAt(i) == 's' && this.state.start == false) {
                this.state.start = true;
                this.state.stop = false;
            } else if (command.charAt(i) == 's' && this.state.stop == false) {
                this.state.start = false;
                this.state.stop = true;
            }
        }

        for (int i = 0; i < command.length(); i++) {
            try {
                if (command.charAt(i) == 'm' && command.charAt(i + 4) == 'f') {
                    switch (String.valueOf(command.charAt(i + 1) + command.charAt(i + 2) + command.charAt(i + 3))) {
                        case "frw":
                            this.partition = "wheel";
                            this.subPartition = "frontRightWheel";
                            this.direction = "forward";
                            command = command.deleteCharAt(i);
                            command = command.deleteCharAt(i + 1);
                            command = command.deleteCharAt(i + 2);
                            command = command.deleteCharAt(i + 3);
                            command = command.deleteCharAt(i + 4);
                            break;
                        case "flw":
                            this.partition = "wheel";
                            this.subPartition = "frontLightWheel";
                            this.direction = "forward";
                            command = command.deleteCharAt(i);
                            command = command.deleteCharAt(i + 1);
                            command = command.deleteCharAt(i + 2);
                            command = command.deleteCharAt(i + 3);
                            command = command.deleteCharAt(i + 4);
                            break;
                        case "brw":
                            this.partition = "wheel";
                            this.subPartition = "backRightWheel";
                            this.direction = "forward";
                            command = command.deleteCharAt(i);
                            command = command.deleteCharAt(i + 1);
                            command = command.deleteCharAt(i + 2);
                            command = command.deleteCharAt(i + 3);
                            command = command.deleteCharAt(i + 4);
                            break;
                        case "blw":
                            this.partition = "wheel";
                            this.subPartition = "backLeftWheel";
                            this.direction = "forward";
                            command = command.deleteCharAt(i);
                            command = command.deleteCharAt(i + 1);
                            command = command.deleteCharAt(i + 2);
                            command = command.deleteCharAt(i + 3);
                            command = command.deleteCharAt(i + 4);
                            break;
                    }
                }
                if (command.charAt(i) == 'm' && command.charAt(i + 4) == 'b') {
                    switch (String.valueOf(command.charAt(i + 1) + command.charAt(i + 2) + command.charAt(i + 3))) {
                        case "frw":
                            this.partition = "wheel";
                            this.subPartition = "frontRightWheel";
                            this.direction = "backward";
                            command = command.deleteCharAt(i);
                            command = command.deleteCharAt(i + 1);
                            command = command.deleteCharAt(i + 2);
                            command = command.deleteCharAt(i + 3);
                            command = command.deleteCharAt(i + 4);
                            break;
                        case "flw":
                            this.partition = "wheel";
                            this.subPartition = "frontLightWheel";
                            this.direction = "backward";
                            command = command.deleteCharAt(i);
                            command = command.deleteCharAt(i + 1);
                            command = command.deleteCharAt(i + 2);
                            command = command.deleteCharAt(i + 3);
                            command = command.deleteCharAt(i + 4);
                            break;
                        case "brw":
                            this.partition = "wheel";
                            this.subPartition = "backRightWheel";
                            this.direction = "backward";
                            command = command.deleteCharAt(i);
                            command = command.deleteCharAt(i + 1);
                            command = command.deleteCharAt(i + 2);
                            command = command.deleteCharAt(i + 3);
                            command = command.deleteCharAt(i + 4);
                            break;
                        case "blw":
                            this.partition = "wheel";
                            this.subPartition = "backLeftWheel";
                            this.direction = "backward";
                            command = command.deleteCharAt(i);
                            command = command.deleteCharAt(i + 1);
                            command = command.deleteCharAt(i + 2);
                            command = command.deleteCharAt(i + 3);
                            command = command.deleteCharAt(i + 4);
                            break;
                    }
                }
                if (command.charAt(i) == 'm' && command.charAt(i + 4) == 'r') {
                    switch (String.valueOf(command.charAt(i + 1) + command.charAt(i + 2) + command.charAt(i + 3))) {
                        case "frw":
                            this.partition = "wheel";
                            this.subPartition = "frontRightWheel";
                            this.direction = "rightward";
                            command = command.deleteCharAt(i);
                            command = command.deleteCharAt(i + 1);
                            command = command.deleteCharAt(i + 2);
                            command = command.deleteCharAt(i + 3);
                            command = command.deleteCharAt(i + 4);
                            break;
                        case "flw":
                            this.partition = "wheel";
                            this.subPartition = "frontLightWheel";
                            this.direction = "rightward";
                            command = command.deleteCharAt(i);
                            command = command.deleteCharAt(i + 1);
                            command = command.deleteCharAt(i + 2);
                            command = command.deleteCharAt(i + 3);
                            command = command.deleteCharAt(i + 4);
                            break;
                        case "brw":
                            this.partition = "wheel";
                            this.subPartition = "backRightWheel";
                            this.direction = "rightward";
                            command = command.deleteCharAt(i);
                            command = command.deleteCharAt(i + 1);
                            command = command.deleteCharAt(i + 2);
                            command = command.deleteCharAt(i + 3);
                            command = command.deleteCharAt(i + 4);
                            break;
                        case "blw":
                            this.partition = "wheel";
                            this.subPartition = "backLeftWheel";
                            this.direction = "rightward";
                            command = command.deleteCharAt(i);
                            command = command.deleteCharAt(i + 1);
                            command = command.deleteCharAt(i + 2);
                            command = command.deleteCharAt(i + 3);
                            command = command.deleteCharAt(i + 4);
                            break;
                    }
                }
                if (command.charAt(i) == 'm' && command.charAt(i + 4) == 'l') {
                    switch (String.valueOf(command.charAt(i + 1) + command.charAt(i + 2) + command.charAt(i + 3))) {
                        case "frw":
                            this.partition = "wheel";
                            this.subPartition = "frontRightWheel";
                            this.direction = "leftward";
                            command = command.deleteCharAt(i);
                            command = command.deleteCharAt(i + 1);
                            command = command.deleteCharAt(i + 2);
                            command = command.deleteCharAt(i + 3);
                            command = command.deleteCharAt(i + 4);
                            break;
                        case "flw":
                            this.partition = "wheel";
                            this.subPartition = "frontLightWheel";
                            this.direction = "leftward";
                            command = command.deleteCharAt(i);
                            command = command.deleteCharAt(i + 1);
                            command = command.deleteCharAt(i + 2);
                            command = command.deleteCharAt(i + 3);
                            command = command.deleteCharAt(i + 4);
                            break;
                        case "brw":
                            this.partition = "wheel";
                            this.subPartition = "backRightWheel";
                            this.direction = "leftward";
                            command = command.deleteCharAt(i);
                            command = command.deleteCharAt(i + 1);
                            command = command.deleteCharAt(i + 2);
                            command = command.deleteCharAt(i + 3);
                            command = command.deleteCharAt(i + 4);
                            break;
                        case "blw":
                            this.partition = "wheel";
                            this.subPartition = "backLeftWheel";
                            this.direction = "leftward";
                            command = command.deleteCharAt(i);
                            command = command.deleteCharAt(i + 1);
                            command = command.deleteCharAt(i + 2);
                            command = command.deleteCharAt(i + 3);
                            command = command.deleteCharAt(i + 4);
                            break;
                    }
                }
            } catch (IndexOutOfBoundsException e) {

            }
        }

        for (int i = 0; i < command.length(); i++) {
            try {
                if (command.charAt(i) == 'm' && command.charAt(i + 2) == 'f') {
                    switch (command.charAt(i + 1)) {
                        case 's':
                            this.partition = "arm";
                            this.subPartition = "shoulder";
                            this.direction = "forward";
                            command = command.deleteCharAt(i);
                            command = command.deleteCharAt(i + 1);
                            command = command.deleteCharAt(i + 2);
                            break;
                        case 'f':
                            this.partition = "arm";
                            this.subPartition = "forearm";
                            this.direction = "forward";
                            command = command.deleteCharAt(i);
                            command = command.deleteCharAt(i + 1);
                            command = command.deleteCharAt(i + 2);
                            break;
                        case 'h':
                            this.partition = "arm";
                            this.subPartition = "hand";
                            this.direction = "forward";
                            command = command.deleteCharAt(i);
                            command = command.deleteCharAt(i + 1);
                            command = command.deleteCharAt(i + 2);
                            break;
                    }
                }
                if (command.charAt(i) == 'm' && command.charAt(i + 2) == 'b') {
                    switch (command.charAt(i + 1)) {
                        case 's':
                            this.partition = "arm";
                            this.subPartition = "shoulder";
                            this.direction = "backward";
                            command = command.deleteCharAt(i);
                            command = command.deleteCharAt(i + 1);
                            command = command.deleteCharAt(i + 2);
                            break;
                        case 'f':
                            this.partition = "arm";
                            this.subPartition = "forearm";
                            this.direction = "backward";
                            command = command.deleteCharAt(i);
                            command = command.deleteCharAt(i + 1);
                            command = command.deleteCharAt(i + 2);
                            break;
                        case 'h':
                            this.partition = "arm";
                            this.subPartition = "hand";
                            this.direction = "backward";
                            command = command.deleteCharAt(i);
                            command = command.deleteCharAt(i + 1);
                            command = command.deleteCharAt(i + 2);
                            break;
                    }
                }
                if (command.charAt(i) == 'm' && command.charAt(i + 2) == 'r') {
                    switch (command.charAt(i + 1)) {
                        case 's':
                            this.partition = "arm";
                            this.subPartition = "shoulder";
                            this.direction = "rightward";
                            command = command.deleteCharAt(i);
                            command = command.deleteCharAt(i + 1);
                            command = command.deleteCharAt(i + 2);
                            break;
                        case 'f':
                            this.partition = "arm";
                            this.subPartition = "forearm";
                            this.direction = "rightward";
                            command = command.deleteCharAt(i);
                            command = command.deleteCharAt(i + 1);
                            command = command.deleteCharAt(i + 2);
                            break;
                        case 'h':
                            this.partition = "arm";
                            this.subPartition = "hand";
                            this.direction = "rightward";
                            command = command.deleteCharAt(i);
                            command = command.deleteCharAt(i + 1);
                            command = command.deleteCharAt(i + 2);
                            break;
                    }
                }
                if (command.charAt(i) == 'm' && command.charAt(i + 2) == 'l') {
                    switch (command.charAt(i + 1)) {
                        case 's':
                            this.partition = "arm";
                            this.subPartition = "shoulder";
                            this.direction = "leftward";
                            command = command.deleteCharAt(i);
                            command = command.deleteCharAt(i + 1);
                            command = command.deleteCharAt(i + 2);
                            break;
                        case 'f':
                            this.partition = "arm";
                            this.subPartition = "forearm";
                            this.direction = "leftward";
                            command = command.deleteCharAt(i);
                            command = command.deleteCharAt(i + 1);
                            command = command.deleteCharAt(i + 2);
                            break;
                        case 'h':
                            this.partition = "arm";
                            this.subPartition = "hand";
                            this.direction = "leftward";
                            command = command.deleteCharAt(i);
                            command = command.deleteCharAt(i + 1);
                            command = command.deleteCharAt(i + 2);
                            break;
                    }
                }
            } catch (IndexOutOfBoundsException e) {

            }
        }
    }


    public void motion() {
        int positiveChange = 1;
        int negativeChange = -1;

        switch (this.direction) {
            case "forward":
                this.state.setPositionX(this.partition, this.subPartition, positiveChange);
                break;
            case "backward":
                this.state.setPositionX(this.partition, this.subPartition, negativeChange);
                break;
            case "rightward":
                this.state.setPositionY(this.partition, this.subPartition, positiveChange);
                break;
            case "leftward":
                this.state.setPositionY(this.partition, this.subPartition, negativeChange);
                break;
        }
    }
}
