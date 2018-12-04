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


public class SpCellConfig implements BerType, Serializable {

	private static final long serialVersionUID = 1L;

	public static final BerTag tag = new BerTag(BerTag.UNIVERSAL_CLASS, BerTag.CONSTRUCTED, 16);

	public byte[] code = null;
	private ServCellIndex servCellIndex = null;
	private ReconfigurationWithSync reconfigurationWithSync = null;
	private SetupRelease rlfTimersAndConstants = null;
	private BerEnum rlmInSyncOutOfSyncThreshold = null;
	private ServingCellConfig spCellConfigDedicated = null;
	
	public SpCellConfig() {
	}

	public SpCellConfig(byte[] code) {
		this.code = code;
	}

	public void setServCellIndex(ServCellIndex servCellIndex) {
		this.servCellIndex = servCellIndex;
	}

	public ServCellIndex getServCellIndex() {
		return servCellIndex;
	}

	public void setReconfigurationWithSync(ReconfigurationWithSync reconfigurationWithSync) {
		this.reconfigurationWithSync = reconfigurationWithSync;
	}

	public ReconfigurationWithSync getReconfigurationWithSync() {
		return reconfigurationWithSync;
	}

	public void setRlfTimersAndConstants(SetupRelease rlfTimersAndConstants) {
		this.rlfTimersAndConstants = rlfTimersAndConstants;
	}

	public SetupRelease getRlfTimersAndConstants() {
		return rlfTimersAndConstants;
	}

	public void setRlmInSyncOutOfSyncThreshold(BerEnum rlmInSyncOutOfSyncThreshold) {
		this.rlmInSyncOutOfSyncThreshold = rlmInSyncOutOfSyncThreshold;
	}

	public BerEnum getRlmInSyncOutOfSyncThreshold() {
		return rlmInSyncOutOfSyncThreshold;
	}

	public void setSpCellConfigDedicated(ServingCellConfig spCellConfigDedicated) {
		this.spCellConfigDedicated = spCellConfigDedicated;
	}

	public ServingCellConfig getSpCellConfigDedicated() {
		return spCellConfigDedicated;
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

		if (spCellConfigDedicated != null) {
			codeLength += spCellConfigDedicated.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, CONSTRUCTED, 4
			reverseOS.write(0xA4);
			codeLength += 1;
		}
		
		if (rlmInSyncOutOfSyncThreshold != null) {
			codeLength += rlmInSyncOutOfSyncThreshold.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, PRIMITIVE, 3
			reverseOS.write(0x83);
			codeLength += 1;
		}
		
		if (rlfTimersAndConstants != null) {
			sublength = rlfTimersAndConstants.encode(reverseOS);
			codeLength += sublength;
			codeLength += BerLength.encodeLength(reverseOS, sublength);
			// write tag: CONTEXT_CLASS, CONSTRUCTED, 2
			reverseOS.write(0xA2);
			codeLength += 1;
		}
		
		if (reconfigurationWithSync != null) {
			codeLength += reconfigurationWithSync.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, CONSTRUCTED, 1
			reverseOS.write(0xA1);
			codeLength += 1;
		}
		
		if (servCellIndex != null) {
			codeLength += servCellIndex.encode(reverseOS, false);
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
			servCellIndex = new ServCellIndex();
			subCodeLength += servCellIndex.decode(is, false);
			if (subCodeLength == totalLength) {
				return codeLength;
			}
			subCodeLength += berTag.decode(is);
		}
		
		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.CONSTRUCTED, 1)) {
			reconfigurationWithSync = new ReconfigurationWithSync();
			subCodeLength += reconfigurationWithSync.decode(is, false);
			if (subCodeLength == totalLength) {
				return codeLength;
			}
			subCodeLength += berTag.decode(is);
		}
		
		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.CONSTRUCTED, 2)) {
			subCodeLength += length.decode(is);
			rlfTimersAndConstants = new SetupRelease();
			subCodeLength += rlfTimersAndConstants.decode(is, null);
			if (subCodeLength == totalLength) {
				return codeLength;
			}
			subCodeLength += berTag.decode(is);
		}
		
		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 3)) {
			rlmInSyncOutOfSyncThreshold = new BerEnum();
			subCodeLength += rlmInSyncOutOfSyncThreshold.decode(is, false);
			if (subCodeLength == totalLength) {
				return codeLength;
			}
			subCodeLength += berTag.decode(is);
		}
		
		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.CONSTRUCTED, 4)) {
			spCellConfigDedicated = new ServingCellConfig();
			subCodeLength += spCellConfigDedicated.decode(is, false);
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
		if (servCellIndex != null) {
			sb.append("\n");
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("servCellIndex: ").append(servCellIndex);
			firstSelectedElement = false;
		}
		
		if (reconfigurationWithSync != null) {
			if (!firstSelectedElement) {
				sb.append(",\n");
			}
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("reconfigurationWithSync: ");
			reconfigurationWithSync.appendAsString(sb, indentLevel + 1);
			firstSelectedElement = false;
		}
		
		if (rlfTimersAndConstants != null) {
			if (!firstSelectedElement) {
				sb.append(",\n");
			}
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("rlfTimersAndConstants: ");
			rlfTimersAndConstants.appendAsString(sb, indentLevel + 1);
			firstSelectedElement = false;
		}
		
		if (rlmInSyncOutOfSyncThreshold != null) {
			if (!firstSelectedElement) {
				sb.append(",\n");
			}
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("rlmInSyncOutOfSyncThreshold: ").append(rlmInSyncOutOfSyncThreshold);
			firstSelectedElement = false;
		}
		
		if (spCellConfigDedicated != null) {
			if (!firstSelectedElement) {
				sb.append(",\n");
			}
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("spCellConfigDedicated: ");
			spCellConfigDedicated.appendAsString(sb, indentLevel + 1);
			firstSelectedElement = false;
		}
		
		sb.append("\n");
		for (int i = 0; i < indentLevel; i++) {
			sb.append("\t");
		}
		sb.append("}");
	}

}
