package solutions;

/**
 * Created by yfain11 on 8/12/14.
 */
public class TemperatureConverter2 {
    public static String convertTemp (float temperature, char convertTo) {

        String convertedTemperature;

        switch (convertTo){
            case 'F':
               convertedTemperature =  "The temperature in Fahrenheit is " + (9*temperature/5 + 32);
               // break;
            case 'C':
                convertedTemperature = "The temperature in Celsius is " + (temperature - 32)*5/9;
                break;
            default:
                convertedTemperature = "You can enter either F or C as convertTo argument";
        }

        return convertedTemperature;
    }

    public static void main(String[] args) {

        System.out.println("Converting 21C to Fahrenheit. " +  convertTemp(21,'F'));
        System.out.println("Converting 70F to Celsius. " +  convertTemp(70,'C'));

    }
}
