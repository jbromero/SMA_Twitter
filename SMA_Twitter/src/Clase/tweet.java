package Clase;

/**
 * @author T O S H I B A
 */
public class tweet {
    private String tweet;
    private String mensaje;

    public tweet() {
    }
    
    public tweet(String tweet, String mensaje) {
        this.tweet = tweet;
        this.mensaje = mensaje;
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
        return "tweet{" + "tweet=" + tweet + ", mensaje=" + mensaje + '}';
    }
}
