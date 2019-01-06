public class Done implements State {
    Filester filester;

    public Done(Filester filester){
        this.filester=filester;
    }

    @Override
    public void setKlasifikasi(int pilihan) {
        System.out.println("Done is done");
    }

    @Override
    public void setPath(String pathSrc, String pathDst) {
        System.out.println("Done is done");
    }

    @Override
    public void runFilester() {
        System.out.println("Done is done");

    }
}
