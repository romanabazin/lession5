public class Homework {
    public static void main(String[] args) {
        Employeer person = new Employeer("Иванов", "Директор", "ivanov345@mail.ru", "89353333333", 400000, 50);
        System.out.println(person);
        System.out.println();

        Person[] persArray = new Person[5];
        persArray[0] = new Person("Борисов Борис Борисович", "Директор по IT", "borisov@mail.ru", "892312312", 500000, 42);
        persArray[1] = new Person("Иванов Иван Иванович", "Бухгалтер", "ivanov@gmail.com", "89999999999", 30000, 35);
        persArray[2] = new Person("Иванов Иван Иванович", "Завхоз", "ivanov@gmail.com", "89888888888", 25000, 48);
        persArray[3] = new Person("Сидоров Сидр Сидорович", "Менеджер", "sidorov@inbox.com", "89777777777", 40000, 25);
        persArray[4] = new Person("Ахмед", "Маркетолог", "ahmed@icloud.com", "89666666666", 35000, 40);

        for (Person employee : persArray)
            if (employee.getAge()>40)
                System.out.println(employee);
    }
}

