package rs.raf.UI.P2.andreja_nesic.model.dto;

import rs.raf.UI.P2.andreja_nesic.model.Zaposleni;

import java.sql.Date;

public class DezurstvoDto extends AbstractDto<Integer> {

    private int dezurstvoId;
    private Date pocetak;
    private Date kraj;
    private Zaposleni zaposleni;

    public DezurstvoDto() {
    }

    public void setDezurstvoId(int dezurstvoId) {
        this.dezurstvoId = dezurstvoId;
    }

    public int getDezurstvoId() {
        return this.dezurstvoId;
    }

    public void setPocetak(java.sql.Date pocetak) {
        this.pocetak = pocetak;
    }

    public java.sql.Date getPocetak() {
        return this.pocetak;
    }

    public void setKraj(java.sql.Date kraj) {
        this.kraj = kraj;
    }

    public java.sql.Date getKraj() {
        return this.kraj;
    }

    public void setZaposleni(Zaposleni zaposleni) {
        this.zaposleni = zaposleni;
    }

    public Zaposleni getZaposleni() {
        return this.zaposleni;
    }
}