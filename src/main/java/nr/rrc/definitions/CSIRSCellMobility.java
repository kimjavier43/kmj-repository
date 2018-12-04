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


public class CSIRSCellMobility implements BerType, Serializable {

	private static final long serialVersionUID = 1L;

	public static class CsiRsMeasurementBW implements BerType, Serializable {

		private static final long serialVersionUID = 1L;

		public static final BerTag tag = new BerTag(BerTag.UNIVERSAL_CLASS, BerTag.CONSTRUCTED, 16);

		public byte[] code = null;
		private BerEnum nrofPRBs = null;
		private BerInteger startPRB = null;
		
		public CsiRsMeasurementBW() {
		}

		public CsiRsMeasurementBW(byte[] code) {
			this.code = code;
		}

		public void setNrofPRBs(BerEnum nrofPRBs) {
			this.nrofPRBs = nrofPRBs;
		}

		public BerEnum getNrofPRBs() {
			return nrofPRBs;
		}

		public void setStartPRB(BerInteger startPRB) {
			this.startPRB = startPRB;
		}

		public BerInteger getStartPRB() {
			return startPRB;
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
			codeLength += startPRB.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, PRIMITIVE, 1
			reverseOS.write(0x81);
			codeLength += 1;
			
			codeLength += nrofPRBs.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, PRIMITIVE, 0
			reverseOS.write(0x80);
			codeLength += 1;
			
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

			subCodeLength += berTag.decode(is);
			if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 0)) {
				nrofPRBs = new BerEnum();
				subCodeLength += nrofPRBs.decode(is, false);
				subCodeLength += berTag.decode(is);
			}
			else {
				throw new IOException("Tag does not match the mandatory sequence element tag.");
			}
			
