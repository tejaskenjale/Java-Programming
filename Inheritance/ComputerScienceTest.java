package Assignment1;

//import Assignment1.ComputerScience;

public class ComputerScienceTest {

    public static void main(String args[]) {

        ComputerScience c1 = new ComputerScience("CS-602", "Java Programming", "Spring20", 3);
        ComputerScience c2 = new ComputerScience("CS-644", "Intro to Big Data", "Fall21", 3);
        ComputerScience c3 = new ComputerScience("CS-610", "Data Structures & Algo", "Spring22", 3);

        System.out.println("--------------------COURSES OFFERED AT NJIT COMPUTER SCIENCE DEPARTMENT -------------------------------------------------");
        System.out.println("");
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println("-------------------------------------------------------------------------------------------------------------------------");
        System.out.println(c1.getCourse_ID());
        c1.setCourse_ID("CS-630"); //calling setter method
        System.out.println(c1.getCourse_ID());
        System.out.println(c1.toString());//calling toString method
    }
}

