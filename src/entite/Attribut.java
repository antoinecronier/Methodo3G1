package entite;

public class Attribut {
	private Integer id_attribut;
	private String name_attribut;
	private Integer value;

	public Attribut(Integer id_attribut, String name_attribut, Integer value){
		this.id_attribut = id_attribut;
		this.name_attribut = name_attribut;
		this.value = value;
		
	
	}
	
	public Attribut(){
		
	}
	
	public Integer getId_attribut() {
		return id_attribut;
	}

	public void setId_attribut(Integer id_attribut) {
		this.id_attribut = id_attribut;
	}

	public String getName_attribut() {
		return name_attribut;
	}

	public void setName_attribut(String name_attribut) {
		this.name_attribut = name_attribut;
	}

	public Integer getValue() {
		return value;
	}

	public void setValue(Integer value) {
		this.value = value;
	}
	
	

}