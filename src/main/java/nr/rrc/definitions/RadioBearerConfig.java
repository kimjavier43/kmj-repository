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


public class RadioBearerConfig implements BerType, Serializable {

	private static final long serialVersionUID = 1L;

	public static final BerTag tag = new BerTag(BerTag.UNIVERSAL_CLASS, BerTag.CONSTRUCTED, 16);

	public byte[] code = null;
	private SRBToAddModList srbToAddModList = null;
	private BerEnum srb3ToRelease = null;
	private DRBToAddModList drbToAddModList = null;
	private DRBToReleaseList drbToReleaseList = null;
	private SecurityConfig securityConfig = null;
	
	public RadioBearerConfig() {
	}

	public RadioBearerConfig(byte[] code) {
		this.code = code;
	}

	public void setSrbToAddModList(SRBToAddModList srbToAddModList) {
		this.srbToAddModList = srbToAddModList;
	}

	public SRBToAddModList getSrbToAddModList() {
		return srbToAddModList;
	}

	public void setSrb3ToRelease(BerEnum srb3ToRelease) {
		this.srb3ToRelease = srb3ToRelease;
	}

	public BerEnum getSrb3ToRelease() {
		return srb3ToRelease;
	}

	public void setDrbToAddModList(DRBToAddModList drbToAddModList) {
		this.drbToAddModList = drbToAddModList;
	}

	public DRBToAddModList getDrbToAddModList() {
		return drbToAddModList;
	}

	public void setDrbToReleaseList(DRBToReleaseList drbToReleaseList) {
		this.drbToReleaseList = drbToReleaseList;
	}

	public DRBToReleaseList getDrbToReleaseList() {
		return drbToReleaseList;
	}

	public void setSecurityConfig(SecurityConfig securityConfig) {
		this.securityConfig = securityConfig;
	}

	public SecurityConfig getSecurityConfig() {
		return securityConfig;
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
		if (securityConfig != null) {
			codeLength += securityConfig.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, CONSTRUCTED, 4
			reverseOS.write(0xA4);
			codeLength += 1;
		}
		
		if (drbToReleaseList != null) {
			codeLength += drbToReleaseList.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, CONSTRUCTED, 3
			reverseOS.write(0xA3);
			codeLength += 1;
		}
		
		if (drbToAddModList != null) {
			codeLength += drbToAddModList.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, CONSTRUCTED, 2
			reverseOS.write(0xA2);
			codeLength += 1;
		}
		
		if (srb3ToRelease != null) {
			codeLength += srb3ToRelease.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, PRIMITIVE, 1
			reverseOS.write(0x81);
			codeLength += 1;
		}
		
		if (srbToAddModList != null) {
			codeLength += srbToAddModList.encode(reverseOS, false);
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
			srbToAddModList = new SRBToAddModList();
			subCodeLength += srbToAddModList.decode(is, false);
			if (subCodeLength == totalLength) {
				return codeLength;
			}
			subCodeLength += berTag.decode(is);
		}
		
		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 1)) {
			srb3ToRelease = new BerEnum();
			subCodeLength += srb3ToRelease.decode(is, false);
			if (subCodeLength == totalLength) {
				return codeLength;
			}
			subCodeLength += berTag.decode(is);
		}
		
		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.CONSTRUCTED, 2)) {
			drbToAddModList = new DRBToAddModList();
			subCodeLength += drbToAddModList.decode(is, false);
			if (subCodeLength == totalLength) {
				return codeLength;
			}
			subCodeLength += berTag.decode(is);
		}
		
		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.CONSTRUCTED, 3)) {
			drbToReleaseList = new DRBToReleaseList();
			subCodeLength += drbToReleaseList.decode(is, false);
			if (subCodeLength == totalLength) {
				return codeLength;
			}
			subCodeLength += berTag.decode(is);
		}
		
		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.CONSTRUCTED, 4)) {
			securityConfig = new SecurityConfig();
			subCodeLength += securityConfig.decode(is, false);
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
		if (srbToAddModList != null) {
			sb.append("\n");
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("srbToAddModList: ");
			srbToAddModList.appendAsString(sb, indentLevel + 1);
			firstSelectedElement = false;
		}
		
		if (srb3ToRelease != null) {
			if (!firstSelectedElement) {
				sb.append(",\n");
			}
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("srb3ToRelease: ").append(srb3ToRelease);
			firstSelectedElement = false;
		}
		
		if (drbToAddModList != null) {
			if (!firstSelectedElement) {
				sb.append(",\n");
			}
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("drbToAddModList: ");
			drbToAddModList.appendAsString(sb, indentLevel + 1);
			firstSelectedElement = false;
		}
		
		if (drbToReleaseList != null) {
			if (!firstSelectedElement) {
				sb.append(",\n");
			}
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("drbToReleaseList: ");
			drbToReleaseList.appendAsString(sb, indentLevel + 1);
			firstSelectedElement = false;
		}
		
		if (securityConfig != null) {
			if (!firstSelectedElement) {
				sb.append(",\n");
			}
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("securityConfig: ");
			securityConfig.appendAsString(sb, indentLevel + 1);
			firstSelectedElement = false;
		}
		
		sb.append("\n");
		for (int i = 0; i < indentLevel; i++) {
			sb.append("\t");
		}
		sb.append("}");
	}

}

