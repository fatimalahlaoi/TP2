
/**
 * @author LAHLAOI 
 *
 */
public class Etudiant extends  personne{

	
	
	
	private Integer  nummerEtudiant;
	
	
	public Integer getNummerEtudiant() {
		return nummerEtudiant;
	}
	public void setNummerEtudiant(Integer nummerEtudiant) {
		this.nummerEtudiant = nummerEtudiant;
	}
	
	
	public Etudiant(String nom, Integer nummeretudiant, String email) {
		super(nom,email);
		
		this.nummerEtudiant = nummeretudiant;
	
	}
	public Etudiant() {
		super();
		
	}
	
	
	public String toString() {
		return "Etudiant [nom=" + nom + ", nummerEtudiant=" + nummerEtudiant + ", email=" + email + "]";
	}
	
	public void afficher()
	{
		System.out.println(toString());
	}
	
	

}

