public class HumanPrototype implements Prototype{
    private String name;
    private String lastName;
    private int age;

    public HumanPrototype(String name, String lastName, int age) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
    }

    @Override
    public Prototype getClone() {
        return new HumanPrototype(name, lastName, age);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public String getLastName() {
        return this.lastName;
    }

    public int getAge() {
        return this.age;
    }

    public String toString() {
        return getClass().getName() + "@"
                + "Name: " + this.name + ", Lastname: " + this.lastName + ", Age: " + this.age;
    }
}