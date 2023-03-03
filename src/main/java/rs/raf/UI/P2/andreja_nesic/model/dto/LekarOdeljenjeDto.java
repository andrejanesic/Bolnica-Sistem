package rs.raf.UI.P2.andreja_nesic.model.dto;

import rs.raf.UI.P2.andreja_nesic.model.LekarOdeljenjePK;
import rs.raf.UI.P2.andreja_nesic.model.Odeljenje;
import rs.raf.UI.P2.andreja_nesic.model.Zaposleni;

public class LekarOdeljenjeDto extends AbstractDto<LekarOdeljenjePK> {

    private LekarOdeljenjePK id;
    private Zaposleni zaposleni;
    private Odeljenje odeljenje;

    public LekarOdeljenjeDto() {
    }

    public void setId(LekarOdeljenjePK id) {
        this.id = id;
    }

    public LekarOdeljenjePK getId() {
        return this.id;
    }

    public void setZaposleni(Zaposleni zaposleni) {
        this.zaposleni = zaposleni;
    }

    public Zaposleni getZaposleni() {
        return this.zaposleni;
    }

    public void setOdeljenje(Odeljenje odeljenje) {
        this.odeljenje = odeljenje;
    }

    public Odeljenje getOdeljenje() {
        return this.odeljenje;
    }
}