import java.util.Scanner;

public class AdventureGame {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);  // keyboard and choice serve as input for all choices for the game
        String choice = "";                         // Initialized choice

        /* Initializing all the prologs for all the different levels and sublevels here */
        String prolog = "";                         // This prolog contains the first level choices
        String prolog_lev_1 = "";                   // This prolog contains the second level choices
        String prolog_lev_1_1 = "";                 // This prolog contains the third level choices
        String prolog_lev_1_1_1 = "";               // This prolog contains the fourth level choices
        String prolog_lev_1_1_2 = "";               // This prolog contains the fourth level choices
        String prolog_lev_1_2 = "";                 // This prolog contains the third level choices
        String prolog_lev_1_2_1 = "";               // This prolog contains the fourth level choices
        String prolog_lev_1_2_2 = "";               // This prolog contains the fourth level choices
        String prolog_lev_2 = "";                   // This prolog contains the second level choices
        String prolog_lev_2_1 = "";                 // This prolog contains the third level choices
        String prolog_lev_2_1_1 = "";               // This prolog contains the fourth level choices
        String prolog_lev_2_1_2 = "";               // This prolog contains the fourth level choices
        String prolog_lev_2_2 = "";                 // This prolog contains the third level choices
        String prolog_lev_2_2_1 = "";               // This prolog contains the fourth level choices
        String prolog_lev_2_2_2 = "";               // This prolog contains the fourth level choices
        String prolog_lev_3 = "";                   // This prolog contains the second level choices
        String prolog_lev_3_1 = "";                 // This prolog contains the third level choices
        String prolog_lev_3_1_1 = "";               // This prolog contains the fourth level choices
        String prolog_lev_3_1_2 = "";               // This prolog contains the fourth level choices
        String prolog_lev_3_2 = "";                 // This prolog contains the third level choices
        String prolog_lev_3_2_1 = "";               // This prolog contains the fourth level choices
        String prolog_lev_3_2_2 = "";               // This prolog contains the fourth level choices
        String prolog_lev_4 = "";                   // This prolog contains the second level choices
        String prolog_lev_4_1 = "";                 // This prolog contains the third level choices
        String prolog_lev_4_1_1 = "";               // This prolog contains the fourth level choices
        String prolog_lev_4_1_2 = "";               // This prolog contains the fourth level choices
        String prolog_lev_4_2 = "";                 // This prolog contains the third level choices
        String prolog_lev_4_2_1 = "";               // This prolog contains the fourth level choices
        String prolog_lev_4_2_2 = "";               // This prolog contains the fourth level choices
        String prolog_lev_5 = "";                   // This prolog contains the second level choices
        String prolog_lev_5_1 = "";                 // This prolog contains the third level choices
        String prolog_lev_5_1_1 = "";               // This prolog contains the fourth level choices
        String prolog_lev_5_1_2 = "";               // This prolog contains the fourth level choices
        String prolog_lev_5_2 = "";                 // This prolog contains the third level choices
        String prolog_lev_5_2_1 = "";               // This prolog contains the fourth level choices
        String prolog_lev_5_2_2 = "";               // This prolog contains the fourth level choices

        String epilog_success = "";
        String epilog_failure = "";

        // Enter game
        prolog = "Enter (level_1), or (level_2) or (level_3) or (level_4) or (level_5)";
        System.out.println(prolog);
        choice = keyboard.nextLine();
        System.out.println();

        if (choice.equals("level_1")) {
            prolog_lev_1 = " Enter (level_1_1) or (level_l_2)";
            System.out.println(prolog_lev_1);       // Level 1 prolog contains choices for second level.
            choice = keyboard.nextLine();
            System.out.println();

            if (choice.equals("level_1_1")) {           // Level 1.1 prolog contains choices for third level.
                System.out.println(prolog_lev_1_1);
                choice = keyboard.nextLine();
                System.out.println();

                if (choice.equals("level_1_1_1")) {         // Level 1.1.1 prolog contains choices for fourth level.
                    System.out.println(prolog_lev_1_1_1);
                    choice = keyboard.nextLine();
                    System.out.println();

                }
                else if (choice.equals("level_1_1_2")) {    // Level 1.1.2 prolog contains choices for fourth level.
                    System.out.println(prolog_lev_1_1_2);
                    choice = keyboard.nextLine();
                    System.out.println();

                }
                else {
                    // Error
                }
            }
            else if (choice.equals("level_1_2")) {      // Level 1.2 prolog contains choices for third level.
                System.out.println(prolog_lev_1_2);
                choice = keyboard.nextLine();
                System.out.println();

                if (choice.equals("level_1_2_1")) {         // Level 1.1.1 prolog contains choices for fourth level.
                    System.out.println(prolog_lev_1_2_1);
                    choice = keyboard.nextLine();
                    System.out.println();

                }
                else if (choice.equals("level_1_2_2")) {    // Level 1.1.2 prolog contains choices for fourth level.
                    System.out.println(prolog_lev_1_2_2);
                    choice = keyboard.nextLine();
                    System.out.println();

                }
            }
            else {
                // Error
            }
        }
        else if (choice.equals("level_2")) {
            System.out.println(prolog_lev_2);       // Level 2 prolog contains choices for second level.
            choice = keyboard.nextLine();
            System.out.println();

            if (choice.equals("level_2_1")) {           // Level 2.1 prolog contains choices for third level.
                System.out.println(prolog_lev_2_1);
                choice = keyboard.nextLine();
                System.out.println();

                if (choice.equals("level_2_1_1")) {         // Level 2.1.1 prolog contains choices for fourth level.
                    System.out.println(prolog_lev_2_1_1);
                    choice = keyboard.nextLine();
                    System.out.println();

                }
                else if (choice.equals("level_2_1_2")) {    // Level 2.1.2 prolog contains choices for fourth level.
                    System.out.println(prolog_lev_2_1_2);
                    choice = keyboard.nextLine();
                    System.out.println();

                }
            }
            else if (choice.equals("level_2_2")) {      // Level 2.2 prolog contains choices for third level.
                System.out.println(prolog_lev_2_2);
                choice = keyboard.nextLine();
                System.out.println();

                if (choice.equals("level_2_2_1")) {         // Level 2.2.1 prolog contains choices for fourth level.
                    System.out.println(prolog_lev_2_2_1);
                    choice = keyboard.nextLine();
                    System.out.println();

                }
                else if (choice.equals("level_2_2_2")) {    // Level 2.2.2 prolog contains choices for fourth level.
                    System.out.println(prolog_lev_2_2_2);
                    choice = keyboard.nextLine();
                    System.out.println();

                }
            }
            else {
                // Error
            }
        }
        else if (choice.equals("level_3")) {
            System.out.println(prolog_lev_3);       // Level 3 prolog contains choices for second level.
            choice = keyboard.nextLine();
            System.out.println();

            if (choice.equals("level_3_1")) {           // Level 3.1 prolog contains choices for third level.
                System.out.println(prolog_lev_3_1);
                choice = keyboard.nextLine();
                System.out.println();

                if (choice.equals("level_3_1_1")) {         // Level 3.1.1 prolog contains choices for fourth level.
                    System.out.println(prolog_lev_3_1_1);
                    choice = keyboard.nextLine();
                    System.out.println();

                } else if (choice.equals("level_3_1_2")) {    // Level 3.1.2 prolog contains choices for fourth level.
                    System.out.println(prolog_lev_3_1_2);
                    choice = keyboard.nextLine();
                    System.out.println();

                }
            }
            else if (choice.equals("level_3_2")) {      // Level 3.2 prolog contains choices for third level.
                System.out.println(prolog_lev_3_2);
                choice = keyboard.nextLine();
                System.out.println();

                if (choice.equals("level_3_2_1")) {         // Level 3.2.1 prolog contains choices for fourth level.
                    System.out.println(prolog_lev_3_2_1);
                    choice = keyboard.nextLine();
                    System.out.println();

                }
                else if (choice.equals("level_3_2_2")) {    // Level 3.2.2 prolog contains choices for fourth level.
                    System.out.println(prolog_lev_3_2_2);
                    choice = keyboard.nextLine();
                    System.out.println();

                }
            }
            else {
                // Error
            }
        }
        else if (choice.equals("level_4")) {
            System.out.println(prolog_lev_4);       // Level 4 prolog contains choices for second level.
            choice = keyboard.nextLine();
            System.out.println();

            if (choice.equals("level_4_1")) {           // Level 4.1 prolog contains choices for third level.
                System.out.println(prolog_lev_4_1);
                choice = keyboard.nextLine();
                System.out.println();

                if (choice.equals("level_4_1_1")) {         // Level 4.1.1 prolog contains choices for fourth level.
                    System.out.println(prolog_lev_4_1_1);
                    choice = keyboard.nextLine();
                    System.out.println();

                }
                else if (choice.equals("level_4_1_2")) {    // Level 4.1.2 prolog contains choices for fourth level.
                    System.out.println(prolog_lev_4_1_2);
                    choice = keyboard.nextLine();
                    System.out.println();

                }
            }
            else if (choice.equals("level_4_2")) {      // Level 4.2 prolog contains choices for third level.
                System.out.println(prolog_lev_4_2);
                choice = keyboard.nextLine();
                System.out.println();

                if (choice.equals("level_4_2_1")) {         // Level 4.2.1 prolog contains choices for fourth level.
                    System.out.println(prolog_lev_4_2_1);
                    choice = keyboard.nextLine();
                    System.out.println();

                }
                else if (choice.equals("level_4_2_2")) {    // Level 4.2.2 prolog contains choices for fourth level.
                    System.out.println(prolog_lev_4_2_2);
                    choice = keyboard.nextLine();
                    System.out.println();
                }
            }
            else {
                // Error
            }
        }
        else if (choice.equals("level_5")) {
            System.out.println(prolog_lev_5);       // Level 5 prolog contains choices for second level.
            choice = keyboard.nextLine();
            System.out.println();

            if (choice.equals("level_5_1")) {           // Level 5.1 prolog contains choices for third level.
                System.out.println(prolog_lev_5_1);
                choice = keyboard.nextLine();
                System.out.println();

                if (choice.equals("level_5_1_1")) {         // Level 5.1.1 prolog contains choices for fourth level.
                    System.out.println(prolog_lev_5_1_1);
                    choice = keyboard.nextLine();
                    System.out.println();

                }
                else if (choice.equals("level_5_1_2")) {    // Level 5.1.2 prolog contains choices for fourth level.
                    System.out.println(prolog_lev_5_1_2);
                    choice = keyboard.nextLine();
                    System.out.println();

                }
            }
            else if (choice.equals("level_5_2")) {      // Level 5.2 prolog contains choices for third level.
                System.out.println(prolog_lev_5_2);
                choice = keyboard.nextLine();
                System.out.println();

                if (choice.equals("level_5_2_1")) {         // Level 5.2.1 prolog contains choices for fourth level.
                    System.out.println(prolog_lev_5_2_1);
                    choice = keyboard.nextLine();
                    System.out.println();

                }
                else if (choice.equals("level_5_2_2")) {    // Level 5.2.2 prolog contains choices for fourth level.
                    System.out.println(prolog_lev_5_2_2);
                    choice = keyboard.nextLine();
                    System.out.println();
                }
            }
            else {
                // Error
            }
        }
        else {
            // Error
        }
    }
}
