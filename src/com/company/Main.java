package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int numero;

        AnimaisDomesticos caes = new AnimaisDomesticos(1, "Cão", "Pastor Alemão", "Preto/Marrom", "10/05/2014","Adalberto.");
        AnimaisDomesticos gatos = new AnimaisDomesticos(2, "Gato", "Siamês", "Branco/Preto", "03/09/2018","Josecleide.");
        AnimaisDomesticos porquinhos = new AnimaisDomesticos(3, "Porquinho-da-india", "Abissínio", "Marrom", "19/07/2015","Jurema.");
        AnimaisDomesticos coelhos = new AnimaisDomesticos(4, "Coelho", "French Lop", "Branco/Marrom", "13/06/2017","Pernalonga.");
        AnimaisDomesticos tartarugas = new AnimaisDomesticos(5, "Tartaruga", "Jabuti-piranga", "Preto/Amarelo", "02/01/1963","Donatello.");

        AnimaisFazenda cavalos = new AnimaisFazenda(6, "cavalo", "Frísio", "Preto","17/03/2002","Gaspar." );
        AnimaisFazenda vacas = new AnimaisFazenda(7, "vaca", "Hereford", "Marron","21/11/2010","Maricleia." );
        AnimaisFazenda ovelhas = new AnimaisFazenda(8, "ovelha", "suffolk", "Branco","29/12/2016","Careca." );

        Proprietario rafael = new Proprietario(10, "Rafael", "Santos", "26/09/1990", "Rua das olivias - SP", "(11)99999-9999.");
        Proprietario maria = new Proprietario(11, "Maria", "Oliveira", "17/08/1989", "Rua das arvores - SP", "(11)99999-9999.");
        Proprietario irani = new Proprietario(12, "Irani", "Guimarães", "31/01/1953", "Rua dos lagos - SP", "(11)99999-9999.");
        Proprietario jose = new Proprietario(13, "Jose", "Souza", "29/07/1986", "Rua do chesperito - SP", "(11)99999-9999.");
        Proprietario lucas = new Proprietario(14, "Lucas", "Enzo", "11/10/1995", "Rua do chapolin  - SP", "(11)99999-9999.");
        Proprietario artur = new Proprietario(15, "Artur", "Felipe", "21/04/1974", "Rua do chaves - SP", "(11)99999-9999.");
        Proprietario diana = new Proprietario(16, "Diana", "Princesa", "15/12/1979", "Rua do tripa seca - SP", "(11)99999-9999.");
        Proprietario luiza = new Proprietario(17, "Luiza", "Aurora", "27/03/1969", "Rua do mão negra - SP", "(11)99999-9999.");

        Veterinario veterinario1 = new Veterinario("44455566677", "Hugo", "Alex", "5467878", "Cirurgião");
        Veterinario veterinario2 = new Veterinario("11122233344", "Francisco", "Agugusto", "9898766", "Fisioterapia Veterinária");
        Veterinario veterinario3 = new Veterinario("55566677788", "Manuella", "de Jesus", "2365784", "Clinico");
        Veterinario veterinario4 = new Veterinario("88899900011", "Antonia", "Fraga", "9878766", "Laboratorial");

        Consulta consulta1 = new Consulta("07/09/2021","Exame","Alergia","Troca do alimento", veterinario3);
        Consulta consulta2 = new Consulta("08/09/2021","avaliação","Obesidade","Diminuiçao do alimento", veterinario2);
        Consulta consulta3 = new Consulta("09/09/2021","avaliaçãp","Depressão","Passear mais com ele", veterinario3);
        Consulta consulta4 = new Consulta("10/09/2021","Exame","Erlichiose","Aplicação de remedio", veterinario4);
        Consulta consulta5 = new Consulta("11/09/2021","Exame","Insuficiensia renal","Dieta apropriada", veterinario3);
        Consulta consulta6 = new Consulta("12/09/2021","avaliação","Otite","Antibiotico", veterinario3);
        Consulta consulta7 = new Consulta("13/09/2021","Exame","Fratura","Cirurgia", veterinario1);
        Consulta consulta8 = new Consulta("14/09/2021","avaliação","Cinomose","Vacinação", veterinario2);

        System.out.println("Qual o numero do paciente ? //Ex 1 a 8.");
        numero = teclado.nextInt();

        System.out.println(consulta8.toString());
        if (numero == 1) {
            System.out.println(caes+"\n");
            System.out.println(rafael+"\n");
            System.out.println(consulta1+"\n");
        }else if (numero == 2){
            System.out.println(gatos+"\n");
            System.out.println(maria+"\n");
            System.out.println(consulta2+"\n");
        }else if (numero == 3){
            System.out.println(porquinhos+"\n");
            System.out.println(irani+"\n");
            System.out.println(consulta3+"\n");
        }else if (numero == 4){
            System.out.println(coelhos+"\n");
            System.out.println(jose+"\n");
            System.out.println(consulta4+"\n");
        }else if (numero == 5){
            System.out.println(tartarugas+"\n");
            System.out.println(lucas+"\n");
            System.out.println(consulta5+"\n");
        }else if (numero == 6){
            System.out.println(cavalos+"\n");
            System.out.println(artur+"\n");
            System.out.println(consulta6+"\n");
        }else if (numero == 7){
            System.out.println(vacas+"\n");
            System.out.println(diana+"\n");
            System.out.println(consulta7+"\n");
        }else if (numero == 8){
            System.out.println(ovelhas+"\n");
            System.out.println(luiza+"\n");
            System.out.println(consulta8+"\n");
        }
   }
}
