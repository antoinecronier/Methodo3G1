package matchManager;

import entite.Club;

public class MatchManager {

    public static void main(String[] args) {


    }

    private String nomMatch;

  
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
    
    public int nbPoints(Club club){
    	int points = 0;
    	
    	if(jouerMatch()==1){
    		points=3;
    	}
    	
    	else if(jouerMatch()==2){
    		points=0;
    	}
    	else if(jouerMatch()==0){
    		points=1;
    	}
    	return points;
    }
    
}
