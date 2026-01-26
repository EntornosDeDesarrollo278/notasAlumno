public class Alumno {
  public String nombre;
  public int telefono;
  public int edad;
  public int notas [] = new int [3];
  
  public Alumno(String nombre, int telefono, int edad) {
    this.nombre = nombre;
    this.telefono = telefono;
    this.edad = edad;
    
    for(int i = 0; i < notas.length; i++) {
      notas[i] = (int) (Math.random()*11);
    }
  }
}
