import java.util.*;

public class Robot {
    public static void controlManual() {
        System.out.println("                                                                                                            ROBOT CONTROL MANUAL\n");
        System.out.println("                                                                                                             shoulder = 's'");
        System.out.println("                                                                                                             forearm = 'f'");
        System.out.println("                                                                                                             hand = 'h'");
        System.out.println("                                                                                                             front right wheel = 'frw'");
        System.out.println("                                                                                                             front left wheel = 'flw'");
        System.out.println("                                                                                                             back right wheel = 'brw'");
        System.out.println("                                                                                                             back left wheel = 'blw'");
        System.out.println("                                                                                                             move = 'm'");
        System.out.println("                                                                                                             forward = 'f'");
        System.out.println("                                                                                                             backward = 'b'");
        System.out.println("                                                                                                             rightward = 'r'");
        System.out.println("                                                                                                             leftward = 'l'\n");
        System.out.println("                                                                                                             Type 's' to start robot\n");
        System.out.println("                                                                                                             To move robot, type a command");
        System.out.println("                                                                                                             in the format 'xyz...' e.g,");
        System.out.println("                                                                                                             type 'msf' to move shoulder");
        System.out.println("                                                                                                             forward\n");
        System.out.println("                                                                                                             Type 's' to stop robot\n");
    }

    public static void main (String[] args) {
        Controller controller = new Controller();
        Scanner scanner = new Scanner(System.in);
        StringBuilder command;

        System.out.println("                                                                                                              IMAGINARY ROBOT\n");
        System.out.println("                                                                                     Imaginary robot has one arm and four wheels. The arm is divided");
        System.out.println("                                                                                     into three parts: shoulder, forearm, and hand. All three parts");
        System.out.println("                                                                                     can move in any direction, and all four wheels can rotate in");
        System.out.println("                                                                                     forward and backward directions.\n");

        controlManual();

        while (true) {
            if (controller.state.start == false) {
                System.out.println("Start robot: ");
                command =  new StringBuilder(scanner.nextLine());
                controlManual();
                controller.commandTransformer(command);
            } else {
                while (controller.state.start == true) {
                    System.out.println("Enter command");
                    command =  new StringBuilder(scanner.nextLine());
                    controlManual();
                    controller.commandTransformer(command);
                }
            }
        }
    }
}
