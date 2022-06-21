package controller;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;

import view.FormFrame;
import org.apache.poi.xwpf.usermodel.Borders;
import org.apache.poi.xwpf.usermodel.ParagraphAlignment;
import org.apache.poi.xwpf.usermodel.UnderlinePatterns;

public class GenerateDoc {

	public static void main(String[] args) throws IOException {
		
		// creation du .doc et configuration
		XWPFDocument document = new XWPFDocument();

		XWPFParagraph paragraph = document.createParagraph();
		XWPFRun run = paragraph.createRun();
		
		run.setText("Arkadia PC");
		run.addBreak();
		run.setText("4, rue des Pyrénées");
		run.addBreak();
		run.setText("92500 Rueil Malmaison");
		run.addBreak();
		run.setText("+33 (1)47 08 98 38");
		run.addBreak();
		run.setText("contact@arkadia-pc.fr");
		run.addBreak();
		run.addBreak();
		run.setText("Agrément N°SAP524160330");	
		run.addBreak();
		run.setFontFamily("Helvetia");
		paragraph.setAlignment(ParagraphAlignment.LEFT);
		
		
		XWPFParagraph paragraph2 = document.createParagraph();
		XWPFRun run2 = paragraph2.createRun();
		
		run2.addBreak();
		run2.setText("Attestation destinée au Centre des Impôts");
		run2.setFontSize(18); 
		run2.setFontFamily("Helvetia");
		run2.setUnderline(UnderlinePatterns.SINGLE);
		paragraph2.setAlignment(ParagraphAlignment.CENTER);
		
		
		
		
		
		
		
		
		
		// sauvegarde du .doc dans le dossier cible
		try {
			FileOutputStream output = new FileOutputStream("C:\\Users\\Jean\\Desktop\\DocGenerator\\Awesome.docx");
			document.write(output);
			output.close();
			System.out.println("Doc Launched.");
		} catch (Exception e) {
			e.printStackTrace();
		}	
		
		// affichage du formulaire dans le Main
		new FormFrame().setVisible(true);
	}
}
