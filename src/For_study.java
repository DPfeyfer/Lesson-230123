public class For_study {
    public static void main(String[] args) {Lesson_1(); Lesson_2(); Lesson_3();
    }

    public static void Lesson_1() {
        String phoneNumber = "9188182727";
        if (phoneNumber.length() == 10) {
            phoneNumber = '7' + phoneNumber;
        } else if (phoneNumber.length() > 11) {
            throw new RuntimeException("Check your number");
        } else if (phoneNumber.length() < 10) {
            throw new RuntimeException("Number is short");
        }
        System.out.println("Phone number is " + phoneNumber);
        System.out.println();
    }

    public static void Lesson_2() {
        String phoneNumber = "+7918--81  8 27-27";
        phoneNumber = phoneNumber.replace("-", "");
        phoneNumber = phoneNumber.replace(" ", "");
        phoneNumber = phoneNumber.replace("+", "");
        if (phoneNumber.length() == 10) {
            phoneNumber = '7' + phoneNumber;
        } else if (phoneNumber.length() > 11) {
            throw new RuntimeException("Check your number");
        } else if (phoneNumber.length() < 10) {
            throw new RuntimeException("Number is short");
        } else if (phoneNumber.length() == 11 && phoneNumber.charAt(0) != '7') {
            throw new RuntimeException("First number not right!");
        }
        System.out.println("phoneNumber = " + phoneNumber);
        System.out.println();
    }

    public static void Lesson_3() {
        String phoneNumber = "+918-81  8 27-27";
        phoneNumber = phoneNumber.replace("-", "");
        phoneNumber = phoneNumber.replace(" ", "");
        phoneNumber = phoneNumber.replace("+", "");
        if (phoneNumber.length() == 10) {
//            phoneNumber = '7' + phoneNumber;
        } else if (phoneNumber.length() > 11) {
            throw new RuntimeException("Check your number");
        } else if (phoneNumber.length() < 10) {
            throw new RuntimeException("Number is short");
        } else if (phoneNumber.length() == 11 && phoneNumber.charAt(0) != '7') {
            throw new RuntimeException("First number not right!");
        }
//        System.out.println("phoneNumber = " + phoneNumber);
        String expectedPhone = "79188182727";
        if (phoneNumber.equals(expectedPhone)) {
            System.out.println("Success");
        } else {
            System.out.println("poorly");
        }
    }
}
