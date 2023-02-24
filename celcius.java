import java.util.Scanner;

import javax.sound.midi.Soundbank;

public class celcius {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("please Enter Temp in Celcius");
        float tempc = input.nextFloat();
        float tempF =(tempc*9/5)+324;
        System.out.println(tempF);
    }
}
