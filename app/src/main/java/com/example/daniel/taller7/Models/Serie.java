package com.example.daniel.taller7.Models;

public class Serie {
    public String title, Image, seasons,tags;

    public Serie() {
    }

    public Serie(String title, String image, String seasons, String tags) {
        this.title = title;
        Image = image;
        this.seasons = seasons;
        this.tags = tags;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImage() {
        return Image;
    }

    public void setImage(String image) {
        Image = image;
    }

    public String getSeasons() {
        return seasons;
    }

    public void setSeasons(String seasons) {
        this.seasons = seasons;
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }
}
