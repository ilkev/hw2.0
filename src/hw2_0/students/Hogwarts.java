package hw2_0.students;

public abstract class Hogwarts {

    private String name;
    private Integer power;
    private Integer transgression;

    public Hogwarts(String name, Integer power, Integer transgression) {
        this.name = name;
        this.power = power;
        this.transgression = transgression;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPower() {
        return power;
    }

    public void setPower(Integer power) {
        this.power = power;
    }

    public Integer getTransgression() {
        return transgression;
    }

    public void setTransgression(Integer transgression) {
        this.transgression = transgression;
    }


    @Override
    public String toString() {
        return "Hogwarts{" +
                "name=" + name +
                ", power=" + power +
                ", transgression=" + transgression +
                '}';
    }
}