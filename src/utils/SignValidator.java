package utils;

import java.util.LinkedList;

public class SignValidator {
    
    public boolean isValid(String s){
        
    LinkedList<Character> pila = new LinkedList<Character>();
    for (char signo : s.toCharArray()){
        if (signo == '(' || signo == '{' || signo == '['){
            pila.push(signo);
        } else if (signo == ')' || signo == '}' || signo == ']'){
            if (pila.isEmpty()){
                return false;
            }
            char ultimoSigno = pila.pop();
            if ((signo == ')' && ultimoSigno != '(') ||
                (signo == '}' && ultimoSigno != '{') ||
                (signo == ']' && ultimoSigno != '[')){
                return false;
            }   
        }
    }
    return pila.isEmpty();
    }
}
