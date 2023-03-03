package rs.raf.UI.P2.andreja_nesic.model.dto;

import rs.raf.UI.P2.andreja_nesic.model.Zaposleni;

import java.sql.Date;

public class OdmorDto extends AbstractDto<Integer> {

    private int odmorId;
    private Date pocetak;
    private Date kraj;
    private Zaposleni zaposleni;

    public OdmorDto() {
    }

    public void setOdmorId(int odmorId) {
        this.odmorId = odmorId;
    }

    public int getOdmorId() {
        return this.odmorId;
    }

    public void setPocetak(Date pocetak) {
        this.pocetak = pocetak;
    }

    public Date getPocetak() {
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