package Clase;

/**
 * @author T O S H I B A
 */
public class tweet {
    private int id;
    private String tweet;
    private String mensaje;

    public tweet() {
    }

    public tweet(int id, String tweet, String mensaje) {
        this.id = id;
        this.tweet = tweet;
        this.mensaje = mensaje;
    }
    
    public tweet(String tweet, String mensaje) {
        this.tweet = tweet;
        this.mensaje = mensaje;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTweet() {
        return tweet;
    }

    public void setTweet(String tweet) {
        this.tweet = tweet;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    @Override
    public String toString() {
        return "tweet{" + "id=" + id + ", tweet=" + tweet + ", mensaje=" + mensaje + '}';
    }
}
