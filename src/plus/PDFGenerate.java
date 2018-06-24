/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package plus;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.html.simpleparser.HTMLWorker;
import com.itextpdf.text.pdf.PdfWriter;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.StringReader;
import javax.swing.JFileChooser;
import javax.swing.JFrame;

public class PDFGenerate {

    private String texto;
    private String caminho;

    public PDFGenerate(String texto) {
        this.texto = texto;
    }

    public void create(){
        JFileChooser janelaSave = new JFileChooser();
        janelaSave.setSelectedFile(new File("CONTRATO_SAVE.pdf"));
        janelaSave.setDialogTitle("Salvar Arquivo");
        int opcao = janelaSave.showSaveDialog(new JFrame());
        
        if (opcao == JFileChooser.APPROVE_OPTION) {
            File fileToSave = janelaSave.getSelectedFile();
            this.caminho = fileToSave.getAbsolutePath();
            
            try {
                File file = new File(this.caminho);
                file.getParentFile().mkdirs();

                Document document = new Document(PageSize.A4);
                PdfWriter.getInstance(document, new FileOutputStream(file));
                document.open();
                StringBuilder sb = new StringBuilder();
                sb.append(this.texto);

                HTMLWorker htmlWorker = new HTMLWorker(document);
                htmlWorker.parse(new StringReader(sb.toString()));
                document.close();
                System.out.println("Arquivo gravado");
                
            } catch (IOException | DocumentException ex) {
                ex.printStackTrace();
            }
        }
    }
}
