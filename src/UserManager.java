
public class UserManager {
     public void Ekle(Student students){
        System.out.println(students.firstName+" "+ students.lastName+" öğrenci eklenmiştir.");
    }
     public void Sil(Student students){
          System.out.println(students.firstName+" "+ students.lastName+" öğrenci silinmiştir.");
     }
       public void Güncelle(Student students){
          System.out.println(students.firstName+" "+ students.lastName+" öğrenci güncellenmiştir.");
     }
}
