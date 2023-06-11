package hw2_0;

import hw2_0.students.*;

public class HogwartsComparison {
    public static void compareGriffindorStudents(Griffindor firstStudent, Griffindor secondStudent) {
        int firstSum = firstStudent.getBravery() + firstStudent.getHonor() + firstStudent.getNobility();
        int secondSum = secondStudent.getBravery() + secondStudent.getHonor() + secondStudent.getNobility();

        if (firstSum > secondSum) {
            System.out.println(firstStudent.getName() + " лучший Гриффиндорец чем " + secondStudent.getName());
        } else if (firstSum < secondSum) {
            System.out.println(secondStudent.getName() + " лучший Гриффиндорец чем " + firstStudent.getName());
        } else {
            System.out.println("Студенты равны");
        }
    }


    public static void compareHufflepuffStudents(Hufflepuff firstStudent, Hufflepuff secondStudent) {
        int firstSum = firstStudent.getHonesty() + firstStudent.getLoyalty() + firstStudent.getIndustriousness();
        int secondSum = secondStudent.getHonesty() + secondStudent.getLoyalty() + secondStudent.getIndustriousness();
        if (firstSum > secondSum) {
            System.out.println(firstStudent.getName() + " лучший Пуффендуец чем " + secondStudent.getName());
        } else if (firstSum < secondSum) {
            System.out.println(secondStudent.getName() + " лучший Пуффендуец чем " + firstStudent.getName());
        } else {
            System.out.println("Студенты равны");
        }
    }



    public static void compareSlytherinStudents(Slytherin firstStudent, Slytherin secondStudent) {
        int firstSum = firstStudent.getAmbition() + firstStudent.getCunning() + firstStudent.getDetermination() + firstStudent.getResourcefulness() + firstStudent.getThirstForPower();
        int secondSum = secondStudent.getAmbition() + secondStudent.getCunning() + secondStudent.getDetermination() + secondStudent.getResourcefulness() + secondStudent.getThirstForPower();
        if (firstSum > secondSum) {
            System.out.println(firstStudent.getName() + " лучший студент Слизерина чем " + secondStudent.getName());
        } else if (firstSum < secondSum) {
            System.out.println(secondStudent.getName() + " лучший студент Слизерина чем " + firstStudent.getName());
        } else {
            System.out.println("Студенты равны");
        }
    }


    public static void compareRavenclawStudents(Ravenclaw firstStudent, Ravenclaw secondStudent) {
        int firstSum = firstStudent.getCreativity() + firstStudent.getSmart() + firstStudent.getWit() + firstStudent.getWisdom();
        int secondSum = secondStudent.getCreativity() + secondStudent.getSmart() + secondStudent.getWit() + secondStudent.getWisdom();
        if (firstSum > secondSum) {
            System.out.println(firstStudent.getName() + " лучший студент Коктеврана чем " + secondStudent.getName());
        } else if (firstSum < secondSum) {
            System.out.println(secondStudent.getName() + " лучший студент Коктеврана чем " + firstStudent.getName());
        } else {
            System.out.println("Студенты равны");
        }
    }

    public static void compareHogwartsStudents(Hogwarts firstStudent, Hogwarts secondStudent) {
        if (firstStudent.getPower() > secondStudent.getPower()) {
            System.out.println(firstStudent.getName() + " сильнее, чем " + secondStudent.getName());
        } else if (secondStudent.getPower() > firstStudent.getPower()) {
            System.out.println(secondStudent.getName() + " сильнее, чем " + firstStudent.getName());
        } else {
            System.out.println(firstStudent.getName() + " равен по силе " + secondStudent.getName());
        }


        if (firstStudent.getTransgression() > secondStudent.getTransgression()) {
            System.out.println(firstStudent.getName() + " обладает большим расстоянием трансгрессии, чем " + secondStudent.getName());
        } else if (secondStudent.getPower() > firstStudent.getPower()) {
            System.out.println(secondStudent.getName() + " обладает большим расстоянием трансгрессии, чем " + firstStudent.getName());
        } else {
            System.out.println(firstStudent.getName() + " обладает таким же расстоянием трасгрессии, как и " + secondStudent.getName());
        }
    }

}
