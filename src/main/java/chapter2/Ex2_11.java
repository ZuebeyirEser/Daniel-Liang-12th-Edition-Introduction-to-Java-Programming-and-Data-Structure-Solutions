import java.util.Scanner;

public class Ex2_11 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("please enter the year: ");
        
        double year = input.nextLong();

        double CurrentPopulationUSA = 312032486;
        double oneyearinseconds = 60*60*24*365;
        double newbornperyear = oneyearinseconds/7;
        double deadperyear = oneyearinseconds/13;
        double immigrantperyear = oneyearinseconds/45;


        double newpopulation = CurrentPopulationUSA + (newbornperyear-deadperyear+immigrantperyear)*year;
        
        System.out.println("Year " + year + " population is :" + newpopulation);
    }
    
}
