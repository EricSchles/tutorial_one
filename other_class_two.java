/*

2) explanation of updating values in a class.

Here we have two methods for updating values in a class.  But before we get there, you should understand the use of the this
keyword.

this.[variable] is used as a place holder, where the this gets replaced with the name of the class instance at run time.
This is the simplest example of generalizing code.

So for example below:

this.input becomes ref.input assuming you have the class instiation, other_class_two ref = new other_class_two([string goes here], [number goes here]).

There is a this construct in a sense for functions.  Anything not declared as static will be associated with a specific instiated class.

So, get_input will become ref.get_input() for the class instiation other_class_two ref = new other_class_two([string goes here], [number goes here]).


*/
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