
public class Main {
       public static void main(String[] args) {
           //instructor nesnesi
     Instructor instructor=new Instructor();
     instructor.setId(1);
     instructor.setFirstName("Engin");
     instructor.setLastName("Demiroğ");
     instructor.seteMail("engin@gmail.com");
     instructor.setPassword("123");
     instructor.setCoursesIntructorName("Java React");
     
     Instructor ınstructor2=new Instructor(2,"Ali","Demir","ali@gmail.com","123","Pyhton");
     InstructorManager ınstroductermanager=new InstructorManager();
     Instructor[] instructors={instructor,ınstructor2};
    for(Instructor Instructors : instructors ){
     System.out.println("Ders Adı:"+Instructors.getCoursesIntructorName());
         System.out.println("Eğitmen Adı soyadı:"+Instructors.getFirstName()+" "+ Instructors.getLastName());
         ınstroductermanager.Login(instructor);
    }
     //student nesnesi
     Student student=new Student();
     student.setId(101);
     student.setFirstName("zehra nur");
     student.setLastName("Alkan");
     student.seteMail("z.nuralkan@gmail.com");
     student.setPassword("123");
     student.setLesson("java react");
     
     UserManager usermanager=new UserManager();
     StudentManager studentmanager=new StudentManager();
     Student student2= new Student(102, "bulut ","aras", "b@gmail.com","123","java");
      Student[] students={student,student2};
    for(Student Students : students ){
     System.out.println("Ders Adı:"+Students.getLesson());
         System.out.println("Adı soyadı:"+Students.getFirstName()+" "+ Students.getLastName());
         usermanager.Ekle(Students);
         studentmanager.Login(Students);
    }
    
    usermanager.Sil(student2);
    }
}
