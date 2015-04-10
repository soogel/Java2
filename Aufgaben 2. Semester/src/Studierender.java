import java.util.Date;

public class Studierender {
	private String vorname, nachname, kurs;
	private Date geburtsdatum;

	public Studierender(String vorname, String nachname, String kurs,
			Date geburtsdatum) {
		super();
		this.vorname = vorname;
		this.nachname = nachname;
		this.kurs = kurs;
		this.geburtsdatum = geburtsdatum;
	}

	public String getVorname() {
		return vorname;
	}

	public void setVorname(String vorname) {
		this.vorname = vorname;
	}

	public String getNachname() {
		return nachname;
	}

	public void setNachname(String nachname) {
		this.nachname = nachname;
	}

	public String getKurs() {
		return kurs;
	}

	public void setKurs(String kurs) {
		this.kurs = kurs;
	}

	public Date getGeburtsdatum() {
		return geburtsdatum;
	}

	public void setGeburtsdatum(Date geburtsdatum) {
		this.geburtsdatum = geburtsdatum;
	}

	@Override
	public boolean equals (Object obj){
		if (this == obj) return true;
		else if (!(obj instanceof Studierender)) return false;
		Studierender other = (Studierender) obj;
		return vorname.equals(other.vorname) && nachname.equals(other.nachname) && kurs.equals(other.kurs) && geburtsdatum.equals(other.geburtsdatum);
	}
	
	@Override
	public int hashCode(){
		int result = 17;
		int multiplikator = 37;
		result = multiplikator * result + vorname.hashCode();
		result = multiplikator * result + nachname.hashCode();
		result = multiplikator * result + kurs.hashCode();
		result = multiplikator * result + geburtsdatum.hashCode();
		
		return result;
	}
	


	public int compareTo(Studierender s){
		if(nachname.equals(s.nachname)){
			if(vorname.equals(s.vorname)){
				if(kurs.equals(s.kurs)){
					if(geburtsdatum.equals(s.geburtsdatum)){
						return 0;
					}
					return geburtsdatum.compareTo(s.geburtsdatum);
				}
				return kurs.compareTo(s.kurs);
			}
			return vorname.compareTo(s.vorname);
		}
		return nachname.compareTo(s.nachname);
	}

}
