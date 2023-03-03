package rs.raf.UI.P2.andreja_nesic.model.dto;

import rs.raf.UI.P2.andreja_nesic.model.Odeljenje;

public class BlokDto extends AbstractDto<Integer> {

    private int blokId;
    private String kod;
    private String ime;
    private int sprat;
    private Odeljenje odeljenje;

    public BlokDto() {
    }

    public void setBlokId(int blokId) {
        this.blokId = blokId;
    }

    public int getBlokId() {
        return this.blokId;
    }

    public void setKod(String kod) {
        this.kod = kod;
    }

    public String getKod() {
        return this.kod;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getIme() {
        return this.ime;
    }

    public void setSprat(int sprat) {
        this.sprat = sprat;
    }

    public int getSprat() {
        return this.sprat;
    }

    public void setOdeljenje(Odeljenje odeljenje) {
        this.odeljenje = odeljenje;
    }

    public Odeljenje getOdeljenje() {
        return this.odeljenje;
    }
}