package Server;

import java.util.ArrayList;

public class PuntiVendita {
   
    private int size;
    private ArrayList <PuntiVendita> punti = new ArrayList <>();

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public ArrayList<PuntiVendita> getPunti() {
        return punti;
    }

    public void setPunti(ArrayList<PuntiVendita> punti) {
        this.punti = punti;
    }
    
}
