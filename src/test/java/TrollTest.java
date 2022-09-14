import characters.Troll;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TrollTest {

    Troll troll;

    @Before
    public void before(){
        troll = new Troll(100);
    }


}
