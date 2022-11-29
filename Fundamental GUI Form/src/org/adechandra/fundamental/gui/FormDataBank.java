package org.adechandra.fundamental.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FormDataBank {
    private JTextField textField1;
    private JComboBox comboBox1;
    private JComboBox comboBox2;
    private JTextField textField2;
    private JButton browseFileButton;
    private JButton simpanButton;
    private JTextArea textArea1;
    private JPanel rootP;
    private JLabel foto;
    public String namaFoto;

    public JPanel getRootP() {
        return rootP;
    }

    public void insertingDataToFile(String inputtedData) throws IOException {
        try {
            FileWriter myFile = new FileWriter("Data Pengguna.txt", true);
            myFile.write(inputtedData);
            myFile.close();
            System.out.println("Succesfully wrote to the file");
        } catch (IOException ex) {
            System.out.println("An error occured");
            ex.printStackTrace();
        }
    }

    public FormDataBank() {
        simpanButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String kartu = textField1.getText();
                String atm = (String) comboBox1.getSelectedItem();
                String bank = (String) comboBox2.getSelectedItem();
                String pengguna = textField2.getText();

                Pengguna user = new Pengguna();
                user.setKartu(kartu);
                user.setAtm(atm);
                user.setBank(bank);
                user.setPengguna(pengguna);

                String hasil = "Berhasil Disimpan..." + "\nNo Kartu = " + kartu + "\nJenis ATM = " + atm + "\nBank = " + bank +
                        "\nNama Pemilik = " + pengguna + "\nNama File Gambar = " + namaFoto;

                textArea1.append(hasil);

                try {
                    insertingDataToFile(hasil + "\n\n");
                    namaFoto = null;
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });
        browseFileButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFileChooser carifoto = new JFileChooser();

                int showOpenDialogue = carifoto.showOpenDialog(null);

                if (showOpenDialogue == JFileChooser.APPROVE_OPTION) {
                    File pilihfoto = carifoto.getSelectedFile();
                    String pilihfotopath = pilihfoto.getAbsolutePath();

                    namaFoto = carifoto.getSelectedFile().getName();

                    ImageIcon jpg = new ImageIcon(pilihfotopath);
                    Image photo = jpg.getImage().getScaledInstance(foto.getWidth(), foto.getHeight(), Image.SCALE_SMOOTH);

                    foto.setIcon(new ImageIcon(photo));
                }
            }
        });
    }

}
