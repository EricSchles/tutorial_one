/*
How to run:

On Ubuntu:

sudo apt-get install openjdk-7-jdk

javac lesson_one.java
java lesson_one

Explanation:

The following is a first java program.  It explains all the necessary syntax to get started.  

So what's going on here?  Well we are starting with the typical first example for any programming language - the "hello world" example.
In this example you are taught how to print to the screen.

The only 'real' thing happening here is:

System.out.println("Welcome to java");

This explains much of how java works. Every line ends with a semicolon, and function calls require parentheses.  Also notice the use of '.'
Specifically in System.out.println.  Theses dots are used to denote class methods.  Specifically we are in the System package of java, in the out class and calling the println method.

We could wrap the println method as well.  (Something will get into in the next lesson).

If all of this is over your head, don't worry!  We'll get into all of it.  

The last thing to explain is the "class lesson_one{" line and the "public static void main(String[] args){" line.

Everything in Java is a class.  The reason for this is something you can't understand until you understand objects, and we aren't ready to explain that yet.  
So for now you'll just have to take it as a given.

The way you declare a class is with the following syntax:

class [class name] 

Aside: here and throughout, anything with brackets means a variable name that could be anything.

So [class name] means this is just a place holder but will be the name of the class.

The next line: "public static void main(String[] args)" really doesn't mean anything yet.  And it shouldn't.
All you need to know about this is anything within the public static void main(String[] args) function will be run by the Java compiler.
Anything not explicitly in this function will not be run, so if you want your code to actually need to be executed it needs to be "inside" this function definition.

So how do you put things inside a function?  With curly braces.  Don't worry if that doesn't make much sense, we'll get into it over the next few lessons.

As a final very important point: the class with the main function must be the same as the file name in Java.  However you can have many classes in a single file.
*/
class lesson_one {
	public static void main(String[] args){
		System.out.println("Welcome to java");
	}

}
