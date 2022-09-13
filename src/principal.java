import java.util.Scanner;

public class principal {
    public static void main(String[] args) {
        calculadora calc = new calculadora();
        Scanner leer = new Scanner(System.in);
        int opc = 0;
        double rs = 0;

        do {
            System.out.println(
                    "OPERACIONES:\n1.-Suma 2.-Resta 3.-Multiplicacion 4.-Division 5.-Potencia 6.-Raiz Cuadrada 7.-Salir");
            System.out.print("Elige una opcion: ");
            opc = leer.nextInt();
            switch (opc) {
                case 1:
                    System.out.println("Ingrese los datos a sumar: ");
                    rs = calc.suma(leer.nextDouble(), leer.nextDouble());
                    System.out.println("El resultado es: " + rs);
                    break;
                case 2:
                    System.out.println("Ingrese los datos a restar: ");
                    rs = calc.resta(leer.nextDouble(), leer.nextDouble());
                    System.out.println("El resultado es: " + rs);
                    break;
                case 3:
                    System.out.println("Ingrese los datos a multiplicar: ");
                    rs = calc.multiplicacion(leer.nextDouble(), leer.nextDouble());
                    System.out.println("El resultado es: " + rs);
                    break;
                case 4:
                    System.out.println("Ingrese los datos a dividir: ");
                    rs = calc.division(leer.nextDouble(), leer.nextDouble());
                    System.out.println("El resultado es: " + rs);
                    break;
                case 5:
                    System.out.println("Ingrese los datos a potenciar: ");
                    rs = calc.potencia(leer.nextDouble(), leer.nextDouble());
                    System.out.println("El resultado es: " + rs);
                    break;
                case 6:
                    System.out.println("Ingrese el dato a sacar raiz cuadrada: ");
                    rs = calc.raiz(leer.nextDouble());
                    System.out.println("El resultado es: " + rs);
                    break;
                case 7:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }
        } while (opc != 7);
    }
}
