
import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Ingrese la catidad de coordenadas a ingresar");
        int cantidad = in.nextInt();
        for (int i = 0; i < cantidad; i++) {
            System.out.println("Ingrese la coordenada X");
            double num1 = in.nextDouble();
            System.out.println("Ingrese la coordenada Y");
            double num2 = in.nextDouble();

            if (num1 >= 0 && num2 >= 0){
                System.out.println("Las coordenadas (" + num1 + "," + num2 + ") se encuentra en el primer cuadrante");
            }else if (num1 < 0 && num2 >= 0){
                System.out.println("Las coordenadas (" + num1 + "," + num2 + ") se encuentra en el segundo cuadrante");
            }else if (num1 < 0 && num2 < 0){
                System.out.println("Las coordenadas (" + num1 + "," + num2 + ") se encuentra en el tercer cuadrante");
            }else{
                System.out.println("Las coordenadas (" + num1 + "," + num2 + ") se encuentra en el cuarto cuadrante");
            }
        }
    }
}
