public class Ready implements State{
    Filester filester;

    public Ready(Filester filester){
        this.filester=filester;
    }
    @Override
    public void setKlasifikasi(int pilihan) {

    }

    @Override
    public void setPath(String pathSrc, String pathDst) {

    }

    @Override
    public void runFilester(){
        if(this.filester.klasifkasi !=null){
            System.out.println("tenkukan pilihan ");
        }
        if(this.filester.klasifkasi.getPathSrc()!=null && this.filester.klasifkasi.getPathDst()!=null){
            this.filester.klasifkasi.setData();
            this.filester.klasifkasi.writeData();
            filester.setState(filester.getDoneKlasifikasi());
        }else{
            System.out.println("erorr path src || dst : ikuti prosedure");
        }
    }
}
