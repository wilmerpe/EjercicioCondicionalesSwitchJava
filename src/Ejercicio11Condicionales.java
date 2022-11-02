
import javax.swing.*;
import java.util.Scanner;

public class Ejercicio11Condicionales {
    public static void main(String[] args) {
        int numero1, numero2, suma, resta, mult, div;
        char operacion;

        numero1 = Integer.parseInt(JOptionPane.showInputDialog("Escriba un número: "));
        numero2 = Integer.parseInt(JOptionPane.showInputDialog("Escriba un segundo número: "));

        operacion = JOptionPane.showInputDialog("Escriba a continuación la operación a realizar: ").charAt(0);

        switch (operacion) {
            case 's':
            case 'S':
                suma = numero1 + numero2;
                JOptionPane.showMessageDialog(null, "La suma es: " + suma);
                break;
            case 'r':
            case 'R':
                resta = numero1 - numero2;
                JOptionPane.showMessageDialog(null, "La resta es: " + resta);
                break;
            case 'p':
            case 'P':
            case 'm':
            case 'M': mult = numero1 * numero2;
                JOptionPane.showMessageDialog(null, "La resta es: " + mult);
                break;
            case 'd':
            case 'D': div = numero1 / numero2;
            JOptionPane.showMessageDialog(null, "La division es: " + div);
            break;
            default: JOptionPane.showMessageDialog(null, "Error, la operación a realizar es erronea");
        }
    }
}
