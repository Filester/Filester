import java.io.File;

public class InPilihan implements State {
    Filester filester;

    public InPilihan(Filester filester){
        this.filester=filester;
    }
    @Override
    public void setKlasifikasi(int pilihan) {
        System.out.println("cant input pilihan klasifikasi");
    }

    @Override
    public void setPath(String pathSrc, String pathDst){
        if(filester.klasifkasi ==null) {
            return;
        }
        if(pathSrc.compareToIgnoreCase(pathDst)==0){
            System.out.println("error src == dst");
            System.out.println("src : "+pathSrc);
            System.out.println("dst : "+pathDst);
            return;
        }
        File fileSrc = new File(pathSrc);
        File fileDst = new File(pathDst);

        if(fileSrc.isDirectory() && fileDst.isDirectory()){

            if(fileSrc.list().length==0 ){

                System.out.println("src : Directory is empty!");
                return;
            }
            if(fileDst.list().length!=0 ){
                System.out.println("dst : Directory is not empty!");
                return;
            }

        }
        System.out.println("add src "+pathSrc);
        System.out.println("add dst "+pathDst);
        this.filester.klasifkasi.setPathSrc(pathSrc);
        this.filester.klasifkasi.setPathDst(pathDst);

        filester.setState(filester.getPath());
    }

    @Override
    public void runFilester() {
        System.out.println("cant runFilester in InPilihan : input path ");
    }
}
