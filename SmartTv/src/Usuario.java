import java.util.Scanner;

public class Usuario {
    public static void main(String[] args) throws Exception {

        Scanner leitor = new Scanner(System.in);

        SmartTv tv = new SmartTv();
        String ligarTV = "";
        if (tv.ligada) {
            System.out.println("Tv Ligada, no canal " + tv.canal);
            System.out.println("Nivel de volume: " + tv.volume);

        } else {
            System.out.println("Tv fora da tomada.");
            System.out.println("Deseja ligar a TV?");
            System.out.println("Digite --> SIM <-- para ligar.");
            System.out.println("Digite --> NÃO <-- para não ligar.");

            ligarTV = leitor.nextLine();
        }

        if (ligarTV.toLowerCase().equals("sim")) {
            tv.statusTomada(true);
            System.out.println("TV ligada no canal: " + tv.canal);
            System.out.println("Nivel de Volume: " + tv.volume);

        } else if (ligarTV.toLowerCase().equals("não") || ligarTV.toLowerCase().equals("nao")) {
            System.out.println("OK TV parmace desligada.");
            System.out.println("Até mais.");

        } else {
            System.out.println("Opção invalida, tente novamente");
            System.out.println("Digite --> SIM <-- para ligar.");
            System.out.println("Digite --> NÃO <-- para não ligar.");

            ligarTV = leitor.nextLine();
        }

        leitor.close();

    }
}
