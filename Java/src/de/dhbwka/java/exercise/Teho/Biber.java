package de.dhbwka.java.exercise.Teho;



public class Biber {
    public int state = 0;
    public int index;
    public State[] states;
    public int[] band = new int[15];
    public static void main(String[] args) {
        Biber biber = new Biber(5);
        biber.addState(new int[]{1,1,1}, new int[]{0,-1,2});
        biber.addState(new int[]{1,-1,0}, new int[]{0,1,1});
        biber.addState(new int[]{1,-1,1}, new int[]{1,1,-1});
        biber.doSomeWork();
    }

    public Biber(int size) {
        states = new State[size];
    }

    public void addState(int[] a, int[] b){
        states[index++] = new State(a,b);
    }

    public void doSomeWork(){
        WarpInt Warpindex = new WarpInt(5);

        for (int i = 0; i < 10; i++) {
            state = states[state].decide(Warpindex, band);
            for (int j = 0; j < band.length; j++) {
                System.out.print(band[j]);
            }
            System.out.println();

        }
    }
}
