package appmusic;

/**
* The functionality of this class is to create an object which will be used as a template to store different types of songs, 
*   as well as to obtain or modify the information of these objects.
*
* @version 1.01.1 2022-02-12 
*           
* @author Adryan Ynfante Valero - adryanynfante@gmail.com
*
* @since Available from version 1
* 
*/

public class Song implements Comparable<Song> {
   
    /* Variable declaration.*/
     
    private String id;
    private String title;
    private String description;
    private String duration;
    private String gender;
    private String cover;
    private String date;

    public Song(String id, String title, String description, String duration, String gender, String cover, String date) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.duration = duration;
        this.gender = gender;
        this.cover = cover;
        this.duration = duration;
        this.date = date;
    }

    public Song() {

    }
    
    /*All the functions to obtain and set values for the variables of the Songs class are performed.*/
     
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    
    @Override
    public String toString() {
        return this.id + "." + this.title + " --- " + this.gender + " --- "
            + this.duration + " --- " + this.date + " --- " + this.cover + 
            " --- " + this.description;
    }

    /**
    * Method with which string comparison is performed in order to generate a sorting by date.
    *
    * @param o1 object of type Song 
    * @return Boolean value
    *
    * @author Diego Fernando Becerra Zambrano - diegofer1110@gmail.com 
    *
    * @since It is present since version 1
    */
    
    @Override
    public int compareTo(Song o1) {
        return this.date.compareToIgnoreCase(o1.date);
    }
    
    /**
    * Method with which string comparison is performed to generate a sorting by duration.
    *
    * @param o1 object of type Song 
    * @return Boolean value
    *
    * @author Diego Fernando Becerra Zambrano - diegofer1110@gmail.com 
    *
    * @since It is present since version 1
    */
    public int compareToDuration(Song o1) {
        return this.duration.compareToIgnoreCase(o1.duration);
    }

}
