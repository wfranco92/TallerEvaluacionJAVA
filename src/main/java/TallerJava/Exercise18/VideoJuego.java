package TallerJava.Exercise18;

public class VideoJuego implements Ientregable{

    private String title;
    private int estimateHour;
    private boolean isdelivered;
    private String genre;
    private String company;

    public VideoJuego() {
        this.title = "";
        this.estimateHour = 10;
        this.isdelivered = false;
        this.genre = "";
        this.company = "";
    }

    public VideoJuego(String title, int stimateHour) {
        this.title = title;
        this.estimateHour = stimateHour;
        this.isdelivered = false;
        this.genre = "";
        this.company = "";
    }

    public VideoJuego(String title, int stimateHour, String genere, String company) {
        this.title = title;
        this.estimateHour = stimateHour;
        this.isdelivered = false;
        this.genre = genere;
        this.company = company;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getEstimateHour() {
        return estimateHour;
    }

    public void setEstimateHour(int estimateHour) {
        this.estimateHour = estimateHour;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    @Override
    public String toString() {
        return "VideoJuego{" +
                "title='" + title + '\'' +
                ", stimateHour=" + estimateHour +
                ", isdelivered=" + isdelivered +
                ", genere='" + genre + '\'' +
                ", company='" + company + '\'' +
                '}';
    }

    @Override
    public void entregar() {
        isdelivered = true;
    }

    @Override
    public void devolver() {
        isdelivered = false;
    }

    @Override
    public boolean isEntregado() {
        return isdelivered;
    }
}
