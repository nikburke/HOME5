public class Person {
private String FIO; 
private String post; 
private String email;
private String telephone; 
private int salary;
private int age;

public Person(){ 
}
public Person(String FIO, String post, String email ,String telephone, int salary, int age){ 
  this.FIO = FIO;
  this.post = post;
  this.email = email;
  this.telephone = telephone;
  this.salary = salary;
  this.age = age;
}
   public void vivod() {
      bloodvivod();
   }
public int getages() {
      return age;
  }
      private void bloodvivod() {
        System.out.println("ФИО: ", FIO);
        System.out.println("должность: ", post);
        System.out.println("email: ", email);
        System.out.println("телефон: ", telephone);
        System.out.println("зарплата: ", salary);
        System.out.println("возраст: ", age);
    }
}