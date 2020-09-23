package application;
import java.util.Locale;
import java.util.Scanner;
import entities.execFixacao;

import entities.execFixacao;

public class ExecFixacao{

    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        execFixacao pousada = new execFixacao();        

        System.out.printf("How many rooms will be rented?");
        int quartos = sc.nextInt();
        
        Reservas(quartos);

        sc.close();
    }

    public static void Reservas(int quartos){

        Scanner sc = new Scanner(System.in);
        execFixacao[] quarto = new execFixacao[10];

            for(int i = 0; i < quartos; i++){

                System.out.println("I have 10 rooms disponibles to rented/n");
                System.out.print("");    
                System.out.println("Rent #" + i + ": ");
                System.out.println("Nome: ");
                String nome = sc.next(); 
                System.out.println("E-mail: "); 
                String email = sc.next();
                System.out.println("Telefone: ");
                int phone = sc.nextInt(); 
                System.out.println("Room: ");
                int room = sc.nextInt();  

                quarto[room-1] = new execFixacao(nome, email, phone);
               // System.out.printf("Nome: %s, E-mail %s, Telefone: %d e Quarto: %d /n", nome, email, phone, room);
        }  

     //   System.out.println();

    //System.out.println("Busy rooms: ");
    //for(int i=0; i<10; i++){

     //   if(quarto[i] != null){

      //      System.out.println(i + ": " + quarto[i]);
    //    }
  //  }
        
        relatorio(quarto);
    }

    public static void relatorio(execFixacao[] quarto){

    System.out.println();

    System.out.println("Busy rooms: ");
    for(int i=0; i<10; i++){

        if(quarto[i] != null){

            System.out.println(i + ": " + quarto[i]);
        }
    }

    }
}