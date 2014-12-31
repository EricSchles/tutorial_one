/*
How to run:
javac lesson_four.java other_class_two.java
java lesson_four

Explanation:

So here we'll look at a few more things:

1) passing in values to a class,
2) updating values in an instiated class
3) what does instiation really mean? (to some degree)
4) a reference to the next lesson on templated types. - this explains why we can't use our print function for ref.get_age();


1)
So, here we see that instiation is just a way to initialize our class with specific values.  See the use of ref and ref_two.  
They do the same thing, but act on different variables.  That's the power of instiating different initial values for a class.
This opens the door to a whole new way of thinking about code, code as a template, or generalization and then specific values as it's parameters.

As we'll see in later lessons, it's possible to template much more than values, we can template functions, and classes allowing us extremely generalized code.
So why would anyone do such a thing?  It's so you have a structure to work in, and so you can write less code overall.  It does mean more upfront work, but 
it also means you get to be lazier in the future.  

2)
So - the next thing to look at is updating values in a class, for this we have to look at other_class_two.java so please head there for the explanation.

3) 
So what does it really mean to instiate a class?  Well it means taking a general template and applying it to a specific variable termed an object.
But what does that mean?  Well to understand that you'll need to understand how memory works in the computer.  This is a pretty challenging concept in
it of itself.  For now though you just need to get this - when you use the new keyword, you tell Java to give your program new memory for your program, when it's running.

In Java there are two stages of running a program - compile time and run time.

During compile time your program gets certain pieces of it created and turned into java byte code.
At run time anything "dynamic" will be allocated and turned into bytecode.  The term dynamic here is just used to refer to code that executes when the program is run.

When you execute a program in general you are running it. For those of you new to programming this is the same thing as "launching" the program.
You create the need for more memory at run time, to some degree for historical reasons, and to some degree for practical reasons.
Memory used to be in very high demand within your computer, because harddisks didn't have much space.  So you wouldn't want to ask your computer for more memory than was required.
This lead to the creation of dynamic objects.  That's why your computer runs a lot slower if you are running a lot of programs, they are all asking for way more memory and there is less of it to go around.
So your operating system has to wait for memory to become available.  In a sense, this problem will never go away because computers will almost certainly always have finite sized memory.  

Another important thing to understand is - RAM is the actual memory your computer has access to for running programs.  The storage disk can only be used for static files, like the compiled version of a Java program.
This is a big part of the reason developers always want more RAM, it means they can run more programs.  But RAM isn't cheap (in terms of dollars).  Having a few extra GB of memory could tack on $400 to the cost of your computer.

I should also say, in a sense this is very cheap considering how much that much more RAM used to cost.  But still it's a non-trivial amount of money for your average person.
Which is the reason most people still use languages like Java.  Because of the ability to use more memory at run time, your programs can be VERY VERY fast.  It also doesn't hurt that the Java Compiler is very very good
and has a ton of optimizations making it compile very efficient byte code.

4)
The last point isn't a major one, but it's important enough that it's worth mentioning:

Notice how we had to use System.out.println() for ref.get_input().  Why did we have to do that?  It's because we gave our function a class definition for a String type!
What if we wanted our print method to handle any type of object?  Well for that we'll need templates which we will see in the next lesson.
*/
class lesson_four{
	public static void main(String[] args){
		other_class_two ref = new other_class_two("Hello there",42);
		other_class_two ref_two = new other_class_two("Oh, this isn't the same",10000);

		other_class_two.print(ref.get_input());
		System.out.println(ref.get_age());

		ref.set_input("Well this is different");
		ref.set_age(14);
		other_class_two.print(ref.get_input());
		System.out.println(ref.get_age());

		other_class_two.print(ref_two.get_input());
		System.out.println(ref_two.get_age());

		ref_two.set_input("Well this is different - as well");
		ref_two.set_age(14);
		other_class_two.print(ref_two.get_input());
		System.out.println(ref_two.get_age());

	}
}