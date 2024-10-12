
public class Test {
	
	public static void main(String []args) {
		
		//コンストラクタ1
		Person taro = new Person();
		taro.name = "taro";
		taro.age = 18;
		System.out.println(taro.name);
		System.out.println(taro.age);
		
		//コンストラクタ2
		Person jiro = new Person("jiro", 20);
		System.out.println(jiro.name);
		System.out.println(jiro.age);
		
		//コンストラクタ3
		Person saburo = new Person("saburo");
		System.out.println(saburo.name);
		System.out.println(saburo.age);
		
		//コンストラクタ4
		new Person(25);
		System.out.println("名前なし");
		System.out.println(25);
		
		//コンストラクタ5
		Person hanako = new Person(17,"hanako");
		System.out.println(hanako.age);
		System.out.println(hanako.name);
	}

}
