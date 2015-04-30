
public class ExtendsThreadsExample extends Thread {
	//Schrit 1: Klasse leite von Thread ab
	
	
	//Schritt 2: Überschreiben von run:
	@Override
	public void run() {
		int i = 0;
		String name = getName();
		StringBuffer sb = new StringBuffer();
		
		while(i < 1000000){
			i++;
			sb.append("[");
			sb.append(name);
			sb.append("] ");
			sb.append(i);
			sb.append("\n");
			
		} System.out.println(sb);
	}
	
	

}
