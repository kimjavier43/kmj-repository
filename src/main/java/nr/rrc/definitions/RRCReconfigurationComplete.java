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


public class RRCReconfigurationComplete implements BerType, Serializable {

	private static final long serialVersionUID = 1L;

	public static class CriticalExtensions implements BerType, Serializable {

		private static final long serialVersionUID = 1L;

		public byte[] code = null;
		public static class CriticalExtensionsFuture implements BerType, Serializable {

			private static final long serialVersionUID = 1L;

			public static final BerTag tag = new BerTag(BerTag.UNIVERSAL_CLASS, BerTag.CONSTRUCTED, 16);

			public byte[] code = null;
			
			public CriticalExtensionsFuture() {
			}

			public CriticalExtensionsFuture(byte[] code) {
				this.code = code;
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
				return subCodeLength;
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
				for (int i = 0; i < indentLevel; i++) {
					sb.append("\t");
				}
				sb.append("}");
			}

		}

		private RRCReconfigurationCompleteIEs rrcReconfigurationComplete = null;
		private CriticalExtensionsFuture criticalExtensionsFuture = null;
		
		public CriticalExtensions() {
		}

		public CriticalExtensions(byte[] code) {
			this.code = code;
		}

		public void setRrcReconfigurationComplete(RRCReconfigurationCompleteIEs rrcReconfigurationComplete) {
			this.rrcReconfigurationComplete = rrcReconfigurationComplete;
		}

		public RRCReconfigurationCompleteIEs getRrcReconfigurationComplete() {
			return rrcReconfigurationComplete;
		}

		public void setCriticalExtensionsFuture(CriticalExtensionsFuture criticalExtensionsFuture) {
			this.criticalExtensionsFuture = criticalExtensionsFuture;
		}

		public CriticalExtensionsFuture getCriticalExtensionsFuture() {
			return criticalExtensionsFuture;
		}

		public int encode(OutputStream reverseOS) throws IOException {

			if (code != null) {
				for (int i = code.length - 1; i >= 0; i--) {
					reverseOS.write(code[i]);
				}
				return code.length;
			}

			int codeLength = 0;
			if (criticalExtensionsFuture != null) {
				codeLength += criticalExtensionsFuture.encode(reverseOS, false);
				// write tag: CONTEXT_CLASS, CONSTRUCTED, 1
				reverseOS.write(0xA1);
				codeLength += 1;
				return codeLength;
			}
			
			if (rrcReconfigurationComplete != null) {
				codeLength += rrcReconfigurationComplete.encode(reverseOS, false);
				// write tag: CONTEXT_CLASS, CONSTRUCTED, 0
				reverseOS.write(0xA0);
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

			if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.CONSTRUCTED, 0)) {
				rrcReconfigurationComplete = new RRCReconfigurationCompleteIEs();
				codeLength += rrcReconfigurationComplete.decode(is, false);
				return codeLength;
			}

			if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.CONSTRUCTED, 1)) {
				criticalExtensionsFuture = new CriticalExtensionsFuture();
				codeLength += criticalExtensionsFuture.decode(is, false);
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

			if (rrcReconfigurationComplete != null) {
				sb.append("rrcReconfigurationComplete: ");
				rrcReconfigurationComplete.appendAsString(sb, indentLevel + 1);
				return;
			}

			if (criticalExtensionsFuture != null) {
				sb.append("criticalExtensionsFuture: ");
				criticalExtensionsFuture.appendAsString(sb, indentLevel + 1);
				return;
			}

			sb.append("<none>");
		}

	}

	public static final BerTag tag = new BerTag(BerTag.UNIVERSAL_CLASS, BerTag.CONSTRUCTED, 16);

	public byte[] code = null;
	private RRCTransactionIdentifier rrcTransactionIdentifier = null;
	private CriticalExtensions criticalExtensions = null;
	
	public RRCReconfigurationComplete() {
	}

	public RRCReconfigurationComplete(byte[] code) {
		this.code = code;
	}

	public void setRrcTransactionIdentifier(RRCTransactionIdentifier rrcTransactionIdentifier) {
		this.rrcTransactionIdentifier = rrcTransactionIdentifier;
	}

	public RRCTransactionIdentifier getRrcTransactionIdentifier() {
		return rrcTransactionIdentifier;
	}

	public void setCriticalExtensions(CriticalExtensions criticalExtensions) {
		this.criticalExtensions = criticalExtensions;
	}

	public CriticalExtensions getCriticalExtensions() {
		return criticalExtensions;
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

		sublength = criticalExtensions.encode(reverseOS);
		codeLength += sublength;
		codeLength += BerLength.encodeLength(reverseOS, sublength);
		// write tag: CONTEXT_CLASS, CONSTRUCTED, 1
		reverseOS.write(0xA1);
		codeLength += 1;
		
		codeLength += rrcTransactionIdentifier.encode(reverseOS, false);
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
			rrcTransactionIdentifier = new RRCTransactionIdentifier();
			subCodeLength += rrcTransactionIdentifier.decode(is, false);
			subCodeLength += berTag.decode(is);
		}
		else {
			throw new IOException("Tag does not match the mandatory sequence element tag.");
		}
		
		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.CONSTRUCTED, 1)) {
			subCodeLength += length.decode(is);
			criticalExtensions = new CriticalExtensions();
			subCodeLength += criticalExtensions.decode(is, null);
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
		if (rrcTransactionIdentifier != null) {
			sb.append("rrcTransactionIdentifier: ").append(rrcTransactionIdentifier);
		}
		else {
			sb.append("rrcTransactionIdentifier: <empty-required-field>");
		}
		
		sb.append(",\n");
		for (int i = 0; i < indentLevel + 1; i++) {
			sb.append("\t");
		}
		if (criticalExtensions != null) {
			sb.append("criticalExtensions: ");
			criticalExtensions.appendAsString(sb, indentLevel + 1);
		}
		else {
			sb.append("criticalExtensions: <empty-required-field>");
		}
		
		sb.append("\n");
		for (int i = 0; i < indentLevel; i++) {
			sb.append("\t");
		}
		sb.append("}");
	}

}
