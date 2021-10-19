public class Main {

    public static void main(String[] args) {
        Lawyer lawyer = new Lawyer("John", 30, 8, 8, "steak");
        Engineer engineer = new Engineer("Alex", 27, 7, 9, "pizza");
        Mathematician mathematician = new Mathematician("Steve", 36, 8, 9, "burger");
        Computer computer = new Computer();
            lawyer.work();
            engineer.eat();
            mathematician.sleep();
            computer.calculate();
        }
    }

