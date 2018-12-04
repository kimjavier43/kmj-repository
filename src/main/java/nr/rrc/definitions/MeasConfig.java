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


public class MeasConfig implements BerType, Serializable {

	private static final long serialVersionUID = 1L;

	public static class SMeasureConfig implements BerType, Serializable {

		private static final long serialVersionUID = 1L;

		public byte[] code = null;
		private RSRPRange ssbRSRP = null;
		private RSRPRange csiRSRP = null;
		
		public SMeasureConfig() {
		}

		public SMeasureConfig(byte[] code) {
			this.code = code;
		}

		public void setSsbRSRP(RSRPRange ssbRSRP) {
			this.ssbRSRP = ssbRSRP;
		}

		public RSRPRange getSsbRSRP() {
			return ssbRSRP;
		}

		public void setCsiRSRP(RSRPRange csiRSRP) {
			this.csiRSRP = csiRSRP;
		}

		public RSRPRange getCsiRSRP() {
			return csiRSRP;
		}

		public int encode(OutputStream reverseOS) throws IOException {

			if (code != null) {
				for (int i = code.length - 1; i >= 0; i--) {
					reverseOS.write(code[i]);
				}
				return code.length;
			}

			int codeLength = 0;
			if (csiRSRP != null) {
				codeLength += csiRSRP.encode(reverseOS, false);
				// write tag: CONTEXT_CLASS, PRIMITIVE, 1
				reverseOS.write(0x81);
				codeLength += 1;
				return codeLength;
			}
			
			if (ssbRSRP != null) {
				codeLength += ssbRSRP.encode(reverseOS, false);
				// write tag: CONTEXT_CLASS, PRIMITIVE, 0
				reverseOS.write(0x80);
				codeLength += 1;
				return codeLength;
			}
			
			throw new IOException("Error encoding CHOICE: No element of CHOICE was selected.");
		}

		public int decode(InputStream is) throws IOException {
			return decode(is, null);
		}

		public int decode(InputStream is, BerTag berTag) throws IOException {

			int codeLength = 0;
			BerTag passedTag = berTag;

			if (berTag == null) {
				berTag = new BerTag();
				codeLength += berTag.decode(is);
			}

			if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 0)) {
				ssbRSRP = new RSRPRange();
				codeLength += ssbRSRP.decode(is, false);
				return codeLength;
			}

