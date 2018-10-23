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

public class ConfigRestrictInfoSCG implements BerType, Serializable {

	private static final long serialVersionUID = 1L;

	public static class PowerCoordinationFR1 implements BerType, Serializable {

		private static final long serialVersionUID = 1L;

		public static final BerTag tag = new BerTag(BerTag.UNIVERSAL_CLASS, BerTag.CONSTRUCTED, 16);

		public byte[] code = null;
		private PMax pMaxNR = null;
		private PMax pMaxEUTRA = null;
		
		public PowerCoordinationFR1() {
		}

		public PowerCoordinationFR1(byte[] code) {
			this.code = code;
		}

		public void setPMaxNR(PMax pMaxNR) {
			this.pMaxNR = pMaxNR;
		}

		public PMax getPMaxNR() {
			return pMaxNR;
		}

		public void setPMaxEUTRA(PMax pMaxEUTRA) {
			this.pMaxEUTRA = pMaxEUTRA;
		}

		public PMax getPMaxEUTRA() {
			return pMaxEUTRA;
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
			if (pMaxEUTRA != null) {
				codeLength += pMaxEUTRA.encode(reverseOS, false);
				// write tag: CONTEXT_CLASS, PRIMITIVE, 1
				reverseOS.write(0x81);
				codeLength += 1;
			}
			
			if (pMaxNR != null) {
				codeLength += pMaxNR.encode(reverseOS, false);
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
				pMaxNR = new PMax();
				subCodeLength += pMaxNR.decode(is, false);
				if (subCodeLength == totalLength) {
					return codeLength;
				}
				subCodeLength += berTag.decode(is);
			}
			
			if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 1)) {
				pMaxEUTRA = new PMax();
				subCodeLength += pMaxEUTRA.decode(is, false);
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
			if (pMaxNR != null) {
				sb.append("\n");
				for (int i = 0; i < indentLevel + 1; i++) {
					sb.append("\t");
				}
				sb.append("pMaxNR: ").append(pMaxNR);
				firstSelectedElement = false;
			}
			
			if (pMaxEUTRA != null) {
				if (!firstSelectedElement) {
					sb.append(",\n");
				}
				for (int i = 0; i < indentLevel + 1; i++) {
					sb.append("\t");
				}
				sb.append("pMaxEUTRA: ").append(pMaxEUTRA);
				firstSelectedElement = false;
			}
			
			sb.append("\n");
			for (int i = 0; i < indentLevel; i++) {
				sb.append("\t");
			}
			sb.append("}");
		}

	}

	public static class ServCellIndexRangeSCG implements BerType, Serializable {

		private static final long serialVersionUID = 1L;

		public static final BerTag tag = new BerTag(BerTag.UNIVERSAL_CLASS, BerTag.CONSTRUCTED, 16);

		public byte[] code = null;
		private ServCellIndex lowBound = null;
		private ServCellIndex upBound = null;
		
		public ServCellIndexRangeSCG() {
		}

		public ServCellIndexRangeSCG(byte[] code) {
			this.code = code;
		}

		public void setLowBound(ServCellIndex lowBound) {
			this.lowBound = lowBound;
		}

		public ServCellIndex getLowBound() {
			return lowBound;
		}

		public void setUpBound(ServCellIndex upBound) {
			this.upBound = upBound;
		}

		public ServCellIndex getUpBound() {
			return upBound;
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
			codeLength += upBound.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, PRIMITIVE, 1
			reverseOS.write(0x81);
			codeLength += 1;
			
			codeLength += lowBound.encode(reverseOS, false);
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
				lowBound = new ServCellIndex();
				subCodeLength += lowBound.decode(is, false);
				subCodeLength += berTag.decode(is);
			}
			else {
				throw new IOException("Tag does not match the mandatory sequence element tag.");
			}
			
			if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 1)) {
				upBound = new ServCellIndex();
				subCodeLength += upBound.decode(is, false);
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
			if (lowBound != null) {
				sb.append("lowBound: ").append(lowBound);
			}
			else {
				sb.append("lowBound: <empty-required-field>");
			}
			
			sb.append(",\n");
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			if (upBound != null) {
				sb.append("upBound: ").append(upBound);
			}
			else {
				sb.append("upBound: <empty-required-field>");
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
	private BandCombinationIndexList allowedBCListMRDC = null;
	private PowerCoordinationFR1 powerCoordinationFR1 = null;
	private ServCellIndexRangeSCG servCellIndexRangeSCG = null;
	private BerInteger maxMeasFreqsSCGNR = null;
	private BerInteger maxMeasIdentitiesSCGNR = null;
	
	public ConfigRestrictInfoSCG() {
	}

	public ConfigRestrictInfoSCG(byte[] code) {
		this.code = code;
	}

	public void setAllowedBCListMRDC(BandCombinationIndexList allowedBCListMRDC) {
		this.allowedBCListMRDC = allowedBCListMRDC;
	}

	public BandCombinationIndexList getAllowedBCListMRDC() {
		return allowedBCListMRDC;
	}

	public void setPowerCoordinationFR1(PowerCoordinationFR1 powerCoordinationFR1) {
		this.powerCoordinationFR1 = powerCoordinationFR1;
	}

	public PowerCoordinationFR1 getPowerCoordinationFR1() {
		return powerCoordinationFR1;
	}

	public void setServCellIndexRangeSCG(ServCellIndexRangeSCG servCellIndexRangeSCG) {
		this.servCellIndexRangeSCG = servCellIndexRangeSCG;
	}

	public ServCellIndexRangeSCG getServCellIndexRangeSCG() {
		return servCellIndexRangeSCG;
	}

	public void setMaxMeasFreqsSCGNR(BerInteger maxMeasFreqsSCGNR) {
		this.maxMeasFreqsSCGNR = maxMeasFreqsSCGNR;
	}

	public BerInteger getMaxMeasFreqsSCGNR() {
		return maxMeasFreqsSCGNR;
	}

	public void setMaxMeasIdentitiesSCGNR(BerInteger maxMeasIdentitiesSCGNR) {
		this.maxMeasIdentitiesSCGNR = maxMeasIdentitiesSCGNR;
	}

	public BerInteger getMaxMeasIdentitiesSCGNR() {
		return maxMeasIdentitiesSCGNR;
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
		if (maxMeasIdentitiesSCGNR != null) {
			codeLength += maxMeasIdentitiesSCGNR.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, PRIMITIVE, 4
			reverseOS.write(0x84);
			codeLength += 1;
		}
		
		if (maxMeasFreqsSCGNR != null) {
			codeLength += maxMeasFreqsSCGNR.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, PRIMITIVE, 3
			reverseOS.write(0x83);
			codeLength += 1;
		}
		
		if (servCellIndexRangeSCG != null) {
			codeLength += servCellIndexRangeSCG.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, CONSTRUCTED, 2
			reverseOS.write(0xA2);
			codeLength += 1;
		}
		
		if (powerCoordinationFR1 != null) {
			codeLength += powerCoordinationFR1.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, CONSTRUCTED, 1
			reverseOS.write(0xA1);
			codeLength += 1;
		}
		
		if (allowedBCListMRDC != null) {
			codeLength += allowedBCListMRDC.encode(reverseOS, false);
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
			allowedBCListMRDC = new BandCombinationIndexList();
			subCodeLength += allowedBCListMRDC.decode(is, false);
			if (subCodeLength == totalLength) {
				return codeLength;
			}
			subCodeLength += berTag.decode(is);
		}
		
		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.CONSTRUCTED, 1)) {
			powerCoordinationFR1 = new PowerCoordinationFR1();
			subCodeLength += powerCoordinationFR1.decode(is, false);
			if (subCodeLength == totalLength) {
				return codeLength;
			}
			subCodeLength += berTag.decode(is);
		}
		
		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.CONSTRUCTED, 2)) {
			servCellIndexRangeSCG = new ServCellIndexRangeSCG();
			subCodeLength += servCellIndexRangeSCG.decode(is, false);
			if (subCodeLength == totalLength) {
				return codeLength;
			}
			subCodeLength += berTag.decode(is);
		}
		
		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 3)) {
			maxMeasFreqsSCGNR = new BerInteger();
			subCodeLength += maxMeasFreqsSCGNR.decode(is, false);
			if (subCodeLength == totalLength) {
				return codeLength;
			}
			subCodeLength += berTag.decode(is);
		}
		
		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 4)) {
			maxMeasIdentitiesSCGNR = new BerInteger();
			subCodeLength += maxMeasIdentitiesSCGNR.decode(is, false);
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
		if (allowedBCListMRDC != null) {
			sb.append("\n");
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("allowedBCListMRDC: ");
			allowedBCListMRDC.appendAsString(sb, indentLevel + 1);
			firstSelectedElement = false;
		}
		
		if (powerCoordinationFR1 != null) {
			if (!firstSelectedElement) {
				sb.append(",\n");
			}
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("powerCoordinationFR1: ");
			powerCoordinationFR1.appendAsString(sb, indentLevel + 1);
			firstSelectedElement = false;
		}
		
		if (servCellIndexRangeSCG != null) {
			if (!firstSelectedElement) {
				sb.append(",\n");
			}
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("servCellIndexRangeSCG: ");
			servCellIndexRangeSCG.appendAsString(sb, indentLevel + 1);
			firstSelectedElement = false;
		}
		
		if (maxMeasFreqsSCGNR != null) {
			if (!firstSelectedElement) {
				sb.append(",\n");
			}
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("maxMeasFreqsSCGNR: ").append(maxMeasFreqsSCGNR);
			firstSelectedElement = false;
		}
		
		if (maxMeasIdentitiesSCGNR != null) {
			if (!firstSelectedElement) {
				sb.append(",\n");
			}
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("maxMeasIdentitiesSCGNR: ").append(maxMeasIdentitiesSCGNR);
			firstSelectedElement = false;
		}
		
		sb.append("\n");
		for (int i = 0; i < indentLevel; i++) {
			sb.append("\t");
		}
		sb.append("}");
	}

}

