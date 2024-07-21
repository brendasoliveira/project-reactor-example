package com.yt.project_reactor_examples;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SubscriberTeste {

	public static void main(String[] args) {
		YoutubeChannel publisher = new YoutubeChannel();
		publisher.addVideo(new Video("Reactive Programing with Java",
				"This video talk about reactive programing...",200, 10000));
		publisher.addVideo(new Video("Java vs Kotlin",
				"This video compare the difference about Java and Kotlin...",50, 20000));

//		User subscriber = new User("Brenda");
//        publisher.getAllVideos().subscribeWith(subscriber);

//		publisher.getAllVideos().log().subscribe();

//		publisher.getAllVideos().log().subscribe(video -> {
//			System.out.println(video.getName());
//		});

		publisher.getAllVideos().log().subscribe(
				video -> System.out.println(video.getName()),
				throwable -> System.out.println(throwable),
				() -> System.out.println("Dados consumidos com sucesso")
		);
	}

}
