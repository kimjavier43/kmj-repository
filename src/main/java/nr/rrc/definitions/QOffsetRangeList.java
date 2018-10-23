/**
 * This class file was automatically generated by jASN1 v1.10.0 (http://www.openmuc.org)
 */

package nr.rrc.definitions;

import java.io.IOException;
import java.io.EOFException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.io.Serializable;
import org.openmuc.jasn1.ber.*;
import org.openmuc.jasn1.ber.types.*;
import org.openmuc.jasn1.ber.types.string.*;


public class QOffsetRangeList implements BerType, Serializable {

	private static final long serialVersionUID = 1L;

	public static final BerTag tag = new BerTag(BerTag.UNIVERSAL_CLASS, BerTag.CONSTRUCTED, 16);

	public byte[] code = null;
	private QOffsetRange rsrpOffsetSSB = null;
	private QOffsetRange rsrqOffsetSSB = null;
	private QOffsetRange sinrOffsetSSB = null;
	private QOffsetRange rsrpOffsetCSIRS = null;
	private QOffsetRange rsrqOffsetCSIRS = null;
	private QOffsetRange sinrOffsetCSIRS = null;
	
	public QOffsetRangeList() {
	}

	public QOffsetRangeList(byte[] code) {
		this.code = code;
	}

	public void setRsrpOffsetSSB(QOffsetRange rsrpOffsetSSB) {
		this.rsrpOffsetSSB = rsrpOffsetSSB;
	}

	public QOffsetRange getRsrpOffsetSSB() {
		return rsrpOffsetSSB;
	}

	public void setRsrqOffsetSSB(QOffsetRange rsrqOffsetSSB) {
		this.rsrqOffsetSSB = rsrqOffsetSSB;
	}

	public QOffsetRange getRsrqOffsetSSB() {
		return rsrqOffsetSSB;
	}

	public void setSinrOffsetSSB(QOffsetRange sinrOffsetSSB) {
		this.sinrOffsetSSB = sinrOffsetSSB;
	}

	public QOffsetRange getSinrOffsetSSB() {
		return sinrOffsetSSB;
	}

	public void setRsrpOffsetCSIRS(QOffsetRange rsrpOffsetCSIRS) {
		this.rsrpOffsetCSIRS = rsrpOffsetCSIRS;
	}

	public QOffsetRange getRsrpOffsetCSIRS() {
		return rsrpOffsetCSIRS;
	}

	public void setRsrqOffsetCSIRS(QOffsetRange rsrqOffsetCSIRS) {
		this.rsrqOffsetCSIRS = rsrqOffsetCSIRS;
	}

	public QOffsetRange getRsrqOffsetCSIRS() {
		return rsrqOffsetCSIRS;
	}

	public void setSinrOffsetCSIRS(QOffsetRange sinrOffsetCSIRS) {
		this.sinrOffsetCSIRS = sinrOffsetCSIRS;
	}

	public QOffsetRange getSinrOffsetCSIRS() {
		return sinrOffsetCSIRS;
	}

	public int encode(OutputStream reverseOS) throws IOException {
		return encode(reverseOS, true);
	}

	public int encode(OutputStream reverseOS, boolean withTag) throws IOException {

		if (code != null) {
			for (int i = code.length - 1; i >= 0; i--) {
				reverseOS.write(code[i]);
			}
			if (withTag) {
				return tag.encode(reverseOS) + code.length;
			}
			return code.length;
		}

		int codeLength = 0;
		if (sinrOffsetCSIRS != null) {
			codeLength += sinrOffsetCSIRS.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, PRIMITIVE, 5
			reverseOS.write(0x85);
			codeLength += 1;
		}
		
		if (rsrqOffsetCSIRS != null) {
			codeLength += rsrqOffsetCSIRS.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, PRIMITIVE, 4
			reverseOS.write(0x84);
			codeLength += 1;
		}
		
		if (rsrpOffsetCSIRS != null) {
			codeLength += rsrpOffsetCSIRS.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, PRIMITIVE, 3
			reverseOS.write(0x83);
			codeLength += 1;
		}
		
		if (sinrOffsetSSB != null) {
			codeLength += sinrOffsetSSB.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, PRIMITIVE, 2
			reverseOS.write(0x82);
			codeLength += 1;
		}
		
		if (rsrqOffsetSSB != null) {
			codeLength += rsrqOffsetSSB.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, PRIMITIVE, 1
			reverseOS.write(0x81);
			codeLength += 1;
		}
		
		if (rsrpOffsetSSB != null) {
			codeLength += rsrpOffsetSSB.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, PRIMITIVE, 0
			reverseOS.write(0x80);
			codeLength += 1;
		}
		
		codeLength += BerLength.encodeLength(reverseOS, codeLength);

		if (withTag) {
			codeLength += tag.encode(reverseOS);
		}

		return codeLength;

	}

