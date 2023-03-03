package rs.raf.UI.P2.andreja_nesic.model.dto;

public class ZaposleniDto extends AbstractDto<Integer> {

    private int zaposleniId;
    private String ime;
    private String prezime;

    public ZaposleniDto() {
    }

    public void setZaposleniId(int zaposleniId) {
        this.zaposleniId = zaposleniId;
    }

    public int getZaposleniId() {
        return this.zaposleniId;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getIme() {
        return this.ime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public String getPrezime() {
        return this.prezime;
    }
}