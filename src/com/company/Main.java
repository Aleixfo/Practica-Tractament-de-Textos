package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        boolean sortida=false;

        Scanner sc = new Scanner(System.in);

        System.out.println("Introdueix una frase: ");
        String frase = sc.nextLine();
        frase = frase.toLowerCase();

        do {

            Opcions.menuOpcions();

            System.out.println(" ");
            System.out.print("\nOpció: ");
            int x = sc.nextInt();

            switch (x) {

                case 0:
                    sortida = true;
                    System.out.println("HAS SORTIT DEL PROGRAMA! ADEU!!");

                    break;

                case 1:

                    System.out.println("Introdueix la teva frase nova:");
                    frase = sc.nextLine();
                    frase = sc.nextLine();
                    System.out.println("La teva frase s'ha actualitzat, ara es\n -"+frase+"-");
                    break;

                case 2:

                    System.out.println("La teva frase es: ");
                    System.out.println("-"+frase+"-");

                    break;



                case 3:

                    int contLletres=0;

                    for (int i=0;i<frase.length();i++){

                        if (frase.charAt(i) != ' '&&frase.charAt(i) != '.'&&frase.charAt(i) != ','&&frase.charAt(i) != '!'&&frase.charAt(i) != '?'&&frase.charAt(i) != ':'){

                            contLletres++;

                        }
                    }
                    System.out.println("La teva frase conte "+contLletres+" lletres.");

                    break;


                case 4:

                    String paraula4 = "";
                    ArrayList<String> paraules = new ArrayList<String>();

                    for(int i = 0; i < frase.length();i++){
                        if(frase.charAt(i) != ' '&&frase.charAt(i) != '.'&&frase.charAt(i) != ','&&frase.charAt(i) != '!'&&frase.charAt(i) != '?'&&frase.charAt(i) != ':'){
                            paraula4 = paraula4 + frase.charAt(i);
                        }
                        else{
                            paraules.add(paraula4);
                            paraula4 = "";
                        }
                    }
                    paraules.add(paraula4);

                    System.out.println("La teva frase conte "+paraules.size()+" paraules.");


                    break;


                case 5:

                    String caracters="abcdefghijklmnopqrstuvwxyz.,?!:";
                    int cont=0;

                    for (int i=0;i<caracters.length();i++){

                        cont=0;

                        for (int k=0;k<frase.length();k++){

                            if (frase.charAt(k)==caracters.charAt(i)){
                                cont++;
                            }

                        }

                        System.out.println("El caracter "+caracters.charAt(i)+" es repeteix "+cont+" vegades.");

                    }


                    break;


                case 6:

                    String abecedari="abcdefghijklmnopqrstuvwxyz.,?!";
                    int contador=0;
                    int contadorMaxim=0;
                    char caracter=' ';

                    for (int i=0;i<abecedari.length();i++){

                        contador=0;

                        for (int k=0;k<frase.length();k++){

                            if (frase.charAt(k)==abecedari.charAt(i)){
                                contador++;
                            }

                        }

                        if (contador>contadorMaxim){

                            contadorMaxim=contador;
                            caracter=abecedari.charAt(i);


                        }


                    }

                    System.out.println("El caracter més repetit es -"+caracter+"- i es repeteix "+contadorMaxim+" vegades.");

                    break;

                case 7:

                    String paraula7="";
                    ArrayList<String> arrayParaules= new ArrayList<String>();
                    ArrayList<String> arraySenseRepetir = new ArrayList<String>();

                    //Passar frase a array de paraules
                    for(int i = 0; i < frase.length();i++){


                        if (frase.charAt(i) != ' '&&frase.charAt(i) != '.'&&frase.charAt(i) != ','&&frase.charAt(i) != '!'&&frase.charAt(i) != '?'&&frase.charAt(i) != ':') {
                            paraula7 = paraula7 + frase.charAt(i);
                        }

                        else {
                            if (paraula7.length()>0) {
                                arrayParaules.add(paraula7);
                                paraula7 = "";
                            }
                        }

                    }
                    arrayParaules.add(paraula7);

                    //Cream array amb totes les paraules de la frase però sense repetir

                    Boolean trobada = false; //inicialitzem a false perquè la primera paraula sempre anirà a l'array senserepetir

                    for(int i =0; i<arrayParaules.size();i++){
                        for(int j=0; j < arraySenseRepetir.size(); j++){
                            if(arrayParaules.get(i).equalsIgnoreCase(arraySenseRepetir.get(j))){
                                trobada = true;
                            }
                        }
                        if(trobada == false){
                            arraySenseRepetir.add(arrayParaules.get(i));
                        }
                        trobada = false;
                    }

                    //Contar per cada paraula de l'arraySenserepetir quantes vegades apareix la paraula dins l'arrayParaules
                    ArrayList<Integer> repeticions = new ArrayList<Integer>();
                    int contParaules7 = 0;
                    for (int i = 0; i < arraySenseRepetir.size();i++){
                        for(int j = 0; j < arrayParaules.size();j++){
                            if(arraySenseRepetir.get(i).equalsIgnoreCase(arrayParaules.get(j))) {
                                contParaules7++;
                            }
                        }
                        repeticions.add(contParaules7);
                        contParaules7 = 0;
                    }

                    //Finalment, cercam la paraula més repetida
                    int max = 0;
                    int index = 0;
                    for (int i =0; i<repeticions.size();i++){
                        if(repeticions.get(i)>max){
                            max = repeticions.get(i);
                            index = i;
                        }
                    }

                    System.out.println("La paraula més repetida es -"+arraySenseRepetir.get(index)+"- i es repeteix "+repeticions.get(index)+" vegades.");

                    break;

                case 8:

                    System.out.println("Introdueix el caracter desitjat: ");
                    char caract = sc.next().charAt(0);
                    int contadorCaracter=0;

                    for (int i=0;i<frase.length();i++){

                        if (caract==frase.charAt(i)){

                            contadorCaracter++;

                        }

                    }

                    System.out.println("El caracter -"+caract+"- es repeteix "+contadorCaracter+" vegades.");

                    break;


                case 9:

                    System.out.println("Introdueix la paraula: ");
                    String paraulaIntroduida = sc.nextLine();
                    paraulaIntroduida = sc.nextLine();
                    String paraulaAComparar = "";
                    int contadorParaula9=0;

                    for (int i=0;i<frase.length();i++){

                        if (frase.charAt(i) != ' '&&frase.charAt(i) != '.'&&frase.charAt(i) != ','&&frase.charAt(i) != '!'&&frase.charAt(i) != '?'&&frase.charAt(i) != ':'){

                            paraulaAComparar=paraulaAComparar+frase.charAt(i);

                        }

                        if (frase.charAt(i)==' '||frase.charAt(i)==','||frase.charAt(i)=='.'){

                            if (paraulaAComparar.equalsIgnoreCase(paraulaIntroduida)){

                                contadorParaula9++;

                            }

                            paraulaAComparar="";

                        }

                    }

                    if (paraulaAComparar.equalsIgnoreCase(paraulaIntroduida)){

                        contadorParaula9++;

                    }

                    System.out.println("La paraula -"+paraulaIntroduida+"- es repeteix "+contadorParaula9+" vegades.");

                    break;



            }

        } while (!sortida);
    }

}

