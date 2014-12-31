/*

How to run:

javac -Xlint lesson_five.java other_class_three.java
java lesson_five

Explanation:

There is a lot less to explain here.  The biggest point to understand is:

	other_class_three.set_input("Hello there");	
	other_class_three.print(ref.get_input()); //prints Hello there
	other_class_three.print(ref_two.get_input()); //prints Hello there

	other_class_three.set_input("Hello, this is different....");	
	other_class_three.print(ref.get_input()); //prints Hello, this is different....
	other_class_three.print(ref_two.get_input()); //print Hello, this is different....

Notice the use of static method and how this is reflected in the individual instances of the other_class_three.  
As we update the variable through the static method, the value is updated in each class.  This shows some more power for instiation.

The only other point worth mentioning here is in the other_class_three.java file.  PLease head there for an explanation of generics.

*/
class lesson_five{
	public static void main(String[] args){
		other_class_three ref = new other_class_three("First thing","Second thing");		
		other_class_three ref_two = new other_class_three("Third thing","Fourth thing");
		other_class_three.print(ref.get_user_input());
		other_class_three.print(ref.get_generic());

		ref.set_user_input("new thing");
		ref.set_generic(5);
		
		other_class_three.print(ref.get_user_input());
		other_class_three.print(ref.get_generic());

		other_class_three.set_input("Hello there");	
		other_class_three.print(ref.get_input()); //prints Hello there
		other_class_three.print(ref_two.get_input()); //prints Hello there

		other_class_three.set_input("Hello, this is different....");	
		other_class_three.print(ref.get_input()); //prints Hello, this is different....
		other_class_three.print(ref_two.get_input()); //prints Hello, this is different....

	}
}