package Janakan;

import java.util.Date;

public class Billiardtunier {
	private static billiardplayer[] Billiardplayer = new billiardplayer[10];
	private static String Name;
	private static String datum;
//konstruktor Billiardtunier
	   public Billiardtunier(String Name,String datum) {
		   Billiardtunier.Name = Name;
		   Billiardtunier.datum = datum;
	    }
	   //automatische Punktzahl und age
	   public void addBilliadplayer(String name) {
		   	for(int i = 0; i < Billiardplayer.length; i++) {
		   		int nummer = i;
		   		int Punktzahl = billiardplayer.erreichtePunkte();
		   		int alter = billiardplayer.age();
		   		billiardplayer billiardplayerO = new billiardplayer(nummer, name, Punktzahl, alter);
		   		Billiardplayer[i] = billiardplayerO;
		   		
		   	}
		   	}
		   	public void Go(){
		   		for (var i = 0; i < getBilliardplayer().length; i++) {
		            if (getBilliardplayer()[i] != null) {
		            	billiardplayer.erreichtePunkte();
		            	
		            	
		   	}}
		   		}
		   	//Zeig an
		   	public static void printPlayer() {
		        Billiardtunier getNameobj = new Billiardtunier(Name, datum);
		        System.out.println("Wettkampf: " + Name + datum);
		        for (var i = 0; i < Billiardplayer.length; i++) {
		            System.out.println("_");
		            if (Billiardplayer[i] != null) {
		                System.out.println("Billiardplayer-Nr  : " + Billiardplayer[i].getNummer());
		                System.out.println("Billiardplayer-Name: " + Billiardplayer[i].getName());
		                System.out.println("Billiardplayer-score: " + Billiardplayer[i].getPunktzahl());
		                System.out.println("Billiardplayer-Alter: " + Billiardplayer[i].getAlter());
		            } else {
		                System.out.println("Schiff-Nr[" + i + "] ist nicht definiert.");
		            }}

		        
		        }

		            public static billiardplayer[] getBilliardplayer() {
		                return Billiardplayer;
		            }

		            public static void setBilliardspieler(billiardplayer[] Billiardplayer) {
		            	Billiardtunier.Billiardplayer = Billiardplayer;
		            }

		   
	   }


