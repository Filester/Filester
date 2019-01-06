import java.io.File;

public class Input implements State{
    Filester filester;

    public Input(Filester filester){
        this.filester=filester;
    }

    @Override
    public void setKlasifikasi(int pilihan) {
        if(pilihan<1 || pilihan >4){
            System.out.println("error pilihan :"+ pilihan +"\n 1 : extension \n 2 : year \n 3 : month \n 4 : alfabet ");
            return;
        }
        if(pilihan==1){
            this.filester.klasifkasi = new Extension();
        }
        else if (pilihan==2){
            this.filester.klasifkasi = new Year();
        }
        else if(pilihan==3){
            this.filester.klasifkasi = new Month();
        }
        else {
            this.filester.klasifkasi = new Alfabet();
        }

        if(this.filester.klasifkasi.getPathSrc()!=null && this.filester.klasifkasi.getPathDst()!=null){
            filester.setState(filester.getReady());
        }
    }

    @Override
    public void setPath(String pathSrc, String pathDst){
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
        if(this.filester.klasifkasi !=null) {
            filester.setState(filester.getReady());
        }
    }

    @Override
    public void runFilester() {

    }
}
