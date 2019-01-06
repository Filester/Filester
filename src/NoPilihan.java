public class NoPilihan implements State {
    Filester filester;

    public NoPilihan(Filester filester){
        this.filester=filester;
    }

    @Override
    public void setKlasifikasi(int pilihan) {
        if(pilihan==1){
            this.filester.klasifkasi = new Extension();
            filester.setState(filester.getInPilihan());
        }
        else if (pilihan==2){
            this.filester.klasifkasi = new Year();
            filester.setState(filester.getInPilihan());
        }
        else if(pilihan==3){
            this.filester.klasifkasi = new Month();
            filester.setState(filester.getInPilihan());
        }
        else if(pilihan==4){
            this.filester.klasifkasi = new Alfabet();
            filester.setState(filester.getInPilihan());
        }
        else{
            System.out.println("error pilihan :"+ pilihan +"\n 1 : extension \n 2 : year \n 3 : month \n 4 : alfabet ");
        }
    }

    @Override
    public void setPath(String pathSrc, String pathDst) {
        System.out.println("cant set path in noPilihan : input pilihan klasifkasi");
    }

    @Override
    public void runFilester() {
        System.out.println("cant runFilester in noPilihan : input pilihan klasifkasi");
    }
}
