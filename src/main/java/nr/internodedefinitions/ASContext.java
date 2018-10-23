/**
 * This class file was automatically generated by jASN1 v1.10.0 (http://www.openmuc.org)
 */

package nr.internodedefinitions;

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

import nr.rrc.definitions.ARFCNValueNR;
import nr.rrc.definitions.CSIRSIndex;
import nr.rrc.definitions.CellIdentity;
import nr.rrc.definitions.GapConfig;
import nr.rrc.definitions.MeasQuantityResults;
import nr.rrc.definitions.MeasResultCellListSFTD;
import nr.rrc.definitions.MeasResultList2NR;
import nr.rrc.definitions.MeasResultSCGFailure;
import nr.rrc.definitions.PMax;
import nr.rrc.definitions.PhysCellId;
import nr.rrc.definitions.RRCReconfiguration;
import nr.rrc.definitions.RadioBearerConfig;
import nr.rrc.definitions.SSBIndex;
import nr.rrc.definitions.SSBMTC;
import nr.rrc.definitions.ServCellIndex;
import nr.rrc.definitions.SetupRelease;
import nr.rrc.definitions.ShortMACI;
import nr.rrc.definitions.UECapabilityRATContainerList;

public class ASContext implements BerType, Serializable {

	private static final long serialVersionUID = 1L;

	public static class ReestablishmentInfo implements BerType, Serializable {

		private static final long serialVersionUID = 1L;

		public static final BerTag tag = new BerTag(BerTag.UNIVERSAL_CLASS, BerTag.CONSTRUCTED, 16);

		public byte[] code = null;
		private PhysCellId sourcePhysCellId = null;
		private ShortMACI targetCellShortMACI = null;
		private ReestabNCellInfoList additionalReestabInfoList = null;
		
		public ReestablishmentInfo() {
		}

		public ReestablishmentInfo(byte[] code) {
			this.code = code;
		}

		public void setSourcePhysCellId(PhysCellId sourcePhysCellId) {
			this.sourcePhysCellId = sourcePhysCellId;
		}

		public PhysCellId getSourcePhysCellId() {
			return sourcePhysCellId;
		}

		public void setTargetCellShortMACI(ShortMACI targetCellShortMACI) {
			this.targetCellShortMACI = targetCellShortMACI;
		}

		public ShortMACI getTargetCellShortMACI() {
			return targetCellShortMACI;
		}

		public void setAdditionalReestabInfoList(ReestabNCellInfoList additionalReestabInfoList) {
			this.additionalReestabInfoList = additionalReestabInfoList;
		}

		public ReestabNCellInfoList getAdditionalReestabInfoList() {
			return additionalReestabInfoList;
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
			if (additionalReestabInfoList != null) {
				codeLength += additionalReestabInfoList.encode(reverseOS, false);
				// write tag: CONTEXT_CLASS, CONSTRUCTED, 2
				reverseOS.write(0xA2);
				codeLength += 1;
			}
			
			codeLength += targetCellShortMACI.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, PRIMITIVE, 1
			reverseOS.write(0x81);
			codeLength += 1;
			
			codeLength += sourcePhysCellId.encode(reverseOS, false);
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
				sourcePhysCellId = new PhysCellId();
				subCodeLength += sourcePhysCellId.decode(is, false);
				subCodeLength += berTag.decode(is);
			}
			else {
				throw new IOException("Tag does not match the mandatory sequence element tag.");
			}
			
			if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 1)) {
				targetCellShortMACI = new ShortMACI();
				subCodeLength += targetCellShortMACI.decode(is, false);
				if (subCodeLength == totalLength) {
					return codeLength;
				}
				subCodeLength += berTag.decode(is);
			}
			else {
				throw new IOException("Tag does not match the mandatory sequence element tag.");
			}
			
			if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.CONSTRUCTED, 2)) {
				additionalReestabInfoList = new ReestabNCellInfoList();
				subCodeLength += additionalReestabInfoList.decode(is, false);
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
			if (sourcePhysCellId != null) {
				sb.append("sourcePhysCellId: ").append(sourcePhysCellId);
			}
			else {
				sb.append("sourcePhysCellId: <empty-required-field>");
			}
			
			sb.append(",\n");
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			if (targetCellShortMACI != null) {
				sb.append("targetCellShortMACI: ").append(targetCellShortMACI);
			}
			else {
				sb.append("targetCellShortMACI: <empty-required-field>");
			}
			
			if (additionalReestabInfoList != null) {
				sb.append(",\n");
				for (int i = 0; i < indentLevel + 1; i++) {
					sb.append("\t");
				}
				sb.append("additionalReestabInfoList: ");
				additionalReestabInfoList.appendAsString(sb, indentLevel + 1);
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
	private ReestablishmentInfo reestablishmentInfo = null;
	private ConfigRestrictInfoSCG configRestrictInfo = null;
	
	public ASContext() {
	}

	public ASContext(byte[] code) {
		this.code = code;
	}

	public void setReestablishmentInfo(ReestablishmentInfo reestablishmentInfo) {
		this.reestablishmentInfo = reestablishmentInfo;
	}

	public ReestablishmentInfo getReestablishmentInfo() {
		return reestablishmentInfo;
	}

	public void setConfigRestrictInfo(ConfigRestrictInfoSCG configRestrictInfo) {
		this.configRestrictInfo = configRestrictInfo;
	}

	public ConfigRestrictInfoSCG getConfigRestrictInfo() {
		return configRestrictInfo;
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
		if (configRestrictInfo != null) {
			codeLength += configRestrictInfo.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, CONSTRUCTED, 1
			reverseOS.write(0xA1);
			codeLength += 1;
		}
		
		if (reestablishmentInfo != null) {
			codeLength += reestablishmentInfo.encode(reverseOS, false);
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
			reestablishmentInfo = new ReestablishmentInfo();
			subCodeLength += reestablishmentInfo.decode(is, false);
			if (subCodeLength == totalLength) {
				return codeLength;
			}
			subCodeLength += berTag.decode(is);
		}
		
		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.CONSTRUCTED, 1)) {
			configRestrictInfo = new ConfigRestrictInfoSCG();
			subCodeLength += configRestrictInfo.decode(is, false);
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
		if (reestablishmentInfo != null) {
			sb.append("\n");
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("reestablishmentInfo: ");
			reestablishmentInfo.appendAsString(sb, indentLevel + 1);
			firstSelectedElement = false;
		}
		
		if (configRestrictInfo != null) {
			if (!firstSelectedElement) {
				sb.append(",\n");
			}
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("configRestrictInfo: ");
			configRestrictInfo.appendAsString(sb, indentLevel + 1);
			firstSelectedElement = false;
		}
		
		sb.append("\n");
		for (int i = 0; i < indentLevel; i++) {
			sb.append("\t");
		}
		sb.append("}");
	}

}

