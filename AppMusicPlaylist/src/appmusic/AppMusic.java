/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appmusic;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author adrya
 */
public class AppMusic {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Song> ListM = new ArrayList<>();
        ArrayList<Song> PlayL = new ArrayList<>();
        Scanner num = new Scanner(System.in);
        Song sg1 = new Song(1, "Bohemian Rhapsody", " Is a song and single by the British rock band Queen.", 5.55, "Rock   ","─═☆☆═─", "   1975   ");
        ListM.add(sg1);
        Song sg2 = new Song(2, "Candle in The Wind", " Is a song with music by Elton John and lyrics by Bernie Taupin." , 3.57," Pop   ","((̲̅̅●̲̲̅̅̅̅=̲̲̅̅̅̅●̲̅̅))", "   1997   ");
        ListM.add(sg2);
        Song sg3 = new Song(3, "Games             ", " It's a heartbreak song ",3.01," Pop   ","¯(°_o)/¯","   2017   ");
        ListM.add(sg3);
        Song sg4 = new Song(4, "All Dead, All Dead", " Is a Queen song written by Brian May",3.04 ,"Rock   ", "√v^√v^√♥", "   1977   ");
        ListM.add(sg4);
        Song sg5 = new Song(5, "Coming Soon       ","Is a song written by drummer of the English rock band Queen" ,3.02,"Rock   ","(̲̅:̲̅:̲̅:̲̅[̲̅ ̲̅]̲̅:̲̅:̲̅:̲̅ )", "   1980   ");
        ListM.add(sg5);

        System.out.println("*******Our Songs*******");
        System.out.println("| ---Title--- | |---Gender---|---Duration---| ---Date--- | ---Cover--- | ---Description--- |");
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
            if(!PlayL.isEmpty())
            System.out.println("Presiona 0 si ya no quieres agregar mas canciones, o escribe el numero de la cancion que quieres.");
        } while (opplay != 0);
        System.out.println("********Tu Playlist********");
        for (Song sg : PlayL) {
            System.out.println(sg.toString());
        }
    }
}
