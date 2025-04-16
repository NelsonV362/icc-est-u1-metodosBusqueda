package Controllers;

import Models.Person;

import  
Views.showConsole;


public class MetodosBusqueda {
    private Person[] people; private showConsole showConsole;



    public MetodosBusqueda(Person[] persons) {
        showConsole = new showConsole();
        this.people = persons;
    }
    public int busquedaLineal(int[] array, int elemento) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == elemento) {
                return i;
            }
        }
        return -1;
    }
    public int findPersonByCode(int code) {
        for (int i = 0; i < people.length; i++) {
            if (people[i].getCode() == code) {
                return i;
            }
        }
        return -1;
    }

    public void showPerson() {
        int codeToFind = showConsole.showBanner();
        int indexPerson = findPersonByCode(                 codeToFind);
        if (indexPerson >= 0) {
            showConsole.showMessage("Persona con código " + codeToFind + 
            
            
            " encontrada:");
            showConsole.showMessage(people[indexPerson].toString());
        } else {
            showConsole.showMessage("Persona con código " + codeToFind + " no encontrada.");
        }
    }

    public int findPersonByName(
        String name) {
        for (int i = 0; i < people.length; i++) {
            if (people[i].getName().equalsIgnoreCase(name)) {
                return i;
            }
        }
        return -1;
    }

   
    public void showPersonByName() {
        String nameToFind = showConsole.
        inputName();
        int indexPerson = findPersonByName(nameToFind);
        if (indexPerson >= 0) {
            showConsole.showMessage("Persona con nombre \"" + nameToFind +                              "\" encontrada:");
            showConsole.showMessage(people[indexPerson
            ].toString());
        } else {
            showConsole.showMessage("Persona con nombre \"              " + nameToFind + "\" no encontrada.");
        }
    }
}
