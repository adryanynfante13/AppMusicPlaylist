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

public class Song {
    private int id;
    private String title;
    private String description; 
    private double duration;
    private String gender;
    private String cover;
    private String date;
   
    
    public Song(int id, String title, String description, double duration, String gender, String cover, String date) {
        this.title = title;
        this.description = description;
        this.duration = duration;
        this.gender = gender;
        this.cover = cover;
        this.duration = duration;
        this.date = date;
    }
    public Song(){

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

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
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

    
}
