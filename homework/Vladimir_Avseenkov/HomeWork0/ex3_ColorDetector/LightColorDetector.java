package Vladimir_Avseenkov.HomeWork0.ex3_ColorDetector;

import java.util.Scanner;

public class LightColorDetector {
    public static void main(String[] args) throws Exception {
        LightColorDetector light = new LightColorDetector();
        Scanner input = new Scanner(System.in);
        System.out.print("Input wave length: ");
        System.out.println(light.detect(input.nextInt()));
        LightColorDetectorTest test = new LightColorDetectorTest();
        test.runTests();

    }

    public String detect(int waveLength) {
        if (waveLength >= 380 && waveLength < 450) {
            return "Violet";
        } else if (waveLength >= 450 && waveLength < 495) {
            return "Blue";
        } else if (waveLength >= 495 && waveLength < 570) {
            return "Green";
        } else if (waveLength >= 570 && waveLength < 590) {
            return "Yellow";
        } else if (waveLength >= 590 && waveLength < 620) {
            return "Red";
        } else {
            return ("Invisible light");
        }
    }
}
