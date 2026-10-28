package ss4_class_opject.project;

public class StudentManager {
    public Student[] studentsList= new Student[100];
    public void showList(){
        for(int i=0;i<studentsList.length;i++){
            if(studentsList[i]!=null){
                System.out.println(studentsList[i].getInfo());
            }else{
                break;
            }
        }
    }
    public void add(Student student){
        for (int i = 0; i < studentsList.length; i++) {
            if(studentsList[i]==null){
                studentsList[i]=student;
                break;
            }
        }
    }
}
