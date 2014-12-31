/*
How to run:

javac lesson_two.java
java lesson_two

Explanation:

So this code is a bit more complex.  Here we've added our three function definitions: println, print, and PrintSameEveryTime.

so let's understand what's happening here:

A function in programming is a little different from a function in mathematics.  Unless of course you are talking about functional programming.
First of all, functions need not return anything.  Secondly, functions need not take in any input just like PrintSameEveryTime doesn't.

So these functions are all pretty basic, they take in a String named input, and then print that String to the screen.

Notice that each function has curly braces to determine the scope of the function.

Definition: scope := A self contained piece of code that only executes in at a specific time.  

In java scope is specified by curly braces.  So if you want to tell Java what statements to execute inside of a function, you create a 
function definition and then you simply, put the code you want executed inside the curly braces.  

This concept isn't particularly deep, at least right now, but it's important to understand since its where many of the errors in programming stem from. 

So really in programming, a function is just a way of separating scopes for different pieces of code.  Which is very important.

Now that we understand scope (hopefully), let's go back to our main function.

The way that Java determines what to be executed is by looking at the main function's scope within the class's scope.  


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