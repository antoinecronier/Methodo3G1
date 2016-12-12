package entite;

public class Attributs {
	private Integer attributs_id;
	private String name;
	private Integer value;
	
	public Attributs(Integer attributs_id, String name, Integer value){
		this.attributs_id = attributs_id;
		this.name = name;
		this.value = value;
	
	}

	public Integer getAttributs_id() {
		return attributs_id;
	}

	public void setAttributs_id(Integer attributs_id) {
		this.attributs_id = attributs_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getValue() {
		return value;
	}

	public void setValue(Integer value) {
		this.value = value;
	}
}
