package entite;

public class Selection {
	private Integer id_selection;
	private Integer id_match;
	private Integer id_club;
		
	public Selection(Integer id_selection, Integer id_match, Integer id_club) {
		this.id_selection = id_selection;
		this.id_match = id_match;
		this.id_club = id_club;
	}
	
	public Selection() {
		
	}

	public Integer getId_selection() {
		return id_selection;
	}

	public void setId_selection(Integer id_selection) {
		this.id_selection = id_selection;
	}

	public Integer getId_match() {
		return id_match;
	}

	public void setId_match(Integer id_match) {
		this.id_match = id_match;
	}

	public Integer getId_club() {
		return id_club;
	}

	public void setId_club(Integer id_club) {
		this.id_club = id_club;
	}
	
}
