/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singletonio_commandio;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Queue;
import java.util.Scanner;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/**
 *
 * @author ShirkeJR
 */
public class TransactionsSingleton {
    private Queue<Transaction> queOfTransactions;
    
    private static TransactionsSingleton uniqueInstace = null;
    
    private TransactionsSingleton() { 
        queOfTransactions = new LinkedBlockingQueue<Transaction>();
        readTransactions("transactions.txt");
    }
    
    public static synchronized TransactionsSingleton getInstance(){
        if(uniqueInstace == null)
            uniqueInstace = new TransactionsSingleton();
        return uniqueInstace;
    }
    
    public void readTransactions(String filePath)
    {
        Integer numbetOfAccountSource = 0, numbetOfAccountDestiny = 0;
        float value = 0;
        try {
            File f = new File(filePath);
            Scanner sc = new Scanner(f);
            while(sc.hasNext()){
                numbetOfAccountSource = Integer.parseInt(sc.next());
                numbetOfAccountDestiny = Integer.parseInt(sc.next());
                value = Float.parseFloat(sc.next());    
                queOfTransactions.add(new Transaction(numbetOfAccountSource, numbetOfAccountDestiny, value));
            }
            sc.close();
        } 
        catch (FileNotFoundException ex) {
            System.out.println("Problem with file" + filePath);
        }
    }
    
    public void showTransactions(){
        for(Transaction t : queOfTransactions){
            System.out.println(t);
        }
            
    }   

    public Queue<Transaction> getQueOfTransactions() {
        return queOfTransactions;
    }

    public void setQueOfTransactions(Queue<Transaction> queOfTransactions) {
        this.queOfTransactions = queOfTransactions;
    }
    
}
