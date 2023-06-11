package hw2_0;

import hw2_0.students.Griffindor;
import hw2_0.students.Hogwarts;
import hw2_0.students.Slytherin;
import jdk.dynalink.linker.ConversionComparator;

public class Main {
    public static void main(String[] args) {
        Slytherin DracoMalfoy = new Slytherin(
                "Drako Malfoy",
                80,
                70,
                90,
                50,
                80,
                50,
                70
        );

        Griffindor HarryPotter = new Griffindor(
                "Harry Potter",
                85,
                80,
                90,
                90,
                90
        );

        Griffindor HermionaGranger = new Griffindor(
                "Hermione Granger",
                75,
                90,
                95,
                80,
                70
        );


        Griffindor RonWeasley = new Griffindor(
                "Ron Weasley",
                85,
                80,
                90,
                90,
                90
        );

        HogwartsComparison.compareGriffindorStudents(HarryPotter, RonWeasley);
        HogwartsComparison.compareGriffindorStudents(HermionaGranger, RonWeasley);
        HogwartsComparison.compareHogwartsStudents(HarryPotter, DracoMalfoy);
        HogwartsComparison.compareHogwartsStudents(HarryPotter, RonWeasley);


        System.out.println(HermionaGranger);
        System.out.println(HarryPotter);
        System.out.println(RonWeasley);
        System.out.println(DracoMalfoy);
    }
}