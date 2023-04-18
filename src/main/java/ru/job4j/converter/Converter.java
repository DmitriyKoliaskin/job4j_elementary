package ru.job4j.converter;

/**
 * Конвертер валют.
 * @author Dmitriy Koliaskin (dmk2098@gmail.com)
 */
public class Converter {

    /**
     * Конвертируем рубли в евро.
     * @param value рубли.
     * @return евро.
     */
    public static float rubleToEuro(float value) {
        return value / 70;
    }

    /**
     * Конвертируем рубли в долары.
     * @param value рубли.
     * @return доллары.
     */
    public static float rubleToDollar(float value) {
        return value / 20;
    }

    public static void main(String[] args) {
        float in = 140;
        float expectedRubleToEuro = 2;
        float expectedRubleToDollar = 7;
        float outRubleToEuro = Converter.rubleToEuro(in);
        float outRubleToDollar = Converter.rubleToDollar(in);
        boolean passedRubleToEuro = expectedRubleToEuro == outRubleToEuro;
        boolean passedRubleToDollar = expectedRubleToDollar == outRubleToDollar;
        System.out.println(in + " rubles are " + expectedRubleToEuro + ". Test result: " + passedRubleToEuro);
        System.out.println(in + " rubles are " + expectedRubleToDollar + ". Test result: " + passedRubleToDollar);
    }
}