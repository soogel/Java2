public class SynMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Figur f = new Figur();
		Writer w = new Writer(f);
		Reader r = new Reader(f);

		r.setDaemon(true);
		
		w.start();
		
		try {
			Thread.sleep(763);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		r.start();
	}

}
