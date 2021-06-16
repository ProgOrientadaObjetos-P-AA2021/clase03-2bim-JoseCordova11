package paquete3;

/**
 *
 * @author Jose Cordova
 */
public class Reporte {
    
   protected String codigo;
   
   public Reporte (String c){
       setCodigo(c);
   }
   
   public void setCodigo(String c){
       codigo = c; 
   }
   
   public String getCodigo(){
       return codigo;
   }
   
   @Override
    public String toString(){
        return String.format("Codigo: %s\n", getCodigo());
    }
    
}
