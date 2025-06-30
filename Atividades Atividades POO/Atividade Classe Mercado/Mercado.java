public class Mercado {
    String nomeMercado;
    int macasVendidas;
    double precoVendasMacas;
    int larasVendidas;
    double precoVendasLaras;


    public Mercado(String nomeMercado,int macasVendidas,double precoVendasMacas,int larasVendidas,double precoVendasLaras){
        this.nomeMercado = nomeMercado;
        this.macasVendidas = macasVendidas;
        this.precoVendasMacas = precoVendasMacas;
        this.larasVendidas = larasVendidas;
        this.precoVendasLaras = precoVendasLaras;


    }

    public double faturamentoMacas(){
        return macasVendidas * precoVendasMacas;
    }

    public double faturamentoLaras(){
        return larasVendidas * precoVendasLaras;
    }
    public double faturamentoTotal(){
        return (larasVendidas * precoVendasLaras) + (macasVendidas * precoVendasMacas);
    }

    public void mostrarInfos(){
        System.out.println("------Infos da "+nomeMercado+"------");
        System.out.println("A quantidade de Maças vendidas foram: "+macasVendidas);
        System.out.println("O preço cobrado por maças vendidas foi: R$ "+String.format("%.2f",precoVendasMacas));
        System.out.println("A quantidade de Laranjas vendidas foi: "+larasVendidas);
        System.out.println("O preço cobrado por Laranjas vendidas foi: R$ "+String.format("%.2f",precoVendasLaras));

    }

}
