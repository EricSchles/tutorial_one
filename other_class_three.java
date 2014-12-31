class other_class_three<T,T1>{
	
	public static String input = "initially";
	String user_input;
	private T generic;

	public other_class_three(String input, T generic){
		this.user_input = input;
		this.generic = generic;
	}

	public static void set_input(String new_string){
		input = new_string;
	}

	public String get_input(){
		return this.input;
	}

	public void set_user_input(String input){
		this.user_input = input;
	}

	public static <T> void print(T to_print){
		System.out.println(to_print);
	}

	public void set_generic(T input){
		this.generic = input;
	}

	public T get_generic(){
		return this.generic;
	}
	public String get_user_input(){
		return this.user_input;
	}
}