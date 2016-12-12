package entite;

public class Entraineur {
	
	private Integer entraineur_id;
	private String firstname;
	private String lastname;
	
	public Entraineur(Integer entraineur_id, String firstname, String lastname) {
		this.entraineur_id = entraineur_id;
		this.firstname = firstname;
		this.lastname = lastname;
	}
	
	public Integer getEntraineur_id() {
		return entraineur_id;
	}

	public void setEntraineur_id(Integer entraineur_id) {
		this.entraineur_id = entraineur_id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	
}