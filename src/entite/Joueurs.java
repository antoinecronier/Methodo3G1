package entite;

public class Joueurs {
	
	private Integer joueurs_id;
	private String lastname;
	private String firstname;
	private String surname;
	private Integer price;

	public Joueurs(Integer joueurs_id, String lastname, String firstname, String surname, Integer price){
		this.joueurs_id = joueurs_id;
		this.lastname = lastname;
		this.firstname = firstname;
		this.surname = surname;
		this.price = price;
	}

	public Integer getJoueurs_id() {
		return joueurs_id;
	}

	public void setJoueurs_id(Integer joueurs_id) {
		this.joueurs_id = joueurs_id;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}
	
}