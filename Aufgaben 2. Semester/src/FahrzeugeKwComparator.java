import java.util.Comparator;

public class FahrzeugeKwComparator implements Comparator<Fahrzeuge>{
	
	public int compare(Fahrzeuge f1, Fahrzeuge f2){
		if(f1.getKw() == f2.getKw()){
			if(f1.getHersteller().equals(f2.getHersteller())){
				if(f1.getTyp().equals(f2.getTyp())){
					if(f1.getHoechstgeschwindigkeit() == f2.getHoechstgeschwindigkeit()){
						if(f1.getAussenfarbe().equals(f2.getAussenfarbe())){
							return 0;
						}
						else return f1.getAussenfarbe().compareTo(f2.getAussenfarbe());
					}
					else return f1.getHoechstgeschwindigkeit() - f2.getHoechstgeschwindigkeit();
				}
				else return f1.getTyp().compareTo(f2.getTyp());
			}
			else return f1.getHersteller().compareTo(f2.getHersteller());
		}
		else return f2.getKw() - f1.getKw();
	}
}
