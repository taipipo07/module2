package ss8_java_collection_framework.mvc.entity;

public abstract class Person {
    private double id;
    private String name;

    public Person() {
    }

    public Person(double id, String name) {
        this.id = id;
        this.name = name;
    }

    public double getId() {
        return id;
    }

    public void setId(double id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Name: "+this.name+"-Id: "+this.id;
    }
}
