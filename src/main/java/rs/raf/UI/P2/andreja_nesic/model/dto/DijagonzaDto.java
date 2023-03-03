package rs.raf.UI.P2.andreja_nesic.model.dto;

import rs.raf.UI.P2.andreja_nesic.model.Pacijent;

import java.sql.Date;

public class DijagonzaDto extends AbstractDto<Integer> {
    
    private int dijagnozaId;
    private Date pocetak;
    private Date kraj;
    private String sifra;
    private String ime;
    private Pacijent pacijent;

    public DijagonzaDto() {
    }

    public void setDijagnozaId(int dijagnozaId) {
        this.dijagnozaId = dijagnozaId;
    }

    public int getDijagnozaId() {
        return this.dijagnozaId;
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

    public void setSifra(String sifra) {
        this.sifra = sifra;
    }

    public String getSifra() {
        return this.sifra;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getIme() {
        return this.ime;
    }

    public void setPacijent(Pacijent pacijent) {
        this.pacijent = pacijent;
    }

    public Pacijent getPacijent() {
        return this.pacijent;
    }
}