	public int decode(InputStream is) throws IOException {
		return decode(is, true);
	}

	public int decode(InputStream is, boolean withTag) throws IOException {
		int codeLength = 0;
		int subCodeLength = 0;
		BerTag berTag = new BerTag();

		if (withTag) {
			codeLength += tag.decodeAndCheck(is);
		}

		BerLength length = new BerLength();
		codeLength += length.decode(is);

		int totalLength = length.val;
		codeLength += totalLength;

		if (totalLength == 0) {
			return codeLength;
		}
		subCodeLength += berTag.decode(is);
		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 0)) {
			rsrpOffsetSSB = new QOffsetRange();
			subCodeLength += rsrpOffsetSSB.decode(is, false);
			if (subCodeLength == totalLength) {
				return codeLength;
			}
			subCodeLength += berTag.decode(is);
		}
		
		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 1)) {
			rsrqOffsetSSB = new QOffsetRange();
			subCodeLength += rsrqOffsetSSB.decode(is, false);
			if (subCodeLength == totalLength) {
				return codeLength;
			}
			subCodeLength += berTag.decode(is);
		}
		
		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 2)) {
			sinrOffsetSSB = new QOffsetRange();
			subCodeLength += sinrOffsetSSB.decode(is, false);
			if (subCodeLength == totalLength) {
				return codeLength;
			}
			subCodeLength += berTag.decode(is);
		}
		
		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 3)) {
			rsrpOffsetCSIRS = new QOffsetRange();
			subCodeLength += rsrpOffsetCSIRS.decode(is, false);
			if (subCodeLength == totalLength) {
				return codeLength;
			}
			subCodeLength += berTag.decode(is);
		}
		
		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 4)) {
			rsrqOffsetCSIRS = new QOffsetRange();
			subCodeLength += rsrqOffsetCSIRS.decode(is, false);
			if (subCodeLength == totalLength) {
				return codeLength;
			}
			subCodeLength += berTag.decode(is);
		}
		
		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 5)) {
			sinrOffsetCSIRS = new QOffsetRange();
			subCodeLength += sinrOffsetCSIRS.decode(is, false);
			if (subCodeLength == totalLength) {
				return codeLength;
			}
		}
		throw new IOException("Unexpected end of sequence, length tag: " + totalLength + ", actual sequence length: " + subCodeLength);

		
	}

	public void encodeAndSave(int encodingSizeGuess) throws IOException {
		ReverseByteArrayOutputStream reverseOS = new ReverseByteArrayOutputStream(encodingSizeGuess);
		encode(reverseOS, false);
		code = reverseOS.getArray();
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		appendAsString(sb, 0);
		return sb.toString();
	}

	public void appendAsString(StringBuilder sb, int indentLevel) {

		sb.append("{");
		boolean firstSelectedElement = true;
		if (rsrpOffsetSSB != null) {
			sb.append("\n");
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("rsrpOffsetSSB: ").append(rsrpOffsetSSB);
			firstSelectedElement = false;
		}
		
		if (rsrqOffsetSSB != null) {
			if (!firstSelectedElement) {
				sb.append(",\n");
			}
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("rsrqOffsetSSB: ").append(rsrqOffsetSSB);
			firstSelectedElement = false;
		}
		
		if (sinrOffsetSSB != null) {
			if (!firstSelectedElement) {
				sb.append(",\n");
			}
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("sinrOffsetSSB: ").append(sinrOffsetSSB);
			firstSelectedElement = false;
		}
		
		if (rsrpOffsetCSIRS != null) {
			if (!firstSelectedElement) {
				sb.append(",\n");
			}
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("rsrpOffsetCSIRS: ").append(rsrpOffsetCSIRS);
			firstSelectedElement = false;
		}
		
		if (rsrqOffsetCSIRS != null) {
			if (!firstSelectedElement) {
				sb.append(",\n");
			}
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("rsrqOffsetCSIRS: ").append(rsrqOffsetCSIRS);
			firstSelectedElement = false;
		}
		
		if (sinrOffsetCSIRS != null) {
			if (!firstSelectedElement) {
				sb.append(",\n");
			}
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("sinrOffsetCSIRS: ").append(sinrOffsetCSIRS);
			firstSelectedElement = false;
		}
		
		sb.append("\n");
		for (int i = 0; i < indentLevel; i++) {
			sb.append("\t");
		}
		sb.append("}");
	}

}

