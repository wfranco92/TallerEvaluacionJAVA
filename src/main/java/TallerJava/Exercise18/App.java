package TallerJava.Exercise18;

public class App {

    static Serie[] series = new Serie[5];
    static VideoJuego[] videoJuegos = new VideoJuego[5];
    public static void main(String[] args) {

        series[0] = new Serie();
        series[1] = new Serie("The Breaking Bad", "Vinve Gilligan");
        series[2] = new Serie("La casa de papel", "Alex Pina");
        series[3] = new Serie("Stranger Thing", 4, "Thriller", "The Duffer Brothers");
        series[4] = new Serie("The Witcher", "Laurent Schmidt");

        videoJuegos[0] = new VideoJuego("Call Of Duty", 6);
        videoJuegos[1] = new VideoJuego("Assassins credd", 25);
        videoJuegos[2] = new VideoJuego();
        videoJuegos[3] = new VideoJuego("Dark Souls", 30, "Rol", "From SOftware");
        videoJuegos[4] = new VideoJuego("Crysis", 10, "FPS", "CryTek");

        series[1].entregar();
        series[3].entregar();

        videoJuegos[1].entregar();
        videoJuegos[3].entregar();
        videoJuegos[4].entregar();

        changeDeliverid();
        orderVideoByHours();
        orderSeriesBySeason();

    }


    private static void changeDeliverid(){
        for (int i = 0; i < 5; i++) {
            if (series[i].isEntregado() || videoJuegos[i].isEntregado()) {
                series[i].devolver();
                videoJuegos[i].devolver();
            }
        }
    }

    private static void orderVideoByHours() {
        for (int i = 0; i < videoJuegos.length - 1; i++) {
            for (int j = 0; j < videoJuegos.length - 1; j++) {
                if (videoJuegos[j].compareTo(videoJuegos[j + 1]) == 1) {
                    VideoJuego aux = videoJuegos[j];
                    videoJuegos[j] = videoJuegos[j + 1];
                    videoJuegos[j + 1] = aux;
                }
            }
        }
        System.out.println("Video juego con mas horas estimadas: " + videoJuegos[0].toString());
    }

    private static void orderSeriesBySeason() {
        for (int i = 0; i < series.length - 1; i++) {
            for (int j = 0; j < series.length - 1; j++) {
                if (series[j].compareTo(series[j + 1]) == 1) {
                    Serie aux = series[j];
                    series[j] = series[j + 1];
                    series[j + 1] = aux;
                }
            }
        }
        System.out.println("Serie con mas horas estimadas: " + series[0].toString());
    }
}

