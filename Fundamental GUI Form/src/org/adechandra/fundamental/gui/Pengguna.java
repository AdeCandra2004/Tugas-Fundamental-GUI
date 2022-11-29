package org.adechandra.fundamental.gui;

public class Pengguna {
    private String kartu;
    private String atm;
    private String bank;
    private String pengguna;
    private String namagambar;

    public Pengguna() {
    }

    public Pengguna(String kartu, String atm, String bank, String pengguna, String namagambar) {
        this.kartu = kartu;
        this.atm = atm;
        this.bank = bank;
        this.pengguna = pengguna;
        this.namagambar = namagambar;
    }

    public String getKartu() {
        return kartu;
    }

    public void setKartu(String kartu) {
        this.kartu = kartu;
    }

    public String getAtm() {
        return atm;
    }

    public void setAtm(String atm) {
        this.atm = atm;
    }

    public String getBank() {
        return bank;
    }

    public void setBank(String bank) {
        this.bank = bank;
    }

    public String getPengguna() {
        return pengguna;
    }

    public void setPengguna(String pengguna) {
        this.pengguna = pengguna;
    }

    public String getNamagambar() {
        return namagambar;
    }

    public void setNamagambar(String namagambar) {
        this.namagambar = namagambar;
    }

    @Override
    public String toString() {
        return ("\nNo Kartu = " + kartu + "\nJenis ATM = " + atm + "\nBank = " + bank +
                "\nNama Pemilik = " + pengguna + "\nNama File Gambar = " + namagambar);
    }
}
