package rs.raf.UI.P2.andreja_nesic.model.dto;

import rs.raf.UI.P2.andreja_nesic.model.Zaposleni;

public class OdeljenjeDto extends AbstractDto<Integer> {

    private int odeljenjeId;
    private int ime;
    private Zaposleni zaposleni;

    public OdeljenjeDto() {
    }

    public void setOdeljenjeId(int odeljenjeId) {
        this.odeljenjeId = odeljenjeId;
    }

    public int getOdeljenjeId() {
        return this.odeljenjeId;
    }

    public void setIme(int ime) {
        this.ime = ime;
    }

    public int getIme() {
        return this.ime;
    }

    public void setZaposleni(Zaposleni zaposleni) {
        this.zaposleni = zaposleni;
    }

    public Zaposleni getZaposleni() {
        return this.zaposleni;
    }
}