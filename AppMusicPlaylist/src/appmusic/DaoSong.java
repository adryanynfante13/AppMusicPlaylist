/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appmusic;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author adryan creacion de filtros
 */
public class DaoSong {

    private String gender;
    private int date = 0;

    public void FilterSongG(String gender, ArrayList<Song> ListM) {

        ListM.stream().filter(s -> s.getGender() == gender).forEach(System.out::println);

    }

    public void FilterSongD(String date, ArrayList<Song> ListM) {

        ListM.stream().filter(s -> s.getDate().equals(date)).forEach(System.out::println);

    }

    public void OrderbyDate(ArrayList<Song> ListM) {
        Collections.sort(ListM, (x, y) -> x.getDate().compareToIgnoreCase(y.getDate()));
    }

    public void OrderbyDuration(ArrayList<Song> ListM) {
        Collections.sort(ListM, (x, y) -> x.getDuration().compareToIgnoreCase(y.getDuration()));
    }

}
