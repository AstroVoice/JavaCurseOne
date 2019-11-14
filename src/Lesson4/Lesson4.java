package Lesson4;

public class Lesson4 {
    public static void main(String[] args) {
        int ageParm = 45;
        float updSalaryByAgeParm = 5000f;

        //1. Создать класс "Сотрудник" с полями: ФИО, должность, телефон, зарплата, возраст;
        Employee e = new Employee("Alexander", "Alexandrovich", "Strugov", "926 000-00-00", "Practicant", 25000, 1978);

        //4. Вывести при помощи методов из пункта 3 ФИО и должность.

        System.out.println("Please welcome our " + e.getPosition() + ", " + e.getName() + " " + e.getSecondName() + " " + e.getSyrName());

        //5. Создать массив из 5 сотрудников. С помощью цикла вывести информацию только о сотрудниках старше 40 лет;

        Employee[] employees = {
                e,
                new Employee("Alexey", "Alexandrovich", "Pak", "926 000-00-00", "Practicant", 25000, 1988),
                new Employee("Vladimir", "Vladimirovich", "Kim", "926 000-00-00", "Practicant", 25000, 1998),
                new Employee("Andrey", "Leonidovich", "U", "926 000-00-00", "Practicant", 25000, 2000),
                new Employee("Makar", "Alexandrovich", "Ivanov", "926 000-00-00", "Practicant", 25000, 1977),
        };
        for (int i = 0; i < employees.length; i++)
            if (employees[i].getAge() > 40) System.out.println(employees[i].getFullinfo());

            updateSalary(employees, 45, 5000.0f);

        for (int i = 0; i < employees.length; i++)
            if (employees[i].getAge() > 40) System.out.println(employees[i].getFullinfo());

    }

    //* Создать метод, повышающий зарплату всем сотрудникам старше 45 лет на 5000.
   /* private static void updateSalary(Employee[] emp, int age, float increment ) {
        for (int i = 0; i < emp.length; i++)
            if (emp[i].getAge() > age) emp[i].setSalary(increment);
    }
    */
    private static void updateSalary(Employee[] emp, int age, float increment){
        for (int i = 0; i < emp.length; i++) {
            if (emp[i].getAge() > age) {
                emp[i].setSalary(increment);
                emp[i].isSalaryChanged = true;
            }
        }
    }

    // 7.	** Написать методы (принимающие на вход массив сотрудников),
    // вычисляющие средний возраст и среднюю зарплату сотрудников,
    // вывести результаты работы в консоль.
    private static float averageSalary(Employee[] emp){
        float result = 0;
        for (int i = 0; i < emp.length; i++)
            result += emp[i].getSalary();

        return result / emp.length;
    }

    private static float averageAge(Employee[] emp){
        float result = 0;
        for (int i = 0; i < emp.length; i++)
            result += emp[i].getAge();

        return result / emp.length;
    }
    //*** Продумать конструктор таким образом, чтобы при создании каждому сотруднику присваивался личный уникальный идентификационный порядковый номер


}

