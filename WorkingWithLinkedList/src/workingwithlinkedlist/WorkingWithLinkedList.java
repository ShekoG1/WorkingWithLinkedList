/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package workingwithlinkedlist;

import java.util.LinkedList;

/**
 *
 * @author SHEKHAR
 */
public class WorkingWithLinkedList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //You cannot specify an intitial size of a linked list
        LinkedList<String> colors = new LinkedList<String>();
        colors.add("red");
        colors.add("blue");
        colors.add("green");
        colors.add("black");
        colors.add("orange");
        colors.remove("black");
        System.out.println(colors.contains("red"));
        System.out.println(colors.get(1));
        System.out.println("Size of this ArrayList is: "+ colors.size());
    }
    
}
