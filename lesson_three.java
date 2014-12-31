/*
how to run:

javac lesson_three.java other_class.java
java lesson_three

Explanation:

Now that we understand scope, let's look into some keywords used with functions.  Specifically:

1) public
2) static
3) void
4) new

public:
So public is pretty much the easist.  It goes in front of functions or variables and indicates the scope at which the function or variable can be used.
public means it can be used across multiple files in a given java project - called a package.  

There are other distincts in that vein: private and protected.

protected can be used within the project but cannot be called in other packages.

private can be used within a class only.  The rest of the project doesn't have access to that method or variable. 

static and new:
The static keyword has to do with the use of new.  The new keyword is used to refer to a newly created object.  The way you create an object is as below:

[class_name] [class instance name] = new [class_name]([any parameters that get passed into the class]);

So this means that classes can act like functions, taking in variables and using them.  Except!  You can reference an instance of a class, 
as often as you want, instead of just at call time, so you sort have the ability to store variables after processing.  I'll get into this more
in the next exercise.  For now all you really need to understand is that this is how you instiate a class to be used.

If I didn't want to instiate the class and still wanted to use one of it's methods, the method would have to be declared is static.

If you look back at lesson_two, that's how we did things there (in case you were looking for an example).

void:
The void keyword is used to tell Java that the function doesn't return anything.  You can sort of think of this as a place holder.
It could also be the case that our function returns a type, something we'll get into soon! 
*/
class lesson_three{
	public static void main(String[] args){
		other_class ref = new other_class();
		ref.print("Hello");
	}
}