package PackageFirst;

class Parent {
	Parent() {
		System.out.println(this.hashCode());
	}
}

class Child extends Parent {
	Child(){
		System.out.println(this.hashCode());
	}
}

public class TestClass {

	public static void main(String[] args) {
		Child c = new Child();
		System.out.println(c.hashCode());
	}

}
