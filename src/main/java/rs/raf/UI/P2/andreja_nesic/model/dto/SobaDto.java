package rs.raf.UI.P2.andreja_nesic.model.dto;

import rs.raf.UI.P2.andreja_nesic.model.Blok;

public class SobaDto extends AbstractDto<Integer> {

    private int sobaId;
    private String broj;
    private Blok blok;

    public SobaDto() {
    }

    public void setSobaId(int sobaId) {
        this.sobaId = sobaId;
    }

    public int getSobaId() {
        return this.sobaId;
    }

    public void setBroj(String broj) {
        this.broj = broj;
    }

    public String getBroj() {
        return this.broj;
    }

    public void setBlok(Blok blok) {
        this.blok = blok;
    }

    public Blok getBlok() {
        return this.blok;
    }
}