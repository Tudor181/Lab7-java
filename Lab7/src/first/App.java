package first;

import university.Student;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        CandyBox candyBox = new CandyBox("vanilla", "Irak");
        System.out.println(candyBox.toString());
        CandyBox baravelli = new Baravelli(10, 20, "strawberry", "India");
        System.out.println(baravelli.toString());
        Object candyBoxFake = candyBox;
        System.out.println("equals" + candyBox.equals(candyBoxFake));

        Student student = new Student("Capota", "Serban", "123456");
        student.adaugareDisc("Alg", "Cristi", 7);
        student.adaugareDisc("Mate", "Matei", 8);
        student.adaugareDisc("Romana", "Miai", 10);

        System.out.println(student.toString());
        System.out.println("medie: " + student.calculMedie());
    }
}
