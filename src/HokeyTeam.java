
public class HokeyTeam {

    private String name;
    private String surname;
    private String teamName;
    private int numberOfmember;
    private int Members;
    public static int totalMembers;

    public HokeyTeam() {
    }

    public HokeyTeam(String name, String surname, String teamName, int numberOfmember) {
        this.name = name;
        this.surname = surname;
        this.teamName = teamName;
        this.numberOfmember = numberOfmember;
    }

    public HokeyTeam(String name, String surname, String teamName, int numberOfmember, int Members, int totalMembers) {

        this.name = name;
        this.surname = surname;
        this.teamName = teamName;
        this.numberOfmember = numberOfmember;
        this.Members = Members;
        this.totalMembers = totalMembers;

    }


    public void setName(String name) {
        this.name = name;
    }


    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public void setNumberOfMember(int numberOfmember) {
        this.numberOfmember = numberOfmember;
    }


    public void setMembers(int Members) {
        this.Members = Members;
    }


    public String toString() {
        return "name:" + name + "\n"
                + "surname:" + surname + "\n"
                + "teamName:" + teamName + "\n"
                + "numberOfmember:" + numberOfmember + "\n"
                + "Members:" + Members + "\n"
                + "totalMembers" + totalMembers + "\n";
    }

    public static void printStaticSum() {
        System.out.println("totalMembers:" + totalMembers + "\n");
    }

    public static void printSum() {
        System.out.println("totalMembers: " + totalMembers + "\n");
    }

    public void resetValues(String name, String surname, String teamName, int numberOfmember, int Members, int totalMembers) {

        this.name = name;
        this.surname = surname;
        this.teamName = teamName;
        this.numberOfmember = numberOfmember;
        this.Members = Members;
        this.totalMembers = totalMembers;
    }

}
