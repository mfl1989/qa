package test08;

public class Child extends Parent {
	// 親クラスの強制的にOverrideする意味（アノテーション）
	public void hello() {
		System.out.println("child method");
	}

}
