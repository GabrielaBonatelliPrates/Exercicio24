package com.mycompany.Exercicio24;

import javax.swing.JOptionPane;

/**
 *
 * @author rafae
 */
public class Exercicio24 {

    public static void main(String[] args) {
        int i = 14;
        do {
            JOptionPane.showMessageDialog(null, i);
            i = i + 2;
        } while (i < 23);
    }
}
