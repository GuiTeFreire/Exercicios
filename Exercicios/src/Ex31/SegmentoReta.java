package Ex31;

public class SegmentoReta {
    private Ponto pi, pf;

    public Ponto getPi() {
        return pi;
    }

    public void setPi(Ponto pi) {
        this.pi = pi;
    }

    public Ponto getPf() {
        return pf;
    }

    public void setPf(Ponto pf) {
        this.pf = pf;
    }

    public SegmentoReta(Ponto pi, Ponto pf) {
        this.pi = pi;
        this.pf = pf;
    }
    public SegmentoReta(float x1, float y1, float x2, float y2){
        this.pi = new Ponto(x1, y1);
        this.pf = new Ponto(x2, y2);
    }

    public double tamanho(){
        return Math.sqrt(Math.pow((this.pf.getX() - this.pi.getX()), 2) + Math.pow((this.pf.getY() - this.pi.getY()), 2));
    }
}
