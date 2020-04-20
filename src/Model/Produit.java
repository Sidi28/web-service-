package Model;

public class Produit {
    private int id;
	private  double prix, quantite;
	private  String statut, designation;
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getStatut() {
		return statut;
	}
	public void setStatut(String statut) {
		this.statut = statut;
	}
	public double getPrix() {
		return prix;
	}
	public void setPrix(double prix) {
		this.prix = prix;
	}
	public double getQuantite() {
		return quantite;
	}
	public void setQuantite(double quantite) {
		this.quantite = quantite;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	@Override
	public String toString() {
		return "Produit [id=" + id + ", prix=" + prix + ", quantite=" + quantite + ", statut=" + statut
				+ ", designation=" + designation + "]";
	}
	  
	
	
}
