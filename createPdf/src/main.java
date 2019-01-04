import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.font.PDFont;
import org.apache.pdfbox.pdmodel.font.PDType1Font;
import org.apache.pdfbox.pdmodel.graphics.PDFontSetting;

import createPdf.com.pdf.document.domain.PDFConfig;

public class main {
	public static void main(String[]arg) throws Exception{
		PDDocument pDoc = new PDDocument();

		PDPage page = new PDPage();

		pDoc.addPage(page);

		PDFont font = new PDFontSetting().getFont();

		PDPageContentStream pcs = new PDPageContentStream(pDoc, page);

		PDFConfig config = new PDFConfig();
		config.setFont(PDType1Font.TIMES_BOLD);
		config.setFontSize(12);
		config.setPositionX(100);
		config.setPositionY(700);
		config.setText("Hello~~~~");

		pcs.beginText();
		pcs.setFont(config.getFont(), config.getFontSize());
		pcs.newLineAtOffset(config.getPositionX(), config.getPositionY());
		pcs.showText(config.getText());
		pcs.endText();
		pcs.close();

		pDoc.save("test.pdf");
		pDoc.close();

	}
}
