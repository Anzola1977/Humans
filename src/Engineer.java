public class Engineer extends Humans implements Workable{

    public Engineer(String name, int age, int sleepHours, int workHours, String food) {
        super(name, age, sleepHours, workHours, food);
    }

    @Override
    public void eat() {
        System.out.println("I eat something");
    }

    @Override
    public void sleep() {
        System.out.println("I sleep well");
    }

    @Override
    public void work() {
        System.out.println("I like my work");
    }
}
