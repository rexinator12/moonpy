package Janakan;

public class klub {
	private static String namec;
	private String Land;
	private String Ort;
	 public klub(String namec,String Land, String Ort) {
		  this.namec = namec;
		  this.Land = Land;
		  this.Ort = Ort;
	    }
	public static String getNamec() {
		return namec;
	}
	public void setNamec(String namec) {
		this.namec = namec;
	}
	public String getLand() {
		return Land;
	}
	public void setLand(String land) {
		Land = land;
	}
	public String getOrt() {
		return Ort;
	}
	public void setOrt(String ort) {
		Ort = ort;
	}


}
