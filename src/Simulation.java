public class Simulation {
    private int robotPartition1 = 35;
    private int subPartition1 = 26;

    int robotPartition2 = 36;
    int robotPartition3 = 37;
    int robotPartition4 = 38;
    int robotPartition5 = 39;
    int robotPartition6 = 40;
    int robotPartition7 = 41;
    int robotPartition8 = 42 ;

    public void run (String robotCommand) {

        Map map = new Map(robotPartition1,
        subPartition1,

        robotPartition2,
        robotPartition3,
        robotPartition4,
        robotPartition5,
        robotPartition6,
        robotPartition7,
        robotPartition8);
        map.drawMap(robotCommand);
    }
}
