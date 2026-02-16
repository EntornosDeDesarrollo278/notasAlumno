public class Alumno {
    String nombre;
    String telefono;
    double[] notas = new double[3];
    double media;
    
    public Alumno(String nombre, String telefono) {
        this.nombre = nombre;
        this.telefono = telefono;
        for (int i = 0; i < 3; i++) {
            this.notas[i] = Math.random() * 10;
        }
        calcularMedia();
    }

    private void calcularMedia() {
        double sum = 0;
        for (double nota : notas) {
            sum += nota;
        }
        media = sum / 3;
    }
}

