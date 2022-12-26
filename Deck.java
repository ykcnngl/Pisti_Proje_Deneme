import java.util.Random;
import java.util.Scanner;

	public class Deck {
		private String[] suit = {"Hearts","Spades","Diamonds","Clubs"} ;
		private String[] number = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
		private String[] name;
		
		Scanner sc=new Scanner(System.in);
		Card [] cards = new Card [52];
		Player[] player;
		Computer[] computer; 
		
		Deck() {		// Constructor oluşturdum koddaki ilk çalışan yer buarsı
			this.suit=suit;
			this.number=number;
			this.name=name;
			int cardsIndex=0;
			
			for(int s=0;s<suit.length;s++) {
				for(int n=0;n<number.length;n++) {                              // Kartları oluşturdum çarpım tablosu yapar gibi
					cards[cardsIndex]= new Card( suit[s], number[n]);
					cardsIndex++;
				}
			}
		}
		
		public static void shuffle() {
			int i;
			for (int k=0; k<cards.length; k++) {
				i= (int)(Math.random()*cards.length);              //0 ve 52 arasında rastgele bir sayı verdi 
				Card tmp = cards[i];							   
				cards[i] = cards[k];
				cards[k] = tmp;
				System.out.println(cards[i]);                     // Seçilen rastgele sayıyı tmpye atadım sonra rastgele seçien sayıyı yeni indexe atadım  en son tmpyi kart dizisine atadım ki karılabilsinler
			}   
		}
			
		public static void Cut() {
			Card[] Cutarray = new Card[52];                        // kesilmiş kartlar için yeni bir dizi açtım
			System.out.println("Enter a number to cut.");
			int cutIndex = sc.nextInt();
			for (int i = 0; i < Cutarray.length; i++) {
				if (cutIndex >51) {
				Cutarray[i] = cards[cutIndex - cards.length];           // oyuncu 52'yi seçerse kartlar kesilmez ve kesilen kısımdan önceki kısım aynı ilk diziyle aynı olmalı 
				continue;
				}
				Cutarray[i] = cards[cutIndex];
				cutIndex++;  
			}
			cards = Cutarray;
		}
		
		
		/*public static void DealCard(int player1, int player2) {
		int player1 = 0;
		int player2 = 0;
		for (int k = 0; k<8;k++) {
			if ( k==0 && k%2==0){ 			// çift sırada olan kartlar bir oyuncuya tek sırada olan kartlar diğer oyuncuya gitsin diye böyle yaptım.
			*/
	}
	
	
	

// DESTEDEKİ KARTLARI OLUŞTURDUM ve KARDIM ve KESTİM.