package Uni.uni;

public class Personne {

    protected int idP, nSS;
    String nomP, prenomP;

    public int getIdP() {
        return idP;
    }

    public void setIdP(int idP) {
        this.idP = idP;
    }

    public int getnSS() {
        return nSS;
    }

    public void setnSS(int nSS) {
        this.nSS = nSS;
    }

    public String getNomP() {
        return nomP;
    }

    public void setNomP(String nomP) {
        this.nomP = nomP;
    }

    public String getPrenomP() {
        return prenomP;
    }

    public void setPrenomP(String prenomP) {
        this.prenomP = prenomP;
    }


    public Personne(int idP, int nSS, String nomP, String prenomP) {
        super();
        this.idP = idP;
        this.nSS = nSS;
        this.nomP = nomP;
        this.prenomP = prenomP;
    }
}