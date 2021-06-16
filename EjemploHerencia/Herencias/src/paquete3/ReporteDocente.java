package paquete3;

import herencias2.Docente;
import java.util.ArrayList;

/**
 *
 * @author Jose Cordova
 */
public class ReporteDocente extends Reporte {
    double promedioSueldos;
    ArrayList<Docente> lista;

    public ReporteDocente(String c, ArrayList<Docente> lista) {
        super(c);
        this.lista = lista;
    }

    public double getPromedioSueldos() {
        return promedioSueldos;
    }

    public void setPromedioSueldos() {
        double suma = 0;
        for (int i = 0; i < lista.size(); i++) {
            suma = suma + lista.get(i).getSueldo();
        }
        this.promedioSueldos = suma/lista.size();
    }
    
     public ArrayList<Docente> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Docente> list) {
        lista = list;
    }
    
    @Override
    public String toString() {
        String cadena = String.format("%sReporte de Docentes: \n",
                super.toString());
        for (int i = 0; i < lista.size(); i++) {
            cadena = String.format("%s - %s \n", cadena,
                    lista.get(i).toString());
        }
        cadena = String.format("%sPromedio de sueldos es: %.2f", cadena,
                getPromedioSueldos());
        return cadena;
    }
}
