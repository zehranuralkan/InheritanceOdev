
public class User {
    int id;
    String firstName;
    String lastName;
    String eMail;
    String password;

   
    public void setId(int id) {
        this.id = id;
    }
    
    public int getId(){
        return id;
    }
   
    public String getFirstName() {
        return firstName;
    }

    
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

  
    public String getLastName() {
        return lastName;
    }

    
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    
    public String geteMail() {
        return eMail;
    }

   
    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

   
    public String getPassword() {
        return password;
    }

    
    public void setPassword(String password) {
        this.password = password;
    }
}
