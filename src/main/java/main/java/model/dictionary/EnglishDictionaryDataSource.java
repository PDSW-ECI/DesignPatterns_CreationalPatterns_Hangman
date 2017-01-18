/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.java.model.dictionary;


import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author hcadavid
 */
public class EnglishDictionaryDataSource {
    
        
    public List<String> getAvailableWords(){
        List<String> out=new LinkedList<>();
        out.add("PLAYER");
        out.add("BALL");
        out.add("SOCCER");
        out.add("RAGE");
        out.add("GAME");
        return out;
    }
    
}
