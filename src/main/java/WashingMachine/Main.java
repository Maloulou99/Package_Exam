package WashingMachine;

public class Main {
    public static void main(String[] args) {

        WashingMachine washingMachine = new WashingMachine(30, true);


        washingMachine.start();
        washingMachine.addWash(washingMachine.start());


        System.out.println(washingMachine);
    }
}
