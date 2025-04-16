package Controllers;

import Models.Person;
import Views.showConsole;

public class MetodosBusqueda {

    private Person[]people;

    private Views.showConsole showConsole;

    public MetodosBusqueda(Person[] persons){
        showConsole=new showConsole();
        this.people=persons;
    }


        public int busquedaLineal(int [] array, int elemento){
            for (int i=0; i<array.length; i++){
                if (array[i]==elemento){
                    return i;
                }
            }
            return -1;
        }
        
/*
 * @parametro code a buscar
 * @return posicion de la persona encontrada
 */
public int findPersonByCode(int code){
    for (int i = 0; i < people.length; i++) {
        if (people[i].getCode() == code) {
            return i;
        }
    }
    return -1;
}

        public void showPerson(){
            int CodeToFind = showConsole.showBanner();
            int indexPerson = findPersonByCode(CodeToFind);
            if (indexPerson>=0){
                showConsole.showMessage("Persona con codigo " +CodeToFind+"encontrada");
                showConsole.showMessage(people[indexPerson].toString());
        }
    }
    public void showPersonByName(){
        String nameTofinde = showConsole.inputName();
        int indexPerson= findPersonByName(nameTofinde);
    }
    
}