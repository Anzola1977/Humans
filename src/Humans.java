public abstract class Humans {
    String name;
    int age;
    int sleepHours;
    int workHours;
    String food;

    public Humans(String name, int age, int sleepHours, int workHours, String food) {
        this.name = name;
        this.age = age;
        this.sleepHours = sleepHours;
        this.workHours = workHours;
        this.food = food;
    }

    public abstract void eat();

    public abstract void sleep();
}
