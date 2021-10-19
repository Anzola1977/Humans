public class Lawyer extends Humans implements Workable{

    public Lawyer(String name, int age, int sleepHours, int workHours, String food) {
        super(name, age, sleepHours, workHours, food);
    }

    @Override
    public void eat() {
        System.out.println("I eat in restaurant");
    }

    @Override
    public void sleep() {
        System.out.println("Today i can't sleep");
    }

    @Override
    public void work() {
        System.out.println("Today will be a trial");
    }
}
