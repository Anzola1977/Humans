public class Mathematician extends Humans implements Workable, Calculating{

    public Mathematician(String name, int age, int sleepHours, int workHours, String food) {
        super(name, age, sleepHours, workHours, food);
    }

    @Override
    public void eat() {
        System.out.println("I eat twice a day");
    }

    @Override
    public void sleep() {
        System.out.println("I sleep enough");
    }

    @Override
    public void calculate() {
        System.out.println("I am calculating slowly");
    }

    @Override
    public void work() {
        System.out.println("I work in Google");
    }
}
