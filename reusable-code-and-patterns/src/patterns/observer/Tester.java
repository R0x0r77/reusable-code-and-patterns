package patterns.observer;

public class Tester {

	public static void main(String[] args) {

		Channel tv1 = new Channel("tv1");
		Channel polsat = new Channel("polsat");
		Channel hbo = new Channel("hbo");
		
		NewsAgency newsAgency = new NewsAgency();
		
		newsAgency.addObserver(tv1);
		newsAgency.addObserver(polsat);
		newsAgency.addObserver(hbo);
		
		newsAgency.setNews("Nowe wiadomoœci z kraju Z³otej Ma³py");
		newsAgency.removerObsever(polsat);
		newsAgency.setNews("hehe");
	}

}
