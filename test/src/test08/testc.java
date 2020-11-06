package test08;

public class testc {

	public static void main(String[]args) {

		B s1=new B();
		s1.setName("nana");
		s1.setAge(21);
		s1.setSex("nv");
		System.out.println(s1.getName()+"---"+s1.getAge()+"---"+s1.getSex());
		B s2=new B(12,"kaka","2333d");
		System.out.println(s2.getName()+"---"+s2.getAge()+"---"+s2.getSex());


	}

}
