public class mainAlumno {
  public static void main(String[] args) {
    Alumno alumno = new Alumno("Luis", 694596359, 18);
    
    System.out.println("Nombre: " + alumno.nombre);
    System.out.println("Teléfono: " + alumno.telefono);
    System.out.println("Edad: " + alumno.edad);
    
    for(int i = 0; i < alumno.notas.length; i++) {
      System.out.println("Nota " + (i+1) + ": " + alumno.notas[i]);
    }
  }
}
