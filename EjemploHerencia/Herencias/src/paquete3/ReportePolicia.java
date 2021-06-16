package paquete3;

import herencias2.Policia;
import java.util.ArrayList;

/**
 *
 * @author Jose Cordova
 */
public class ReportePolicia extends Reporte{
    double promedioEdades;
    ArrayList<Policia> lista;

    public ReportePolicia(String c, ArrayList<Policia> lista) {
        super(c);
        this.lista = lista;
    }

    public double getPromedioEdades() {
        return promedioEdades;
    }

    public void setPromedioEdades() {
        double suma = 0;
        for (int i = 0; i < lista.size(); i++) {
            suma = suma + lista.get(i).getEdad();
        }
        this.promedioEdades = suma/lista.size();
    }

     public ArrayList<Policia> getLista() {
        return lista;
    
    }

    public void setLista(ArrayList<Policia> lista) {
        this.lista = lista;
    }
    
     @Override
    public String toString() {
        String cadena = String.format("%sReporte de Policias: \n",
                super.toString());
        for (int i = 0; i < lista.size(); i++) {
            cadena = String.format("%s - %s \n", cadena,
                    lista.get(i).toString());
        }
        cadena = String.format("%sPromedio de edades es: %.2f", cadena,
                getPromedioEdades());
        return cadena;
    }
    
}
