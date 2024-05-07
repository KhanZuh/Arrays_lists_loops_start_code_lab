import java.util.HashMap;

public class MapPlayground {

    public static void main(String[] args) {

        HashMap<String, Integer> trainerHouseNumbers = new HashMap<>();

        trainerHouseNumbers.put("Colin", 16);
        trainerHouseNumbers.put("Zsolt", 45);
        trainerHouseNumbers.put("Thibyaa", 26);

        int trainerHouse = trainerHouseNumbers.get("Zsolt");

        System.out.println(trainerHouseNumbers.values());

    }
}
