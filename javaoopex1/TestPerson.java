package fr.fms.javaoopex1;

import java.util.ArrayList;

public class TestPerson {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		ArrayList<Person> listOfPeople = new ArrayList<>();
		//--------------person--------------
		//Person manu = new Person("Macron","Emmanuel",43,"Elisée à Paris", new City("Amiens","France"));
		//Person putin = new Person("Putin","Vladimir",68);
		//Person biden = new Person("Biden", "Joe");
		
		listOfPeople.add(new Person("Macron", "Emmanuel", 43, "l'Elisée à Paris", new City("Amiens","France")));
		
		listOfPeople.add(new Person("Sarkozy", "Nicolas", 66, "Paris", new City("Paris","France",2000000)));
		
		listOfPeople.add(new Person("Johnson", "Boris", 56, "Downing street London", new City("New York","Etats-Unis")));
		
		listOfPeople.add(new Person("Depardieu", "Gerard", 72, "", new City("Châteauroux","France")));
		
		listOfPeople.add(new Person("Kravitz", "lenny", 56, "Hotel particulier à Paris", new City("New York","USA")));
		
		listOfPeople.add(new Person("Laurence", "Jeniffer", 30, "Louisville aux USA", new City("Indian Hills","USA")));
		
		
		//filter persons that where born in france or living in paris
		ArrayList<Person> filteredPersons = new ArrayList<>();
		for(Person p : listOfPeople) {
			if(p.getAdresse().toLowerCase().contains("paris") || p.getBornCity().getCountryName().toLowerCase().equals("france")) {
				filteredPersons.add(p);
			}
		}
		System.out.println();
		for(Person p : filteredPersons) {
			System.out.println(p);
		}
	}

}
