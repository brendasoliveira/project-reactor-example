package com.yt.project_reactor_examples;

import reactor.core.publisher.Flux;

import java.util.ArrayList;
import java.util.List;

public class YoutubeChannel {

    private List<Video> videos;

    public YoutubeChannel(List<Video> videos) {
        this.videos = videos;
    }

    public YoutubeChannel() {
        this.videos = new ArrayList<>();
    }

    public void addVideo(Video video) {
        videos.add(video);
    }

    public Flux<Video> getAllVideos() {
        return Flux.fromIterable(videos);
    }
}
