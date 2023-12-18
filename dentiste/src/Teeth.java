package vivant; 

public class Teeth {
    private int id_Teeth;
    private String id_TypeTeeth;
    private int numero_Teeth;
    
    public Teeth(int id_Teeth, String id_TypeTeeth, int numero_Teeth) {
        this.id_Teeth = id_Teeth;
        this.id_TypeTeeth = id_TypeTeeth;
        this.numero_Teeth = numero_Teeth;
    }
    
    // Getters et setters pour chaque attribut
    public int getId_Teeth() {
        return id_Teeth;
    }
    
    public void setId_Teeth(int id_Teeth) {
        this.id_Teeth = id_Teeth;
    }
    
    public String getId_TypeTeeth() {
        return id_TypeTeeth;
    }
    
    public void setId_TypeTeeth(String id_TypeTeeth) {
        this.id_TypeTeeth = id_TypeTeeth;
    }
    
    public int getNumero_Teeth() {
        return numero_Teeth;
    }
    
    public void setNumero_Teeth(int numero_Teeth) {
        this.numero_Teeth = numero_Teeth;
    }
}
