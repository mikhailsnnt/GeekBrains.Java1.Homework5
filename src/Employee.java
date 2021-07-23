public class Employee {
    private  String name,place, email , phoneNumber;
    private  int wage, age;
    Employee(String name, String place, String email, String phoneNumber, int wage, int age)
    {
        this.name = name;
        this.place = place;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.wage = wage;
        this.age = age;
    }
    void printInfo()
    {
        System.out.printf("Employee name: %s:%n" +
                "Place: %s%n" +
                "Email: %s%n" +
                "Phone number: %s%n" +
                "Wage: %d%n" +
                "Age: %d%n%n",name,place,email,phoneNumber,wage,age);
    }

    public int getAge() {
        return age;
    }
}
