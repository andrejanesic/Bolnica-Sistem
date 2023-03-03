package rs.raf.UI.P2.andreja_nesic.model.dto;

import rs.raf.UI.P2.andreja_nesic.model.Pacijent;

public class OsiguranjeDto extends AbstractDto<Integer> {

    private int osiguranjeId;
    private String tip;
    private String broj;
    private Pacijent pacijent;

    public OsiguranjeDto() {
    }

    public void setOsiguranjeId(int osiguranjeId) {
        this.osiguranjeId = osiguranjeId;
    }

    public int getOsiguranjeId() {
        return this.osiguranjeId;
    }

    public void setTip(String tip) {
        this.tip = tip;
    }

    public String getTip() {
        return this.tip;
    }

    public void setBroj(String broj) {
        this.broj = broj;
    }

    public String getBroj() {
        return this.broj;
    }

    public void setPacijent(Pacijent pacijent) {
        this.pacijent = pacijent;
    }

    public Pacijent getPacijent() {
        return this.pacijent;
    }
}