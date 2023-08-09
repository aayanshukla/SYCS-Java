class Student {
	// Method 1
	public void StudentId(String name, int roll_no)
	{
		System.out.println("Name :" + name + " "
						+ "Roll-No :" + roll_no);
	}

	// Method 2
	public void StudentId(int roll_no, String name)
	{
		// Again printing name and id of person
		System.out.println("Roll-No :" + roll_no + " "
						+ "Name :" + name);
	}
}

// Class 2
// Main class
class Practical1ab {
	// Main function
	public static void main(String[] args)
	{
		// Creating object of above class
		Student obj = new Student();

		// Passing name and id
		// Note: Reversing order
		obj.StudentId("Aayan", 58);
		obj.StudentId(31, "Akshat");
	}
}
