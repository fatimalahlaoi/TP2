
public class professeur extends personne  {

	private String nom;
	private Integer  nummerSomme;
	private String email;
	private String grade;
	
	public professeur(String nom, Integer nummerSomme, String email, String grade) {
		super(nom,email);
		
		this.nummerSomme = nummerSomme;
		
		this.grade = grade;
	}
	
	public professeur() {
		super();
		
	}
	
	
	public Integer getNummerSomme() {
		return nummerSomme;
	}
	public void setNummerSomme(Integer nummerSomme) {
		this.nummerSomme = nummerSomme;
	}
	
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	
	
	public String toString() {
		return "Professeur [nom=" + nom + ", nummerSomme=" + nummerSomme + ", email=" + email + ", grade=" + grade
				+ "]";
	}
	public void afficher()
	{
		System.out.println(toString());
	}
	
	
public static void main(String[] args) {
	
	professeur prof=new professeur("hafidi Imade",1,"imad.hafidi@gmail.com","chef de departement");
	prof.afficher();
}
}

