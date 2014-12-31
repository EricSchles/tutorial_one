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
		other_class_three.print(ref.get_input());
		other_class_three.print(ref_two.get_input());

		other_class_three.set_input("Hello, this is different....");	
		other_class_three.print(ref.get_input());
		other_class_three.print(ref_two.get_input());

	}
}