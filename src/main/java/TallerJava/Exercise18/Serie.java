package TallerJava.Exercise18;

public class Serie implements Ientregable{

    private String title;
    private int season;
    private boolean isdelivered;
    private String genre;
    private String creator;

    public Serie() {
        this.title = "";
        this.season = 3;
        this.isdelivered = false;
        this.genre = "";
        this.creator = "";
    }

    public Serie(String title, String creator) {
        this.title = title;
        this.season = 3;
        this.isdelivered = false;
        this.genre = "";
        this.creator = creator;
    }

    public Serie(String title, int season, String genre, String creator) {
        this.title = title;
        this.season = season;
        this.isdelivered = false;
        this.genre = genre;
        this.creator = creator;
    }

    public String getTitle() {
        return title;
    }

    public int getSeason() {
        return season;
    }

    public String getGenre() {
        return genre;
    }

    public String getCreator() {
        return creator;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setSeason(int season) {
        this.season = season;
    }

    public void setGenre(String genere) {
        this.genre = genere;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    @Override
    public String toString() {
        return "Serie{" +
                "title='" + title + '\'' +
                ", season=" + season +
                ", isdelivered=" + isdelivered +
                ", genre='" + genre + '\'' +
                ", creator='" + creator + '\'' +
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
