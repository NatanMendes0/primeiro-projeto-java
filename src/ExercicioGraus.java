public class ExercicioGraus {
    public static void main(String[] args){
        int celsius = 28;
        double fahrenheit = (celsius *1.8)+32;
        System.out.println(String.format("A temperatura em %d convertido para fahrenheit é: %.2f", celsius, fahrenheit));

        int fahrenheitInteiro = (int) fahrenheit;
        System.out.println(String.format("A temperatura em %d convertido para fahrenheit é: %d", celsius, fahrenheitInteiro));
    }
}
