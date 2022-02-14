package appmusic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * In this class we find the main where the program will be executed by console,
 * the menu and the different options that this specific program can perform.
 *
 * @version 1.01.1 2022-02-12
 *
 * @author Adryan Ynfante Valero - adryanynfante@gmail.com Diego Fernando
 * Becerra Zambrano - diegofer1110@gmail.com
 *
 * @since Available from version 1
 *
 */
public class AppMusic {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /* Variable declaration. */
        ArrayList<Song> ListM = new ArrayList<>();
        ArrayList<Song> PlayL = new ArrayList<>();
        int op = 0;
        Scanner num = new Scanner(System.in);
        Scanner anio = new Scanner(System.in);
        DaoSong meth = new DaoSong();
        String dat = "";
        
        /* Loading of song array information and welcome to the system is performed. */
        System.out.println("**************************************************");
        System.out.println("   Welcome to DAM -Music for you-");
        System.out.println("**************************************************");
        Song sg1 = new Song("A", "Bohemian Rhapsody", " Is a song and single by the British rock band Queen.", "5.55", "Rock", "   ─═☆☆═─  ", "1975");
        ListM.add(sg1);
        Song sg2 = new Song("B", "Candle in The Wind", " Is a song with music by Elton John and lyrics by Bernie Taupin.", "3.57", "Pop", " ((̲̅●̲̲̅=̲̲̅●̲̅)) ", "1997");
        ListM.add(sg2);
        Song sg3 = new Song("C", "Games             ", " It's a heartbreak song ", "3.01", "Pop", "  ¯(°_o)/¯    ", "2017");
        ListM.add(sg3);
        Song sg4 = new Song("D", "All Dead,All Dead", " Is a Queen song written by Brian May", "3.04", "Rock", "  √v^√v^√♥  ", "1977");
        ListM.add(sg4);
        Song sg5 = new Song("E", "Coming Soon      ", " Is a song written by drummer of the English rock band Queen", "3.02", "Rock", " (̲̅:̲̅:̲̅:̲̅:̲̅:̲̅)", "1980");
        ListM.add(sg5);

        System.out.println("*******Our Songs*******");
        System.out.println("|      Title     | |  Gender | Duration | Date  |       Cover       |                          Description                          |");
        for (Song sg : ListM) {
            System.out.println(sg.toString());
        }

        /* Start of the cycle with which a console menu is generated for the program to perform its functions. */
        do {
            System.out.println("");
            System.out.println("Please enter the number of the desired option ");
            System.out.println("1. Create playlist of songs");
            System.out.println("2. Filter by:  ");
            System.out.println("3. Sort by: ");
            System.out.println("4. Modify Playlist: ");
            System.out.println("5. Show Playlist: ");
            System.out.println("0. Exit DAM. ");
            System.out.println("");
            op = num.nextInt();

            /* System options are started. */
            switch (op) {
                case 1:

                    /* Functionality of the program where song type objects are stored in a given arraylist making the user create a playlist. */
                    System.out.println("===================================");
                    System.out.println("|      Title     | |  Gender | Duration | Date  |       Cover       |                          Description                          |");
                    for (Song sg : ListM) {
                        System.out.println(sg.toString());
                    }
                    System.out.println("===================================");
                    System.out.println("********Create Playlist********");
                    System.out.println("Type the song's number to add: ");
                    int opplay = 0;
                    do {
                        opplay = num.nextInt();
                        if (opplay == 0) {
                        } else {
                            PlayL.add(ListM.get(opplay - 1));
                        }
                        if (!PlayL.isEmpty()) {
                            System.out.println("Press song number to add or press 0 if you don't want to add more songs.");
                        }
                    } while (opplay != 0);
                    System.out.println("********Your Playlist********");
                    System.out.println("|      Title     | |  Gender | Duration | Date  |       Cover       |                            Description                            |");
                    for (Song sg : PlayL) {
                        System.out.println(sg.toString());
                    }
                    break;
                case 2:

                    /* program functionality where objects found in a specific array are filtered and sectioned by a specific attribute of those objects. */
                    System.out.println("===================================");
                    System.out.println("");
                    System.out.println("Please enter the number of the genre you want to filter");
                    System.out.println("");
                    System.out.println("    1. Gender.");
                    System.out.println("    2. Date.");
                    int op2 = num.nextInt();
                    if (op2 == 1) {

                        System.out.println("Please enter the number of the genre you want to filter");
                        System.out.println("");
                        System.out.println("1.Rock.");
                        System.out.println("2.Pop.");
                        System.out.println("");
                        op2 = num.nextInt();

                        /* The filter method is used to obtain specific objects found in an array. */
                        if (op2 == 1) {
                            meth.FilterSongG("Rock", ListM);
                        } else if (op2 == 2) {
                            meth.FilterSongG("Pop", ListM);
                        }

                    } else if (op2 == 2) {
                        System.out.println("Please enter the year you want to filter");
                        dat = anio.nextLine();
                        meth.FilterSongD(dat, ListM);
                    }
                    break;
                case 3:

                    /* Program functionality to sort objects that are stored in an array by a specific attribute of those objects. */
                    System.out.println("===================================");
                    System.out.println("");
                    System.out.println("Please enter the way you want to sort the List");
                    System.out.println("");
                    System.out.println("    1. Date.");
                    System.out.println("    2. Duration.");
                    int op3 = num.nextInt();
                    if (op3 == 1) {
                        Collections.sort(ListM, (x, y) -> x.getDate().compareToIgnoreCase(y.getDate()));
                        for (Song s : ListM) {
                            System.out.println(s.toString());
                        }
                        break;
                    } else if (op3 == 2) {
                        Collections.sort(ListM, (Song x, Song y) -> x.getDuration().compareToIgnoreCase(y.getDuration()));
                        for (Song s : ListM) {
                            System.out.println(s.toString());
                        }
                    }
                    break;
                case 4:
                    System.out.println("Please enter one of the following options");
                    System.out.println("1. delete all songs from the Playlist");
                    System.out.println("2. delete a specific song from the Playlist");
                    int op4 = num.nextInt();
                    if (op4 == 1) {
                        meth.ModifyPlayList(op4, PlayL, op4);
                    } else {
                        System.out.println("********Your Playlist********");
                        System.out.println("|      Title     | |  Gender | Duration | Date  |       Cover       |                            Description                            |");
                        for (Song sg : PlayL) {
                            System.out.println(sg.toString());
                        }
                        System.out.println("Enter song number to delete");
                        int op5 = num.nextInt();
                        meth.ModifyPlayList(op4, PlayL, op5);
                        break;
                    }

                    break;
                case 5:
                    System.out.println("********Your Playlist********");
                    System.out.println("|      Title     | |  Gender | Duration | Date  |       Cover       |                            Description                            |");
                    PlayL.forEach((sg) -> {
                        System.out.println(sg.toString());
                    });
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Invalid option.");
            }
        } while (op != 0); // System options cycle.
    }
}
