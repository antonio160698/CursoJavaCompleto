public class Imprimir {
    private Imprimable ob;

    public Imprimir(Imprimable ob) {
        this.ob = ob;
    }
    public void imprimirObjetoPorImpresora(){
        System.out.println(this.ob.imprimir());
    }
}
