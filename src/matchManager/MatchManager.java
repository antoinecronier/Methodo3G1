package matchManager;

import entite.Club;

public class MatchManager {
		
	public int calculPoints(Club club1, Club club2){
		
		/*int resultat = jouerMatch(club1, club2);
		if(resultat == 1){
			club1.setTotalPoints(3);
		}else if(resultat == 2){
			club2.setTotalPoints(3);
		}else if(resultat == 0){
			club1.setTotalPoints(1);
			club2.setTotalPoints(1);
		}
		
		return resultat;*/
		return 0;
		
	}
	public int jouerMatch(Club club1, Club club2){
		
		int resultat = 3;
		int but1 = nbButs();
		int but2 = nbButs();
		if(but1 > but2){
			resultat = 1;
		}else if(but1 < but2){
			resultat = 2;
		}else if(but1 == but2){
			resultat = 0;
		}
		
		return resultat;
		
		
	}
	
	public int nbButs(){
		int nbButs = (int) (0 + (Math.random()*(10-0)));
		return nbButs;
		
	}
	
	
}
