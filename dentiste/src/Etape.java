package dentiste;

public class Etape {
    int id_Etape;
    String nom_Etape;
    int prix_Unitaire;
    
    public Etape(int id_Etape, String nom_Etape, int prix_Unitaire) {
        this.id_Etape = id_Etape;
        this.nom_Etape = nom_Etape;
        this.prix_Unitaire = prix_Unitaire;
    }
    
    // Getters et setters pour chaque attribut
    public int getId_Etape() {
        return id_Etape;
    }
    
    public void setId_Etape(int id_Etape) {
        this.id_Etape = id_Etape;
    }
    
    public String getNom_Etape() {
        return nom_Etape;
    }
    
    public void setNom_Etape(String nom_Etape) {
        this.nom_Etape = nom_Etape;
    }
    
    public int getPrix_Unitaire() {
        return prix_Unitaire;
    }
    
    public void setPrix_Unitaire(int prix_Unitaire) {
        this.prix_Unitaire = prix_Unitaire;
    }
}
