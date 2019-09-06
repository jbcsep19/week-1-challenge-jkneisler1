import java.util.Scanner;

public class AdventureGame {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);  // keyboard and choice serve as input for all choices for the game
        String choice = "";                         // Initialized choice
        String epilog_success = "You have succeeded in your quest for riches beyond belief.";
        String epilog_failure = "You have failed in your quest for riches, fame and glory.";

        // Enter game
        String prolog = "You are an unemployed and you are looking to change your luck.\r\nYou’ve decided to go treasure hunting and claim untold riches to make you wealthy beyond belief.\r\nYou have conducted extensive research and you have narrowed your possible places to five choices:\r\n   The Island of Blue Mountains in the South Pacific,\r\nA place in the Andes Mountains where a volcano annihilated all the inhabitants to extinction,\r\n   An island in Indonesia,\r\nA remote location in Appalachia, and\r\n   A remote location in Greenland known as Windomere.\r\nThey all have treasures; however at this point you have to go to a location to find out more details.\r\nYou also do not have enough resources to visit more than one location.\r\nFor choice one enter (IBM), choice two (VAX), choice three (Indo), choice four (Apple), choice five (Windows).";
        System.out.println(prolog);
        choice = keyboard.nextLine().toUpperCase();
        System.out.println();

        if (choice.equals("IBM")) {                 // Level 1 prolog contains choices for second level.
            String prolog_lev_1 = "You decide to travel to the Island of Blue Mountains.\r\nYou were told that possible treasure on the island are two very large opals and two very large sapphires.\r\nYou are also told that many vary large sapphires exist on another mountain.\r\n For choice one enter (OS2), choice two (MVS).";
            System.out.println(prolog_lev_1);
            choice = keyboard.nextLine().toUpperCase();
            System.out.println();

            if (choice.equals("OS2")) {           // Level 1.1 prolog contains choices for third level.
                String prolog_lev_1_1 = "You travel to the mountain that has the 2 opals and sapphires.\r\nWhen you arrive, you ask a local where to find the gems.  She was not sure but she had heard that the gems exist on one of two caves\r\nFor choice one enter (cave1), choice two (cave2).)";
                System.out.println(prolog_lev_1_1);
                choice = keyboard.nextLine().toUpperCase();
                System.out.println();

                if (choice.equals("CAVE1")) {         // Level 1.1.1 prolog contains choices for fourth level.
                    String prolog_lev_1_1_1 = "You enter the first cave and there are two paths into the cave that you can take.\r\nFor choice one enter (path1), choice two (path2).";
                    System.out.println(prolog_lev_1_1_1);
                    choice = keyboard.nextLine().toUpperCase();
                    System.out.println();

                    if (choice.equals("PATH1")) {
                        epilog_failure = "You have been in the cave for several hours when you drop your flashlight.\r\nUnable to find your way out of the cave, you perish.\r\n" + epilog_failure;
                        System.out.println(epilog_failure);
                        System.out.print("End of game.  Please try again.");
                    }
                    else if (choice.equals("PATH2")) {
                        epilog_failure = "You start down the second path when notice a very steep crevasse to your right.\r\nBefore you know it you fall 256 ft to you death.\r\n" + epilog_failure;
                        System.out.println(epilog_failure);
                        System.out.print("End of game.  Please try again.");
                    }
                    else {
                        System.out.println("Error: made a bad entry, please restart the game.");
                    }
                }
                else if (choice.equals("CAVE2")) {    // Level 1.1.2 prolog contains choices for fourth level.
                    String prolog_lev_1_1_2 = "You enter cave 2 and you notice carvings on the wall.\r\nThere are 2 trails you can take.\r\nFor choice one enter (Trail1), choice two (Trail2).";
                    System.out.println(prolog_lev_1_1_2);
                    choice = keyboard.nextLine().toUpperCase();
                    System.out.println();

                    if (choice.equals("TRAIL1")) {
                        epilog_failure = "You start down the first trail and you foot hits a trip wire.\r\nSeveral poison darts are shot out from the walls, killing you instantly.\r\n" + epilog_failure;
                        System.out.println(epilog_failure);
                        System.out.print("End of game.  Please try again.");
                    }
                    else if (choice.equals("TRAIL2")) {
                        epilog_failure = "You have traveled a long way down the second trail and you come to a door.\r\nYou open the door only to have 8 vipers taking a byte out of you,\r\n killing you slowly" + epilog_failure;
                        System.out.println(epilog_failure);
                        System.out.print("End of game.  Please try again.");
                    }
                    else {
                        System.out.println("Error: made a bad entry, please restart the game.");
                    }
                }
                else {
                    System.out.println("Error: made a bad entry, please restart the game.");
                }
            }
            else if (choice.equals("MVS")) {      // Level 1.2 prolog contains choices for third level.
                String prolog_lev_1_2 = "You travel to the mountain that has the many very large sapphires.\r\nThere are two rope bridges crossing a river 512 ft below.\r\nFor choice one enter (Bridge1), choice two (Bridge2).))";
                System.out.println(prolog_lev_1_2);
                choice = keyboard.nextLine().toUpperCase();
                System.out.println();

                if (choice.equals("BRIDGE1")) {         // Level 1.1.1 prolog contains choices for fourth level.
                    String prolog_lev_1_2_1 = "You carefully step on the first bridge and you safely make it across.\r\nA little while later you see two rope ladders leading in two different directions.\r\nFor choice one enter (Ladder1), choice two (Ladder2).";
                    System.out.println(prolog_lev_1_2_1);
                    choice = keyboard.nextLine().toUpperCase();
                    System.out.println();

                    if (choice.equals("LADDER1")) {
                        epilog_failure = "You step on the ladder and a bolt of lightning hits the ladder, killing you instantly.\r\n(Yes, ladders can fail on bridges with too much electricity.)\r\n" + epilog_failure;
                        System.out.println(epilog_failure);
                        System.out.print("End of game.  Please try again.");
                    }
                    else if (choice.equals("You step on the ladder and a bolt of lightning hits the ladder, killing you instantly.\r\n(Yes, ladders can fail on bridges with too much electricity.  Didn't you learn this when you took the first ladder?)\n")) {
                        epilog_failure = "You " + epilog_failure;
                        System.out.println(epilog_failure);
                        System.out.print("End of game.  Please try again.");
                    }
                    else {
                        System.out.println("Error: made a bad entry, please restart the game.");
                    }
                }
                else if (choice.equals("BRIDGE2")) {    // Level 1.1.2 prolog contains choices for fourth level.
                    String prolog_lev_1_2_2 = "You carefully step on the second bridge and you safely make it across.  A little while later you come across two rope swings.\r\nFor choice one enter (Swing1), choice two (Swing2).";
                    System.out.println(prolog_lev_1_2_2);
                    choice = keyboard.nextLine().toUpperCase();
                    System.out.println();

                    if (choice.equals("SWING1")) {
                        epilog_failure = "You " + epilog_failure;
                        System.out.println(epilog_failure);
                        System.out.print("End of game.  Please try again.");
                    }
                    else if (choice.equals("SWING2")) {
                        epilog_failure = "You " + epilog_failure;
                        System.out.println(epilog_failure);
                        System.out.print("End of game.  Please try again.");
                    }
                    else {
                        System.out.println("Error: made a bad entry, please restart the game.");
                    }
                }
                else {
                    System.out.println("Error: made a bad entry, please restart the game.");
                }
            }
            else {
                System.out.println("Error: You made a bad entry in the plane you were flying and it crash landed.  Please restart the game.");
            }
        }
        else if (choice.equals("VAX")) {       // Level 2 prolog contains choices for second level.
            String prolog_lev_2 = "You arrive in the Andes and there are two areas that you want to check out.\r\n For choice one enter (Area1), choice two (Area2).";
            System.out.println(prolog_lev_2);
            choice = keyboard.nextLine().toUpperCase();
            System.out.println();

            if (choice.equals("AREA1")) {           // Level 2.1 prolog contains choices for third level.
                String prolog_lev_2_1 = "You arrive at area 1 and start investigating.   There are 2 ways to go down into the volcano.\r\nFor choice one enter (Way1), choice two (Way2).";
                System.out.println(prolog_lev_2_1);
                choice = keyboard.nextLine().toUpperCase();
                System.out.println();

                if (choice.equals("WAY1")) {         // Level 2.1.1 prolog contains choices for fourth level.
                    epilog_failure = "You enter the volcano and soon after you are overcome with toxic gas and die in the volcano.\r\n(There was nothing there, the VAX died a long time ago)\r\n" + epilog_failure;
                    System.out.println(epilog_failure);
                    System.out.print("End of game.  Please try again.");
                }
                else if (choice.equals("WAY2")) {    // Level 2.1.2 prolog contains choices for fourth level.
                    epilog_failure = "You think you see something valuable and you scream out in excitement.\r\nIn doing so, you trigger an avalanche crushing you.\r\n(There was nothing there, the VAX died a long time ago)\r\n" + epilog_failure;
                    System.out.println(epilog_failure);
                    System.out.print("End of game.  Please try again.");
                }
                else {
                    System.out.println("Error: made a bad entry, please restart the game.");
                }
            }
            else if (choice.equals("AREA2")) {      // Level 2.2 prolog contains choices for third level.
                String prolog_lev_2_2 = "You arrive at area 2 and start investigating.\r\nIt is time to set up camp.  There are 2 choices high ground or low ground\r\nFor choice one enter (High), choice two (Low).";
                System.out.println(prolog_lev_2_2);
                choice = keyboard.nextLine().toUpperCase();
                System.out.println();

                if (choice.equals("HIGH")) {         // Level 2.2.1 prolog contains choices for fourth level.
                    epilog_failure = "Over night, the temperature drops 40 degrees, which you are unpreparred for.\r\nYou freeze to death on the near the top of the volcano.\r\n(There was nothing there, the VAX died a long time ago)\r\n" + epilog_failure;
                    System.out.println(epilog_failure);
                    System.out.print("End of game.  Please try again.");
                }
                else if (choice.equals("LOW")) {    // Level 2.2.2 prolog contains choices for fourth level.
                    epilog_failure = "You wake up in the middle of the night during a torrential rainstorm.\r\nBefore you know it, you are swept away in the flood, never to be seen from again.\r\n(There was nothing there, the VAX died a long time ago)\r\n" + epilog_failure;
                    System.out.println(epilog_failure);
                    System.out.print("End of game.  Please try again.");
                }
                else {
                    System.out.println("Error: made a bad entry, please restart the game.");
                }
            }
            else {
                System.out.println("Error: You made a bad entry in the plane you were flying and it crash landed.  Please restart the game.");
            }
        }
        else if (choice.equals("INDO")) {       // Level 3 prolog contains choices for second level.
            String prolog_lev_3 = "You arrive in Indonesia and there are two groups of islands that you can travel to.\r\nFor choice one enter (Group1), choice two (Group2).";
            System.out.println(prolog_lev_3);
            choice = keyboard.nextLine().toUpperCase();
            System.out.println();

            if (choice.equals("GROUP1")) {           // Level 3.1 prolog contains choices for third level.
                String prolog_lev_3_1 = "You have two choices for this group, Borneo or Java.\r\nFor choice one enter (Borneo), choice two (Java).";
                System.out.println(prolog_lev_3_1);
                choice = keyboard.nextLine().toUpperCase();
                System.out.println();

                if (choice.equals("BORNEO")) {         // Level 3.1.1 prolog contains choices for fourth level.
                    epilog_failure = "You arrived in Borneo, you travel around for months using up all your resources.\r\nYou arrive back home penniless." + epilog_failure;
                    System.out.println(epilog_failure);
                    System.out.print("End of game.  Please try again.");
                }
                else if (choice.equals("JAVA")) {    // Level 3.1.2 prolog contains choices for fourth level.
                    epilog_success = "When you arrived, it was like entering paradise.  Everything worked well, everyone was happy.\r\nYou will always find happiness working on Java.\r\n" + epilog_success;
                    System.out.println(epilog_success);
                    System.out.print("End of game.  Please try again.");
                }
                else {
                    System.out.println("Error: made a bad entry, please restart the game.");
                }
            }
            else if (choice.equals("GROUP2")) {      // Level 3.2 prolog contains choices for third level.
                String prolog_lev_3_2 = "You have two choices for this group, Sumatra or Lombok.\r\nFor choice one enter (Sumatra), choice two (Lombok).";
                System.out.println(prolog_lev_3_2);
                choice = keyboard.nextLine();
                System.out.println();

                if (choice.equals("SUMATRA")) {         // Level 3.2.1 prolog contains choices for fourth level.
                    epilog_failure = "You, arrive in Sumatra and you try their coffee and you forget about what you were searching for.  You never find any treasure.\r\n" + epilog_failure;
                    System.out.println(epilog_failure);
                    System.out.print("End of game.  Please try again.");
                }
                else if (choice.equals("LOMBOK")) {    // Level 3.2.2 prolog contains choices for fourth level.
                    epilog_failure = "You are in Lombok, and you are kidnapped and taken away for ransom.\r\nWhen your captors find out you have no money, they let you go.\r\nYou immediately decide to go back home.\r\n" + epilog_failure;
                    System.out.println(epilog_failure);
                    System.out.print("End of game.  Please try again.");
                }
                else {
                    System.out.println("Error: made a bad entry, please restart the game.");
                }
            }
            else {
                System.out.println("Error: You made a bad entry in the plane you were flying and it crash landed.  Please restart the game.");
            }
        }
        else if (choice.equals("APPLE")) {       // Level 4 prolog contains choices for second level.
            String prolog_lev_4 = "You arrive in a small town in Appalachia where all the houses were made with adobe.  Everything was beautiful and picturesque.\r\nYou talk to the first person you meet and you inquire about the whether there is any myth about treasure in this area.\r\nThe person replied that here in Appalachia one has to work to find treasure.\r\nThe person then said that you can either find your own job or you can come with me.\r\nFor choice one enter (Jobs) for choice two enter (Cook).";
            System.out.println(prolog_lev_4);
            choice = keyboard.nextLine().toUpperCase();
            System.out.println();

            if (choice.equals("JOBS")) {           // Level 4.1 prolog contains choices for third level.
                String prolog_lev_4_1 = "You have decided to look for a job so you purchase a local newspaper.\r\nYou find two jobs, the first job you need to call Mr. Mackintosh and the other job you need to ask for Lisa\r\nFor choice one enter (Mac) for choice two enter (Lisa)";
                System.out.println(prolog_lev_4_1);
                choice = keyboard.nextLine();
                System.out.println();

                if (choice.equals("MAC")) {         // Level 4.1.1 prolog contains choices for fourth level.
                    String prolog_lev_4_1_1 = "You talk to Mac and he replied that he had two openings.\r\nOne on a pod out in a lake and a pad on some property that he owns.\r\nFor choice one enter (iPod) for choice two enter (iPad)";
                    System.out.println(prolog_lev_4_1_1);
                    choice = keyboard.nextLine().toUpperCase();
                    System.out.println();

                    if (choice.equals("IPOD")) {
                        epilog_failure = "You decided to work on the pod; however, the work was similar to what you did years ago and it was not very exciting anymore.\r\nYou realize that there is no treasure here so you decide to go back home.\r\n" + epilog_failure;
                        System.out.println(epilog_failure);
                        System.out.print("End of game.  Please try again.");
                    }
                    else if (choice.equals("IPAD")) {
                        epilog_failure = "You decided to work on the pad; however, you soon realize that everything in\r\nthis area is so expensive that you cannot afford to live here with or without any treasure.\r\nYou realize that there is no treasure here so you decide to go back home.\r\n" + epilog_failure;
                        System.out.println(epilog_failure);
                        System.out.print("End of game.  Please try again.");
                    }
                    else {
                        System.out.println("Error: made a bad entry, please restart the game.");
                    }
                }
                else if (choice.equals("LISA")) {    // Level 4.1.2 prolog contains choices for fourth level.
                    String prolog_lev_4_1_2 = "You talk to Lisa about working for her and she had two openings, \r\none with Mr Scully in operations and one with Mr. Wozniak.\r\nFor choice one enter (Scully) for choice two enter (Woz)";
                    System.out.println(prolog_lev_4_1_2);
                    choice = keyboard.nextLine().toUpperCase();
                    System.out.println();

                    if (choice.equals("SCULLY")) {
                        epilog_failure = "You talk to Mr. Scully and you agree to work with  him.\r\nWorking with Mr. Scully was very difficult, you argued with him constantly and disagreed with his business practices.\r\nAfter a month you quit and decide to go back home." + epilog_failure;
                        System.out.println(epilog_failure);
                        System.out.print("End of game.  Please try again.");
                    }
                    else if (choice.equals("WOZ")) {
                        epilog_failure = "You called Mr. Wozniak and found out that he quit his job weeks ago\r\nand advised you not to work for Lisa, because her costs are too high.\r\n" + epilog_failure;
                        System.out.println(epilog_failure);
                        System.out.print("End of game.  Please try again.");
                    }
                    else {
                        System.out.println("Error: made a bad entry, please restart the game.");
                    }
                }
                else {
                    System.out.println("Error: made a bad entry, please restart the game.");
                }
            }
            else if (choice.equals("COOK")) {      // Level 4.2 prolog contains choices for third level.
                String prolog_lev_4_2 = "You go with the person you met to her restaurant.  She tells you that she has two openings, one for a waiter and one to bus tables.\r\nFor choice one enter (Wait) for choice two enter (Bus).";
                System.out.println(prolog_lev_4_2);
                choice = keyboard.nextLine().toUpperCase();
                System.out.println();

                if (choice.equals("WAIT")) {         // Level 4.2.1 prolog contains choices for fourth level.
                    String prolog_lev_4_2_1 = "You decide to work as a waiter";
                    System.out.println(prolog_lev_4_2_1);
                    choice = keyboard.nextLine().toUpperCase();
                    System.out.println();

                    if (choice.equals("level_4_2_1_1")) {
                        epilog_failure = "You " + epilog_failure;
                        System.out.println(epilog_failure);
                        System.out.print("End of game.  Please try again.");
                    }
                    else if (choice.equals("level_4_2_1_2")) {
                        epilog_failure = "You " + epilog_failure;
                        System.out.println(epilog_failure);
                        System.out.print("End of game.  Please try again.");
                    }
                    else {
                        System.out.println("Error: made a bad entry, please restart the game.");
                    }
                }
                else if (choice.equals("BUS")) {    // Level 4.2.2 prolog contains choices for fourth level.
                    String prolog_lev_4_2_2 = "You decide to work as a busing tables.  \r\nFor choice one enter (ONE) for choice two enter (TWO).";
                    System.out.println(prolog_lev_4_2_2);
                    choice = keyboard.nextLine().toUpperCase();
                    System.out.println();

                    if (choice.equals("ONE")) {
                        epilog_failure = "You " + epilog_failure;
                        System.out.println(epilog_failure);
                        System.out.print("End of game.");
                    }
                    else if (choice.equals("TWO")) {
                        epilog_failure = "You " + epilog_failure;
                        System.out.println(epilog_failure);
                        System.out.print("End of game.");
                    }
                    else {
                        System.out.println("Error: made a bad entry, please restart the game.");
                    }
                }
                else {
                    System.out.println("Error: made a bad entry, please restart the game.");
                }
            }
            else {
                System.out.println("Error: You made a bad entry in the plane you were flying and it crash landed.  Please restart the game.");
            }
        }
        else if (choice.equals("WINDOWS")) {       // Level 5 prolog contains choices for second level.
            String prolog_lev_5 = "You land in northern Greenland and you have a local taxi driver take you to Windomere.\r\nHe is nervous but he drives to the outskirts of town and hastily drives off back to the airport.\r\nDuring the trip you talk to the driver about what can be found in Windomere.\r\nThe driver told of a story that his grandfather told him that there is someplace in Windomere where all your wishes will come true.\r\nThe driver also said that he did not believe the story, the claim seems so outrageous.\r\n.You enter the town and to your surprise, there are these small blue creatures that are everywhere and they move very slowly.  You decide to call them micro sloths.\r\nYou talk to one of them about what you are after and the sloth replied that there are only two paths that lead out of town.\r\nOne called the winding incline narrows and the other is called down on the seaside.\r\nFor choice one enter (win) for choice two enter (dos).";
            System.out.println(prolog_lev_5);
            choice = keyboard.nextLine().toUpperCase();
            System.out.println();

            if (choice.equals("WIN")) {           // Level 5.1 prolog contains choices for third level.
                String prolog_lev_5_1 = "You walk up a slope for several miles and you come to a small town, again there are micro sloths everywhere.\r\nYou also hear them mumbling how they can solve any problem and your spirits are lifted and you start to believe that maybe they can make wishes come true.\r\nYou talk to one of the sloths and ask them if they can make any wish come true.  The sloth said that you will have to talk to their leader B. S. Death but he goes by the name of Baloo.\r\nYou ask where can I find this Baloo?The sloth replied that Baloo is either in the mirco sloth office at the edge of town or at the peak of Mt Skype.\r\nFor choice one enter (Office) or for choice two enter (Skype).";
                System.out.println(prolog_lev_5_1);
                choice = keyboard.nextLine().toUpperCase();
                System.out.println();

                if (choice.equals("OFFICE")) {         // Level 5.1.1 prolog contains choices for fourth level.
                    String prolog_lev_5_1_1 = "You decided to check out the micro sloth’s office.  There was a sloth next to the office and asked where you could find Baloo.\r\nThe sloth answer, he can be found either in the front office or the back office\r\nFor choice one enter (Front) or for choice two enter (Back)";
                    System.out.println(prolog_lev_5_1_1);
                    choice = keyboard.nextLine();
                    System.out.println();

                    if (choice.equals("FRONT")) {
                        epilog_failure = "You were so enamoured with the office windows that you totally forgot about your quest\r\n" + epilog_failure;
                        System.out.println(epilog_failure);
                        System.out.print("End of game.  Please try again.");
                    }
                    else if (choice.equals("BACK")) {
                        epilog_failure = "You could not find Baloo and you wondered around aimlessly for years never to find Baloo.\r\nIn the process you squandered all the money and resources you had and became very dissolutioned in the process." + epilog_failure;
                        System.out.println(epilog_failure);
                        System.out.print("End of game.  Please try again.");
                    }
                    else {
                        System.out.println("Error: You had a problem with micro sloth's office, don't worry everyone does.\r\nPease restart the game.");
                    }
                }
                else if (choice.equals("SKYPE")) {    // Level 5.1.2 prolog contains choices for fourth level.
                    String prolog_lev_5_1_2 = "YYou decided to climb up Mt Skype.  The trek was exhausting, with each step you took the slower you moved.  It started to get very cold and you had difficulty moving forward.\r\nFor choice one enter (Froze) or for choice two enter (Conn)";
                    System.out.println(prolog_lev_5_1_2);
                    choice = keyboard.nextLine().toUpperCase();
                    System.out.println();

                    if (choice.equals("FROZE")) {
                        epilog_failure = "Your attempt was in vain, everything froze including you.\r\n" + epilog_failure;
                        System.out.println(epilog_failure);
                        System.out.print("End of game.  Please try again.");
                    }
                    else if (choice.equals("CONN")) {
                        epilog_failure = "You could not connect with Baloo on Mt Skype.\r\nIn the process you became very dissolutioned and decided never go to Skype again.\r\n" + epilog_failure;
                        System.out.println(epilog_failure);
                        System.out.print("End of game.  Please try again.");
                    }
                    else {
                        System.out.println("Error: You had a problem with Skype, don't worry everybody does.\r\nPlease restart the game.");
                    }
                }
                else {
                    System.out.println("Error: made a bad entry, please restart the game.");
                }
            }
            else if (choice.equals("DOS")) {      // Level 5.2 prolog contains choices for third level.
                String prolog_lev_5_2 = "You walk down a path for several miles and you come to a seaside village, again there are micro sloths everywhere.\r\nYou also hear them mumbling how they can solve any problem and your spirits are lifted and you start to believe that maybe they can make wishes come true.\r\nYou talk to one of the sloths and ask them if they can make any wish come true.  The sloth said that you will have to talk to their leader Baloo Skeen Death but he goes by the name of Baloo.\r\nYou ask where can I find this Baloo?The sloth replied that Baloo is either floating along the tide or he can be meandering along the dunes.\r\n nFor choice one enter (FAT) or for choice two enter (CMD).";
                System.out.println(prolog_lev_5_2);
                choice = keyboard.nextLine().toUpperCase();
                System.out.println();

                if (choice.equals("FAT")) {         // Level 5.2.1 prolog contains choices for fourth level.
                    String prolog_lev_5_2_1 = "You take a boat out on the tide, it is getting late and you need to decide to continue or to go back to shore.\r\nFor choice one enter (forward) for choice two enter (return)";
                    System.out.println(prolog_lev_5_2_1);
                    choice = keyboard.nextLine().toUpperCase();
                    System.out.println();

                    if (choice.equals("FORWARD")) {
                        epilog_failure = "You keep floating in micro sloth's world drowning in fog and confusion, never to be seen or heard from again.\r\n" + epilog_failure;
                        System.out.println(epilog_failure);
                        System.out.print("End of game.  Please try again");
                    }
                    else if (choice.equals("RETURN")) {
                        epilog_failure = "You return to shore and you walked into a bed of quicksand.  You got out but lost everything.\r\nIt was then that you realized that the FAT used up all of your resources." + epilog_failure;
                        System.out.println(epilog_failure);
                        System.out.print("End of game.  Please try again");
                    }
                    else {
                        System.out.println("Error: made a bad entry, please restart the game.");
                    }
                }
                else if (choice.equals("CMD")) {    // Level 5.2.2 prolog contains choices for fourth level.
                    String prolog_lev_5_2_2 = "You walk along the dunes for hours and you come across two huts with signs.\r\nOne sign was labeled Big Indian and the other was labeled Little Indian.\r\nFor choice one enter (big), for choice two enter (little)";
                    System.out.println(prolog_lev_5_2_2);
                    choice = keyboard.nextLine().toUpperCase();
                    System.out.println();

                    if (choice.equals("BIG")) {
                        epilog_failure = "You go into the hut and talk to the owner and ask whether this is the land where wiches come true.\r\nThe big Indian said that he did not know because micro sloths does not work with big Indians.\r\nCompletely frustrated, you went home." + epilog_failure;
                        System.out.println(epilog_failure);
                        System.out.print("End of game.  Please try again");
                    }
                    else if (choice.equals("LITTLE")) {
                        epilog_failure = "You walk into the little Indian's hut and to your astonishment there was Baloo.  He was not small, he was huge and Baloo lunged toward you.\r\nYou were consummed by the micro sloth's Baloo Skeen Death.\r\n" + epilog_failure;
                        System.out.println(epilog_failure);
                        System.out.print("End of game.  Please try again");
                    }
                    else {
                        System.out.println("Error: You made a bad entry, please restart the game.");
                    }
                }
                else {
                    System.out.println("Error: You are nervous could not face Baloo Skeen Death and entered incorrectly, please restart the game.");
                }
            }
            else {
                System.out.println("Error: You made a bad entry, please restart the game.");
            }
        }
        else {
            System.out.println("Error: You made a bad entry in the plane you were flying and it crash landed.  Please restart the game.");
        }
    }
}
