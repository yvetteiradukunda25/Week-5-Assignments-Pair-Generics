public class Main {
    public static void main(String[] args) {
    Pair<String, Integer> pair1 = new Pair<>("Age", 25);
    Pair<Integer, String> pair2 = new Pair<>(404, "Not found");
        System.out.println("Pair 1: " + pair1.toString());
        System.out.println("Pair 2: " + pair2.toString());

        //testing invalid inputs

        Pair<String, Integer> pair3 = Pair.create("Age", 30);
        System.out.println("Pair 3:" + pair3.toString());
    }
}