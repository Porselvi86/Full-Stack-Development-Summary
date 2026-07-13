package exceptionhandling;

class SalaryException extends Exception {

    SalaryException(String msg) {
        super(msg);
    }
}

public class Custom {

    static void checkSalary(int salary) throws SalaryException {

        if (salary < 20000) {
            throw new SalaryException("Salary should be at least 20000");
        } else {
            System.out.println("Salary Successfully Proceed");
        }
    }

    public static void main(String[] args) {

        try {
            checkSalary(10000);
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Program Successfully Finished");
    }
}

