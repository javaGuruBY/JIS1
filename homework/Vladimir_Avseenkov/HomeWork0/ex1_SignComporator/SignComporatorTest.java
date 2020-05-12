package Vladimir_Avseenkov.HomeWork0.ex1_SignComporator;

import com.sun.xml.internal.ws.api.message.ExceptionHasMessage;

public class SignComporatorTest {

    public void assertEqual (String expected, String actual, String description) throws Exception {
        SignComporator signComporator = new SignComporator();
        if (actual.equals(expected)) {
            System.out.println(description + " passed");
        } else {
            throw new Exception(description + " FAILED");
        }
    }

    public void runTests() throws Exception {
        testExpectedResulEqualsZero();
        testExpectedResultLessThenZero();
        testExpectedResultMoreThenZero();
    }

    public void testExpectedResultMoreThenZero() throws Exception {
        SignComporator signComporator = new SignComporator();
        String expected = signComporator.positive;
        String actual = signComporator.compare(1);
        String description = "Test for positive number has";
        assertEqual(expected, actual, description);
    }

    public void testExpectedResultLessThenZero() throws Exception {
        SignComporator signComporator = new SignComporator();
        String expected = signComporator.negative;
        String actual = signComporator.compare(-1);
        String description = "Test for negative number has";
        assertEqual(expected, actual, description);
    }

    public void testExpectedResulEqualsZero() throws Exception {
        SignComporator signComporator = new SignComporator();
        String expected = signComporator.zero;
        String actual = signComporator.compare(0);
        String description = "Test for zero number has";
        assertEqual(expected, actual, description);
    }
}
