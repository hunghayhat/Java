package a_Kien;

public class Dog {
	private String name;
	public String breed;
	private int age;
	
	public Dog (String name, int age) {
		this.name = name;
		this.breed = "Phung san Gae";
		this.age = age;
	}
	public Dog (String name, String breed, int age) {
		this.name = name;
		this.breed = breed;
		this.age = age;
	}
	
	public String toString() {
		return "(Ten goi) " + name + ", (Loai) " + breed + ", (Tuoi) " + age + " tuoi";

	}
	
	public void barking() {
		System.out.println("Gau gau =))))");
	}
	
	public static void main(String[] args) {
		Dog dog1 = new Dog("Dang yeu", "Yorkshire Terrier", 5);
		System.out.println("Ten, loai, tuoi cua cho: "+ dog1.toString());
		dog1.barking();
		
		Dog dog2 = new Dog("Happy", "Maltese", 3);
		System.out.println("Ten, loai, tuoi cua cho: "+ dog2.toString());
		dog2.barking();
	}
}
