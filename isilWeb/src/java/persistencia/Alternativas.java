package persistencia;
// Generated 07/04/2010 08:17:43 PM by Hibernate Tools 3.2.1.GA



/**
 * Alternativas generated by hbm2java
 */
public class Alternativas  implements java.io.Serializable {


     private AlternativasId id;
     private String valor;

    public Alternativas() {
    }

	
    public Alternativas(AlternativasId id) {
        this.id = id;
    }
    public Alternativas(AlternativasId id, String valor) {
       this.id = id;
       this.valor = valor;
    }
   
    public AlternativasId getId() {
        return this.id;
    }
    
    public void setId(AlternativasId id) {
        this.id = id;
    }
    public String getValor() {
        return this.valor;
    }
    
    public void setValor(String valor) {
        this.valor = valor;
    }




}

