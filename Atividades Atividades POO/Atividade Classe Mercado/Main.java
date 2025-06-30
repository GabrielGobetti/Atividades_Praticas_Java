public class Main {
    public static void main(String[] args) {
        //Criando vetor
    Mercado[] mercados = {
            new Mercado("Unidade de Blumenau",200,2.5,250,1.99),
            new Mercado("Unidade de Joinville",300,2,600,1.50),
            new Mercado("Unidade de Florianopolis",500,2.50,700,2.25)
    };

    Mercado maiorMacas = mercados[0]; // Criando uma variavel que guarda o obj inteiro
        //Maior Faturamento de maças
    for (Mercado m : mercados){
        if (m.faturamentoMacas() > maiorMacas.faturamentoMacas()){
            maiorMacas = m;

        }
    }
    //Maior faturamento de Laranjas
    Mercado maiorLaras = mercados[0];
    for (Mercado m : mercados){
        if (m.faturamentoLaras() > maiorLaras.faturamentoLaras()){
            maiorLaras = m;
        }
    }
    // Mercado com a maior Receita
    Mercado maiorReceita = mercados[0];
    for (Mercado m : mercados){
        if (m.faturamentoTotal() > maiorReceita.faturamentoTotal()){
            maiorReceita = m;
        }
    }
    // Mercado com a menor Receita
    Mercado menorReceita = mercados[0];
    for (Mercado m : mercados){
        if (m.faturamentoTotal() < menorReceita.faturamentoTotal()){
            menorReceita = m;
        }
    }
    //Mercado que não foi o maior nem o menor faturamento
    Mercado lojaDoMeio = mercados[0];
    for (Mercado m : mercados){
        if (m != menorReceita && m != maiorReceita){
            lojaDoMeio = m;
        }
    }
    //Comparação entre o faturamento dos mercados com laranjas, para ver se foi vendido mais Laranjas ou Maças.
    double totalLaras = 0;
    double totalMacas = 0;
    for (Mercado m : mercados){
        totalLaras += m.faturamentoLaras();
        totalMacas += m.faturamentoMacas();

    }
    //Comparador
    String maisVendido ="";
    if (totalMacas > totalLaras){
        maisVendido = "Maças";
    }
    else {
        maisVendido ="Laranjas";
    }
        //Mostrar os dados.
        System.out.println("Maior receita vendendo maçãs: " + maiorMacas.nomeMercado);
        System.out.println("Maior receita vendendo laranjas: " + maiorLaras.nomeMercado);
        System.out.println("Maior receita total: " + maiorReceita.nomeMercado);
        System.out.println("Menor receita total: " + menorReceita.nomeMercado);
        System.out.println("Loja do meio em faturamento: " + lojaDoMeio.nomeMercado);
        System.out.println("A franquia faturou mais vendendo: " + maisVendido);
    }
}