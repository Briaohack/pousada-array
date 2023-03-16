package aplication;
import java.util.Scanner;

import entities.Pousada;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        Pousada[] aluguelPousadas = new Pousada[10];

        int n;
        do {
            System.out.print("Digite quantos estudantes serão cadastrados: (MAX 10) ");
            n = sc.nextInt();
            sc.nextLine();
        } while (n > 10);

        for (int i = 0; i < n; i++) {
            System.out.println("Rent #"+(i+1) );
            System.out.print("NAME: ");
            String name = sc.nextLine();
            System.out.print("EMAIL: ");
            String email = sc.nextLine();
            System.out.print("ROOM: ");
            int room = sc.nextInt();
            sc.nextLine();

            aluguelPousadas[room] = new Pousada(name, email, room);
        }

        for (int i = 0; i < aluguelPousadas.length; i++) {
            if(aluguelPousadas[i] != null)
           System.out.println(aluguelPousadas[i]);
            
        }
        sc.close();
    }
}
