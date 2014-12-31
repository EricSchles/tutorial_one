class other_class_two{
	
	String input;
	int age;

	public other_class_two(String input, int age){
		this.input = input;
		this.age = age;
	}

	public String get_input(){
		return this.input;
	}

	public int get_age(){
		return this.age;
	}

	public void set_input(String input){
		this.input = input;
	}

	public void set_age(int age){
		this.age = age;
	}

	public static void print(String input){
		System.out.println(input);
	}
}