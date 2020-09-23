package application;

import java.util.*;

public class ExecMatriz {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o numero de linhas...");
        int linhas = sc.nextInt();

        System.out.println("Digite o numero de colunas...");
        int colunas = sc.nextInt();

        int [][]matriz = new int[linhas][colunas];

        for(int i = 0; i<matriz.length; i++){

            for(int j = 0; j<matriz.length; j++){

                matriz[i][j] = sc.nextInt();

            }
        }

        for(int i = 0; i<matriz.length; i++){

            for(int j = 0; j<matriz.length; j++){

                System.out.println(matriz[i][j]);
                
            }
        }
    }
    
}
