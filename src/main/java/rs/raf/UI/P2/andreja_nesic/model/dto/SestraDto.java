package rs.raf.UI.P2.andreja_nesic.model.dto;

public class SestraDto extends AbstractDto<String> {

    private String pozicija;
    private byte licenca;

    public SestraDto() {
    }

    public void setPozicija(String pozicija) {
        this.pozicija = pozicija;
    }

    public String getPozicija() {
        return this.pozicija;
    }

    public void setLicenca(byte licenca) {
        this.licenca = licenca;
    }

    public byte getLicenca() {
        return this.licenca;
    }
}