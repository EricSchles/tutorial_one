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

This explains much of how java works. Every line ends with a semicolon, and function calls require paranthesis.  Also notice the use of '.'
Specifically in System.out.println.  Theses dots are used to denote class methods.  Specifically we are in the System package of java, in the out class and calling the println method.

We could wrap the println method as well.  (Something will get into in the next lesson).

If all of this is over your head, don't worry!  We'll get into all of it.  

The last thing to explain is the "class lesson_one{" line and the "public static void main(String[] args){" line.

  
*/
class lesson_one {
	public static void main(String[] args){
		System.out.println("Welcome to java");
	}

}