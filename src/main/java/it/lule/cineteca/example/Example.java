/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package it.lule.cineteca.example;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 *
 * @author Luca
 */
public class Example {

    public static void main(String[] args) {

        Word rubareWord = new Word("rubare");
        ArrayList<Word> sinonimiRubare = new ArrayList<>();
        sinonimiRubare.add(new Word("fregare"));
        sinonimiRubare.add(new Word("scippare"));
        sinonimiRubare.add(new Word("inculare"));

        Name simona = new Name(true, "Simona");
        LinkedList<Name> sinonimiSimona = new LinkedList<>();
        sinonimiSimona.add(new Name(true, "Simonetta"));

        Acronym gg = new Acronym("Goog Game", "GG");
        LinkedList<Acronym> sinonimiGG = new LinkedList<>();
        sinonimiGG.add(new Acronym("wp", "Well Played"));
        sinonimiGG.add(new Acronym("ez", "easy"));

        SinonimiDictionary.getInstance().insertSinonimi(rubareWord, sinonimiRubare);
        SinonimiDictionary.getInstance().insertSinonimi(simona, sinonimiSimona);
        SinonimiDictionary.getInstance().insertSinonimi(gg, sinonimiGG);

//        SCOMMENTA QUESTA SEZIONE ANALIZZANDO GLI ERRORI  
//        SinonimiDictionary.getInstance().insertSinonimi_NOT_WORKING_1(rubareWord, sinonimiRubare); // SCOMMENTA QUA
/*          questo funziona perché: il metodo ha come argomento : 
             public void insertSinonimi_NOT_WORKING_1(Word word, List<Word> sinonimi){
          quindi sinonimiRubare essendo dichiarata come una Lista di Word funziona perfettamente*/
//        SinonimiDictionary.getInstance().insertSinonimi_NOT_WORKING_1(simona, sinonimiSimona); // SCOMMENTA QUA
//        SinonimiDictionary.getInstance().insertSinonimi_NOT_WORKING_1(gg, sinonimiGG);         // SCOMMENTA QUA
/*            questi due chiamate invece non funzionano perché è vero che per il polimorfismo
           sia LinkedList che ArrayList estendono List, ma i tipi generici non sono calcolati nel polimorfismo
               quindi LinkedList<Name> non si può dire che estende: 
                             List<Word>  perché semmai è vero solo che LinkedList<Word> estende List<Word>
                e l'unico modo per rendere valida la cosa è aggiungere la wildcard alla signature della lista
       
     La cosa quindi si può sistemare aggiungendo la wildcard alla signature del metodo 
     Il codice seguente sarà quindi compilabile ma se non viene aggiustata anche la struttura dati
     sottostante ci sarà un errore sintattico a monte 
     ( si scommenti il codice interno a insertSinonimi_NOT_WORKING_2)
         */
//        SinonimiDictionary.getInstance().insertSinonimi_NOT_WORKING_2(rubareWord, sinonimiRubare); // SCOMMENTA QUA
//        SinonimiDictionary.getInstance().insertSinonimi_NOT_WORKING_2(simona, sinonimiSimona);    // SCOMMENTA QUA
//        SinonimiDictionary.getInstance().insertSinonimi_NOT_WORKING_2(gg, sinonimiGG);            // SCOMMENTA QUA
    }

}
