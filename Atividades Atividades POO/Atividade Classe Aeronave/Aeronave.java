public class Aeronave {
    String modelo;
    int passageiros;
    double veloMax;
    double capacidadeCombu;
    double queimaCombuMin;

    public Aeronave(String modelo,int passageiros,double veloMax,double capacidadeCombu,double queimaCombuMin){
        this.modelo = modelo;
        this.passageiros = passageiros;
        this.veloMax = veloMax;
        this.capacidadeCombu = capacidadeCombu;
        this.queimaCombuMin = queimaCombuMin;
    }
    public double tempoNoAr(){
    return capacidadeCombu / queimaCombuMin;
    }
    public double calculoDeDistancia(){
        return veloMax * (tempoNoAr() / 60);
    }
}
