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


public class ServingCellConfigCommon implements BerType, Serializable {

	private static final long serialVersionUID = 1L;

	public static class SsbPositionsInBurst implements BerType, Serializable {

		private static final long serialVersionUID = 1L;

		public byte[] code = null;
		private BerBitString shortBitmap = null;
		private BerBitString mediumBitmap = null;
		private BerBitString longBitmap = null;
		
		public SsbPositionsInBurst() {
		}

		public SsbPositionsInBurst(byte[] code) {
			this.code = code;
		}

		public void setShortBitmap(BerBitString shortBitmap) {
			this.shortBitmap = shortBitmap;
		}

		public BerBitString getShortBitmap() {
			return shortBitmap;
		}

		public void setMediumBitmap(BerBitString mediumBitmap) {
			this.mediumBitmap = mediumBitmap;
		}

		public BerBitString getMediumBitmap() {
			return mediumBitmap;
		}

		public void setLongBitmap(BerBitString longBitmap) {
			this.longBitmap = longBitmap;
		}

		public BerBitString getLongBitmap() {
			return longBitmap;
		}

		public int encode(OutputStream reverseOS) throws IOException {

			if (code != null) {
				for (int i = code.length - 1; i >= 0; i--) {
					reverseOS.write(code[i]);
				}
				return code.length;
			}

			int codeLength = 0;
			if (longBitmap != null) {
				codeLength += longBitmap.encode(reverseOS, false);
				// write tag: CONTEXT_CLASS, PRIMITIVE, 2
				reverseOS.write(0x82);
				codeLength += 1;
				return codeLength;
			}
			
			if (mediumBitmap != null) {
				codeLength += mediumBitmap.encode(reverseOS, false);
				// write tag: CONTEXT_CLASS, PRIMITIVE, 1
				reverseOS.write(0x81);
				codeLength += 1;
				return codeLength;
			}
			
			if (shortBitmap != null) {
				codeLength += shortBitmap.encode(reverseOS, false);
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
				shortBitmap = new BerBitString();
				codeLength += shortBitmap.decode(is, false);
				return codeLength;
			}

			if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 1)) {
				mediumBitmap = new BerBitString();
				codeLength += mediumBitmap.decode(is, false);
				return codeLength;
			}

