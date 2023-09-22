import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        //(This task uses Strings:) A program that prompts the user for their party affiliation
        //(Democrat, Republican, or Independent) and responds accordingly with a Donkey,
        //Elephant, Person, or Other. (i.e. “You get a Democratic Donkey.”) Notes: create a menu
        //so the user chooses D, R, or I and assume that any other choice will be Other. Tests: just
        //the four options D, R, I, Other. Use as cascaded if structure not separate if statements

        //string politcalParty = " "
        //
        //		Output "Enter your political party [D R I]: "
        //		Input politicalParty
        //
        //		If politcalParty == "D" then
        //			Output "You get a Democratic Donkey!"
        //		else if politcalParty == "R" then
        //			Output "You get a Republican Elephant!"
        //		else if politcalParty == "I" then
        //			Output "You get an Independent Man!"
        //		else
        //			Output "We could not find your party."

        String politcalParty = ""; //[D R I]
        Scanner in = new Scanner(System.in);

        System.out.println("Enter your political party [D R I]: ");
        if (in.hasNextLine()){
            politcalParty = in.nextLine();
            in.nextLine();
            if (politcalParty.equals("D")) {
                System.out.println("You get a Democratic Donkey!");
            } else if (politcalParty.equals("R")) {
                System.out.println("You get a Republican Elephant!");
            }else if (politcalParty.equals("I")) {
                System.out.println("You get an Independent Man!");
            }else{
                System.out.println("We could not find your party.");
            }
        }
    }
}