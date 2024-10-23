package azar; // Define el paquete al que pertenece esta clase

import javax.swing.JOptionPane; // Importa la clase JOptionPane para mostrar cuadros de diálogo
import java.util.Random; // Importa la clase Random para generar números aleatorios

public class azar { // Define la clase principal "azar"

    public static void main(String[] args) { // Método principal que se ejecuta al iniciar el programa
        Random random = new Random(); // Crea una instancia de Random para generar números aleatorios
        int numeroAleatorio = random.nextInt(100) + 1; // Genera un número aleatorio entre 1 y 100
        int intento = 0; 
        boolean adivinado = false; // indica si el número ha sido adivinado

        // Muestra un mensaje de bienvenida al usuario
        JOptionPane.showMessageDialog(null, "¡Bienvenido al juego de adivinanza!\nHe escogido un número entre 1 y 100. ¡Intenta adivinarlo!");

        // Bucle que se ejecuta mientras el número no haya sido adivinado
        while (!adivinado) {
            // Solicita al usuario que introduzca un número
            String input = JOptionPane.showInputDialog("Introduce tu número:");
            if (input == null) { // Comprueba si el usuario cierra el cuadro de diálogo
                JOptionPane.showMessageDialog(null, "Juego terminado."); // Muestra un mensaje de finalización
                return; // Termina el programa
            }

            try {
                intento = Integer.parseInt(input); // Intenta convertir la entrada del usuario a un número entero
            } catch (NumberFormatException e) { // Captura excepciones si la conversión falla
                JOptionPane.showMessageDialog(null, "Por favor, introduce un número válido entre 1 y 100."); // Mensaje de error
                continue; // Vuelve al inicio del bucle
            }

            // Comprueba si el número introducido está fuera del rango permitido
            if (intento < 1 || intento > 100) {
                JOptionPane.showMessageDialog(null, "Por favor, elige un número entre 1 y 100."); // Mensaje de error
            } else if (intento < numeroAleatorio) { // Si el intento es menor que el número aleatorio
                JOptionPane.showMessageDialog(null, "El número es más alto. Intenta de nuevo."); // Sugerencia para el usuario
            } else if (intento > numeroAleatorio) { // Si el intento es mayor que el número aleatorio
                JOptionPane.showMessageDialog(null, "El número es más bajo. Intenta de nuevo."); // Sugerencia para el usuario
            } else { // Si el usuario adivina el número
                adivinado = true; // Cambia a true
                JOptionPane.showMessageDialog(null, "¡Felicidades! Has adivinado el número: " + numeroAleatorio); // Mensaje de éxito
            }
        }
    }
}