package rs.raf.UI.P2.andreja_nesic.model.dto;

public class LekDto extends AbstractDto<Integer> {

    private int lekId;
    private String naziv;
    private String proizvodjac;
    private String grupa;
    private String tip;
    private String sastav;

    public LekDto() {
    }

    public void setLekId(int lekId) {
        this.lekId = lekId;
    }

    public int getLekId() {
        return this.lekId;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public String getNaziv() {
        return this.naziv;
    }

    public void setProizvodjac(String proizvodjac) {
        this.proizvodjac = proizvodjac;
    }

    public String getProizvodjac() {
        return this.proizvodjac;
    }

    public void setGrupa(String grupa) {
        this.grupa = grupa;
    }

    public String getGrupa() {
        return this.grupa;
    }

    public void setTip(String tip) {
        this.tip = tip;
    }

    public String getTip() {
        return this.tip;
    }

    public void setSastav(String sastav) {
        this.sastav = sastav;
    }

    public String getSastav() {
        return this.sastav;
    }
}