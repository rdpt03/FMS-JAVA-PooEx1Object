package fr.fms.javaoopex1;

public class TestCity {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		//create cities
		City toulouse = new City ("Toulouse","France",450000);
		City paris     = new City("Paris", "France", 2161000);
		City lyon      = new City("Lyon", "France", 515695);
		City marseille = new City("Marseille", "France", 861635);
		City londres   = new City("London", "United Kingdom", 8982000);
		City manchester= new City("Manchester", "United Kingdom", 553230);
		City berlin    = new City("Berlin", "Germany", 3769000);
		City munich    = new City("Munich", "Germany", 1472000);
		City rome      = new City("Rome", "Italy", 2873000);
		City milan     = new City("Milan", "Italy", 1352000);
		City lisbon    = new City("Lisbon", "Portugal", 504718);
		City porto     = new City("Porto", "Portugal", 237591);
		City madrid    = new City("Madrid", "Spain", 3266000);
		City barcelona = new City("Barcelona", "Spain", 1620000);
		City amsterdam = new City("Amsterdam", "Netherlands", 872680);
		City bruxelas  = new City("Brussels", "Belgium", 185103);
		City vancouver = new City("Vancouver", "Canada", 675218);
		City toronto   = new City("Toronto", "Canada", 2731571);
		City sydney    = new City("Sydney", "Australia", 5312163);
		City melbourne = new City("Melbourne", "Australia", 5078193);
		City tokyo     = new City("Tokyo", "Japan", 13929286);
		City osaka     = new City("Osaka", "Japan", 2691000);
		City seoul     = new City("Seoul", "South Korea", 9733509);
		City newYork   = new City("New York", "USA", 8419600);
		City losAngeles= new City("Los Angeles", "USA", 3980400);
		City chicago   = new City("Chicago", "USA", 2716000);
		City rio       = new City("Rio de Janeiro", "Brazil", 6748000);
		City saoPaulo  = new City("São Paulo", "Brazil", 12330000);
		City buenosAires = new City("Buenos Aires", "Argentina", 2890000);
		City capeTown  = new City("Cape Town", "South Africa", 433688);
		City johannesburg = new City("Johannesburg", "South Africa", 957441);
		City rabat = new City("Rabat",577000);
		//print
		System.out.println(paris);
		System.out.println(lyon);
		System.out.println(marseille);
		System.out.println(londres);
		System.out.println(manchester);
		System.out.println(berlin);
		System.out.println(munich);
		System.out.println(rome);
		System.out.println(milan);
		System.out.println(lisbon);
		System.out.println(porto);
		System.out.println(madrid);
		System.out.println(barcelona);
		System.out.println(amsterdam);
		System.out.println(bruxelas);
		System.out.println(vancouver);
		System.out.println(toronto);
		System.out.println(sydney);
		System.out.println(melbourne);
		System.out.println(tokyo);
		System.out.println(osaka);
		System.out.println(seoul);
		System.out.println(newYork);
		System.out.println(losAngeles);
		System.out.println(chicago);
		System.out.println(rio);
		System.out.println(saoPaulo);
		System.out.println(buenosAires);
		System.out.println(capeTown);
		System.out.println(johannesburg);
		
		//----toulouse----
		System.out.println(toulouse);
		//add to toulouse
		//toulouse.habitants += 20000;
		toulouse.addHabitants(20000);
		System.out.println(toulouse);	
		
		//remove from toulouse
		toulouse.addHabitants(-100000);
		System.out.println(toulouse);

		//----rabat---- ex : 1.3
		System.out.println(rabat);
		rabat.setnPays("Maroc");
		System.out.println(rabat);
		
		//1.7 print cities count
		System.out.println(City.getCitiesQuantity());
		
		
		
		//1.5 le code affiche le nom de la classe suivi de son code exadecimal, possiblement sa valeur en RAM);
	}

}
