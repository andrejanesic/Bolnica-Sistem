package rs.raf.UI.P2.andreja_nesic.model.dto;

import rs.raf.UI.P2.andreja_nesic.model.Pacijent;

public class ReceptDto extends AbstractDto<Integer> {

    private int receptId;
    private int doza;
    private int pocetak;
    private int trajanje;
    private boolean obnavljajuci;
    private Pacijent pacijent;

    public ReceptDto() {
    }

    public void setReceptId(int receptId) {
        this.receptId = receptId;
    }

    public int getReceptId() {
        return this.receptId;
    }

    public void setDoza(int doza) {
        this.doza = doza;
    }

    public int getDoza() {
        return this.doza;
    }

    public void setPocetak(int pocetak) {
        this.pocetak = pocetak;
    }

    public int getPocetak() {
        return this.pocetak;
    }

    public void setTrajanje(int trajanje) {
        this.trajanje = trajanje;
    }

    public int getTrajanje() {
        return this.trajanje;
    }

    public void setObnavljajuci(boolean obnavljajuci) {
        this.obnavljajuci = obnavljajuci;
    }

    public boolean getObnavljajuci() {
        return this.obnavljajuci;
    }

    public void setPacijent(Pacijent pacijent) {
        this.pacijent = pacijent;
    }

    public Pacijent getPacijent() {
        return this.pacijent;
    }
}