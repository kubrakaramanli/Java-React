package hw2;

import oopIntro2g�n.ProductManager;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Universities universities1= new Universities();
		universities1.id=1;
		universities1.name="�stanbul Bilgi �niversitesi";
		universities1.country="T�RK�YE";
		universities1.city="�stanbul";
		universities1.address="Eski Silahtara�a Elektrik Santral� Kaz�m Karabekir Cad."
				+ " No: 2/13 34060 Ey�psultan";
		
		
		Universities universities2 = new Universities();
		universities2.id=2;
		universities2.name="Harvard �niversitesi";
		universities2.country="Amerika Birle�ik Devletleri";
		universities2.city="Boston";
		universities2.address="Cambridge, MA, Amerika Birle�ik Devletleri";
		
		
		Universities universities3 = new Universities();
		universities3.id=3;
		universities3.name="Akdeniz �niversitesi";
		universities3.country="T�RK�YE";
		universities3.city="Antalya";
		universities3.address="P�narba��, Akdeniz �nv., 07070 Konyaalt�";
		
		Universities universities4 = new Universities();
		universities4.id=4;
		universities4.name="Yak�n Do�u �niversitesi";
		universities4.country="KKTC";
		universities4.city="Lefko�a";
		universities4.address="Yak�n Do�u �niversitesi / Yak�n Do�u Bulvar�";
		

		Universities[] universities= { universities1,universities2,
				universities3,universities4
				
		};
		
		System.out.println(universities.length);
		
		Country country1 = new Country();
		country1.id=1;
		country1.name="Yurti�i";
		
		Country country2 = new Country();
		country2.id=2;
		country2.name="Yurtd���";
		
		
		UniversitiesManager universitiesManager = new UniversitiesManager();
		UniversitiesManager.addToUniversities(universities1);
		UniversitiesManager.addToUniversities(universities2);
		UniversitiesManager.addToUniversities(universities3);
		UniversitiesManager.addToUniversities(universities4);
		
		
		
		
}
}
