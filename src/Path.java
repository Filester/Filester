public class Path implements State {

    Filester filester;

    public Path(Filester filester){
        this.filester=filester;
    }
    @Override
    public void setKlasifikasi(int pilihan) {
        System.out.println("cant set pilihan");
    }

    @Override
    public void setPath(String pathSrc, String pathDst) {
        System.out.println("cant set pilihan");
    }

    @Override
    public void runFilester(){
        if(this.filester.klasifkasi !=null && this.filester.klasifkasi.getPathSrc()!=null && this.filester.klasifkasi.getPathDst()!=null){
            this.filester.klasifkasi.setData();
            this.filester.klasifkasi.writeData();
            filester.setState(filester.getDoneKlasifikasi());
        }else{
            System.out.println("ikuti prosedure");
        }
    }
}
