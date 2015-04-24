
public class Creature {
	private int age = 0;

	public Creature (int age) {
		setAge(age);
	}
	
	
	public int getAge(){
		return age;
	}
	
	
	
	public void setAge (int age){
		if (age >=0 && age <=30){
			this.age=age;
		}
		else {
			System.err.println("Invalid Age: "+ age);
		}
	}
	
	public String toString(){
		return "Im a " + getClass()+ " the "+ this.getClass().getSimpleName();
	}
}
