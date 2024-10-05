import java.util.Random;

public class App {
    public static void main(String[] args) {
        String[] names = {"Joe", "Akira", "Amelie", "Thomas", "Ivar"};
        String[] lastNames = {"McFly", "Dupont", "McMillan", "Ragnarson", "Yamada"};
        int[] ages = {28, 22, 26, 18, 32};

        read(names, lastNames, ages);
    }

    public static void read(String[] names, String[] lastNames, int[] ages) {
        Random rand = new Random();
        int gen1 = rand.nextInt(5);
        int gen2 = rand.nextInt(5);
        int gen3 = rand.nextInt(5);
        System.out.println(names[gen1] + " " + lastNames[gen2] + " " + ages[gen3]);
    }

    public static void arrayList() {
        
    }
}