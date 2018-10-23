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

public class RRMConfig implements BerType, Serializable {

	private static final long serialVersionUID = 1L;

	public static final BerTag tag = new BerTag(BerTag.UNIVERSAL_CLASS, BerTag.CONSTRUCTED, 16);

	public byte[] code = null;
	private BerEnum ueInactiveTime = null;
	private MeasResultList2NR candidateCellInfoList = null;
	
	public RRMConfig() {
	}

	public RRMConfig(byte[] code) {
		this.code = code;
	}

	public void setUeInactiveTime(BerEnum ueInactiveTime) {
		this.ueInactiveTime = ueInactiveTime;
	}

	public BerEnum getUeInactiveTime() {
		return ueInactiveTime;
	}

	public void setCandidateCellInfoList(MeasResultList2NR candidateCellInfoList) {
		this.candidateCellInfoList = candidateCellInfoList;
	}

	public MeasResultList2NR getCandidateCellInfoList() {
		return candidateCellInfoList;
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
		if (candidateCellInfoList != null) {
			codeLength += candidateCellInfoList.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, CONSTRUCTED, 1
			reverseOS.write(0xA1);
			codeLength += 1;
		}
		
		if (ueInactiveTime != null) {
			codeLength += ueInactiveTime.encode(reverseOS, false);
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
			ueInactiveTime = new BerEnum();
			subCodeLength += ueInactiveTime.decode(is, false);
			if (subCodeLength == totalLength) {
				return codeLength;
			}
			subCodeLength += berTag.decode(is);
		}
		
		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.CONSTRUCTED, 1)) {
			candidateCellInfoList = new MeasResultList2NR();
			subCodeLength += candidateCellInfoList.decode(is, false);
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
		if (ueInactiveTime != null) {
			sb.append("\n");
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("ueInactiveTime: ").append(ueInactiveTime);
			firstSelectedElement = false;
		}
		
		if (candidateCellInfoList != null) {
			if (!firstSelectedElement) {
				sb.append(",\n");
			}
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("candidateCellInfoList: ");
			candidateCellInfoList.appendAsString(sb, indentLevel + 1);
			firstSelectedElement = false;
		}
		
		sb.append("\n");
		for (int i = 0; i < indentLevel; i++) {
			sb.append("\t");
		}
		sb.append("}");
	}

}

