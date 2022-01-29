package como.ejercicio2;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner in = new Scanner(System.in);
        int[] notas = new int[10];
        int cont1 = 0;
        int cont2 = 0;
        System.out.println("Bienvenido por favor ingrese las notas del estudiante:");
        for(int i=0; i<10; i++){
            System.out.println("nota " +(i+1)+":" );
            notas[i] = in.nextInt();
        }
        for(int j=0; j<notas.length; j++){
            if(notas[j] >= 7){
                cont1++;
            }else{
                cont2++;
            }
        }

        System.out.println("el alumno posee "+cont1+" notas mayores o iguales a 7 y "
            +cont2+" notas menores a 7");
    }
}
