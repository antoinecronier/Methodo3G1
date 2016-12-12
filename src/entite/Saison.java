package entite;

public class Saison {
	private Integer saison_id;
	private String name;
	
	public Saison(Integer saison_id, String name){
		this.saison_id = saison_id;
		this.name = name;
		
	}

	public Integer getSaison_id() {
		return saison_id;
	}

	public void setSaison_id(Integer saison_id) {
		this.saison_id = saison_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
