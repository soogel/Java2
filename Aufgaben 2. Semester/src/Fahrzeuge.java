
public class Fahrzeuge implements Comparable<Fahrzeuge>{

	private String hersteller, typ, aussenfarbe;
	private int kw, hoechstgeschwindigkeit;
	public Fahrzeuge(String hersteller, String typ, String aussenfarbe, int kw,
			int hoechstgeschwindigkeit) {
		super();
		this.hersteller = hersteller;
		this.typ = typ;
		this.aussenfarbe = aussenfarbe;
		this.kw = kw;
		this.hoechstgeschwindigkeit = hoechstgeschwindigkeit;
	}
	public String getHersteller() {
		return hersteller;
	}
	public void setHersteller(String hersteller) {
		this.hersteller = hersteller;
	}
	public String getTyp() {
		return typ;
	}
	public void setTyp(String typ) {
		this.typ = typ;
	}
	public String getAussenfarbe() {
		return aussenfarbe;
	}
	public void setAussenfarbe(String aussenfarbe) {
		this.aussenfarbe = aussenfarbe;
	}
	public int getKw() {
		return kw;
	}
	public void setKw(int kw) {
		this.kw = kw;
	}
	public int getHoechstgeschwindigkeit() {
		return hoechstgeschwindigkeit;
	}
	public void setHoechstgeschwindigkeit(int hoechstgeschwindigkeit) {
		this.hoechstgeschwindigkeit = hoechstgeschwindigkeit;
	}
	
	@Override
	public boolean equals (Object obj){
		if (this == obj) return true;
		else if (!(obj instanceof Fahrzeuge)) return false;
		Fahrzeuge other = (Fahrzeuge) obj;
		return hersteller.equals(other.hersteller) && typ.equals(other.typ) && aussenfarbe.equals(other.aussenfarbe) && other.kw == kw && other.hoechstgeschwindigkeit == hoechstgeschwindigkeit;
	}
	
	@Override
	public int hashCode(){
		int result = 17;
		int multiplikator = 37;
		result = multiplikator * result + hersteller.hashCode();
		result = multiplikator * result + typ.hashCode();
		result = multiplikator * result + aussenfarbe.hashCode();
		result = multiplikator * result + kw;
		result = multiplikator * result + hoechstgeschwindigkeit;
		
		return result;
	}
	
	public String toString(){
		return "\nHersteller: " + hersteller + "\nTyp: " + typ + "\nAussenfarbe: " + aussenfarbe + "\nLeistung: " + kw + "\nHöchstgeschwimdigkeit: " + hoechstgeschwindigkeit + "\n------------";
	}
	
	public int compareTo(Fahrzeuge f){
		if(hersteller.equals(f.hersteller)){
			if(typ.equals(f.typ)){
				if(kw == f.kw){
					if(hoechstgeschwindigkeit == f.hoechstgeschwindigkeit){
						if(aussenfarbe.equals(f.aussenfarbe)){
							return 0;
						}
						else return aussenfarbe.compareTo(f.aussenfarbe);
					}
					else return hoechstgeschwindigkeit - f.hoechstgeschwindigkeit;
				}
				else return kw - f.kw;
			}
			else return typ.compareTo(f.typ);
		}
		else return hersteller.compareTo(f.hersteller);
	}
	
}