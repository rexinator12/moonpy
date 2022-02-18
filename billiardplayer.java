package Janakan;
//Janakan Selvathas
import java.util.concurrent.ThreadLocalRandom;
public class billiardplayer  {
	private int nummer;
	private String name;
	private int alter;
	private int rangliste; 
	private int Punktzahl;
	//Konstruktor für Billiardspieler
	public billiardplayer(int nummer, String name, int Punktzahl, int alter) {
		this.nummer = nummer;
		this.name = name;
		this.alter = alter;
		this.Punktzahl = Punktzahl;

	}
	//getter setter für attribute
	public static int erreichtePunkte() {
        int Punktzahl = ThreadLocalRandom.current().nextInt(10, 100 + 1);
        return Punktzahl;
    }
	public static int age() {
        int alter = ThreadLocalRandom.current().nextInt(18, 70 + 1);
        return alter;
    }

	public int getPunktzahl() {
		return Punktzahl;
	}
	public void setPunktzahl(int punktzahl) {
		Punktzahl = punktzahl;
	}
	public int getNummer() {
		return nummer;
	}
	public void setNummer(int nummer) {
		this.nummer = nummer;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAlter() {
		return alter;
	}
	public void setAlter(int alter) {
		this.alter = alter;
	}
	public int getRangliste() {
		return rangliste;
	}
	public void setRangliste(int rangliste) {
		this.rangliste = rangliste;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
