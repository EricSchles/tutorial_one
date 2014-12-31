/*
How to run:

javac lesson_two.java
java lesson_two

Explanation:

So this code is a bit more complex.  Here we've added our three function definitions: println, print, and PrintSameEveryTime.

so let's understand what's happening here:

A function in programming is a little different from a function in mathematics.  Unless of course you are talking about functional programming.
First of all, functions need not return anything.  Secondly, functions need not take in any input

*/
class lesson_two{

	public static void println(String input){
		System.out.println(input);
	}

	public static void print(String input){
		println(input);
	}

	public static void PrintSameEveryTime(){
		print("This will always print this line, and nothing else");
	}
	public static void main(String[] args){
		println("Your first function");
		println("Isn't that nice?");
		println("");
		print("We can even wrap our wrapped function");
		PrintSameEveryTime();
	}
}