package bgt;

import java.util.Random;
import javax.swing.*;
import javax.swing.JOptionPane;
/**
 *
 * @author USEr
 */
public class baguke extends javax.swing.JFrame {
    private String[] myArray = {"Gunting", "Batu", "Kertas"};

    /**
     * Creates new form baguke
     */
     
    public baguke(){
        initComponents();
    }
    
    public String getComputerChoice() {
        String[] choices = {"Gunting", "Batu", "Kertas"};
        Random random = new Random();
        return choices[random.nextInt(choices.length)];
    }
    
    public String determineResult(String playerChoice, String computerChoice) {
        if (playerChoice.equals(computerChoice)) {
            return "Seri! Anda dan komputer sama-sama memilih " + playerChoice;
        } else if (
            (playerChoice.equals("Gunting") && computerChoice.equals("Kertas")) ||
            (playerChoice.equals("Batu") && computerChoice.equals("Gunting")) ||
            (playerChoice.equals("Kertas") && computerChoice.equals("Batu"))
        ) {
            return "Anda menang! Komputer memilih " + computerChoice;
        } else {
            return "Anda kalah! Komputer memilih " + computerChoice;
        }
    }



private void guntingActionPerformed(java.awt.event.ActionEvent evt) {                                        
        String playerChoice = "Gunting";
        String computerChoice = getComputerChoice();
        String result = determineResult(playerChoice, computerChoice);
        JOptionPane.showMessageDialog(null, result); 
    }                                       

    private void batuActionPerformed(java.awt.event.ActionEvent evt) {                                     
        String playerChoice = "Batu";
        String computerChoice = getComputerChoice();
        String result = determineResult(playerChoice, computerChoice);
        JOptionPane.showMessageDialog(null, result); 
    }                                    

    private void kertasActionPerformed(java.awt.event.ActionEvent evt) {                                       
        String playerChoice = "Kertas";
        String computerChoice = getComputerChoice();
        String result = determineResult(playerChoice, computerChoice);
        JOptionPane.showMessageDialog(null, result);
    } 
