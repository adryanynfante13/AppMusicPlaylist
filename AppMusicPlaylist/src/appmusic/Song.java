/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appmusic;

/**
 *
 * @author adrya
 */
public class Song implements Comparable<Song> {

    private int id;
    private String title;
    private String description;
    private String duration;
    private String gender;
    private String cover;
    private String date;

    public Song(int id, String title, String description, String duration, String gender, String cover, String date) {
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
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
        return this.id + "." + this.title + " --- " + this.gender + " --- " + this.duration + " --- " + this.date + " --- " + this.cover + " --- " + this.description;
    }

    @Override
    public int compareTo(Song o1) {
        return this.date.compareToIgnoreCase(o1.date);
    }
    
    public int compareToDuration(Song o1) {
        
        return this.duration.compareToIgnoreCase(o1.duration);
    }
    


}
