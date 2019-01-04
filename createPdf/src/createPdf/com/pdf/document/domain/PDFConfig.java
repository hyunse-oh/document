package createPdf.com.pdf.document.domain;

import org.apache.pdfbox.pdmodel.font.PDFont;
import org.apache.pdfbox.pdmodel.graphics.image.PDImageXObject;
import org.apache.pdfbox.pdmodel.graphics.image.PDInlineImage;
import org.apache.pdfbox.util.Matrix;

public class PDFConfig {
	private PDFont font;

	private float fontSize;

	private Object[] textPositions;

	private String text;

	private float leading;

	private float positionX;

	private float positionY;

	private float positionW;

	private float positionH;

	private Matrix matrix;

	private PDImageXObject image;

	private PDInlineImage line;

	public PDFont getFont() {
		return font;
	}

	public void setFont(PDFont font) {
		this.font = font;
	}

	public float getFontSize() {
		return fontSize;
	}

	public void setFontSize(float fontSize) {
		this.fontSize = fontSize;
	}

	public Object[] getTextPositions() {
		return textPositions;
	}

	public void setTextPositions(Object[] textPositions) {
		this.textPositions = textPositions;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public float getLeading() {
		return leading;
	}

	public void setLeading(float leading) {
		this.leading = leading;
	}

	public float getPositionX() {
		return positionX;
	}

	public void setPositionX(float positionX) {
		this.positionX = positionX;
	}

	public float getPositionY() {
		return positionY;
	}

	public void setPositionY(float positionY) {
		this.positionY = positionY;
	}

	public float getPositionW() {
		return positionW;
	}

	public void setPositionW(float positionW) {
		this.positionW = positionW;
	}

	public float getPositionH() {
		return positionH;
	}

	public void setPositionH(float positionH) {
		this.positionH = positionH;
	}

	public Matrix getMatrix() {
		return matrix;
	}

	public void setMatrix(Matrix matrix) {
		this.matrix = matrix;
	}

	public PDImageXObject getImage() {
		return image;
	}

	public void setImage(PDImageXObject image) {
		this.image = image;
	}

	public PDInlineImage getLine() {
		return line;
	}

	public void setLine(PDInlineImage line) {
		this.line = line;
	}
}
