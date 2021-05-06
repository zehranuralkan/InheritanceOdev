
public class Instructor extends User{
    int id;
    private String coursesIntructorName;
   

    public String getCoursesIntructorName() {
        return coursesIntructorName;
    }

    
    public void setCoursesIntructorName(String coursesIntructorName) {
        this.coursesIntructorName = coursesIntructorName;
    }
    public Instructor(){
        super();
    }
    public Instructor(int id, String firstName, String lastName, String eMail, String password, String coursesIntructorName){
      this.id=id;
      this.password=password;
      this.eMail=eMail;
      this.firstName=firstName;
      this.lastName=lastName;
      this.coursesIntructorName=coursesIntructorName;
    }
}
