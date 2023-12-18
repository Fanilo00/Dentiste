package utile;

public class Priorite {
    public int id_Priorite;
    public int id_Personne;
    public int id_TypePriorite;
    public int id_Etape;
    
    public Priorite(int id_Priorite, int id_Personne, int id_TypePriorite, int id_Etape) {
        this.id_Priorite = id_Priorite;
        this.id_Personne = id_Personne;
        this.id_TypePriorite = id_TypePriorite;
        this.id_Etape = id_Etape;
    }
    
    public int getId_Priorite() {
        return id_Priorite;
    }
    
    public void setId_Priorite(int id_Priorite) {
        this.id_Priorite = id_Priorite;
    }
    
    public int getId_Personne() {
        return id_Personne;
    }
    
    public void setId_Personne(int id_Personne) {
        this.id_Personne = id_Personne;
    }
    
    public int getId_TypePriorite() {
        return id_TypePriorite;
    }
    
    public void setId_TypePriorite(int id_TypePriorite) {
        this.id_TypePriorite = id_TypePriorite;
    }
    
    public int getId_Etape() {
        return id_Etape;
    }
    
    public void setId_Etape(int id_Etape) {
        this.id_Etape = id_Etape;
    }
}
