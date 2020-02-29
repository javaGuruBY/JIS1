package Vladimir_Avseenkov.HomeWork0.ex3_ColorDetector;

public class LightColorDetectorTest {
    LightColorDetector light = new LightColorDetector();

    public void runTests() throws Exception {
        shouldReturnViolet();
        shouldReturnBlue();
        shouldReturnGreen();
        shouldReturnYellow();
        shouldReturnRed();
        shouldReturnInvisibleLight();

    }

    public void shouldReturnViolet() throws Exception {
        String expectedResult = "Violet";
        String actualResult = light.detect(380);
        assertEqualsString(expectedResult, actualResult);
    }

    public void shouldReturnBlue() throws Exception {
        String expectedResult = "Blue";
        String actualResult = light.detect(450);
        assertEqualsString(expectedResult, actualResult);
    }

    public void shouldReturnGreen() throws Exception {
        String expectedResult = "Green";
        String actualResult = light.detect(495);
        assertEqualsString(expectedResult, actualResult);
    }

    public void shouldReturnYellow() throws Exception {
        String expectedResult = "Yellow";
        String actualResult = light.detect(570);
        assertEqualsString(expectedResult, actualResult);
    }

    public void shouldReturnRed() throws Exception {
        String expectedResult = "Red";
        String actualResult = light.detect(590);
        assertEqualsString(expectedResult, actualResult);
    }

    public void shouldReturnInvisibleLight() throws Exception {
        String expectedResult = "Invisible light";
        String actualResult = light.detect(666);
        assertEqualsString(expectedResult, actualResult);
    }

    public void assertEqualsString(String expectedResult, String actualResult) throws Exception {
        if (actualResult.equals(expectedResult)) {
            System.out.println("Self-test for " + expectedResult + " passed");
        } else {
            throw new Exception("Test for " + expectedResult + " FAILED");
        }
    }
}
