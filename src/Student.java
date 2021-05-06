
public class Student extends User{
 
    private String lesson;


    public String getLesson() {
        return lesson;
    }

    public void setLesson(String lesson) {
        this.lesson = lesson;
    }
    public Student(){
   super(); 
}

public Student(int id, String firstName, String lastName, String eMail, String password, String lesson){
this.id=id;
this.firstName=firstName;
this.lastName=lastName;
this.eMail=eMail;
this.password=password;
   this.lesson=lesson;
      
}
}

