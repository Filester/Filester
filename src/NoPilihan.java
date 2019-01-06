public class NoPilihan implements State {
    Filester filester;

    public NoPilihan(Filester filester){
        this.filester=filester;
    }

    @Override
    public void setKlasifikasi(int pilihan) {
        filester.setState(filester.getInput());
        filester.setPilihan(pilihan);
    }

    @Override
    public void setPath(String pathSrc, String pathDst) {
        filester.setState(filester.getInput());
        filester.setPath(pathSrc,pathDst);
    }

    @Override
    public void runFilester() {
        System.out.println("cant runFilester in noPilihan : input pilihan klasifkasi");
    }
}
