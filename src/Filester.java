public class Filester {
    Classifier klasifkasi;

    State noConfig;
    State hasConfig;
    State ready;
    State doneKlasifikasi;

    State state;

    public Filester(){
        noConfig =  new NoConfig(this);
        hasConfig = new HasConfig(this);
        ready =  new Ready(this);
        doneKlasifikasi = new Done(this);
        this.state= noConfig;
    }

    public static void main(String[] args) {
        Filester tes = new Filester();

        tes.setPath("data/","dst/");
        tes.setPilihan(4);
        tes.setPilihan(2);

        tes.runFilester();
    }

    public void setPilihan(int pilihan ){
        this.state.setKlasifikasi(pilihan);
    }

    public void setPath(String pathSrc,String pathDst){
        this.state.setPath(pathSrc,pathDst);
    }

    public void runFilester(){
        this.state.runFilester();
    }

    public State getNoConfig(){
        return noConfig;
    }

    public State getDoneKlasifikasi() {
        return doneKlasifikasi;
    }

    public void setState(State state) {
        this.state = state;
    }

    public State getInput() {
        return hasConfig;
    }

    public State getReady() {
        return ready;
    }
}
