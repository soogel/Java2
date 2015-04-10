
public class StringXer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i =2000;
		System.out.println(makeXString(i));
		System.out.println("stop");

	}
	public static String makeXString(int anzahl)
	{
		
	String a ="";
	for (int g=1; anzahl>g;g++){
			System.out.print("x");
			a= a+"x";
			
		}return  a;
	}
	}


