import java.util.Scanner;

public class AppAlumno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el nombre del alumno: ");
        String nombre = sc.nextLine();
        System.out.println("Introduce el teléfono del alumno: ");
        int telefono = sc.nextInt();
        System.out.println("Introduce la edad del alumno: ");
        int edad = sc.nextInt();
        
        Alumno alumno = new Alumno(nombre, telefono, edad);
        
        System.out.println("Alumno creado: " + alumno.nombre);
        System.out.println("Notas:");
        for (double nota : alumno.notas) {
            System.out.println(nota);
        }
    }
}
