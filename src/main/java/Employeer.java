public class Employeer {
    private String person;
    private String position;
    private String email;
    private String numberPhone;
    private int salary;
    private int age;

    public Employeer(String person, String position, String email, String numberPhone, int salary, int age){
       this.person = person;
       this.position = position;
       this.email = email;
       this.numberPhone = numberPhone;
       this.salary = salary;
       this.age = age;
    }
    public String toString (){
        return String.format("Cотрудник: %s в должности %s имеет почту %s и телефон %s с зарплатой %d рублей и в возрате %d года.", person, position, email, numberPhone, salary, age);
    }

}
