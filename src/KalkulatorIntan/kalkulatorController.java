/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KalkulatorIntan;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author INTAN
 */
public class kalkulatorController {
    
    public kalkulator view;
    
    public kalkulatorController(kalkulator view){
        
        this.view = view;
        
        //mendeklarasikan button hitung
        this.view.getBtnHitung().addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                hitung();
            }
        });
        
        //mendeklarasikan button clear
        this.view.getBtnClear().addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                view.getTxtPanjang().setText("");
                view.getTxtLebar().setText("");
                view.getTxtLuas().setText("");
                view.getTxtKeliling().setText("");
            }
        });
        
    }
    
    public void hitung(){
        if(this.view.getTxtPanjang().getText().isEmpty() || this.view.getTxtLebar().getText().isEmpty()){
            //menginformasikan muncul pop-up bahwa inputan tidak boleh kosong
            JOptionPane.showMessageDialog(null, "INPUTAN TIDAK BOLEH KOSONG!", "ERROR", JOptionPane.ERROR_MESSAGE);
        } else {
            //menentukan panjang dan lebar
            int pjg = Integer.valueOf(view.getTxtPanjang().getText());
            int lbr = Integer.valueOf(view.getTxtLebar().getText());

            int luas    = pjg * lbr;
            int keliling     = (2*pjg) + (2*lbr);

            //memanggil output panjang dan lebar
            view.getTxtLuas().setText(String.valueOf(luas));
            view.getTxtKeliling().setText(String.valueOf(keliling));
        }
    }
}
