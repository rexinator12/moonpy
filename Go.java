package Janakan;

import java.util.Collection;

//janakan Selvathas
public class Go {

	public static void main(String[] args) {
		Billiardtunier billiardtunier = new Billiardtunier("Rotsee", " 2121-22-21");

		billiardtunier.addBilliadplayer("Watermelin1");	
		billiardtunier.addBilliadplayer("hunde");
		billiardtunier.addBilliadplayer("gurke");
		billiardtunier.addBilliadplayer("salue");
        billiardtunier.addBilliadplayer("pabana");
        Billiardtunier.printPlayer();

	}

}
