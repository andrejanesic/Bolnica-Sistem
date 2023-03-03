package rs.raf.UI.P2.andreja_nesic.model.dto;

import rs.raf.UI.P2.andreja_nesic.model.Zaposleni;

import java.sql.Date;

public class ObukaDto extends AbstractDto<Integer> {

    private int obukaId;
    private String procedura;
    private Date pocetak;
    private Date kraj;
    private String sertifikat;
    private String kod;
    private Zaposleni zaposleni;

    public ObukaDto() {
    }

    public void setObukaId(int obukaId) {
        this.obukaId = obukaId;
    }

    public int getObukaId() {
        return this.obukaId;
    }

    public void setProcedura(String procedura) {
        this.procedura = procedura;
    }

    public String getProcedura() {
        return this.procedura;
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

    public void setSertifikat(String sertifikat) {
        this.sertifikat = sertifikat;
    }

    public String getSertifikat() {
        return this.sertifikat;
    }

    public void setKod(String kod) {
        this.kod = kod;
    }

    public String getKod() {
        return this.kod;
    }

    public void setZaposleni(Zaposleni zaposleni) {
        this.zaposleni = zaposleni;
    }

    public Zaposleni getZaposleni() {
        return this.zaposleni;
    }
}