			if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 1)) {
				startPRB = new BerInteger();
				subCodeLength += startPRB.decode(is, false);
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
			sb.append("\n");
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			if (nrofPRBs != null) {
				sb.append("nrofPRBs: ").append(nrofPRBs);
			}
			else {
				sb.append("nrofPRBs: <empty-required-field>");
			}
			
			sb.append(",\n");
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			if (startPRB != null) {
				sb.append("startPRB: ").append(startPRB);
			}
			else {
				sb.append("startPRB: <empty-required-field>");
			}
			
			sb.append("\n");
			for (int i = 0; i < indentLevel; i++) {
				sb.append("\t");
			}
			sb.append("}");
		}

	}

	public static class CsiRsResourceListMobility implements BerType, Serializable {

		private static final long serialVersionUID = 1L;

		public static final BerTag tag = new BerTag(BerTag.UNIVERSAL_CLASS, BerTag.CONSTRUCTED, 16);
		public byte[] code = null;
		private List<CSIRSResourceMobility> seqOf = null;

		public CsiRsResourceListMobility() {
			seqOf = new ArrayList<CSIRSResourceMobility>();
		}

		public CsiRsResourceListMobility(byte[] code) {
			this.code = code;
		}

		public List<CSIRSResourceMobility> getCSIRSResourceMobility() {
			if (seqOf == null) {
				seqOf = new ArrayList<CSIRSResourceMobility>();
			}
			return seqOf;
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
			for (int i = (seqOf.size() - 1); i >= 0; i--) {
				codeLength += seqOf.get(i).encode(reverseOS, true);
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
			if (withTag) {
				codeLength += tag.decodeAndCheck(is);
			}

			BerLength length = new BerLength();
			codeLength += length.decode(is);
			int totalLength = length.val;

			while (subCodeLength < totalLength) {
				CSIRSResourceMobility element = new CSIRSResourceMobility();
				subCodeLength += element.decode(is, true);
				seqOf.add(element);
			}
			if (subCodeLength != totalLength) {
				throw new IOException("Decoded SequenceOf or SetOf has wrong length. Expected " + totalLength + " but has " + subCodeLength);

			}
			codeLength += subCodeLength;

			return codeLength;
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

			sb.append("{\n");
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			if (seqOf == null) {
				sb.append("null");
			}
			else {
				Iterator<CSIRSResourceMobility> it = seqOf.iterator();
				if (it.hasNext()) {
					it.next().appendAsString(sb, indentLevel + 1);
					while (it.hasNext()) {
						sb.append(",\n");
						for (int i = 0; i < indentLevel + 1; i++) {
							sb.append("\t");
						}
						it.next().appendAsString(sb, indentLevel + 1);
					}
				}
			}

			sb.append("\n");
			for (int i = 0; i < indentLevel; i++) {
				sb.append("\t");
			}
			sb.append("}");
		}

	}

	public static final BerTag tag = new BerTag(BerTag.UNIVERSAL_CLASS, BerTag.CONSTRUCTED, 16);

	public byte[] code = null;
	private PhysCellId cellId = null;
	private CsiRsMeasurementBW csiRsMeasurementBW = null;
	private BerEnum density = null;
	private CsiRsResourceListMobility csiRsResourceListMobility = null;
	
	public CSIRSCellMobility() {
	}

	public CSIRSCellMobility(byte[] code) {
		this.code = code;
	}

	public void setCellId(PhysCellId cellId) {
		this.cellId = cellId;
	}

	public PhysCellId getCellId() {
		return cellId;
	}

	public void setCsiRsMeasurementBW(CsiRsMeasurementBW csiRsMeasurementBW) {
		this.csiRsMeasurementBW = csiRsMeasurementBW;
	}

	public CsiRsMeasurementBW getCsiRsMeasurementBW() {
		return csiRsMeasurementBW;
	}

	public void setDensity(BerEnum density) {
		this.density = density;
	}

	public BerEnum getDensity() {
		return density;
	}

	public void setCsiRsResourceListMobility(CsiRsResourceListMobility csiRsResourceListMobility) {
		this.csiRsResourceListMobility = csiRsResourceListMobility;
	}

	public CsiRsResourceListMobility getCsiRsResourceListMobility() {
		return csiRsResourceListMobility;
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
		codeLength += csiRsResourceListMobility.encode(reverseOS, false);
		// write tag: CONTEXT_CLASS, CONSTRUCTED, 3
		reverseOS.write(0xA3);
		codeLength += 1;
		
		if (density != null) {
			codeLength += density.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, PRIMITIVE, 2
			reverseOS.write(0x82);
			codeLength += 1;
		}
		
		codeLength += csiRsMeasurementBW.encode(reverseOS, false);
		// write tag: CONTEXT_CLASS, CONSTRUCTED, 1
		reverseOS.write(0xA1);
		codeLength += 1;
		
		codeLength += cellId.encode(reverseOS, false);
		// write tag: CONTEXT_CLASS, PRIMITIVE, 0
		reverseOS.write(0x80);
		codeLength += 1;
		
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

		subCodeLength += berTag.decode(is);
		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 0)) {
			cellId = new PhysCellId();
			subCodeLength += cellId.decode(is, false);
			subCodeLength += berTag.decode(is);
		}
		else {
			throw new IOException("Tag does not match the mandatory sequence element tag.");
		}
		
		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.CONSTRUCTED, 1)) {
			csiRsMeasurementBW = new CsiRsMeasurementBW();
			subCodeLength += csiRsMeasurementBW.decode(is, false);
			subCodeLength += berTag.decode(is);
		}
		else {
			throw new IOException("Tag does not match the mandatory sequence element tag.");
		}
		
		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 2)) {
			density = new BerEnum();
			subCodeLength += density.decode(is, false);
			subCodeLength += berTag.decode(is);
		}
		
		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.CONSTRUCTED, 3)) {
			csiRsResourceListMobility = new CsiRsResourceListMobility();
			subCodeLength += csiRsResourceListMobility.decode(is, false);
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
		sb.append("\n");
		for (int i = 0; i < indentLevel + 1; i++) {
			sb.append("\t");
		}
		if (cellId != null) {
			sb.append("cellId: ").append(cellId);
		}
		else {
			sb.append("cellId: <empty-required-field>");
		}
		
		sb.append(",\n");
		for (int i = 0; i < indentLevel + 1; i++) {
			sb.append("\t");
		}
		if (csiRsMeasurementBW != null) {
			sb.append("csiRsMeasurementBW: ");
			csiRsMeasurementBW.appendAsString(sb, indentLevel + 1);
		}
		else {
			sb.append("csiRsMeasurementBW: <empty-required-field>");
		}
		
		if (density != null) {
			sb.append(",\n");
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("density: ").append(density);
		}
		
		sb.append(",\n");
		for (int i = 0; i < indentLevel + 1; i++) {
			sb.append("\t");
		}
		if (csiRsResourceListMobility != null) {
			sb.append("csiRsResourceListMobility: ");
			csiRsResourceListMobility.appendAsString(sb, indentLevel + 1);
		}
		else {
			sb.append("csiRsResourceListMobility: <empty-required-field>");
		}
		
		sb.append("\n");
		for (int i = 0; i < indentLevel; i++) {
			sb.append("\t");
		}
		sb.append("}");
	}

}
