public class Main {
    public static void main(String[] args) {
        HumanPrototype human1 = new HumanPrototype("Pedro", "Henrique", 30);

        HumanPrototype human2 = (HumanPrototype) human1.getClone();
    }
}