package fd;


//import java.lang.*;
public class person{
	private String name;
	private int birthDayYear;
	person(String giveName, int yearOfBirth)
	{
		name = giveName;
		birthDayYear = yearOfBirth;
	}
	public void changeName(String name)
	{
		this.name = name;
	}
	public int getAgeInYears(int currentYear)
	{
		int age;
		age = currentYear - birthDayYear;
		return age;
	}
	public String getName()
	{
		return name;
	}




//import java.lang.*;
	public static void main(String args[])
	{
		person p1 = new person("paul", 2000);
		System.out.println("Current Age: "+p1.getAgeInYears(2020));
		System.out.println("name: "+p1.getName());
		p1.changeName("Snigdho"); // To change the name
		System.out.println("name: "+p1.getName());

	}
}