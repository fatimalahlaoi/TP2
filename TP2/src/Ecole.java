
public class Ecole  {
public static void main(String[] args) {
		
	doctorant d=new doctorant("lahlaoi", 1412354643, "fatima.lahlaoi@gmail.com");
		System.out.println("le salaire du doctorant " +d.nom + " est " +d.calculeSalaire(32)+"DRH");
		
		System.out.println("le nombre de jours de son vacances est " +d.calculeVacances(20)+"jours");
	}

}
