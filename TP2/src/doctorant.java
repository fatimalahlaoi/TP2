
public class doctorant  extends Etudiant implements salarie{
	professeur encadrant;
	String SujetThese;
	public professeur getEncadrant() {
		return encadrant;
	}
	public void setEncadrant(professeur encadrant) {
		this.encadrant = encadrant;
	}
	public String getSujetThese() {
		return SujetThese;
	}
	public void setSujetThese(String sujetThese) {
		SujetThese = sujetThese;
	}
	
	public doctorant(String nom, Integer nummeretudiant, String email) {
		super(nom, nummeretudiant, email);
	}
	public int calculeVacances(int NbrJours) {
		
	     int n;
		n=NbrJours/10;
		return n;
	}
	public double calculeSalaire(int NbrHeurs){
		int s;
		double salaire;
	if(NbrHeurs<=32) {
		s=400*NbrHeurs;
		salaire=s-(s*0.34)+5000;
		return salaire;
	}
	else
	{s=600*NbrHeurs;
	salaire=s-(s*0.17)+5000;
	return salaire;
	}
	}
	
	}
