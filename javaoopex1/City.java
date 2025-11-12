package fr.fms.javaoopex1;

public class City {
	/*
	public String nVille;
	public String nPays;
	public int habitants;
	*/
	private String nVille;
	private String nPays;
	private int habitants;
	
	
	public City(String nVille, String nPays, int habitants) throws Exception {
		if(habitants < 0) {
			throw new Exception("La ville "+ nVille +" ne peut contenir moins de 0 habitants");
		}
		this.nVille = nVille;
		this.nPays = nPays;
		this.habitants = habitants;
	}
	
	public City(String nVille, int habitants) throws Exception{
		if(habitants < 0) {
			throw new Exception("La ville "+ nVille +" ne peut contenir moins de 0 habitants");
		}	
		this.nVille = nVille;
		this.nPays = "unknown";
		this.habitants = habitants;
	}
	

	public String getnVille() {
		return nVille;
	}

	public void setnVille(String nVille) {
		this.nVille = nVille;
	}


	public String getnPays() {
		return nPays;
	}

	public void setnPays(String nPays) {
		this.nPays = nPays;
	}


	public int getHabitants() {
		return habitants;
	}

	public void setHabitants(int habitants) throws Exception {
		if(habitants < 0) {
			throw new Exception("La ville"+ this.nVille +"ne peut contenir moins de 0 habitants");
		}
		this.habitants = habitants;
	}
	
	public void addHabitants(int habitantsToAdd) throws Exception {
		this.setHabitants(this.getHabitants() + habitantsToAdd);
	}


	public void display() {
		System.out.println(this.toString());
	}
	
	
	@Override
	public String toString() {
		return "Ville de "+this.nVille+" en/au "+this.nPays+" ayant "+this.habitants+" habitants";
	}
	
	
	
	
}
