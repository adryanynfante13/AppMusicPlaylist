package appmusic;

import java.util.ArrayList;
import java.util.Collections;

/**
 * In this class we will observe the creation of different methods to filter
 * objects of type song with respect to specific parameters of this object,
 * specifically by genre and date.
 *
 * @version 1.01.1 2022-02-12
 *
 * @author Adryan Ynfante Valero - adryanynfante@gmail.com
 *
 * @since Available from version 1
 *
 */
public class DaoSong {

    /* Variable declaration.*/
    private String gender;
    private int date = 0;

    /**
     * Method to filter the objects type song by a specific attribute of these
     * objects which corresponds to the genre, the filter method is used.
     *
     * @param gender Data type string that refers to the gender by which you
     * want to filter.
     * @param ListM Data type ArrayList that refers to the list to which you
     * want to apply the filter..
     *
     * @author Diego Fernando Becerra Zambrano - diegofer1110@gmail.com
     *
     * @since It is present since version 1
     */
    public void FilterSongG(String gender, ArrayList<Song> ListM) {

        ListM.stream().filter(s -> s.getGender() == gender).forEach(System.out::println);

    }

    /**
     * Method to filter the song type objects by a specific attribute of these
     * objects corresponding to the date, using the filter method.
     *
     * @param date Data type string that refers to the date by which you want to
     * filter.
     * @param ListM Data type ArrayList that refers to the list to which you
     * want to apply the filter..
     *
     * @author Diego Fernando Becerra Zambrano - diegofer1110@gmail.com
     *
     * @since It is present since version 1
     */
    public void FilterSongD(String date, ArrayList<Song> ListM) {

        ListM.stream().filter(s -> s.getDate().equals(date)).forEach(System.out::println);

    }

    /**
     * Method to sort a song type arrayList according to its release date.
     *
     * @param ListM Data type ArrayList which you want to sort according to the
     * parameters.
     *
     * @author Diego Fernando Becerra Zambrano - diegofer1110@gmail.com
     *
     * @since It is present since version 1
     */
    public void OrderbyDate(ArrayList<Song> ListM) {
        Collections.sort(ListM, (x, y) -> x.getDate().compareToIgnoreCase(y.getDate()));
    }

    /**
     * Method to sort an arrayList of type song according to its duration.
     *
     * @param ListM Data type ArrayList which you want to sort according to the
     * parameters.
     *
     * @author Diego Fernando Becerra Zambrano - diegofer1110@gmail.com
     *
     * @since It is present since version 1
     */
    public void OrderbyDuration(ArrayList<Song> ListM) {
        Collections.sort(ListM, (x, y) -> x.getDuration().compareToIgnoreCase(y.getDuration()));
    }

    /**
     * Method that removes objects from an array either as a whole or for a
     * specific object in the list.
     *
     * @param op1 Data type option to know whether the user will delete all
     * songs or a specific one
     * @param ListM Data ArrayList element of which you want to make the
     * functions
     * @param song Data type integer position of the object to be deleted
     *
     * @author Miller Esteban Gallego Forero - miller.gallegof@gmail.com
     *
     * @since It is present since version 1
     */
    public void ModifyPlayList(int op1, ArrayList<Song> ListM, int song) {

        switch (op1) {
            case 1:
                ListM.clear();
                System.out.println("Songs from the Playlist were removed");
                break;
            case 2:
                ListM.remove(song - 1);
                System.out.println("The song was removed");
                break;
            default:
                System.out.println("Select a correct option");
                break;
        }
    }

}
