import java.util.*;

public class Robot extends Thread{
    private static Controller controller = new Controller();

/*    // Arm directions
    private static int upperarmDirectionX = controller.state.getDirectionX("arm", "upperarm");
    private static int upperarmDirectionY = controller.state.getDirectionY("arm", "upperarm");
    private static int forearmDirectionX = controller.state.getDirectionX("arm", "forearm");
    private static int forearmDirectionY = controller.state.getDirectionY("arm", "forearm");
    private static int handDirectionX = controller.state.getDirectionX("arm", "hand");
    private static int handDirectionY = controller.state.getDirectionY("arm", "hand");

    // Wheel directions
    private static int frontRightWheel = controller.state.getDirectionX("wheel", "frontRightWheel");
    private static int frontLeftWheel = controller.state.getDirectionX("wheel", "frontLeftWheel");
    private static int backRightWheel = controller.state.getDirectionX("wheel", "backRightWheel");
    private static int backLeftWheel = controller.state.getDirectionX("wheel", "frontRightWheel");*/

    private static Simulation simulation = new Simulation();


    public static void controlManual() {
/*        System.out.println("                                                                                                            ROBOT CONTROL MANUAL\n");
        System.out.println("                                                                                                             upperarm = 'u'");
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
        System.out.println("                                                                                                             type 'mul' to move upperarm");
        System.out.println("                                                                                                             leftward\n");
        System.out.println("                                                                                                             Type 's' to stop robot\n");*/

        System.out.println("                                                                                                            ROBOT CONTROL MANUAL\n");
        System.out.println("                                                                                                             move forward");
        System.out.println("                                                                                                             move backward");
        System.out.println("                                                                                                             move upperarm rightward");
        System.out.println("                                                                                                             move upperarm leftward");
        System.out.println("                                                                                                             move forearm rightward");
        System.out.println("                                                                                                             move forearm leftward");
        System.out.println("                                                                                                             move hand rightward");
        System.out.println("                                                                                                             move hand leftward");
        System.out.println("                                                                                                             Type 's' to start robot\n");
    }

    public void run() {
        try {
            System.out.println("");
        } catch (Exception e) {

        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder command;
        String robotCommand = "";

        System.out.println("                                                                                                              IMAGINARY ROBOT\n");
        System.out.println("                                                                                     Imaginary robot has one arm and four wheels. The arm is divided");
        System.out.println("                                                                                     into three parts: upperarm, forearm, and hand. All three parts");
        System.out.println("                                                                                     can move in right and left direction, and all four wheels can");
        System.out.println("                                                                                     rotate in forward and backward directions.\n");

        controlManual();

        while (true) {
            if (controller.state.start == false) {
                System.out.println("\nStart robot: \n");
                command =  new StringBuilder(scanner.nextLine());
                //controlManual();
                controller.commandTransformer(command);
            } else {
                simulation.run(robotCommand);
                while (controller.state.start == true) {
                    System.out.println("\nEnter command\n");
                    //command =  new StringBuilder(scanner.nextLine());
                    robotCommand = scanner.nextLine();
                    simulation.run(robotCommand);
                    //controlManual();
                    //controller.commandTransformer(command);
                }
            }
        }
    }
}
