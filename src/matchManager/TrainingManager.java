package matchManager;

import database.dao.AttributDAO;
import entite.Attribut;

public class TrainingManager {

	public void trainingChoice(){
		
		String trainingChoice = "";
		
		switch (trainingChoice) {
		case "musculation":
			musculation();
			
			break;
		case "passeDix":
			passeDix();
			
			break;
		case "yoga":
			yoga();
			
			break;
		case "footing":
			footing();
			
			break;
		case "kine":
			kine();
			
			break;
		
		default:
			break;
		}
	}
	/*
	public void musculation(){
		puissance += 3;
		Attribut a1 = new Attribut();
		a1.setName("courage");
		a1.setValue(3);
		fatigue += 5;
		AttributDAO attDAO = new AttributDAO();

		
	}
	
	public void passeDix(){
		technique += 5;
		communication += 2;
		agilite += 3;
		fatigue +=3;
	}
	
	public void yoga(){
		sang_froid += 5;
		concentration += 3;
		fatigue -= 2;
	}
	
	public void footing(){
		endurance += 5;
		fatigue += 5;
	}
	
	public void kine(){
		acceleration += 5;
		fatigue -=2;
	}*/
}

