
public class Main {
	public static void main(String[] args) {

		HokeyTeam halyckiLevy = new HokeyTeam();

		halyckiLevy.setName("Valentyn");
		halyckiLevy.setSurname("Karas");
		halyckiLevy.setTeamName("Halycki Levy");
		halyckiLevy.setNumberOfMember(13);
		halyckiLevy.setMembers(11);

		System.out.println(halyckiLevy.toString());
		halyckiLevy.printStaticSum();
		halyckiLevy.printSum();


		HokeyTeam harkivci = new HokeyTeam("Lova", "Tonyshev", "Harkivci", 12);

		System.out.println(harkivci.toString());
		harkivci.printStaticSum();
		harkivci.printSum();


		HokeyTeam lovehokey = new HokeyTeam("Tom", "Tonystar", "Lovehokey", 14, 15, 15);

		System.out.println(lovehokey.toString());
		lovehokey.printStaticSum();
		lovehokey.printSum();

	}
}
