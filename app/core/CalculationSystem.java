package core;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by nue on 6.10.2015.
 */
public class CalculationSystem {


    public int calculationBig(boolean exception) {
        Delay.mockCrashAndDelay(exception, 5000);
        return new Random().nextInt(1234364334);
    }

    public int calculationSmall(boolean exception) {
        Delay.mockCrashAndDelay(exception, 2);
        return new Random().nextInt(1234);
    }


}
