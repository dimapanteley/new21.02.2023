public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static void task1() {
        System.out.println("Задача 1");
        String lastName = "Ivanov"; // задаем строку с фамилией
        String firstName = "Ivan";  // задаем строку с именем
        String middleName = "Ivanovich"; // задаем строку с отчеством
        String fullName = firstName + " " + lastName + " " + middleName; // суммируем
        System.out.println("ФИО сотрудника—" + fullName);
    }

    public static void task2() {
        System.out.println("Задача 2");
        String fullName = "Ivanov Ivan Ivanovich "; // задаем строку  с ф.и.о
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullName.toUpperCase());
    }

    public static void task3() {
        System.out.println("Задача 2");
        String fullName = "Иванов Семён Семёнович"; // задаем строку  с ф.и.о
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullName.replace('ё', 'е'));


    }
}