import java.io.File;

public class Filester {
    Classifier klasifkasi;

    State noPilihan;
    State input;
    State ready;
    State doneKlasifikasi;

    State state;

    public Filester(){
        noPilihan =  new NoPilihan(this);
        input = new Input(this);
        ready =  new Ready(this);
        doneKlasifikasi = new Klasifikasi(this);
        this.state= noPilihan;
    }

    public static void main(String[] args) {
        Filester tes = new Filester();

        tes.setPath("data/","dst/");
        tes.setPilihan(4);

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

    public State getNoPilihan(){
        return noPilihan;
    }

    public State getDoneKlasifikasi() {
        return doneKlasifikasi;
    }

    public void setState(State state) {
        this.state = state;
    }

    public State getInput() {
        return input;
    }

    public State getReady() {
        return ready;
    }
}
