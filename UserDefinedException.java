class MyException extends Exception {
    public MyException(String message) {
        super(message);
    }
}

public class UserDefinedException {

    static void checkSalary(int salary) throws MyException {
        if (salary < 10000) {
            throw new MyException("Salary is too low");
        } else {
            System.out.println("Salary is acceptable");
        }
    }

    public static void main(String[] args) {
        try {
            checkSalary(5000);
        } catch (MyException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }

        System.out.println("Program continues...");
    }
}