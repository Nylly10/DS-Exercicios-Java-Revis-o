public class ExercicioForEach {
    public static void main(String[] args) {
        double[] notas = {10, 20, 30};
        double soma= 0;


        for (double n : notas) {
            soma += n;
        }
        double media= soma/notas.length;
        System.out.println("A média é: " + media);
    }
}
