class Employee {
    String name;
    double baseSalary;

    void displayBasicInfo() {
        System.out.println("Name: " + name);
        System.out.println("Base Salary: " + baseSalary);
    }
}

class Developer extends Employee {
    String programmingLanguage;

    void writeCode() {
        System.out.println(name + " is writing code in " + programmingLanguage);
    }
}

class Tester extends Employee {
    String testingTool;

    void runTests() {
        System.out.println(name + " is running tests using " + testingTool);
    }
}

public class Main10 {
    public static void main(String[] args) {
        Developer dev = new Developer();
        dev.name = "Aarav";
        dev.baseSalary = 75000;
        dev.programmingLanguage = "Java";

        dev.displayBasicInfo();
        dev.writeCode();

        Tester tester = new Tester();
        tester.name = "Priya";
        tester.baseSalary = 60000;
        tester.testingTool = "Selenium";

        tester.displayBasicInfo();
        tester.runTests();
    }
}