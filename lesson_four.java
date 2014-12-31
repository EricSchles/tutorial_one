class lesson_four{
	public static void main(String[] args){
		other_class_two ref = new other_class_two("Hello there",42);

		other_class_two.print(ref.get_input());
		System.out.println(ref.get_age());

		ref.set_input("Well this is different");
		ref.set_age(14);
		other_class_two.print(ref.get_input());
		System.out.println(ref.get_age());


	}
}