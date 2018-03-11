package WeekSix;

import java.util.concurrent.SynchronousQueue;

import javax.swing.plaf.synth.SynthScrollBarUI;

public class Main {
	public static void main(String[] args) {
        int[] array = {5, 1, 3, 4, 2};
        System.out.println(sum(array));
        printElegantly(array);
    }

    public static int sum(int[] array) {
    	int sum=0;
        for(int i=0;i<array.length;i++) {
        	sum+=array[i];
        }
        return sum;
    }
    public static void printElegantly(int[] array) {
    	int i=1;
        while(i<array.length) {
        	System.out.print(array[i-1]+", ");
        	
        	if(i==array.length-1) {
        		System.out.print(array[i]);
        	}i++;
        }
    }
}
