import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String,String> countries = new HashMap<>();
        //add a key and value
        countries.put("USA","Washington DC");
        countries.put("India","New Delhi");
        countries.put("Russia","Moscow");
        countries.put("China","Beijing");

        //Removes the USA key and value from the hashmap
        //countries.remove("USA");

        //Getting value from the key
        //System.out.println(countries.get("India"));

        //Removes all the key and value from the hashmap
        //countries.clear();

        //Gives the size of hashmap how many key and value are
        //System.out.println(countries.size());

        //Replace the value of the item by the key Taiwan is a new value
        //countries.replace("China","Taiwan");

        //Returns boolean value Checks the all key in the hashmap contains this or not
        //System.out.println(countries.containsKey("England"));

        ///Returns boolean value Checks the all value in the hashmap contains this or not
        //System.out.println(countries.containsValue("New Delhi"));

        //Returns an array of all values
        //System.out.println(countries.values());

        System.out.println(countries);
    }
}