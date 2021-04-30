package hw2;

import oopIntro2gün.ProductManager;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Universities universities1= new Universities();
		universities1.id=1;
		universities1.name="Ýstanbul Bilgi Üniversitesi";
		universities1.country="TÜRKÝYE";
		universities1.city="Ýstanbul";
		universities1.address="Eski Silahtaraða Elektrik Santralý Kazým Karabekir Cad."
				+ " No: 2/13 34060 Eyüpsultan";
		
		
		Universities universities2 = new Universities();
		universities2.id=2;
		universities2.name="Harvard Üniversitesi";
		universities2.country="Amerika Birleþik Devletleri";
		universities2.city="Boston";
		universities2.address="Cambridge, MA, Amerika Birleþik Devletleri";
		
		
		Universities universities3 = new Universities();
		universities3.id=3;
		universities3.name="Akdeniz Üniversitesi";
		universities3.country="TÜRKÝYE";
		universities3.city="Antalya";
		universities3.address="Pýnarbaþý, Akdeniz Ünv., 07070 Konyaaltý";
		
		Universities universities4 = new Universities();
		universities4.id=4;
		universities4.name="Yakýn Doðu Üniversitesi";
		universities4.country="KKTC";
		universities4.city="Lefkoþa";
		universities4.address="Yakýn Doðu Üniversitesi / Yakýn Doðu Bulvarý";
		

		Universities[] universities= { universities1,universities2,
				universities3,universities4
				
		};
		
		System.out.println(universities.length);
		
		Country country1 = new Country();
		country1.id=1;
		country1.name="Yurtiçi";
		
		Country country2 = new Country();
		country2.id=2;
		country2.name="Yurtdýþý";
		
		
		UniversitiesManager universitiesManager = new UniversitiesManager();
		UniversitiesManager.addToUniversities(universities1);
		UniversitiesManager.addToUniversities(universities2);
		UniversitiesManager.addToUniversities(universities3);
		UniversitiesManager.addToUniversities(universities4);
		
		
		
		
}
}
