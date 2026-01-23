import java.util.HashMap;

public class Main {
    static void main(String[] args){
        HashMap<String,Integer> empIds = new HashMap<>();
        // <class, class> only wrapper classes should be used. no primitive datatypes must be used.
        empIds.put("Shoshanna", 1);
        empIds.put("Landa", 20);
        //.put(key, value)
        System.out.println(empIds);

        System.out.println(empIds.get("Shoshanna"));
        // .get(key) = gets value for the key

        System.out.println(empIds.containsKey("Jean Pierre"));
        //.containsKey(key) = returns a boolean value regarding the existance of the key in HashMap
        System.out.println(empIds.containsValue(20));
        //.containsValue(Value) = returns a boolean values regarding the existance of the value in HashMap


        //if same key with different value is put in a HashMap, only the value gets updated.
        empIds.put("Shoshanna", 24);
        System.out.println(empIds);

        empIds.replace("Landa", empIds.get("Landa"), 23);
        System.out.println(empIds);

        empIds.putIfAbsent("John", 2344);
        System.out.println(empIds);

        empIds.remove("John");
        System.out.println(empIds);

    }

}
