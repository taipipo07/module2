package ss8_java_collection_framework.mvc.entity;

public class Student extends Person{
    private String className;

    public Student() {
    }

    public Student(String className) {
        this.className = className;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    @Override
    public String toString() {
        return super.toString()+"-ClassName: "+this.className;
    }
}
