package patterns.observer;

import java.util.ArrayList;
import java.util.List;

public class NewsAgency {

	private String news;
	private List<MyObserver> observers = new ArrayList<MyObserver>();
	
	public void addObserver(MyObserver observer) {
		observers.add(observer);
	}
	
	public void removerObsever(MyObserver observer) {
		observers.remove(observer);
	}
	
	public String getNews() {
		return news;
	}
	
	public void setNews(String news) {
		this.news = news;
		notifyObservers();
	}
	
	private void notifyObservers() {
		for (MyObserver observer : observers)
			observer.update(news);
	}
}
