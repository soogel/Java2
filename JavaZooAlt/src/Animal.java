
public class Animal extends Creature{
	//Attribute
	private String name = "?";
	
	public Animal(String name, int age){
		super(age);
		setName(name);
	}
	
	public String toString(){
		return "Hello  my name is "+ getName() + " the "+ this.getClass().getSimpleName()+ " and Iam "+ getAge() + " years old.";
	}
	
	
	
	public void sayName(){
		System.out.println(toString());
	}

	public void setName(String name) {
		if (name !=null && name.length() > 1 && name.length() <100 && name.matches("[\\w]+") ){
			this.name=name;
		}
		else {
			System.err.println("Invalid Name: " +name);
		}
	}
	
	
	public void eat(){
		System.out.println(name +" eating");
		
	}
	
	
	
	public void move(){
		System.out.println("moving");
	}
	
	
	public String getName(){
		return name;
	}

}
