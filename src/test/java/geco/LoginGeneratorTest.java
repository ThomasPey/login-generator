package geco;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LoginGeneratorTest {

    private LoginGenerator aLoginGenerator;

    @Before
    public void setUp() throws Exception {
        String[] start = new String[]{"JROL","BPER","CGUR","JDUP","JRAL","JRAL1"};
        aLoginGenerator = new LoginGenerator(new LoginService(start));
    }

    @Test
    public void generateLoginForNomAndPrenom() {
        /* CT1 */
        String login = aLoginGenerator.generateLoginForNomAndPrenom("Durand","Paul");
        Assert.assertEquals("PDUR",login);

        String login2 = aLoginGenerator.generateLoginForNomAndPrenom("Ralouf","John");
        Assert.assertEquals("JRAL2",login2);

        String login3 = aLoginGenerator.generateLoginForNomAndPrenom("Rolling","Jean");
        Assert.assertEquals("JROL1",login3);

        String login4 = aLoginGenerator.generateLoginForNomAndPrenom("Dùrand","Paul");
        Assert.assertEquals("PDUR1",login4);
    }
}