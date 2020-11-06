package test08;

public class B {
	//属性
	private int age;
	private String name;
	private String sex;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		if("nan".equals(sex)|| "nv".equals(sex)) {
			this.sex=sex;
		}else {
		this.sex = "nan";
		}
	}
	public B() {

	}
	public B(int age,String name,String sex) {
		this.age=age;
		this.name=name;
		this.setSex(sex);
	}

}
