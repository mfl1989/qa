package test07;

public class Pet {

	String name;
	int age;

	@Override
	public String toString() {
		return "Pet [name=" + name + ", age=" + age + "]";
	}

	public Pet() {
		super();
	}

	public void cat(String name, int age) {
		this.name = name;

		this.age = age;

	}

	public void dog(String name, int age) {
		this.name = name;
		this.age = age;
	}

}
