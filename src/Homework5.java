public class Homework5 {
    public static void main(String[] args) {
        Employee[] employees = {
                new Employee("Ivan Petrovich", "PE Teacher","email@mail.com","+7123456789",
                        10,41 ),
                new Employee("Cherniy Kot", "Primus pochinaet","email@mail.com","+7123456789",
                        2,10000000 ),
                new Employee("Mika Karpovich", "Engineer","email@mail.com","+7123456789",
                        10,30 ),
                new Employee("Ustal pridumivat", "PE Teacher","email@mail.com","+7123456789",
                10,40 ),
                new Employee("Ustal Natanovich", "PE Teacher","email@mail.com","+7123456789",
                        10,20 ),
                new Employee("Ivan Ivanovich", "PE Teacher","email@mail.com","+7123456789",
                        10,10 ),
        };
        for (Employee employee:
             employees) {
            if (employee.getAge() >40)
                employee.printInfo();
        }
    }
}
