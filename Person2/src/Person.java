
public class Person {
	
	public String name = null;
	public int age = 0;
	
	//コンストラクタ1
	public Person() {}
	
	//コンストラクタ2
	public Person(String name,int age) {
		
		this.name = name;
		this.age = age;
	}
	
	//コンストラクタ3
	public Person(String name) {
		
		this.name = name;
		this.age = 0;
	}
	
	//コンストラクタ4
	public Person(int age) {
		
		this.name = "名前なし";
		this.age = age;
	}
	
	//コンストラクタ5
	public Person(int age, String name) {
		
		this.name = name;
		this.age = age;
	}

}
