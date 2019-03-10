package patterns.observer;

public class Channel implements MyObserver{

	private String news;
	private String name;
	
	public Channel(String name) {
		this.name = name;
	}
	
	@Override
	public void update(Object news) {
		this.news = (String) news;
		System.out.println(name + ": " + news);
	}
}
