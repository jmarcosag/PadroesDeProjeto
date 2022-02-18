package padroescriacao.singleton;

public class Url {

    private Url() {};
    private static Url instance = new Url();
    public static Url getInstance() {
        return instance;
    }

    private String endpoint;
    private String local;

    public String getEndpoint() {
        return endpoint;
    }

    public void setEndpoint(String endpoint) {
        this.endpoint = endpoint;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }
}
