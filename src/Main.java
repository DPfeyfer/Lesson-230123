public class Main {
    public static void main(String[] args) {Task_1(); Task_2(); Task_3();
    }

    public static void Task_1() {
        System.out.println("Task 1");

        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
//        String fullName = lastName + ' ' + firstName + ' ' + middleName
//        System.out.println("Full name employee is " + fullName);
        System.out.println("Full name employee is " + lastName + ' ' + firstName + ' ' + middleName.toUpperCase());

        System.out.println();
    }

    public static void Task_2() {
        System.out.println("Task 2");

        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + ' ' + firstName + ' ' + middleName;
        System.out.println("Full name of the employee to fill out the report\n"
                + fullName.toUpperCase());

        System.out.println();
    }

    public static void Task_3() {
        System.out.println("Task 3");

        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + ' ' + firstName + ' ' + middleName;
        fullName = fullName.replace("I", "O");
        System.out.println("Full name employee is " + fullName);
    }
}