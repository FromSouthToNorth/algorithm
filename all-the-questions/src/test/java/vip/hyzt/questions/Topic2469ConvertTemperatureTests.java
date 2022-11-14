package vip.hyzt.questions;

import org.junit.Test;

import java.util.Arrays;

public class Topic2469ConvertTemperatureTests {

    @Test
    public void convertTemperature() {
        Topic2469ConvertTemperature topic2469ConvertTemperature = new Topic2469ConvertTemperature();
        double[] celsiuss = {36.50, 122.11, 99.99};
        for (double c : celsiuss) {
            System.out.printf("res: %s\n", Arrays.toString(topic2469ConvertTemperature.convertTemperature(c)));
        }
    }

}
