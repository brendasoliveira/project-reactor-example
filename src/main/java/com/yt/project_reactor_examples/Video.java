package com.yt.project_reactor_examples;

public class Video {

    private String name;
    private String description;
    private String likes;
    private String views;

    public Video(String name, String description, String likes, String views) {
        this.name = name;
        this.description = description;
        this.likes = likes;
        this.views = views;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getViews() {
        return views;
    }

    public void setViews(String views) {
        this.views = views;
    }

    public String getLikes() {
        return likes;
    }

    public void setLikes(String likes) {
        this.likes = likes;
    }
}
