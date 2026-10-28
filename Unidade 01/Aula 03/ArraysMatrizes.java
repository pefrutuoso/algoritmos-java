import java.util.Scanner;

public class ArraysMatrizes {
    public static void main(String[] args) {
        int[] numeros = {1,2,3,4,5};
        int[] numeros2 = new int[5];

        //SCANNER
        Scanner scanner = new Scanner(System.in);

        //ARRAY
        numeros2[0] = 12;
        numeros2[1] = 24;
        numeros2[2] = 48;
        numeros2[3] = 96;
        numeros2[4] = 192;
        //numeros2[5] = 384; não pode usar ERRO: Index 5 out of bounds for length 5

        System.out.println();
        System.out.println(numeros[2]);
        System.out.println(numeros2[4]);
        System.out.println();
        

        //MATRIZ
        int[][] matriz = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] matriz2 = new int[3][3];

        System.out.println(matriz[2][1]);
        System.out.println(matriz[0][0]);

        System.out.print("Digite um número: ");
        numeros[0] = Integer.parseInt(scanner.nextLine());
        System.out.println(numeros[0]);
    } 
}
