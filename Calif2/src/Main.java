//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // aqui tenemos el nomnbre del alumno y definimos calificaciones
        String nombre = "Luis Carlos Gonzalez Salinas";
        double[] calificaciones = {81, 70, 75, 99, 92};
        Alumno alumno = new Alumno(nombre, calificaciones);
        alumno.imprimirResultados();
    }
}

class Alumno {
    private String nombre;
    private double[] calificaciones;

    public Alumno(String nombre, double[] calificaciones) {
        this.nombre = nombre;
        this.calificaciones = calificaciones;
    }

    // aqui calculamos el promedio de las calificaciones
    public double calculoPromedio() {
        double suma = 0;
        for (double calificacion : calificaciones) {
            suma += calificacion;
        }
        return suma / calificaciones.length;
    }

    // Métodos de if y else con respecto al promedio, se puso en char para las letras porque
    // es un solo caracter
    public char obtenerCalifFinal(double promedio) {
        if (promedio <= 50) {
            return 'F';
        } else if (promedio <= 60) {
            return 'E';
        } else if (promedio <= 70) {
            return 'D';
        } else if (promedio <= 80) {
            return 'C';
        } else if (promedio <= 90) {
            return 'B';
        } else {
            return 'A';
        }
    }

    // se imprimen los datos, como el nombre del estudiante, el promedio y los demas datos
    public void imprimirResultados() {
        System.out.println("Nombre del estudiante: " + nombre);
        for (int i = 0; i < calificaciones.length; i++) {
            System.out.println("Calificación " + (i + 1) + ": " + calificaciones[i]);
        }
        double promedio = calculoPromedio();
        System.out.println("Promedio: " + promedio);
        char califFinal = obtenerCalifFinal(promedio);
        System.out.println("Calificación: " + califFinal);
    }
}
