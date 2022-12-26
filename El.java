public class El {
	private Kart kartlar[];
	private int toplamKartSayisi;
	private int eldekiKartSayisi;
	private int kartIndeks;
	
	public El (int kartSayisi) {
		this.toplamKartSayisi = kartSayisi;
		this.kartIndeks = 0;
		this.eldekiKartSayisi = 0;
		
		kartlar = new Kart[this.toplamKartSayisi];
	}
	
	public void kartEkle (Kart kart) {
		if ( kartIndeks == toplamKartSayisi) {
			System.out.println("Kart Verilemez.");
		} else {
			kartlar[kartIndeks] = kart;
			kartIndeks++;
			eldekiKartSayisi++;
		}
	}
	
	public void kartSil (int id) {              //id kaçıncı karta ait olduğunu gösteriyo ve onu diziden çıkarıyo.
		kartlar[id] = null;
		eldekiKartSayisi--;
	}
	
	public Kart kartGoster (int id) {             // Sadece kartı gösterecek silmeyecek
		return kartlar[id];                       // Azaltmaya gerek yok çünkü sadece gösterecek.
	}
	
	public int getEldekiKartSayisi() {
		return this.eldekiKartSayisi;
	}
	
	public int getToplamKartSayisi() {
		return this.toplamKartSayisi;
	}


//KART ATMAYI BUL ELDEN KART ATMA EKSİK.








}