			if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 2)) {
				longBitmap = new BerBitString();
				codeLength += longBitmap.decode(is, false);
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

			if (shortBitmap != null) {
				sb.append("shortBitmap: ").append(shortBitmap);
				return;
			}

			if (mediumBitmap != null) {
				sb.append("mediumBitmap: ").append(mediumBitmap);
				return;
			}

			if (longBitmap != null) {
				sb.append("longBitmap: ").append(longBitmap);
				return;
			}

			sb.append("<none>");
		}

	}

	public static class RateMatchPatternToAddModList implements BerType, Serializable {

		private static final long serialVersionUID = 1L;

		public static final BerTag tag = new BerTag(BerTag.UNIVERSAL_CLASS, BerTag.CONSTRUCTED, 16);
		public byte[] code = null;
		private List<RateMatchPattern> seqOf = null;

		public RateMatchPatternToAddModList() {
			seqOf = new ArrayList<RateMatchPattern>();
		}

		public RateMatchPatternToAddModList(byte[] code) {
			this.code = code;
		}

		public List<RateMatchPattern> getRateMatchPattern() {
			if (seqOf == null) {
				seqOf = new ArrayList<RateMatchPattern>();
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
				RateMatchPattern element = new RateMatchPattern();
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
				Iterator<RateMatchPattern> it = seqOf.iterator();
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

	public static class RateMatchPatternToReleaseList implements BerType, Serializable {

		private static final long serialVersionUID = 1L;

		public static final BerTag tag = new BerTag(BerTag.UNIVERSAL_CLASS, BerTag.CONSTRUCTED, 16);
		public byte[] code = null;
		private List<RateMatchPatternId> seqOf = null;

		public RateMatchPatternToReleaseList() {
			seqOf = new ArrayList<RateMatchPatternId>();
		}

		public RateMatchPatternToReleaseList(byte[] code) {
			this.code = code;
		}

		public List<RateMatchPatternId> getRateMatchPatternId() {
			if (seqOf == null) {
				seqOf = new ArrayList<RateMatchPatternId>();
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
				RateMatchPatternId element = new RateMatchPatternId();
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
				Iterator<RateMatchPatternId> it = seqOf.iterator();
				if (it.hasNext()) {
					sb.append(it.next());
					while (it.hasNext()) {
						sb.append(",\n");
						for (int i = 0; i < indentLevel + 1; i++) {
							sb.append("\t");
						}
						sb.append(it.next());
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
	private PhysCellId physCellId = null;
	private DownlinkConfigCommon downlinkConfigCommon = null;
	private UplinkConfigCommon uplinkConfigCommon = null;
	private UplinkConfigCommon supplementaryUplinkConfig = null;
	private BerEnum nTimingAdvanceOffset = null;
	private SsbPositionsInBurst ssbPositionsInBurst = null;
	private BerEnum ssbPeriodicityServingCell = null;
	private BerEnum dmrsTypeAPosition = null;
	private SetupRelease lteCRSToMatchAround = null;
	private RateMatchPatternToAddModList rateMatchPatternToAddModList = null;
	private RateMatchPatternToReleaseList rateMatchPatternToReleaseList = null;
	private SubcarrierSpacing subcarrierSpacing = null;
	private TDDULDLConfigCommon tddULDLConfigurationCommon = null;
	private BerInteger ssPBCHBlockPower = null;
	
	public ServingCellConfigCommon() {
	}

	public ServingCellConfigCommon(byte[] code) {
		this.code = code;
	}

	public void setPhysCellId(PhysCellId physCellId) {
		this.physCellId = physCellId;
	}

	public PhysCellId getPhysCellId() {
		return physCellId;
	}

	public void setDownlinkConfigCommon(DownlinkConfigCommon downlinkConfigCommon) {
		this.downlinkConfigCommon = downlinkConfigCommon;
	}

	public DownlinkConfigCommon getDownlinkConfigCommon() {
		return downlinkConfigCommon;
	}

	public void setUplinkConfigCommon(UplinkConfigCommon uplinkConfigCommon) {
		this.uplinkConfigCommon = uplinkConfigCommon;
	}

	public UplinkConfigCommon getUplinkConfigCommon() {
		return uplinkConfigCommon;
	}

	public void setSupplementaryUplinkConfig(UplinkConfigCommon supplementaryUplinkConfig) {
		this.supplementaryUplinkConfig = supplementaryUplinkConfig;
	}

	public UplinkConfigCommon getSupplementaryUplinkConfig() {
		return supplementaryUplinkConfig;
	}

	public void setNTimingAdvanceOffset(BerEnum nTimingAdvanceOffset) {
		this.nTimingAdvanceOffset = nTimingAdvanceOffset;
	}

	public BerEnum getNTimingAdvanceOffset() {
		return nTimingAdvanceOffset;
	}

	public void setSsbPositionsInBurst(SsbPositionsInBurst ssbPositionsInBurst) {
		this.ssbPositionsInBurst = ssbPositionsInBurst;
	}

	public SsbPositionsInBurst getSsbPositionsInBurst() {
		return ssbPositionsInBurst;
	}

	public void setSsbPeriodicityServingCell(BerEnum ssbPeriodicityServingCell) {
		this.ssbPeriodicityServingCell = ssbPeriodicityServingCell;
	}

	public BerEnum getSsbPeriodicityServingCell() {
		return ssbPeriodicityServingCell;
	}

	public void setDmrsTypeAPosition(BerEnum dmrsTypeAPosition) {
		this.dmrsTypeAPosition = dmrsTypeAPosition;
	}

	public BerEnum getDmrsTypeAPosition() {
		return dmrsTypeAPosition;
	}

	public void setLteCRSToMatchAround(SetupRelease lteCRSToMatchAround) {
		this.lteCRSToMatchAround = lteCRSToMatchAround;
	}

	public SetupRelease getLteCRSToMatchAround() {
		return lteCRSToMatchAround;
	}

	public void setRateMatchPatternToAddModList(RateMatchPatternToAddModList rateMatchPatternToAddModList) {
		this.rateMatchPatternToAddModList = rateMatchPatternToAddModList;
	}

	public RateMatchPatternToAddModList getRateMatchPatternToAddModList() {
		return rateMatchPatternToAddModList;
	}

	public void setRateMatchPatternToReleaseList(RateMatchPatternToReleaseList rateMatchPatternToReleaseList) {
		this.rateMatchPatternToReleaseList = rateMatchPatternToReleaseList;
	}

	public RateMatchPatternToReleaseList getRateMatchPatternToReleaseList() {
		return rateMatchPatternToReleaseList;
	}

	public void setSubcarrierSpacing(SubcarrierSpacing subcarrierSpacing) {
		this.subcarrierSpacing = subcarrierSpacing;
	}

	public SubcarrierSpacing getSubcarrierSpacing() {
		return subcarrierSpacing;
	}

	public void setTddULDLConfigurationCommon(TDDULDLConfigCommon tddULDLConfigurationCommon) {
		this.tddULDLConfigurationCommon = tddULDLConfigurationCommon;
	}

	public TDDULDLConfigCommon getTddULDLConfigurationCommon() {
		return tddULDLConfigurationCommon;
	}

	public void setSsPBCHBlockPower(BerInteger ssPBCHBlockPower) {
		this.ssPBCHBlockPower = ssPBCHBlockPower;
	}

	public BerInteger getSsPBCHBlockPower() {
		return ssPBCHBlockPower;
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

		codeLength += ssPBCHBlockPower.encode(reverseOS, false);
		// write tag: CONTEXT_CLASS, PRIMITIVE, 13
		reverseOS.write(0x8D);
		codeLength += 1;
		
		if (tddULDLConfigurationCommon != null) {
			codeLength += tddULDLConfigurationCommon.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, CONSTRUCTED, 12
			reverseOS.write(0xAC);
			codeLength += 1;
		}
		
		if (subcarrierSpacing != null) {
			codeLength += subcarrierSpacing.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, PRIMITIVE, 11
			reverseOS.write(0x8B);
			codeLength += 1;
		}
		
		if (rateMatchPatternToReleaseList != null) {
			codeLength += rateMatchPatternToReleaseList.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, CONSTRUCTED, 10
			reverseOS.write(0xAA);
			codeLength += 1;
		}
		
		if (rateMatchPatternToAddModList != null) {
			codeLength += rateMatchPatternToAddModList.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, CONSTRUCTED, 9
			reverseOS.write(0xA9);
			codeLength += 1;
		}
		
		if (lteCRSToMatchAround != null) {
			sublength = lteCRSToMatchAround.encode(reverseOS);
			codeLength += sublength;
			codeLength += BerLength.encodeLength(reverseOS, sublength);
			// write tag: CONTEXT_CLASS, CONSTRUCTED, 8
			reverseOS.write(0xA8);
			codeLength += 1;
		}
		
		codeLength += dmrsTypeAPosition.encode(reverseOS, false);
		// write tag: CONTEXT_CLASS, PRIMITIVE, 7
		reverseOS.write(0x87);
		codeLength += 1;
		
		if (ssbPeriodicityServingCell != null) {
			codeLength += ssbPeriodicityServingCell.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, PRIMITIVE, 6
			reverseOS.write(0x86);
			codeLength += 1;
		}
		
		if (ssbPositionsInBurst != null) {
			sublength = ssbPositionsInBurst.encode(reverseOS);
			codeLength += sublength;
			codeLength += BerLength.encodeLength(reverseOS, sublength);
			// write tag: CONTEXT_CLASS, CONSTRUCTED, 5
			reverseOS.write(0xA5);
			codeLength += 1;
		}
		
		if (nTimingAdvanceOffset != null) {
			codeLength += nTimingAdvanceOffset.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, PRIMITIVE, 4
			reverseOS.write(0x84);
			codeLength += 1;
		}
		
		if (supplementaryUplinkConfig != null) {
			codeLength += supplementaryUplinkConfig.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, CONSTRUCTED, 3
			reverseOS.write(0xA3);
			codeLength += 1;
		}
		
		if (uplinkConfigCommon != null) {
			codeLength += uplinkConfigCommon.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, CONSTRUCTED, 2
			reverseOS.write(0xA2);
			codeLength += 1;
		}
		
		if (downlinkConfigCommon != null) {
			codeLength += downlinkConfigCommon.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, CONSTRUCTED, 1
			reverseOS.write(0xA1);
			codeLength += 1;
		}
		
		if (physCellId != null) {
			codeLength += physCellId.encode(reverseOS, false);
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

		subCodeLength += berTag.decode(is);
		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 0)) {
			physCellId = new PhysCellId();
			subCodeLength += physCellId.decode(is, false);
			subCodeLength += berTag.decode(is);
		}
		
		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.CONSTRUCTED, 1)) {
			downlinkConfigCommon = new DownlinkConfigCommon();
			subCodeLength += downlinkConfigCommon.decode(is, false);
			subCodeLength += berTag.decode(is);
		}
		
		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.CONSTRUCTED, 2)) {
			uplinkConfigCommon = new UplinkConfigCommon();
			subCodeLength += uplinkConfigCommon.decode(is, false);
			subCodeLength += berTag.decode(is);
		}
		
		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.CONSTRUCTED, 3)) {
			supplementaryUplinkConfig = new UplinkConfigCommon();
			subCodeLength += supplementaryUplinkConfig.decode(is, false);
			subCodeLength += berTag.decode(is);
		}
		
		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 4)) {
			nTimingAdvanceOffset = new BerEnum();
			subCodeLength += nTimingAdvanceOffset.decode(is, false);
			subCodeLength += berTag.decode(is);
		}
		
		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.CONSTRUCTED, 5)) {
			subCodeLength += length.decode(is);
			ssbPositionsInBurst = new SsbPositionsInBurst();
			subCodeLength += ssbPositionsInBurst.decode(is, null);
			subCodeLength += berTag.decode(is);
		}
		
		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 6)) {
			ssbPeriodicityServingCell = new BerEnum();
			subCodeLength += ssbPeriodicityServingCell.decode(is, false);
			subCodeLength += berTag.decode(is);
		}
		
		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 7)) {
			dmrsTypeAPosition = new BerEnum();
			subCodeLength += dmrsTypeAPosition.decode(is, false);
			subCodeLength += berTag.decode(is);
		}
		else {
			throw new IOException("Tag does not match the mandatory sequence element tag.");
		}
		
		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.CONSTRUCTED, 8)) {
			subCodeLength += length.decode(is);
			lteCRSToMatchAround = new SetupRelease();
			subCodeLength += lteCRSToMatchAround.decode(is, null);
			subCodeLength += berTag.decode(is);
		}
		
		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.CONSTRUCTED, 9)) {
			rateMatchPatternToAddModList = new RateMatchPatternToAddModList();
			subCodeLength += rateMatchPatternToAddModList.decode(is, false);
			subCodeLength += berTag.decode(is);
		}
		
		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.CONSTRUCTED, 10)) {
			rateMatchPatternToReleaseList = new RateMatchPatternToReleaseList();
			subCodeLength += rateMatchPatternToReleaseList.decode(is, false);
			subCodeLength += berTag.decode(is);
		}
		
		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 11)) {
			subcarrierSpacing = new SubcarrierSpacing();
			subCodeLength += subcarrierSpacing.decode(is, false);
			subCodeLength += berTag.decode(is);
		}
		
		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.CONSTRUCTED, 12)) {
			tddULDLConfigurationCommon = new TDDULDLConfigCommon();
			subCodeLength += tddULDLConfigurationCommon.decode(is, false);
			subCodeLength += berTag.decode(is);
		}
		
		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 13)) {
			ssPBCHBlockPower = new BerInteger();
			subCodeLength += ssPBCHBlockPower.decode(is, false);
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
		if (physCellId != null) {
			sb.append("\n");
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("physCellId: ").append(physCellId);
			firstSelectedElement = false;
		}
		
		if (downlinkConfigCommon != null) {
			if (!firstSelectedElement) {
				sb.append(",\n");
			}
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("downlinkConfigCommon: ");
			downlinkConfigCommon.appendAsString(sb, indentLevel + 1);
			firstSelectedElement = false;
		}
		
		if (uplinkConfigCommon != null) {
			if (!firstSelectedElement) {
				sb.append(",\n");
			}
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("uplinkConfigCommon: ");
			uplinkConfigCommon.appendAsString(sb, indentLevel + 1);
			firstSelectedElement = false;
		}
		
		if (supplementaryUplinkConfig != null) {
			if (!firstSelectedElement) {
				sb.append(",\n");
			}
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("supplementaryUplinkConfig: ");
			supplementaryUplinkConfig.appendAsString(sb, indentLevel + 1);
			firstSelectedElement = false;
		}
		
		if (nTimingAdvanceOffset != null) {
			if (!firstSelectedElement) {
				sb.append(",\n");
			}
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("nTimingAdvanceOffset: ").append(nTimingAdvanceOffset);
			firstSelectedElement = false;
		}
		
		if (ssbPositionsInBurst != null) {
			if (!firstSelectedElement) {
				sb.append(",\n");
			}
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("ssbPositionsInBurst: ");
			ssbPositionsInBurst.appendAsString(sb, indentLevel + 1);
			firstSelectedElement = false;
		}
		
		if (ssbPeriodicityServingCell != null) {
			if (!firstSelectedElement) {
				sb.append(",\n");
			}
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("ssbPeriodicityServingCell: ").append(ssbPeriodicityServingCell);
			firstSelectedElement = false;
		}
		
		if (!firstSelectedElement) {
			sb.append(",\n");
		}
		for (int i = 0; i < indentLevel + 1; i++) {
			sb.append("\t");
		}
		if (dmrsTypeAPosition != null) {
			sb.append("dmrsTypeAPosition: ").append(dmrsTypeAPosition);
		}
		else {
			sb.append("dmrsTypeAPosition: <empty-required-field>");
		}
		
		if (lteCRSToMatchAround != null) {
			sb.append(",\n");
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("lteCRSToMatchAround: ");
			lteCRSToMatchAround.appendAsString(sb, indentLevel + 1);
		}
		
		if (rateMatchPatternToAddModList != null) {
			sb.append(",\n");
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("rateMatchPatternToAddModList: ");
			rateMatchPatternToAddModList.appendAsString(sb, indentLevel + 1);
		}
		
		if (rateMatchPatternToReleaseList != null) {
			sb.append(",\n");
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("rateMatchPatternToReleaseList: ");
			rateMatchPatternToReleaseList.appendAsString(sb, indentLevel + 1);
		}
		
		if (subcarrierSpacing != null) {
			sb.append(",\n");
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("subcarrierSpacing: ").append(subcarrierSpacing);
		}
		
		if (tddULDLConfigurationCommon != null) {
			sb.append(",\n");
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("tddULDLConfigurationCommon: ");
			tddULDLConfigurationCommon.appendAsString(sb, indentLevel + 1);
		}
		
		sb.append(",\n");
		for (int i = 0; i < indentLevel + 1; i++) {
			sb.append("\t");
		}
		if (ssPBCHBlockPower != null) {
			sb.append("ssPBCHBlockPower: ").append(ssPBCHBlockPower);
		}
		else {
			sb.append("ssPBCHBlockPower: <empty-required-field>");
		}
		
		sb.append("\n");
		for (int i = 0; i < indentLevel; i++) {
			sb.append("\t");
		}
		sb.append("}");
	}

}
