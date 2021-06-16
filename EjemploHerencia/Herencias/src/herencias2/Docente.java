package herencias2;

/**
 *
 * @author Jose Cordova
 */
public class Docente extends Persona{
    
    private double sueldo;
    
    public Docente(String n, String a, int e, double suel){
        super(n, a, e);
    }
    
    public void setSueldo(double suel){
        this.sueldo = suel;
    }
    
    public double getSueldo(){
        return sueldo;
    }
    
    @Override
    public String toString(){
        return String.format("%s - %.2f", super.toString(), getSueldo());
    }
    
    
    
}
