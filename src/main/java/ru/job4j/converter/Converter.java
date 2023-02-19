package ru.job4j.converter;

public class Converter {
    public static float rubleToEuro(float value) {
        float rsl = value / 70;
        return rsl;
    }

    public static float rubleToDollar(float value) {
        float rsl = value / 60;
        return rsl;
    }

    public static void main(String[] args) {
        float euro = Converter.rubleToEuro(140);
        float dollar = Converter.rubleToDollar(140);
        System.out.println("140 rubles are " + euro + " euro.");
        System.out.println("140 rubles are " + dollar + " dollar.");
            float in = 140;
            float expected = 2;
            float outEuro = Converter.rubleToEuro(in);
            float outDol = Converter.rubleToDollar(in);
            boolean passedEuro = expected == outEuro;
            boolean passedDol = expected == outDol;
            System.out.println("140 rubles are 2 euro. Test result : " + passedEuro);
            System.out.println("140 rubles are 2 dollar. Test result : " + passedDol);
    }
}
