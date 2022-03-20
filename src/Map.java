// For simulation

public class Map {

    public Map (int robotPartition1,
            int subPartition1,

            int robotPartition2,
            int robotPartition3,
            int robotPartition4,
            int robotPartition5,
            int robotPartition6,
            int robotPartition7,
            int robotPartition8
    ) {
        this.robotPartition1 = robotPartition1;
        this.subPartition1 = subPartition1;
        this.robotPartition2 = robotPartition2;
        this.robotPartition3 = robotPartition3;
        this.robotPartition4 = robotPartition4;
        this.robotPartition5 = robotPartition5;
        this.robotPartition6 = robotPartition6;
        this.robotPartition7 = robotPartition7;
        this.robotPartition8 = robotPartition8 ;
    }

    private int width = 50;
    private int length = 50;
    private String[][] environment = new String[this.width][this.length];
    private boolean hasDishes = false;
    private int robotPartition1;
    private int subPartition1;

    int robotPartition2;
    int robotPartition3;
    int robotPartition4;
    int robotPartition5;
    int robotPartition6;
    int robotPartition7;
    int robotPartition8;

    int subPartition2 = 26;
    int subPartition3 = 26;
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

    public void drawRobot(String robotCommand) {


        if (this.robotPartition1 == 27 || this.robotPartition1 == 28) {
            if (this.subPartition1 == 21 || this.subPartition1 == 22) {
                this.hasDishes = true;
            }
        }

        switch (robotCommand) {
            case "move forward" :
                this.robotPartition1 -= 1;
                robotPartition2 -= 1;
                robotPartition3 -= 1;
                robotPartition4 -= 1;
                robotPartition5 -= 1;
                robotPartition6 -= 1;
                robotPartition7 -= 1;
                robotPartition8 -= 1;
                break;
            case "move backward" :
                this.robotPartition1 += 1;
                robotPartition2 += 1;
                robotPartition3 += 1;
                robotPartition4 += 1;
                robotPartition5  += 1;
                robotPartition6 += 1;
                robotPartition7 += 1;
                robotPartition8 += 1;
                break;
            case "move upperarm rightward" :
                this.environment[robotPartition3][subPartition3] = "//";

                subPartition1 += 1;
                this.environment[robotPartition1][subPartition1] = "||";
                this.environment[robotPartition1][subPartition1 - 1 ] = ". ";

                subPartition2 += 1;
                this.environment[robotPartition2][subPartition2] = "||";
                this.environment[robotPartition2][subPartition2 - 1 ] = ". ";

                break;
            case "move upperarm leftward" :
                this.environment[robotPartition3][subPartition3] = "\\";
                subPartition1 -= 1;
                this.environment[robotPartition1][subPartition1] = "||";
                this.environment[robotPartition1][subPartition1 + 1 ] = ". ";

                subPartition2 -= 1;
                this.environment[robotPartition2][subPartition2] = "||";
                this.environment[robotPartition2][subPartition2 + 1 ] = ". ";

                break;
            case "move forearm rightward" :
                this.environment[robotPartition2][subPartition2] = "//";
                subPartition1 += 1;
                this.environment[robotPartition1][subPartition1] = "||";
                this.environment[robotPartition1][subPartition1 - 1 ] = ". ";

                break;
            case "move forearm leftward" :
                this.environment[robotPartition2][subPartition2] = "\\";
                subPartition1 -= 1;
                this.environment[robotPartition1][subPartition1] = "||";
                this.environment[robotPartition1][subPartition1 + 1 ] = ". ";

                break;
            case "move hand rightward" :
                this.environment[this.robotPartition1][this.subPartition1] = "//";
                break;
            case "move hand leftward" :
                this.environment[this.robotPartition1][this.subPartition1] = "\\";
                break;
        }

        for (int row = 0; row < this.environment[0].length; row++) {
            for (int col = 0; col < this.environment[row].length; col++) {

                if (row == this.robotPartition1) {
                    if (col == this.subPartition1) {
                        this.environment[row][col] = "||";
                    }
                } else if (row == robotPartition2) {
                    if (col == subPartition2) {
                        this.environment[row][col] = "||";
                    }
                } else if (row == robotPartition3) {
                    if (col == 25) {
                        this.environment[row][col] = "__";
                    } else if (col == subPartition3) {
                        this.environment[row][col] = "||";
                    } else if (col == 27) {
                        this.environment[row][col] = "__";
                    }
                } else if (row == robotPartition4) {
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
                } else if (row == robotPartition5) {
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
                } else if (row == robotPartition6) {
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
                } else if (row == robotPartition7) {
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
                } else if (row == robotPartition8) {
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

    public void drawDishes() {
        int dish1Partition = 27;
        int dish2Partition = 28;

        int dish1SubPartition = 21;
        int dish2SubPartition = 21;
        int dish3SubPartition = 22;

        if (this.hasDishes == true) {
            dish1Partition = this.robotPartition1 - 2;
            dish2Partition = this.robotPartition1 - 1;
            dish1SubPartition = this.subPartition1 - 1;
            dish2SubPartition = this.subPartition1 - 1;
            dish3SubPartition = this.subPartition1;
        }

        for (int row = 0; row < this.environment[0].length; row++) {
            for (int col = 0; col < this.environment[row].length; col++) {
                if (row == dish1Partition) {
                    if (col == dish1SubPartition) {
                        this.environment[row][col] = "O ";
                    }
                } else if (row == dish2Partition) {
                    if (col == dish2SubPartition) {
                        this.environment[row][col] = "o ";
                    } else if (col == dish3SubPartition) {
                        this.environment[row][col] = "o ";
                    }
                }
            }
        }
    }

    public void drawMap(String robotCommand) {
        this.populateMap();
        this.drawRobot(robotCommand);
        this.drawDishes();

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

    public void updateMap(int row, int col, String object) {
        this.environment[row][col] = object;
    }

}
