public class App {
    static MetodoBusqueda metodosBusqueda = new MetodoBusqueda();
    public static void main (String[] args ){
        int[] listado={10,8,21,9,7};
        System.out.println("Listado inicial:");
        imprimirlistado(listado);
        //profe como falte no se con cual metodo exactamente hizo, asi que  yo coloque el burbuja
        metodosBusqueda.ordenamientoBurbuja(listado);
        System.out.println("Listado final");
        imprimirlistado(listado);
    }
    public static void imprimirlistado(int[] listado){
        for(int i:listado){
            System.out.println(i+"");
        }
        System.out.println();
    }
}
