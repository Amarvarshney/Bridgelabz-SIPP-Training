import java.util.*;
class maximumhandshake{

        public static int calculateHandshakes(int n){
            return (n * (n - 1)) / 2;
        }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter number of students: ");
            int numberOfStudents = sc.nextInt();

            int handshakes = calculateHandshakes(numberOfStudents);
            System.out.println("Maximum number of handshakes: " + handshakes);
        }
}