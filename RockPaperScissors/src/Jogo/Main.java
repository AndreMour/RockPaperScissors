package Jogo;

import java.util.Random;
import java.util.Scanner;
import Jogo.model.Jogada;

public class Main {

    public static void main(String[] args) {
    	
        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to Rock, Paper, and Scissors game \n");

        Jogada[] jogadas = new Jogada[3];
        jogadas[0] = new Jogada("Rock", 1);
        jogadas[1] = new Jogada("Paper", 2);
        jogadas[2] = new Jogada("Scissors", 3);

        System.out.println("Your turn!");
        showMenu();

        int jogadaJogador = getPlayerMove(scan);
        int jogadaComputador = new Random().nextInt(3) + 1;

        determineWinner(jogadaJogador, jogadaComputador);
        
    	System.out.println("Player choice: " + jogadaJogador);
        System.out.println("Computer choice: " + jogadaComputador);
    }


    private static void showMenu() {
        System.out.println("1 - Rock");
        System.out.println("2 - Paper");
        System.out.println("3 - Scissors");
    }

    private static int getPlayerMove(Scanner scanner) {
        int jogadaJogador;
        do {
            System.out.print("Enter your choice (1-3): ");
            jogadaJogador = scanner.nextInt();
        } while (jogadaJogador < 1 || jogadaJogador > 3);

        return jogadaJogador;
    }

    private static void determineWinner(int jogadaJogador, int jogadaComputador) {
    	if (jogadaJogador == jogadaComputador) {
    	    System.out.println("It's a tie!");
    	} else if ((jogadaJogador == 1 && jogadaComputador == 3) ||
    	           (jogadaJogador == 2 && jogadaComputador == 1) ||
    	           (jogadaJogador == 3 && jogadaComputador == 2)) {
    	    System.out.println("You win!");
    	} else {
    	    System.out.println("Computer wins!");
    	}
        
      
    }
}
