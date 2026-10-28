package ss4_class_opject.project;

public class Student {
    private int id;
    private String name;
    private String address;

    public Student() {
    }

    public Student(int id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String Address) {
        this.address = address;
    }

    public String getInfo() {
        return "id" + this.id + "name" + this.name + "address0" + this.address;
    }
}
