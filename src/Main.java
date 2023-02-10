import Exercice1.Student;
import Exercice2.Player;

/*
*
*@author SORO
*
*/

public class Main {
    public static void main(String[] args) {

        //Exercice1
        Student student1 = new Student();
        student1.setStdId(12345);
        student1.setStdName("Kiran");
        student1.setStdRollNo(4);
        System.out.println("Id: " + student1.getStdId());
        System.out.println("Name: " + student1.getStdName());
        System.out.println("Roll No.: " + student1.getStdRollNo());


        //Exercice2
        Player player1 = new Player("Sachin", 10, "Cricket");
        System.out.println("Name: " + player1.getNamePlayer());
        System.out.println("Age: " + player1.getAgePlayer());
        System.out.println("Game Type: " + player1.getGameType());
    }
}
