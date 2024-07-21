package com.yt.project_reactor_examples;

import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

public class User implements Subscriber<Video> {

    private String name;

    public User(String name) {
        this.name = name;
    }

    @Override
    public void onSubscribe(Subscription subscription) {
        System.out.println("onSubscribe("+name+")");
        subscription.request(Long.MAX_VALUE);
    }

    @Override
    public void onNext(Video o) {
        System.out.println("onNext("+o+")");
    }

    @Override
    public void onError(Throwable throwable) {
        System.out.println("onError("+throwable+")");
    }

    @Override
    public void onComplete() {
        System.out.println("onComplete");
    }
}
