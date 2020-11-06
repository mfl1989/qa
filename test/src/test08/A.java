package test08;

public class A {
	private int age;

	public int getage( ) {
		return age;

	}
	public void setage(int age) {
		if(age>=32) {
			this.age=24;
		}else {
			this.age=age;
		}
	}

}
