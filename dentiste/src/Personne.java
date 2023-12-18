package vivant;

public class Personne {
    int id_Personne;
    String nom_Personne;
    int budget_Personne;
    
    public Personne(int id_Personne, String nom_Personne, int budget_Personne) {
        this.id_Personne = id_Personne;
        this.nom_Personne = nom_Personne;
        this.budget_Personne = budget_Personne;
    }
    
    public int getId_Personne() {
        return id_Personne;
    }
    
    public void setId_Personne(int id_Personne) {
        this.id_Personne = id_Personne;
    }
    
    public String getNom_Personne() {
        return nom_Personne;
    }
    
    public void setNom_Personne(String nom_Personne) {
        this.nom_Personne = nom_Personne;
    }
    
    public int getBudget_Personne() {
        return budget_Personne;
    }
    
    public void setBudget_Personne(int budget_Personne) {
        this.budget_Personne = budget_Personne;
    }
}
