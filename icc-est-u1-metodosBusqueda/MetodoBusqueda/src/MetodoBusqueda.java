public class MetodoBusqueda {
    //Nuevamente profe, falte y no me entere bien que fue lo que sucedio en la clase y opte por el metodoburbuja
    public int busqueda(int[] listado, int valor){
        for(int i=0; i<listado.length; i++){
            if (listado[i]==valor){
                return i;
            }
        }
        return -1;
    }
    public void ordenamientoBurbuja(int[] listado){
        int n=listado.length;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(listado[j]>listado[j+1]){
                    int temp=listado[j];
                    listado[j]=listado[j+1];
                    listado[j+1]=temp;
                }
            }
        }
    }
}
