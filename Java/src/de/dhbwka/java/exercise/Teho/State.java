package de.dhbwka.java.exercise.Teho;

public class State {
    public int[] FalseValue;
    public int[] TrueValue;
    public State(int[] a, int[] b){
        FalseValue = a;
        TrueValue = b;
    }
    public int decide(WarpInt index, int[] arr){
        if(arr[index.value] == 0){
            arr[index.value] = FalseValue[0];
            index.value += FalseValue[1];
            return FalseValue[2];
        } else{
            arr[index.value] = TrueValue[0];
            index.value += TrueValue[1];
            return TrueValue[2];
        }
    }
}
