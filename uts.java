package bgt;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
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
    
    public static int getRandomElement(int[] arr){
        return arr[ThreadLocalRandom.current().nextInt(arr.length)];
    }

    //Example Usage:
    
    
    
    public void lawan(){
        int[] nums = {1, 2, 3};
        int randNum = getRandomElement(nums);
        tf_tes.setText(String.valueOf(randNum));
        
        
        if(gunting.isSelected()){
            if(randNum==1){
               JOptionPane.showMessageDialog(null, "anda menang", "permisi kak....", JOptionPane.INFORMATION_MESSAGE); 
            }
            
        }else if(batu.isSelected()){
            JOptionPane.showMessageDialog(null, "anda menang", "permisi kak....", JOptionPane.INFORMATION_MESSAGE);
        }else if(kertas.isSelected()){
            JOptionPane.showMessageDialog(null, "anda menang", "permisi kak....", JOptionPane.INFORMATION_MESSAGE);
        }
    }
