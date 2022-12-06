package Ex30;

public class Carro {
    private String modelo;
    private Motor motor;

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public Carro(String modelo, Motor motor) {
        this.modelo = modelo;
        this.motor = motor;
    }

    public float velocidadeMaxima(){
        if (this.motor.getCilindrada() <= 1.0)
            return 140;
        else if (this.motor.getCilindrada() > 1.0 && this.motor.getCilindrada() <= 1.6)
            return 180;
        else if (this.motor.getCilindrada() > 1.6 && this.motor.getCilindrada() <= 2.0)
            return 220;
        else
            return 260;
    }

    @Override
    public String toString() {
        return "Carro: " + "modelo='" + modelo + '\'' + ", motor=" + motor;
    }
}
