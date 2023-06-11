package hw2_0.students;

import hw2_0.students.Hogwarts;

public class Slytherin extends Hogwarts {
    private Integer cunning;
    private Integer determination;
    private Integer ambition;
    private Integer resourcefulness;
    private Integer thirstForPower;

    public Slytherin(String name, Integer power, Integer transgression, Integer cunning, Integer determination, Integer ambition, Integer resourcefulness, Integer thirstForPower) {
        super(name, power, transgression);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.thirstForPower = thirstForPower;
    }

    public Integer getCunning() {
        return cunning;
    }

    public void setCunning(Integer cunning) {
        this.cunning = cunning;
    }

    public Integer getDetermination() {
        return determination;
    }

    public void setDetermination(Integer determination) {
        this.determination = determination;
    }

    public Integer getAmbition() {
        return ambition;
    }

    public void setAmbition(Integer ambition) {
        this.ambition = ambition;
    }

    public Integer getResourcefulness() {
        return resourcefulness;
    }

    public void setResourcefulness(Integer resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public Integer getThirstForPower() {
        return thirstForPower;
    }

    public void setThirstForPower(Integer thirstForPower) {
        this.thirstForPower = thirstForPower;
    }

    @Override
    public String toString() {
        return "Slytherin{" +
                "name="+ getName()+
                ", power" + getPower()+
                ", transgression"+ getTransgression()+
                ", cunning=" + cunning +
                ", determination=" + determination +
                ", ambition=" + ambition +
                ", resourcefulness=" + resourcefulness +
                ", thirstForPower=" + thirstForPower +
                '}';
    }
}
