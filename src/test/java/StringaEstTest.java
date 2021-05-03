import Est.StringaEst;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.apache.commons.lang3.StringUtils;

import static org.junit.jupiter.api.Assertions.*;

class StringaEstTest {

    @Test
    void isEmpty() {
        StringaEst string = new StringaEst();
        Assertions.assertTrue(string.isEmpty());
        //StringUtils.isEmpty(string.getValue());
        Assertions.assertEquals(string.isEmpty(), StringUtils.isEmpty(string.getValue()));
    }

    @Test
    void isBlank() {
        StringaEst string = new StringaEst(" ");
        Assertions.assertTrue(string.isBlank());

        Assertions.assertEquals( string.isBlank(), StringUtils.isBlank(string.getValue()) );
    }

    @Test
    void isNUmeric() {
        StringaEst string = new StringaEst("123");
        Assertions.assertTrue(string.isNUmeric());

        Assertions.assertEquals( string.isNUmeric(), StringUtils.isNumeric(string.getValue()) );
    }
}