import java.util.ArrayList;

public class ListPlayground {

    public static void main(String[] args) {

        ArrayList<String> trainers = new ArrayList<>();

        trainers.add("Colin");
        trainers.add("Zsolt");
        trainers.add("Thibyaa");
        trainers.add("Anna");

        trainers.remove(0);
        System.out.println(trainers.size());
    }
}
