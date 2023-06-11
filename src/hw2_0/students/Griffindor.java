package hw2_0.students;

public class Griffindor extends Hogwarts {
    private Integer nobility;
    private Integer honor;
    private Integer bravery;


    public Griffindor(String name, Integer power, Integer transgression, Integer nobility, Integer honor, Integer bravery) {
        super(name, power, transgression);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public Integer getNobility() {
        return nobility;
    }

    public void setNobility(Integer nobility) {
        this.nobility = nobility;
    }

    public Integer getHonor() {
        return honor;
    }

    public void setHonor(Integer honor) {
        this.honor = honor;
    }

    public Integer getBravery() {
        return bravery;
    }

    public void setBravery(Integer bravery) {
        this.bravery = bravery;
    }

    @Override
    public String toString() {
        return "Griffindor{" +
                "name="+ getName()+
                ", power" + getPower()+
                ", transgression"+ getTransgression()+
                "nobility=" + nobility +
                ", honor=" + honor +
                ", bravery=" + bravery +
                '}';
    }
}
