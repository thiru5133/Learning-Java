package sep15;

public class VariablesDemo {
	public int age = 23;
	public  double weight = 75.2;
	public String name ="thiru";
	public char lastName = 'v';
	
	public static void main(String[] arg) {
		VariablesDemo objRef = new VariablesDemo();
		objRef.bioDetails();
	}

    public void bioDetails() {
        System.out.println("Bio Details:");
        System.out.println("Name: " + name + " " + lastName);
        System.out.println("Age: " + age);
        System.out.println("Weight: " + weight);
    }
}
