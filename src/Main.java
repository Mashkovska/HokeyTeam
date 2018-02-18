
public class Main {
	public static void main(String [] args) {
		
		 HokeyTeam HalyckiLevy = new HokeyTeam();
		 
		 HalyckiLevy.setName("Valentyn");
		 HalyckiLevy.setSurname("Karas");
		 HalyckiLevy.setTeamName("Halycki Levy");
		 HalyckiLevy.setNumberOfMember(13);
		 HalyckiLevy.setMembers(11);
		 
		 System.out.println(HalyckiLevy.toString());
		 HalyckiLevy.printStaticSum();
		 HalyckiLevy.printSum();
		 
	 
		 HokeyTeam Harkivci = new HokeyTeam ("Lova","Tonyshev","Harkivci",12);
		 
		 System.out.println(Harkivci.toString());
		 HalyckiLevy.printStaticSum();
		 HalyckiLevy.printSum();
		 
		 
		 HokeyTeam Lovehokey = new HokeyTeam ("Tom","Tonystar","Lovehokey",14, 15,15);
		 
		 System.out.println(Lovehokey.toString());
		 HalyckiLevy.printStaticSum();
		 HalyckiLevy.printSum();
		 
	}
}
