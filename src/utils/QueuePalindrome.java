package utils;

import java.util.LinkedList;
import java.util.Queue;

public class QueuePalindrome {
    
    public boolean isPalindrome(String text){
        
        String texto = text.toLowerCase().replace(" ","");
        Queue<Character> cola1 = new LinkedList<>();
        Queue<Character> cola2 = new LinkedList<>();

        for( char letra : texto.toCharArray()){
            cola1.offer(letra);
        }
        for ( int i = texto.length() - 1; i >=0; i--) {
            cola2.offer(texto.charAt(i));
        }
        while(!cola1.isEmpty()){
            if(cola1.poll().equals(cola2.poll())){
                return true;
            }  
        }  
        return false;
    }
}
