public class HolaMundo {
    public static void main(String arg[]){
        for (int i=0; i<3; i++){
            System.out.println("Saludos");
        }
        String saludar = "saludos";
        System.out.println(saludar);
        System.out.println(saludar);
        System.out.println(saludar);

        var despedirse = "Hasta luego";
        System.out.println(saludar+" "+despedirse);

        Cliente cliente = new Cliente("11-1", "Cliente1");
        Admin admin = new Admin("ant", "pass");
        Imprimir imprimir = new Imprimir(cliente);
        imprimir.imprimirObjetoPorImpresora();
        Imprimir imprimir1 = new Imprimir(admin);
        imprimir1.imprimirObjetoPorImpresora();
    }
}
