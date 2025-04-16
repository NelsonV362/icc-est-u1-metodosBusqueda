package Controllers;

import Models.Person;
import Views.showConsole;

public class MetodoBusquedaBinario {


    private Person[] people;
    private showConsole pantalla;

    public MetodoBusquedaBinario(Person[] people){
        //la variable people instanciada bajo el argumento que llega al mismo constructor
        this.people = people;
        this.pantalla = new showConsole();
pantalla.showMessage("Metodo de busqueda binaria");

    }
    
    private int findPersonByCode(int code){
        int bajo=0;
        int alto= people.length-1;
        //alto>=bajo para que se mantenga en repeticion mientras se cumple la condicion, porque si fuera unicamente > seria solo 
        //para que se cumpla la condicion base sin repeticiones
        while (alto>=bajo) { 
            int central = (bajo+alto)/2;
            if(people[central].getCode()== code){
                //los metodos de busqueda devuelven siempre la posicion nunca el codigo
                return central;
            }
            if(people[central].getCode()>code){
                alto= central-1;// en caso de cumplir la condicion de mayor, se va a la izquierda por eso es central-1
            }else{ 
                bajo=central+1;// en caso de NO cumplir la condicion de mayor, se va a la derecha por eso es bajo=central+1
            }
        }
        return-1;
    }
    public void showPersonByName(){
        int codeToFind= pantalla.inputCode();
        int indexPerson = findPersonByCode(codeToFind);
        if (indexPerson==-1) {
            pantalla.showMessage("Persona con codigo    "+codeToFind+ "       no entontrada");
            
        }else{
            pantalla.showMessage("Persona con codio"+codeToFind+"Encontrada");
            pantalla.showMessage(people[indexPerson].toString());
        }
    }

}
