class semifinal{
	String name, nationality, club, strength;
	int age;

	public static void main(String [] args){

		semifinal Diego = new semifinal();
		semifinal Pep = new semifinal();

		Diego.name = "Diego Simeon";
		Diego.nationality = "Argentina";
		Diego.club = "Ateltico Madrid";
		Diego.strength = "Defence";
		Diego.age = 45;

		Pep.name = "Josep Guardiola";
		Pep.nationality = "Spain";
	    Pep.club = "Bayern Munich";
		Pep.strength = "Passing";
		Pep.age = 45;

		System.out.println("The Manager's name is "+Diego.name);
		System.out.println("The Manager's nationality is "+Diego.nationality);
		System.out.println("The Manager's club is "+Diego.club);
		System.out.println("The Manager's Strength is "+Diego.strength);
		System.out.println("The Manager's age is "+Diego.age);

		System.out.println("\n");


		System.out.println("Vs \n");

		System.out.println("The Manager's name is "+Pep.name);
		System.out.println("The Manager's nationality is "+Pep.nationality);
		System.out.println("The Manager's club is "+Pep.club);
		System.out.println("The Manager's Srength is "+Pep.strength);
		System.out.println("The Manager's age is "+Pep.age);
	}
}






