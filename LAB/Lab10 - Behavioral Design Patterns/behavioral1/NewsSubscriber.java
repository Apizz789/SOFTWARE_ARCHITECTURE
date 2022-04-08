package behavioral1;

import java.util.concurrent.Flow.Subscriber;
import java.util.concurrent.Flow.Subscription;

public class NewsSubscriber implements Subscriber<News> {
	private String name;
	
	public NewsSubscriber(String name) {
        this.name = name;
    }

	@Override
	public void onSubscribe(Subscription subscription) {
	}

	@Override
	public void onNext(News item) {
		System.out.println(name+" get Content : "+item.getContent());
	}

	@Override
	public void onError(Throwable throwable) {
		System.out.println("Error");
	}

	@Override
	public void onComplete() {
		System.out.println("Complete");
		
	}
	

	
}