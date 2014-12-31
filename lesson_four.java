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