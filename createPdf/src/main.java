import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.font.PDFont;
import org.apache.pdfbox.pdmodel.font.PDType1Font;
import org.apache.pdfbox.pdmodel.graphics.PDFontSetting;

public class main {
	public static void main(String[]arg) throws Exception{
		PDDocument pDoc = new PDDocument();

		PDPage page = new PDPage();

		pDoc.addPage(page);

		PDFont font = new PDFontSetting().getFont();

		PDPageContentStream pcs = new PDPageContentStream(pDoc, page);

		pcs.beginText();
		pcs.setFont(PDType1Font.TIMES_BOLD, 12);
		pcs.newLineAtOffset(100, 700);
		pcs.showText("1234");
		pcs.endText();
		pcs.close();

		pDoc.save("test.pdf");
		pDoc.close();

	}
}
