
package com.mycompany.poo;

public class Poo {

    public static void main(String[] args) {
        Character homero = new Character("Homero", "Inspector de seguridad nuclear", 33, "A la grande le puse cuca");
       homero.greeting ();
        System.out.println(homero.age);
        
        Character Bart = new Character("Bartolomeo", "Vago", 10, "Ay Caramba");
        Bart.greeting();
    }
    
      
        
    static class Character {
        String name;
        String occupation;
        int age;
        String phrase;

        public Character(String name, String occupation, int age, String phrase) {
            this.name = name;
            this.occupation = occupation;
            this.age = age;
            this.phrase = phrase;
        }
       
        void greeting(){
              System.out.println(this.phrase);
               
          }        
        
    }
}