			if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 1)) {
				csiRSRP = new RSRPRange();
				codeLength += csiRSRP.decode(is, false);
				return codeLength;
			}

			if (passedTag != null) {
				return 0;
			}

			throw new IOException("Error decoding CHOICE: Tag " + berTag + " matched to no item.");
		}

		public void encodeAndSave(int encodingSizeGuess) throws IOException {
			ReverseByteArrayOutputStream reverseOS = new ReverseByteArrayOutputStream(encodingSizeGuess);
			encode(reverseOS);
			code = reverseOS.getArray();
		}

		public String toString() {
			StringBuilder sb = new StringBuilder();
			appendAsString(sb, 0);
			return sb.toString();
		}

		public void appendAsString(StringBuilder sb, int indentLevel) {

			if (ssbRSRP != null) {
				sb.append("ssbRSRP: ").append(ssbRSRP);
				return;
			}

			if (csiRSRP != null) {
				sb.append("csiRSRP: ").append(csiRSRP);
				return;
			}

			sb.append("<none>");
		}

	}

	public static final BerTag tag = new BerTag(BerTag.UNIVERSAL_CLASS, BerTag.CONSTRUCTED, 16);

	public byte[] code = null;
	private MeasObjectToRemoveList measObjectToRemoveList = null;
	private MeasObjectToAddModList measObjectToAddModList = null;
	private ReportConfigToRemoveList reportConfigToRemoveList = null;
	private ReportConfigToAddModList reportConfigToAddModList = null;
	private MeasIdToRemoveList measIdToRemoveList = null;
	private MeasIdToAddModList measIdToAddModList = null;
	private SMeasureConfig sMeasureConfig = null;
	private QuantityConfig quantityConfig = null;
	private MeasGapConfig measGapConfig = null;
	private MeasGapSharingConfig measGapSharingConfig = null;
	
	public MeasConfig() {
	}

	public MeasConfig(byte[] code) {
		this.code = code;
	}

	public void setMeasObjectToRemoveList(MeasObjectToRemoveList measObjectToRemoveList) {
		this.measObjectToRemoveList = measObjectToRemoveList;
	}

	public MeasObjectToRemoveList getMeasObjectToRemoveList() {
		return measObjectToRemoveList;
	}

	public void setMeasObjectToAddModList(MeasObjectToAddModList measObjectToAddModList) {
		this.measObjectToAddModList = measObjectToAddModList;
	}

	public MeasObjectToAddModList getMeasObjectToAddModList() {
		return measObjectToAddModList;
	}

	public void setReportConfigToRemoveList(ReportConfigToRemoveList reportConfigToRemoveList) {
		this.reportConfigToRemoveList = reportConfigToRemoveList;
	}

	public ReportConfigToRemoveList getReportConfigToRemoveList() {
		return reportConfigToRemoveList;
	}

	public void setReportConfigToAddModList(ReportConfigToAddModList reportConfigToAddModList) {
		this.reportConfigToAddModList = reportConfigToAddModList;
	}

	public ReportConfigToAddModList getReportConfigToAddModList() {
		return reportConfigToAddModList;
	}

	public void setMeasIdToRemoveList(MeasIdToRemoveList measIdToRemoveList) {
		this.measIdToRemoveList = measIdToRemoveList;
	}

	public MeasIdToRemoveList getMeasIdToRemoveList() {
		return measIdToRemoveList;
	}

	public void setMeasIdToAddModList(MeasIdToAddModList measIdToAddModList) {
		this.measIdToAddModList = measIdToAddModList;
	}

	public MeasIdToAddModList getMeasIdToAddModList() {
		return measIdToAddModList;
	}

	public void setSMeasureConfig(SMeasureConfig sMeasureConfig) {
		this.sMeasureConfig = sMeasureConfig;
	}

	public SMeasureConfig getSMeasureConfig() {
		return sMeasureConfig;
	}

	public void setQuantityConfig(QuantityConfig quantityConfig) {
		this.quantityConfig = quantityConfig;
	}

	public QuantityConfig getQuantityConfig() {
		return quantityConfig;
	}

	public void setMeasGapConfig(MeasGapConfig measGapConfig) {
		this.measGapConfig = measGapConfig;
	}

	public MeasGapConfig getMeasGapConfig() {
		return measGapConfig;
	}

	public void setMeasGapSharingConfig(MeasGapSharingConfig measGapSharingConfig) {
		this.measGapSharingConfig = measGapSharingConfig;
	}

	public MeasGapSharingConfig getMeasGapSharingConfig() {
		return measGapSharingConfig;
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
		int sublength;

		if (measGapSharingConfig != null) {
			codeLength += measGapSharingConfig.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, CONSTRUCTED, 9
			reverseOS.write(0xA9);
			codeLength += 1;
		}
		
		if (measGapConfig != null) {
			codeLength += measGapConfig.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, CONSTRUCTED, 8
			reverseOS.write(0xA8);
			codeLength += 1;
		}
		
		if (quantityConfig != null) {
			codeLength += quantityConfig.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, CONSTRUCTED, 7
			reverseOS.write(0xA7);
			codeLength += 1;
		}
		
		if (sMeasureConfig != null) {
			sublength = sMeasureConfig.encode(reverseOS);
			codeLength += sublength;
			codeLength += BerLength.encodeLength(reverseOS, sublength);
			// write tag: CONTEXT_CLASS, CONSTRUCTED, 6
			reverseOS.write(0xA6);
			codeLength += 1;
		}
		
		if (measIdToAddModList != null) {
			codeLength += measIdToAddModList.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, CONSTRUCTED, 5
			reverseOS.write(0xA5);
			codeLength += 1;
		}
		
		if (measIdToRemoveList != null) {
			codeLength += measIdToRemoveList.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, CONSTRUCTED, 4
			reverseOS.write(0xA4);
			codeLength += 1;
		}
		
		if (reportConfigToAddModList != null) {
			codeLength += reportConfigToAddModList.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, CONSTRUCTED, 3
			reverseOS.write(0xA3);
			codeLength += 1;
		}
		
		if (reportConfigToRemoveList != null) {
			codeLength += reportConfigToRemoveList.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, CONSTRUCTED, 2
			reverseOS.write(0xA2);
			codeLength += 1;
		}
		
		if (measObjectToAddModList != null) {
			codeLength += measObjectToAddModList.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, CONSTRUCTED, 1
			reverseOS.write(0xA1);
			codeLength += 1;
		}
		
		if (measObjectToRemoveList != null) {
			codeLength += measObjectToRemoveList.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, CONSTRUCTED, 0
			reverseOS.write(0xA0);
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
		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.CONSTRUCTED, 0)) {
			measObjectToRemoveList = new MeasObjectToRemoveList();
			subCodeLength += measObjectToRemoveList.decode(is, false);
			if (subCodeLength == totalLength) {
				return codeLength;
			}
			subCodeLength += berTag.decode(is);
		}
		
		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.CONSTRUCTED, 1)) {
			measObjectToAddModList = new MeasObjectToAddModList();
			subCodeLength += measObjectToAddModList.decode(is, false);
			if (subCodeLength == totalLength) {
				return codeLength;
			}
			subCodeLength += berTag.decode(is);
		}
		
		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.CONSTRUCTED, 2)) {
			reportConfigToRemoveList = new ReportConfigToRemoveList();
			subCodeLength += reportConfigToRemoveList.decode(is, false);
			if (subCodeLength == totalLength) {
				return codeLength;
			}
			subCodeLength += berTag.decode(is);
		}
		
		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.CONSTRUCTED, 3)) {
			reportConfigToAddModList = new ReportConfigToAddModList();
			subCodeLength += reportConfigToAddModList.decode(is, false);
			if (subCodeLength == totalLength) {
				return codeLength;
			}
			subCodeLength += berTag.decode(is);
		}
		
		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.CONSTRUCTED, 4)) {
			measIdToRemoveList = new MeasIdToRemoveList();
			subCodeLength += measIdToRemoveList.decode(is, false);
			if (subCodeLength == totalLength) {
				return codeLength;
			}
			subCodeLength += berTag.decode(is);
		}
		
		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.CONSTRUCTED, 5)) {
			measIdToAddModList = new MeasIdToAddModList();
			subCodeLength += measIdToAddModList.decode(is, false);
			if (subCodeLength == totalLength) {
				return codeLength;
			}
			subCodeLength += berTag.decode(is);
		}
		
		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.CONSTRUCTED, 6)) {
			subCodeLength += length.decode(is);
			sMeasureConfig = new SMeasureConfig();
			subCodeLength += sMeasureConfig.decode(is, null);
			if (subCodeLength == totalLength) {
				return codeLength;
			}
			subCodeLength += berTag.decode(is);
		}
		
		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.CONSTRUCTED, 7)) {
			quantityConfig = new QuantityConfig();
			subCodeLength += quantityConfig.decode(is, false);
			if (subCodeLength == totalLength) {
				return codeLength;
			}
			subCodeLength += berTag.decode(is);
		}
		
		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.CONSTRUCTED, 8)) {
			measGapConfig = new MeasGapConfig();
			subCodeLength += measGapConfig.decode(is, false);
			if (subCodeLength == totalLength) {
				return codeLength;
			}
			subCodeLength += berTag.decode(is);
		}
		
		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.CONSTRUCTED, 9)) {
			measGapSharingConfig = new MeasGapSharingConfig();
			subCodeLength += measGapSharingConfig.decode(is, false);
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
		if (measObjectToRemoveList != null) {
			sb.append("\n");
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("measObjectToRemoveList: ");
			measObjectToRemoveList.appendAsString(sb, indentLevel + 1);
			firstSelectedElement = false;
		}
		
		if (measObjectToAddModList != null) {
			if (!firstSelectedElement) {
				sb.append(",\n");
			}
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("measObjectToAddModList: ");
			measObjectToAddModList.appendAsString(sb, indentLevel + 1);
			firstSelectedElement = false;
		}
		
		if (reportConfigToRemoveList != null) {
			if (!firstSelectedElement) {
				sb.append(",\n");
			}
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("reportConfigToRemoveList: ");
			reportConfigToRemoveList.appendAsString(sb, indentLevel + 1);
			firstSelectedElement = false;
		}
		
		if (reportConfigToAddModList != null) {
			if (!firstSelectedElement) {
				sb.append(",\n");
			}
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("reportConfigToAddModList: ");
			reportConfigToAddModList.appendAsString(sb, indentLevel + 1);
			firstSelectedElement = false;
		}
		
		if (measIdToRemoveList != null) {
			if (!firstSelectedElement) {
				sb.append(",\n");
			}
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("measIdToRemoveList: ");
			measIdToRemoveList.appendAsString(sb, indentLevel + 1);
			firstSelectedElement = false;
		}
		
		if (measIdToAddModList != null) {
			if (!firstSelectedElement) {
				sb.append(",\n");
			}
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("measIdToAddModList: ");
			measIdToAddModList.appendAsString(sb, indentLevel + 1);
			firstSelectedElement = false;
		}
		
		if (sMeasureConfig != null) {
			if (!firstSelectedElement) {
				sb.append(",\n");
			}
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("sMeasureConfig: ");
			sMeasureConfig.appendAsString(sb, indentLevel + 1);
			firstSelectedElement = false;
		}
		
		if (quantityConfig != null) {
			if (!firstSelectedElement) {
				sb.append(",\n");
			}
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("quantityConfig: ");
			quantityConfig.appendAsString(sb, indentLevel + 1);
			firstSelectedElement = false;
		}
		
		if (measGapConfig != null) {
			if (!firstSelectedElement) {
				sb.append(",\n");
			}
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("measGapConfig: ");
			measGapConfig.appendAsString(sb, indentLevel + 1);
			firstSelectedElement = false;
		}
		
		if (measGapSharingConfig != null) {
			if (!firstSelectedElement) {
				sb.append(",\n");
			}
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("measGapSharingConfig: ");
			measGapSharingConfig.appendAsString(sb, indentLevel + 1);
			firstSelectedElement = false;
		}
		
		sb.append("\n");
		for (int i = 0; i < indentLevel; i++) {
			sb.append("\t");
		}
		sb.append("}");
	}

}
