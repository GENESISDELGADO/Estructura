/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espoch.stack1.clases;

/**
 *
 * @author ACER
 */
public class Stack<T> {
    private Nodo<T> cima;//representa la cima de la 
    private int tamaño;//Tamaño de la pila

    public Stack() {
        this.cima = null;
        this.tamaño = 0;
    }
    //Metodo para agregar un elemento de la pila (push)
    public void push(T dato){
        Nodo<T> nuevoNodo=new Nodo<>(dato);
        nuevoNodo.siguiente=cima;
        cima=nuevoNodo;
        tamaño++;
        
    
    }
    //metodo para verificar si la pila esta vacía
    public boolean isEmpty(){
        return cima==null;
    }
    public int tamaño(){
        return tamaño;
    }

    public T pop(){
        if (isEmpty()){
            throw new IllegalStateException("La pila");
        }
        T dato= cima.dato;
        cima=cima.siguiente;
        tamaño--;
        
    
        return dato;
    
    }
    public T peek(){
        if (isEmpty()){
            throw new IllegalStateException("La pila");
        }
    
        return cima.dato;
    
    }
}
    

    

