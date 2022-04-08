package behavioral1;

import java.util.concurrent.Flow.Publisher;
import java.util.concurrent.Flow.Subscriber;
import java.util.ArrayList;

public class NewsPublisher implements Publisher<News> {
	private ArrayList<Subscriber> subscribers = new ArrayList<Subscriber>();
	@Override
	public void subscribe(Subscriber<? super News> subscriber) {
		subscribers.add(subscriber);
	}
	public void unsubscribe(Subscriber<? super News> subscriber) {
		subscribers.remove(subscriber);
	}
	public void publish(News news) {
        for (Subscriber<? super News> subscriber : subscribers) {
            subscriber.onNext(news);
        }
    }
}