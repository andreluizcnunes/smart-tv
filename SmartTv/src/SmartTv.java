public class SmartTv {

    boolean tomada = false;
    boolean standBy = false;
    boolean ligada = false;

    int canal = 1;
    int volume = 25;

    String mensagem = " ";

    public boolean statusTomada(boolean status) {
        if (status) {
            return this.tomada = status;
        } else {
            return this.tomada = status;
        }
    }

    public void statusStandBy() {
        if (this.tomada) {
            this.standBy = true;
            System.out.println("Stand By ON");
        } else {
            this.standBy = false;
            System.out.println("Stand By OFF");
        }
    }

    public void ligarTV() {
        if (this.tomada) {
            this.ligada = true;
        } else {
            System.out.println("A TV não está na ligada na tomada.");
            System.out.println("Ligue ela na tomada primeiro.");
        }
    }

    public void desligarTV() {
        this.ligada = false;
        System.out.println("A Tv foi desligada.");
        System.out.println("Desligue a Tv da tomanda, para economia. ");
    }

    public void trocarCanal(int canal) {

        if (this.ligada) {
            this.canal = canal;
        } else {
            System.out.println("A TV não está ligada.");
            System.out.println("Ligue ela primeiro para mudar de canal.");
        }

    }

    public void avancarCanal() {

        if (this.ligada) {
            this.canal++;
        } else {
            System.out.println("A TV não está ligada.");
            System.out.println("Ligue ela primeiro para avançar de canal.");
        }
    }

    public void voltarCanal() {
        if (this.ligada) {
            this.canal--;
        } else {
            System.out.println("A TV não está ligada.");
            System.out.println("Ligue ela primeiro para avançar de canal.");
        }
    }

    public void aumentarVolume() {
        if (this.ligada) {
            this.volume++;
        } else {
            System.out.println("A TV não está ligada.");
            System.out.println("Ligue ela primeiro para aumentar o volume.");
        }
    }

    public void diminuriVolume() {
        if (this.ligada) {
            this.volume--;
        } else {
            System.out.println("A TV não está ligada.");
            System.out.println("Ligue ela primeiro para diminui o volume.");
        }
    }

}
