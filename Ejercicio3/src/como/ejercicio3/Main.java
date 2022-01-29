package como.ejercicio3;
import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int pares = 0;
        int inpares = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("Bienvenido ¿cuantos numeros desea ingresar?");
        int cantidad = in.nextInt();
        int[] nums = new int[cantidad];
        System.out.println("numeros a selecionar: "+ cantidad);
        for(int i=0; i<cantidad; i++){
            System.out.println("numero "+(i+1));
            nums[i] = in.nextInt();
            if(nums[i] % 2 == 0){
                pares++;
            }else{
                inpares++;
            }
        }
        System.out.println("cantidad pares: "+pares);
        System.out.println("cantidad inpares: "+inpares);
    }
}
