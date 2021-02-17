class Main {
  public static void main(String[] args) {
    Person[] persArray = new Person[5]; 
    persArray[0] = new Person("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30);
    persArray[1] = new Person("Челове Человеков", "disiner", "man@mailbox.com", "892312321", 30000, 41);
    persArray[2] = new Person("Алексей Алексеев", "Artdisiner", "aleks@mailbox.com", "862312312", 36000, 46);
    persArray[3] = new Person("Вася Пупкинn", "It", "vasan@mailbox.com", "892332312", 30000, 30);
    persArray[4] = new Person("Менш Советский", "Ktoto", "maniakov@mailbox.com", "892314312", 32000, 36);
for(int i = 0; i < 5; i++) {
  int Age = persArray[i].getages();
  if (Age>40){
    persArray[i].vivod();
  }
}
}
}