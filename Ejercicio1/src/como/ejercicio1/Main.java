package como.ejercicio1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner in = new Scanner(System.in);
        System.out.println("Bienvenido por favor ingrese dos numeros");
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        if(num1%num2 == 0){
            System.out.println("los numeros son divisibles entre si");
        }else{
            System.out.println("los numeros no son divisibles entre si");
        }
    }
}
