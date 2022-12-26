public class cARD {
	private String suit ; //KUPA MAÇA KARO SİEK
	private String number; // A2345678910QJK
	private String name;  //KUPA 3 vb.
	
	
	public Card(String suit, String number) {
		this.suit=suit;
		this.number=number;
		this.name=this.suit +" "+ this.number;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSuit() {
		return suit;
	}

	public void setSuit(String suit) {
		this.suit = suit;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String toString() {                                                         
		return suit + " " + number +"\nname = " + name ;
	}
	
}

//KART İSİMLERİNİ ALDIM VE BİLGİLERİNİ SAKLADIM.