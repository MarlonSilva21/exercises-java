package application;

import entities.ClientHashCodeAndEquals;

public class ProgramHashCodeAndEquals {

    public static void main(String[] args) {

        ClientHashCodeAndEquals c1 = new ClientHashCodeAndEquals("Maria", "maria@gmail.com");
        ClientHashCodeAndEquals c2 = new ClientHashCodeAndEquals("Maria", "maria@gmail.com");

        String s1 = new String("test");
        String s2 = new String("test");


        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());
        System.out.println(c1.equals(c2)); //comparar o conteudo dos objetos
        System.out.println(c1 == c2); //comparar a referencia do objeto na memoria

        System.out.println(s1 == s2);

    }
}
