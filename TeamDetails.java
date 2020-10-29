class TeamDetails
{
String name;
String place;
String college;
String hobbies;
String groupname;
void information()
{
System.out.println("name:"+ " "+name);
System.out.println(" place:"+" "+place);
System.out.println("college:"+" "+college);
System.out.println("hobbies:"+ " "+hobbies);
System.out.println("groupname:"+ " "+groupname);
}
}
class TeamMemberDetails
{
public static void main(String args [])
{
Details chandru = new Details();
chandru.name = "chandru";
chandru.place = "gokak";
chandru.college = "bgmit";
chandru.hobbies = "story writer";
chandru.groupname = "teamupgrade";
chandru.information();

Details anusha = new Details();
anusha.name = "anusha";
anusha.place = "tarikeri";
anusha.college ="ait";
anusha.hobbies = "watching mythological stories";
anusha.groupname = "teamupgrade";
anusha.information();

Details arpitha = new Details();
arpitha.name = "arpitha";
arpitha.place ="antharagatte";
arpitha.college ="ait";
arpitha.hobbies = "listening music";
arpitha.groupname = "teamupgrade";
arpitha.information();

Details babitha = new Details();
babitha.name = "babitha";
babitha.place = "arasikeri";
babitha.college = "ait";
babitha.hobbies = "singing";
babitha.groupname= "teamupgrade";
babitha.information();

Details naheeda = new Details();
naheeda.name = "naheeda";
naheeda.place = "jamkhandi";
naheeda.college = "bgmit";
naheeda.hobbies = "watching cricket";
naheeda.groupname = "teamupgrade";
naheeda.information();
}
}