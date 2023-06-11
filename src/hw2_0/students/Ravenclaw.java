package hw2_0.students;

import hw2_0.students.Hogwarts;

public class Ravenclaw extends Hogwarts {
    private Integer smart;
    private Integer wisdom;
    private Integer wit;
    private Integer creativity;

    public Ravenclaw(String name, Integer power, Integer transgression, Integer smart, Integer wisdom, Integer wit, Integer creativity) {
        super(name, power, transgression);
        this.smart = smart;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creativity = creativity;
    }

    public Integer getSmart() {
        return smart;
    }

    public void setSmart(Integer smart) {
        this.smart = smart;
    }

    public Integer getWisdom() {
        return wisdom;
    }

    public void setWisdom(Integer wisdom) {
        this.wisdom = wisdom;
    }

    public Integer getWit() {
        return wit;
    }

    public void setWit(Integer wit) {
        this.wit = wit;
    }

    public Integer getCreativity() {
        return creativity;
    }

    public void setCreativity(Integer creativity) {
        this.creativity = creativity;
    }

    @Override
    public String toString() {
        return "Ravenclaw{" +
                "name="+ getName()+
                ", power" + getPower()+
                ", transgression"+ getTransgression()+
                ", smart=" + smart +
                ", wisdom=" + wisdom +
                ", wit=" + wit +
                ", creativity=" + creativity +
                '}';
    }
}
