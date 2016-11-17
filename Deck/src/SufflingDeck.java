import java.util.Scanner;

public class SufflingDeck {
	//esto es nuevo
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] DeckOfCards = new int [40]; //La baraja de cartas con 40 cartas
		for (int i=0; i<DeckOfCards.length;i++)
			DeckOfCards[i]=i+1;
		int top =0; //numero en el que empieza a contar para repartir
		int [] dealedCards; 
		int option;
		do{
			option=menu();
			switch(option){
			case 1: suffling (DeckOfCards);break;
			case 2: printDeckOfCards(DeckOfCards);break;
			case 3: dealedCards = dealCards(DeckOfCards,top);
					top+=5; //Descarta las 5 cartas que ya ha sacado 
					printDeckOfCards(dealedCards);
					break;
			}
		}while(option!=4);
		System.out.println("Que cobarde cobarde");
		}
	public static void suffling(int [] deck){ //Reparte 5 cartas
			for (int i=0;i<deck.length;i++){ 
				int j=(int) (Math.random()*deck.length);
				int temp = deck[i];
				deck[i]=deck[j];
				deck[j]=temp;
			}
		}
	public static int [] dealCards(int[] deck, int top){ //Baraja las cartas
		int []cards = new int[5];
		for (int i=0; i<5;i++)
			cards[i] = deck[i+top];
		return cards;
	}
	
	public static void printDeckOfCards(int[]deck){ //Publica las cartas en la consola
		System.out.println("Mi baraja");
		for (int i=0; i<deck.length;i++){
			if(i%10==0)System.out.println();
			System.out.print(deck[i]+"	");
		}
	}
	
	public static int menu(){ //menu de opciones
		Scanner sc= new Scanner (System.in);
		System.out.println("\n Menú de opciones");
		System.out.println("................");
		System.out.println("1. Baraja el mazo.");
		System.out.println("2. Visualiza el mazo.");
		System.out.println("3. Sacar 5");
		System.out.println("4. Salir del programa");
		System.out.println("Teclea una opción");
		int option= sc.nextInt();
		return option;
	}

}

