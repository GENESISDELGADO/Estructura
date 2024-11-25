/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ec.edu.espoch.stack1;

import ec.edu.espoch.stack1.clases.Stack;

/**
 *
 * @author ACER
 */
public class Stack1 {

    public static void main(String[] args) {
        Stack<Integer>pila=new Stack<>();
        //Agregar elementos a la pila
        pila.push(10);
        pila.push(20);
        pila.push(30);
        
        System.out.println("Elemento en la cima:" +pila.peek());
        //REMOVER EL ELEMENTO EN LA CIMA
        System.out.println("Elemento removido: "+pila.pop());
    }
}
