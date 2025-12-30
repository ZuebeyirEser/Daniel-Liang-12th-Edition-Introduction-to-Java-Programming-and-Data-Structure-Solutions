public class Ex10 {
    /*(Population projection) The U.S. Census Bureau projects population based on the
    following assumptions:
        ■ One birth every 7 seconds
        ■ One death every 13 seconds
        ■ One new immigrant every 45 seconds
    Write a program to display the population for each of the next five years. Assume
    the current population is 312,032,486 and one year has 365 days. Hint: In Java, if
    two integers perform division, the result is an integer. The fraction part is truncated.
    For example, 5 / 4 is 1 (not 1.25) and 10 / 4 is 2 (not 2.5) */
    public static void main(String[] args) {
        double CurrentPopulationUSA = 312032486;
        double oneyearinseconds = 60*60*24*365;
        double newbornperyear = oneyearinseconds/7;
        double deadperyear = oneyearinseconds/13;
        double immigrantperyear = oneyearinseconds/45;
        for(int i=1; i<=5; i++){
            double newpopulation = CurrentPopulationUSA + (newbornperyear-deadperyear+immigrantperyear)*i;
            System.out.println("Year " + i + " population is :" + newpopulation);
        }

    }
}
