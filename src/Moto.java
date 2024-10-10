public class Moto {
    private String marca;
    private int ano;
    private String placa;
    private String cor;
    private String modelo;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public Moto(String marca, int ano, String placa, String cor, String modelo){
        this.marca = marca;
        this.ano = ano;
        this.placa = placa;
        this.cor = cor;
        this.modelo = modelo;

    }
        public Moto(){}

    @Override
    public String toString() {
        return "Moto{" +
                "marca='" + marca + '\'' +
                ", ano=" + ano +
                ", placa='" + placa + '\'' +
                ", cor='" + cor + '\'' +
                ", modelo='" + modelo + '\'' +
                '}';
    }
}
