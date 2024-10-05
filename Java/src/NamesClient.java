public class NamesClient {
    public static void main(String[] args) {
        Names studentOne = new Names("Joe", "Barbara", 32);
        System.out.println(studentOne.getLastName());
        
        Names studentTwo = new Names("Gunnar", "Ragnarson", 22);
        System.out.println(studentTwo);
    }
}
