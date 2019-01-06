public class Klasifikasi implements State {
    Filester filester;

    public Klasifikasi(Filester filester){
        this.filester=filester;
    }

    @Override
    public void setKlasifikasi(int pilihan) {
        System.out.println("Klasifikasi is done");
    }

    @Override
    public void setPath(String pathSrc, String pathDst) {
        System.out.println("Klasifikasi is done");
    }

    @Override
    public void runFilester() {
        System.out.println("Klasifikasi is done");
    }
}
