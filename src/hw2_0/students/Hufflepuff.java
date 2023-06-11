package hw2_0.students;

import hw2_0.students.Hogwarts;

public class Hufflepuff extends Hogwarts {
    private Integer industriousness;
    private Integer loyalty;
    private Integer honesty;

    public Hufflepuff(String name, Integer power, Integer transgression, Integer industriousness, Integer loyalty, Integer honesty) {
        super(name, power, transgression);
        this.industriousness = industriousness;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public Integer getIndustriousness() {
        return industriousness;
    }

    public void setIndustriousness(Integer industriousness) {
        this.industriousness = industriousness;
    }

    public Integer getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(Integer loyalty) {
        this.loyalty = loyalty;
    }

    public Integer getHonesty() {
        return honesty;
    }

    public void setHonesty(Integer honesty) {
        this.honesty = honesty;
    }

    @Override
    public String toString() {
        return "Hufflepuff{" +
                "name="+ getName()+
                ", power" + getPower()+
                ", transgression"+ getTransgression()+
                ", industriousness=" + industriousness +
                ", loyalty=" + loyalty +
                ", honesty=" + honesty +
                '}';
    }
}
