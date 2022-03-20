// For simulation

public class Map {
    private int width = 50;
    private int length = 50;
    private String[][] environment = new String[this.width][this.length];

    public void populateMap() {
        for (int row = 0; row < this.environment[0].length; row++) {
            for (int col = 0; col < this.environment[row].length; col++) {
                if (row == 12) {
                    if (col == 10) {
                        this.environment[row][col] = "K ";
                    } else if (col == 11) {
                        this.environment[row][col] = "i ";
                    } else if (col == 12) {
                        this.environment[row][col] = "t ";
                    } else if (col == 13) {
                        this.environment[row][col] = "c ";
                    } else if (col == 14) {
                        this.environment[row][col] = "h ";
                    } else if (col == 15) {
                        this.environment[row][col] = "e ";
                    } else if (col == 16) {
                        this.environment[row][col] = "n ";
                    } else {
                        this.environment[row][col] = ". ";
                    }
                } else if (row == 24) {
                    if (col == 10) {
                        this.environment[row][col] = "D ";
                    } else if (col == 11) {
                        this.environment[row][col] = "i ";
                    } else if (col == 12) {
                        this.environment[row][col] = "n ";
                    } else if (col == 13) {
                        this.environment[row][col] = "i ";
                    } else if (col == 14) {
                        this.environment[row][col] = "n ";
                    } else if (col == 15) {
                        this.environment[row][col] = "g ";
                    } else if (col == 16) {
                        this.environment[row][col] = ". ";
                    } else if (col == 17) {
                        this.environment[row][col] = "r ";
                    } else if (col == 18) {
                        this.environment[row][col] = "o ";
                    } else if (col == 19) {
                        this.environment[row][col] = "o ";
                    } else if (col == 20) {
                        this.environment[row][col] = "m ";
                    } else {
                        this.environment[row][col] = ". ";
                    }
                } else if (row == 36) {
                    if (col == 10) {
                        this.environment[row][col] = "R ";
                    } else if (col == 11) {
                        this.environment[row][col] = "o ";
                    } else if (col == 12) {
                        this.environment[row][col] = "b ";
                    } else if (col == 13) {
                        this.environment[row][col] = "o ";
                    } else if (col == 14) {
                        this.environment[row][col] = "t ";
                    } else if (col == 15) {
                        this.environment[row][col] = ". ";
                    } else if (col == 16) {
                        this.environment[row][col] = "s ";
                    } else if (col == 17) {
                        this.environment[row][col] = "t ";
                    } else if (col == 18) {
                        this.environment[row][col] = "a ";
                    } else if (col == 19) {
                        this.environment[row][col] = "t ";
                    } else if (col == 20) {
                        this.environment[row][col] = "i ";
                    } else if (col == 21) {
                        this.environment[row][col] = "o ";
                    } else if (col == 22) {
                        this.environment[row][col] = "n ";
                    } else {
                        this.environment[row][col] = ". ";
                    }
                } else {
                    this.environment[row][col] = ". ";
                }
            }
        }
    }

    public void drawMap() {
        populateMap();
        drawRobot();
        drawDish();

        for (int row = 0; row < this.environment[0].length; row++) {
            System.out.print("                                                                       ");
            for (int col = 0; col < this.environment[row].length; col++) {
                System.out.print(this.environment[row][col]);
                if (col == this.environment[1].length - 1){
                    System.out.print("\n");
                }
            }
        }
    }

    public void drawRobot() {
        String state = "";
        int robotPartition1 = 35;
        int robotPartition2 = 36;
        int robotPartition3 = 37;
        int robotPartition4 = 38;
        int robotPartition5 = 39;
        int robotPartition6 = 40;
        int robotPartition7 = 41;
        int robotPartition8 = 42 ;

        switch (state) {
            case "moveForward" :
                break;
            case "moveBackward" :
                break;
            case "moveUpperarmRightward" :
                break;
            case "moveUpperarmleftward" :
                break;
            case "moveForearmRightward" :
                break;
            case "moveForearmleftward" :
                break;
            case "moveHandRightward" :
                break;
            case "moveHandleftward" :
                break;
        }

        for (int row = 0; row < this.environment[0].length; row++) {
            for (int col = 0; col < this.environment[row].length; col++) {

                if (row == 35) {
                    if (col == 26) {
                        this.environment[row][col] = "||";
                    }
                } else if (row == 36) {
                    if (col == 26) {
                        this.environment[row][col] = "||";
                    }
                } else if (row == 37) {
                    if (col == 25) {
                        this.environment[row][col] = "__";
                    } else if (col == 26) {
                        this.environment[row][col] = "||";
                    } else if (col == 27) {
                        this.environment[row][col] = "__";
                    }
                } else if (row == 38) {
                    if (col == 24) {
                        this.environment[row][col] = "(|";
                    } else if (col == 25) {
                        this.environment[row][col] = " o";
                    } else if (col == 26) {
                        this.environment[row][col] = "  ";
                    } else if (col == 27) {
                        this.environment[row][col] = "o ";
                    } else if (col == 28) {
                        this.environment[row][col] = "|)";
                    }
                } else if (row == 39) {
                    if (col == 24) {
                        this.environment[row][col] = " |";
                    } else if (col == 25) {
                        this.environment[row][col] = "  ";
                    } else if (col == 26) {
                        this.environment[row][col] = "  ";
                    } else if (col == 27) {
                        this.environment[row][col] = "  ";
                    } else if (col == 28) {
                        this.environment[row][col] = "|  ";
                    }
                } else if (row == 40) {
                    if (col == 24) {
                        this.environment[row][col] = " |";
                    } else if (col == 25) {
                        this.environment[row][col] = "  ";
                    } else if (col == 26) {
                        this.environment[row][col] = "  ";
                    } else if (col == 27) {
                        this.environment[row][col] = "  ";
                    } else if (col == 28) {
                        this.environment[row][col] = "|  ";
                    }
                } else if (row == 41) {
                    if (col == 24) {
                        this.environment[row][col] = "(|";
                    } else if (col == 25) {
                        this.environment[row][col] = "  ";
                    } else if (col == 26) {
                        this.environment[row][col] = "  ";
                    } else if (col == 27) {
                        this.environment[row][col] = "  ";
                    } else if (col == 28) {
                        this.environment[row][col] = "|) ";
                    }
                } else if (row == 42) {
                    if (col == 25) {
                        this.environment[row][col] = "--";
                    } else if (col == 26) {
                        this.environment[row][col] = "--";
                    } else if (col == 27) {
                        this.environment[row][col] = "--";
                    }
                }
            }
        }
    }

    public void drawDish() {
        for (int row = 0; row < this.environment[0].length; row++) {
            for (int col = 0; col < this.environment[row].length; col++) {
                if (row == 27) {
                    if (col == 21) {
                        this.environment[row][col] = "O ";
                    }
                } else if (row == 28) {
                    if (col == 21) {
                        this.environment[row][col] = "o ";
                    } else if (col == 22) {
                        this.environment[row][col] = "o ";
                    }
                }
            }
        }
    }

    public String [][] getEnvironment() {
        return environment;
    }

    public void setEnvironment(int row, int col, String object) {
        this.environment[row][col] = object;
    }

    public void updateMap(int row, int col, String object) {
        this.environment[row][col] = object;
    }

}
