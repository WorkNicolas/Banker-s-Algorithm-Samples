package BankerAlgoSample1.src;

public class Main {
    public static void main(String[] args) {
        int i, j, k;
        Banker bk = new Banker();

        bk.initializeValues();
        // Calculate the Need Matrix
        bk.calculateNeed();

        // Check whether system is in safe state or not
        bk.isSafe();
    }
}
