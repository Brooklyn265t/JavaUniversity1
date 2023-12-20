package Mirea.Homework1;

import java.lang.*;

public class Book {
    private int list;
    private String size;
    private String read; 
    private int weight;
    public Book(int lists, String sizes, String reads, int weights){ 
        list = lists;
        size = sizes;
        read = reads;
        weight = weights;
    }
    public Book(int lists, String sizes, int weights){
        list = lists;
        size = sizes;
        weight = weights;
    } 
    public Book(String sizes){ 
        size = sizes;
    } 
    public void setList(int list) { 
        this.list = list; 
    }
    public void setSize(String size) { 
        this.size = size; 
    }
    public void setRead(String read) { 
        this.read = read; 
    }
    public void setWeight(int weight){
        this.weight = weight;
    }
    public double getList(){ 
        return list; 
    }
    public String getSize() { 
        return size; 
    }
    public String getRead() {
        return read;
    }
    public int getWeight(){
        return weight;
    }
    public String toString(){ 
    return "lists " + this.list + ", cizes book "+ this.size + "read " + this.read + "weight book " + this.weight; 
    } 
    public void Balls(){ 
    System.out.println("number of pages in the book "+ list);
    System.out.println("size book " + size);
    System.out.println("read book " + read);
    System.out.println("weight book " + weight); 
    }   
}