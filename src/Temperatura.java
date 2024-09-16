public class Temperatura {

    public static void main(String[] args) {
        double temperaturaCelsius = 30.4;
        double temperaturaFahrenheit = (temperaturaCelsius * 1.8) + 32;

        String mensaje = String.format("La temperatura de %f Celsius equivale a %f Fahrenheit.", temperaturaCelsius, temperaturaFahrenheit);

        System.out.println(mensaje);

        int temperaturaCelsiusEntera = (int) temperaturaCelsius;
        System.out.println("La temperatura en Celsius entera es: " + temperaturaCelsiusEntera);
        int temperaturaFahrenheitEntera = (int) temperaturaFahrenheit;
        System.out.println("La temperatura en Fahrenheit entera es: " + temperaturaFahrenheitEntera);
    }
}