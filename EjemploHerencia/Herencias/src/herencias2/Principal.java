package herencias2;
import java.util.Scanner;

/**
 *
 * @author Jose Cordova
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String nombre;
        String apellido;
        int edad;
        int opc;
        System.out.println("\tIngrese una opcion\n"
                            +"1.Estudiante\n"
                            +"2.Docente\n"
                            +"3.Policia");
        opc = leer.nextInt();
            System.out.println("Ingrese el nombre");
            nombre = leer.next();
            System.out.println("Ingrese el apellido");
            apellido = leer.next();
            System.out.println("Ingrese la edad");
            edad = leer.nextInt();
        
        switch(opc){
            case 1:
                System.out.println("Ingrese el costo de la matricula");
                double mat = leer.nextDouble();
                Estudiante e1 = new Estudiante(nombre,apellido,edad,mat);
                System.out.println(e1);
                break;
            case 2:
                System.out.println("Ingrese el Sueldo del docente");
                double sueldo = leer.nextDouble();
                Docente d1 = new Docente(nombre, apellido, edad, sueldo);
                System.out.println(d1);
                break;

            case 3:
                System.out.println("Ingrese el rango del policia");
                String rango = leer.nextLine();
                Policia p1 = new Policia(nombre, apellido, edad, rango);
                System.out.println(p1);
                break;

            default:
                System.out.println("Opcion Incorrecta");    
        }
        
    }
    
}
