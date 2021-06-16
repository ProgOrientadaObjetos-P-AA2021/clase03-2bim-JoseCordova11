package paquete3;

import herencias2.*;
import java.util.ArrayList;

/**
 *
 * @author Jose Cordova
 */
public class Principal {
    public static void main(String[] args) {
        Estudiante est1 = new Estudiante("René", "Elizalde", 33, 100.2);
        Docente doc1 = new Docente("José", "Hincapié", 40, 1000);
        Policia pol1 = new Policia("María", "MENDOZA", 35, "Cabo");
        Estudiante est2 = new Estudiante("Patricia", "Velez", 31, 100.2);
        Docente doc2 = new Docente("Luis", "Alvarez", 38, 1000);
        Policia pol2 = new Policia("ALEX", "Medina", 33, "Cabo");
        Estudiante est3 = new Estudiante("David", "Mcqueen", 40, 999.5);
        Docente doc3 = new Docente("Mateo", "Villavicencio", 58, 1040);
        Policia pol3 = new Policia("Brayan", "Quizpe", 60, "teniente");

        ArrayList listaDocente = new ArrayList<>();
        listaDocente.add(doc1);
        listaDocente.add(doc2);
        listaDocente.add(doc3);

        ArrayList listaEstudiante = new ArrayList<>();
        listaEstudiante.add(est1);
        listaEstudiante.add(est2);
        listaEstudiante.add(est3);

        ArrayList listaPolicia = new ArrayList<>();
        listaPolicia.add(pol1);
        listaPolicia.add(pol2);
        listaPolicia.add(pol3);

        ReporteDocente rd = new ReporteDocente("0001Doc", listaDocente);
        rd.setPromedioSueldos();
        ReporteEstudiante re = new ReporteEstudiante("0001Est", listaEstudiante);
        re.setPromedioMatriculas();
        ReportePolicia rp = new ReportePolicia("0001Pol", listaPolicia);
        rp.setPromedioEdades();

        System.out.println(rd);
        System.out.println("");
        System.out.println(re);
        System.out.println("");
        System.out.println(rp);
    }
}
