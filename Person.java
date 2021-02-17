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
        System.out.printf("ФИО: "+ FIO);
        System.out.printf("должность: "+ post);
        System.out.printf("email: "+ email);
        System.out.printf("телефон: "+ telephone);
        System.out.printf("зарплата: "+ salary);
        System.out.printf("возраст: "+ age);
   }
public int getages() {
      return age;
  }

}