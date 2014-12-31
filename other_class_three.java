/*

So Generics are bit tricky.  They basically allow Java to inspect the value of a variable at run time and assign the appropriate type.
This means your programs don't need to be strongly typed.  

Def Stronly Typed variables := variables with a set type at run time and compile time. 

Example:

String t = "Hello";

t = 7; //throws an error

T t = "Hello"; - where T is a generic type
t = 7; //passes

That's all there is from an idea prospective, but it makes the syntax really annoying and funky.  But whatever, not my favorite part of
Java.

So how do you get generics in your code?

Take a look at the class definition:
class other_class_three<T,T1>

Anything in the <> will be treated as a generic throughout the Java program.  Here we create two, mostly to show you, you can.
T - is the only one we make use of.

For the most part Generics are used the same way as normal variables except in the following definition:

public static <T> void print(T to_print)

when you create a static method you need to pass in <T> as the generic type.  We could declare a new generic if we wanted to here.
I'm using T, since it's just easier than having to think of a new name, but I could have named it something else.

As an exercise change the method definition to:

public static <X> void print(X to_print)

and recompile the code (if you don't remember how to do this, please look at lesson_five.java)

The final point is the use of Xlint.  If we didn't use statics and generics we wouldn't need to add this flag.  Explaining why is beyond the scope
of these lessons, but it might be worth it to look it up yourself :)
*/
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