package paquete3;

import herencias2.Estudiante;
import java.util.ArrayList;

/**
 *
 * @author Jose Cordova
 */
public class ReporteEstudiante extends Reporte{
    double promedioMatriculas;
    ArrayList<Estudiante> lista;

    public ReporteEstudiante(String c,ArrayList<Estudiante> lista) {
        super(c);
        this.lista = lista;
    }

    public double getPromedioMatriculas() {
        return promedioMatriculas;
    }

    public void setPromedioMatriculas() {
        double suma = 0;
        for (int i = 0; i < lista.size(); i++) {
            suma = suma + lista.get(i).getMatricula();
        }
        this.promedioMatriculas = suma/lista.size();
    }

    public ArrayList<Estudiante> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Estudiante> lista) {
        this.lista = lista;
    }
    
     @Override
    public String toString() {
        String cadena = String.format("%sReporte de Estudiantes: \n",
                super.toString());
        for (int i = 0; i < lista.size(); i++) {
            cadena = String.format("%s - %s \n", cadena,
                    lista.get(i).toString());
        }
        cadena = String.format("%sPromedio de matricula es: %.2f", cadena,
                getPromedioMatriculas());
        return cadena;
    }
    
}
