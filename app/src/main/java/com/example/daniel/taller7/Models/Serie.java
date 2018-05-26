package com.example.daniel.taller7.Models;

public class Serie {
    public String title, image, seasons,tags;

    public Serie() {
    }

    public Serie(String title, String image) {
        this.title = title;
        this.image = image;
    }

    public Serie(String title, String image, String seasons, String tags) {
        this.title = title;
        this.image = image;
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
        return image;
    }

    public void setImage(String image) {
        this.image = image;
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
