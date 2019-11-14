package Lesson4;

public class Employee {
    public int CURRENT_YEAR = 2019;
    private String syrName;
    private String secondName;
    private String name;
    private String position;
    private String phone;
    private float salary;
    boolean isSalaryChanged;
    private int birthYear;
    private static int id = 0;
    public int uid;

    //2. Конструктор класса должен заполнять эти поля при создании объекта;

    Employee(String name,
             String secondName,
             String syrName,
             String phone,
             String position,
             float salary,
             int birthYear){
        this.birthYear = birthYear;
        this.name = name;
        this.syrName = syrName;
        this.secondName = secondName;
        this.position = position;
        this.phone = phone;
        this.salary = salary;
        this.uid = ++id;
    }
    //3. Внутри класса «Сотрудник» написать методы, которые возвращают значение каждого поля;

    public String getSyrName() { return syrName; }

    public String getSecondName() { return secondName;  }

    public String getName() { return name; }

    public String getPosition() { return position; }

    public String getPhone() { return phone; }

    int getSalary() {
        return (int)salary;
    }

    void setSalary(float difference) {
        this.salary = this.salary + difference;
    }

    void setSalary(int salary) {
        this.salary = salary;
    }



    public int getAge() { return CURRENT_YEAR - birthYear; }

    String getFullinfo() {
        return this.name + " " +
        this.secondName + " " +
        this.syrName + " " +
        this.getAge() + " years old, " +
        this.position + ". Phone number:  " +
                this.phone + ". Salary is  " +
                this.getSalary() + " RUR.";
    }


}

