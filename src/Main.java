public class Main {
    public static void main(String[] args) {
    Pair<String, Integer> pair1 = new Pair<>("Age", 25);
    Pair<Integer, String> pair2 = new Pair<>(404, "Not found");
        System.out.println("Pair 1: " + pair1.toString());
        System.out.println("Pair 2: " + pair2.toString());

                    //getters calling
        System.out.println("\nGetters calling:");
        System.out.println("Pair1's key: "+ pair1.getKey());
        System.out.println("Pair1's value: "+ pair1.getValue());


           // Creating pairs using the static factory method

        Pair<Integer, Integer> staticPair = Pair.create(41, 30);//ley and value are integers
        Pair<String, String> staticPair2 = Pair.create("Name", "John");//key and value are strings
        Pair<String, Integer> staticPair3 = Pair.create("Age", 22); //key is string and value is an integer

                   // Printing the pairs
             System.out.println("\nPrinting pairs by static method:");
                System.out.println("" + staticPair);  // Output: (key=Age, value=30)
               System.out.println(staticPair2);

               // Testing equals method
        System.out.println("\nTesting equals method:");
        Pair<String, Integer> anotherPair1 = Pair.create("Age", 78);
        Pair<Integer, String> anotherPair2 = Pair.create(404, "Not found");
        Pair<String, Integer> anotherPair3 = Pair.create("Age", 78);


        System.out.println("Are these pairs equal?: " + anotherPair1.equals(anotherPair2));
        //pair1 and staticPair3, they are not equal, that's why it will be false
        System.out.println("\nAre these pairs equal?: " + anotherPair1.equals(anotherPair3));
        //this will be true anotherpair2=anotherpair3




        }


}
