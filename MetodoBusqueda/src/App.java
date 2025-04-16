import Controllers.MetodoBusquedaBinario;
import Controllers.MetodosBusqueda;
import Models.Person;

public class App {
    
    public static void main(String[] args) throws Exception {
        Person[] personas= new Person[7];
        personas[0]= new Person(101, "Juan");
        personas[1]= new Person(102, "Pedro");
        personas[2]= new Person(103, "Ana");
        personas[3]= new Person(104, "Luis");
        personas[4]= new Person(105, "Maria");
        personas[5]= new Person(106, "Carlos");
        personas[6]= new Person(107, "Sofia");
        //MetodosBusqueda mB= new MetodosBusqueda(personas);
        MetodoBusquedaBinario mBB= new MetodoBusquedaBinario(personas);
        mBB.showPersonByName();
    }
}
