package core;


import java.util.Random;
import static core.PlayPropertiesHelper.*;

/**
 * Created by nue on 6.10.2015.
 */
public class CalculationSystem {


    public int calculationBig() {
        Delay.mockCrashAndDelay(getBigException(), getBigDelay());
        return new Random().nextInt(1234364334);
    }

    public int calculationSmall() {
        Delay.mockCrashAndDelay(getSmallException(), getSmallDelay());
        return new Random().nextInt(1234);
    }


}
