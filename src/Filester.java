import java.io.File;

public class Filester {
    Classifier klasifkasi;

    State noPilihan;
    State inPilihan;
    State path;
    State doneKlasifikasi;

    State state;

    public Filester(){
        noPilihan =  new NoPilihan(this);
        inPilihan = new InPilihan(this);
        path =  new Path(this);
        doneKlasifikasi = new Klasifikasi(this);
        this.state= noPilihan;
    }

    public static void main(String[] args) {
        Filester tes = new Filester();
        tes.setPilihan(1);
        tes.setPath("data/","dst/");
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

    public State getInPilihan() {
        return inPilihan;
    }

    public State getPath() {
        return path;
    }

    public State getDoneKlasifikasi() {
        return doneKlasifikasi;
    }

    public void setState(State state) {
        this.state = state;
    }

}
