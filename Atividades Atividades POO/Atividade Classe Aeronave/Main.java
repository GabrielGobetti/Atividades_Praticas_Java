//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
    Aeronave[] naves = {
            new Aeronave( "Gripen E",1,2.470,3.400,80),
            new Aeronave("KC-390 Millennium",80,870,23.000,115),
            new Aeronave("AH-15B Super Cougar",30,324,3.690,22),
            new Aeronave("P-3AM Orion",11,761,34.096,110)
    };
    // Separa a nave com maior numero de passageiros
    Aeronave maiorNumPassagers = naves[0];
    for (Aeronave a : naves){
        if (a.passageiros > maiorNumPassagers.passageiros){
            maiorNumPassagers = a;
        }
    }
    // Separa a nave que pode ficar mais tempo no Ar
    Aeronave naveTempoArMaior = naves[0];
    for (Aeronave a : naves){
        if (a.tempoNoAr() > naveTempoArMaior.tempoNoAr()){
            naveTempoArMaior = a;
        }
    }
    //Separa a nave que pode percorrer mais distancia
    Aeronave naveMaiorDistancia = naves[0];
    for (Aeronave a : naves){
        if (a.calculoDeDistancia() > naveMaiorDistancia.calculoDeDistancia()){
            naveMaiorDistancia = a;
        }
    }
        System.out.println("A nave com a maior capacidade para passageiros é a "+maiorNumPassagers.modelo);
        System.out.println();
        System.out.println("A nave que pode ficar mais tempo no ar é a "+naveTempoArMaior.modelo);
        System.out.println();
        System.out.println("A nave que pode percorrer a maior distancia é "+naveMaiorDistancia.modelo);

    }
}