public class Main {
    public static void main(String[] args) {
        System.out.println("Start");
        printNumbers();
        System.out.println("Finish3!");
    }

    public static void printNumbers() {
        for(int i =0; i<=10000; i++){
            System.out.println(i);
        }
    }
}