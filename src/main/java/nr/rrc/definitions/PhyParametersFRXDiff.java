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


public class PhyParametersFRXDiff implements BerType, Serializable {

	private static final long serialVersionUID = 1L;

	public static final BerTag tag = new BerTag(BerTag.UNIVERSAL_CLASS, BerTag.CONSTRUCTED, 16);

	public byte[] code = null;
	private BerEnum dynamicSFI = null;
	private BerBitString oneFLDMRSTwoAdditionalDMRS = null;
	private BerBitString twoFLDMRS = null;
	private BerBitString twoFLDMRSTwoAdditionalDMRS = null;
	private BerBitString oneFLDMRSThreeAdditionalDMRS = null;
	private BerEnum supportedDMRSTypeDL = null;
	private BerEnum supportedDMRSTypeUL = null;
	private BerEnum semiOpenLoopCSI = null;
	private BerEnum csiReportWithoutPMI = null;
	private BerEnum csiReportWithoutCQI = null;
	private BerBitString onePortsPTRS = null;
	private BerEnum twoPUCCHF02ConsecSymbols = null;
	private BerEnum pucchF2WithFH = null;
	private BerEnum pucchF3WithFH = null;
	private BerEnum pucchF4WithFH = null;
	private BerEnum freqHoppingPUCCHF02 = null;
	private BerEnum freqHoppingPUCCHF134 = null;
	private BerEnum muxSRHARQACKCSIPUCCH = null;
	private BerEnum uciCodeBlockSegmentation = null;
	private BerEnum onePUCCHLongAndShortFormat = null;
	private BerEnum twoPUCCHAnyOthersInSlot = null;
	private BerEnum intraSlotFreqHoppingPUSCH = null;
	private BerEnum puschLBRM = null;
	private BerEnum pdcchBlindDetectionCA = null;
	private BerEnum tpcPUSCHRNTI = null;
	private BerEnum tpcPUCCHRNTI = null;
	private BerEnum tpcSRSRNTI = null;
	private BerEnum absoluteTPCCommand = null;
	private BerEnum twoDifferentTPCLoopPUSCH = null;
	private BerEnum twoDifferentTPCLoopPUCCH = null;
	private BerEnum puschHalfPiBPSK = null;
	private BerEnum pucchF34HalfPiBPSK = null;
	private BerEnum almostContiguousCPOFDMUL = null;
	private BerEnum spCSIRS = null;
	private BerEnum spCSIIM = null;
	private BerEnum tddMultiDLULSwitchPerSlot = null;
	private BerEnum multipleCORESET = null;
	
	public PhyParametersFRXDiff() {
	}

	public PhyParametersFRXDiff(byte[] code) {
		this.code = code;
	}

	public void setDynamicSFI(BerEnum dynamicSFI) {
		this.dynamicSFI = dynamicSFI;
	}

	public BerEnum getDynamicSFI() {
		return dynamicSFI;
	}

	public void setOneFLDMRSTwoAdditionalDMRS(BerBitString oneFLDMRSTwoAdditionalDMRS) {
		this.oneFLDMRSTwoAdditionalDMRS = oneFLDMRSTwoAdditionalDMRS;
	}

	public BerBitString getOneFLDMRSTwoAdditionalDMRS() {
		return oneFLDMRSTwoAdditionalDMRS;
	}

	public void setTwoFLDMRS(BerBitString twoFLDMRS) {
		this.twoFLDMRS = twoFLDMRS;
	}

	public BerBitString getTwoFLDMRS() {
		return twoFLDMRS;
	}

	public void setTwoFLDMRSTwoAdditionalDMRS(BerBitString twoFLDMRSTwoAdditionalDMRS) {
		this.twoFLDMRSTwoAdditionalDMRS = twoFLDMRSTwoAdditionalDMRS;
	}

	public BerBitString getTwoFLDMRSTwoAdditionalDMRS() {
		return twoFLDMRSTwoAdditionalDMRS;
	}

	public void setOneFLDMRSThreeAdditionalDMRS(BerBitString oneFLDMRSThreeAdditionalDMRS) {
		this.oneFLDMRSThreeAdditionalDMRS = oneFLDMRSThreeAdditionalDMRS;
	}

	public BerBitString getOneFLDMRSThreeAdditionalDMRS() {
		return oneFLDMRSThreeAdditionalDMRS;
	}

	public void setSupportedDMRSTypeDL(BerEnum supportedDMRSTypeDL) {
		this.supportedDMRSTypeDL = supportedDMRSTypeDL;
	}

	public BerEnum getSupportedDMRSTypeDL() {
		return supportedDMRSTypeDL;
	}

	public void setSupportedDMRSTypeUL(BerEnum supportedDMRSTypeUL) {
		this.supportedDMRSTypeUL = supportedDMRSTypeUL;
	}

	public BerEnum getSupportedDMRSTypeUL() {
		return supportedDMRSTypeUL;
	}

	public void setSemiOpenLoopCSI(BerEnum semiOpenLoopCSI) {
		this.semiOpenLoopCSI = semiOpenLoopCSI;
	}

	public BerEnum getSemiOpenLoopCSI() {
		return semiOpenLoopCSI;
	}

	public void setCsiReportWithoutPMI(BerEnum csiReportWithoutPMI) {
		this.csiReportWithoutPMI = csiReportWithoutPMI;
	}

	public BerEnum getCsiReportWithoutPMI() {
		return csiReportWithoutPMI;
	}

	public void setCsiReportWithoutCQI(BerEnum csiReportWithoutCQI) {
		this.csiReportWithoutCQI = csiReportWithoutCQI;
	}

	public BerEnum getCsiReportWithoutCQI() {
		return csiReportWithoutCQI;
	}

	public void setOnePortsPTRS(BerBitString onePortsPTRS) {
		this.onePortsPTRS = onePortsPTRS;
	}

	public BerBitString getOnePortsPTRS() {
		return onePortsPTRS;
	}

	public void setTwoPUCCHF02ConsecSymbols(BerEnum twoPUCCHF02ConsecSymbols) {
		this.twoPUCCHF02ConsecSymbols = twoPUCCHF02ConsecSymbols;
	}

	public BerEnum getTwoPUCCHF02ConsecSymbols() {
		return twoPUCCHF02ConsecSymbols;
	}

	public void setPucchF2WithFH(BerEnum pucchF2WithFH) {
		this.pucchF2WithFH = pucchF2WithFH;
	}

	public BerEnum getPucchF2WithFH() {
		return pucchF2WithFH;
	}

	public void setPucchF3WithFH(BerEnum pucchF3WithFH) {
		this.pucchF3WithFH = pucchF3WithFH;
	}

	public BerEnum getPucchF3WithFH() {
		return pucchF3WithFH;
	}

	public void setPucchF4WithFH(BerEnum pucchF4WithFH) {
		this.pucchF4WithFH = pucchF4WithFH;
	}

	public BerEnum getPucchF4WithFH() {
		return pucchF4WithFH;
	}

	public void setFreqHoppingPUCCHF02(BerEnum freqHoppingPUCCHF02) {
		this.freqHoppingPUCCHF02 = freqHoppingPUCCHF02;
	}

	public BerEnum getFreqHoppingPUCCHF02() {
		return freqHoppingPUCCHF02;
	}

	public void setFreqHoppingPUCCHF134(BerEnum freqHoppingPUCCHF134) {
		this.freqHoppingPUCCHF134 = freqHoppingPUCCHF134;
	}

	public BerEnum getFreqHoppingPUCCHF134() {
		return freqHoppingPUCCHF134;
	}

	public void setMuxSRHARQACKCSIPUCCH(BerEnum muxSRHARQACKCSIPUCCH) {
		this.muxSRHARQACKCSIPUCCH = muxSRHARQACKCSIPUCCH;
	}

	public BerEnum getMuxSRHARQACKCSIPUCCH() {
		return muxSRHARQACKCSIPUCCH;
	}

	public void setUciCodeBlockSegmentation(BerEnum uciCodeBlockSegmentation) {
		this.uciCodeBlockSegmentation = uciCodeBlockSegmentation;
	}

	public BerEnum getUciCodeBlockSegmentation() {
		return uciCodeBlockSegmentation;
	}

	public void setOnePUCCHLongAndShortFormat(BerEnum onePUCCHLongAndShortFormat) {
		this.onePUCCHLongAndShortFormat = onePUCCHLongAndShortFormat;
	}

	public BerEnum getOnePUCCHLongAndShortFormat() {
		return onePUCCHLongAndShortFormat;
	}

	public void setTwoPUCCHAnyOthersInSlot(BerEnum twoPUCCHAnyOthersInSlot) {
		this.twoPUCCHAnyOthersInSlot = twoPUCCHAnyOthersInSlot;
	}

	public BerEnum getTwoPUCCHAnyOthersInSlot() {
		return twoPUCCHAnyOthersInSlot;
	}

	public void setIntraSlotFreqHoppingPUSCH(BerEnum intraSlotFreqHoppingPUSCH) {
		this.intraSlotFreqHoppingPUSCH = intraSlotFreqHoppingPUSCH;
	}

	public BerEnum getIntraSlotFreqHoppingPUSCH() {
		return intraSlotFreqHoppingPUSCH;
	}

	public void setPuschLBRM(BerEnum puschLBRM) {
		this.puschLBRM = puschLBRM;
	}

	public BerEnum getPuschLBRM() {
		return puschLBRM;
	}

	public void setPdcchBlindDetectionCA(BerEnum pdcchBlindDetectionCA) {
		this.pdcchBlindDetectionCA = pdcchBlindDetectionCA;
	}

	public BerEnum getPdcchBlindDetectionCA() {
		return pdcchBlindDetectionCA;
	}

	public void setTpcPUSCHRNTI(BerEnum tpcPUSCHRNTI) {
		this.tpcPUSCHRNTI = tpcPUSCHRNTI;
	}

	public BerEnum getTpcPUSCHRNTI() {
		return tpcPUSCHRNTI;
	}

	public void setTpcPUCCHRNTI(BerEnum tpcPUCCHRNTI) {
		this.tpcPUCCHRNTI = tpcPUCCHRNTI;
	}

	public BerEnum getTpcPUCCHRNTI() {
		return tpcPUCCHRNTI;
	}

	public void setTpcSRSRNTI(BerEnum tpcSRSRNTI) {
		this.tpcSRSRNTI = tpcSRSRNTI;
	}

	public BerEnum getTpcSRSRNTI() {
		return tpcSRSRNTI;
	}

	public void setAbsoluteTPCCommand(BerEnum absoluteTPCCommand) {
		this.absoluteTPCCommand = absoluteTPCCommand;
	}

	public BerEnum getAbsoluteTPCCommand() {
		return absoluteTPCCommand;
	}

	public void setTwoDifferentTPCLoopPUSCH(BerEnum twoDifferentTPCLoopPUSCH) {
		this.twoDifferentTPCLoopPUSCH = twoDifferentTPCLoopPUSCH;
	}

	public BerEnum getTwoDifferentTPCLoopPUSCH() {
		return twoDifferentTPCLoopPUSCH;
	}

	public void setTwoDifferentTPCLoopPUCCH(BerEnum twoDifferentTPCLoopPUCCH) {
		this.twoDifferentTPCLoopPUCCH = twoDifferentTPCLoopPUCCH;
	}

	public BerEnum getTwoDifferentTPCLoopPUCCH() {
		return twoDifferentTPCLoopPUCCH;
	}

	public void setPuschHalfPiBPSK(BerEnum puschHalfPiBPSK) {
		this.puschHalfPiBPSK = puschHalfPiBPSK;
	}

	public BerEnum getPuschHalfPiBPSK() {
		return puschHalfPiBPSK;
	}

	public void setPucchF34HalfPiBPSK(BerEnum pucchF34HalfPiBPSK) {
		this.pucchF34HalfPiBPSK = pucchF34HalfPiBPSK;
	}

	public BerEnum getPucchF34HalfPiBPSK() {
		return pucchF34HalfPiBPSK;
	}

	public void setAlmostContiguousCPOFDMUL(BerEnum almostContiguousCPOFDMUL) {
		this.almostContiguousCPOFDMUL = almostContiguousCPOFDMUL;
	}

	public BerEnum getAlmostContiguousCPOFDMUL() {
		return almostContiguousCPOFDMUL;
	}

	public void setSpCSIRS(BerEnum spCSIRS) {
		this.spCSIRS = spCSIRS;
	}

	public BerEnum getSpCSIRS() {
		return spCSIRS;
	}

	public void setSpCSIIM(BerEnum spCSIIM) {
		this.spCSIIM = spCSIIM;
	}

	public BerEnum getSpCSIIM() {
		return spCSIIM;
	}

	public void setTddMultiDLULSwitchPerSlot(BerEnum tddMultiDLULSwitchPerSlot) {
		this.tddMultiDLULSwitchPerSlot = tddMultiDLULSwitchPerSlot;
	}

	public BerEnum getTddMultiDLULSwitchPerSlot() {
		return tddMultiDLULSwitchPerSlot;
	}

	public void setMultipleCORESET(BerEnum multipleCORESET) {
		this.multipleCORESET = multipleCORESET;
	}

	public BerEnum getMultipleCORESET() {
		return multipleCORESET;
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
		if (multipleCORESET != null) {
			codeLength += multipleCORESET.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, PRIMITIVE, 36
			reverseOS.write(0x24);
			reverseOS.write(0x9F);
			codeLength += 2;
		}
		
		if (tddMultiDLULSwitchPerSlot != null) {
			codeLength += tddMultiDLULSwitchPerSlot.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, PRIMITIVE, 35
			reverseOS.write(0x23);
			reverseOS.write(0x9F);
			codeLength += 2;
		}
		
		if (spCSIIM != null) {
			codeLength += spCSIIM.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, PRIMITIVE, 34
			reverseOS.write(0x22);
			reverseOS.write(0x9F);
			codeLength += 2;
		}
		
		if (spCSIRS != null) {
			codeLength += spCSIRS.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, PRIMITIVE, 33
			reverseOS.write(0x21);
			reverseOS.write(0x9F);
			codeLength += 2;
		}
		
		if (almostContiguousCPOFDMUL != null) {
			codeLength += almostContiguousCPOFDMUL.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, PRIMITIVE, 32
			reverseOS.write(0x20);
			reverseOS.write(0x9F);
			codeLength += 2;
		}
		
		if (pucchF34HalfPiBPSK != null) {
			codeLength += pucchF34HalfPiBPSK.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, PRIMITIVE, 31
			reverseOS.write(0x1F);
			reverseOS.write(0x9F);
			codeLength += 2;
		}
		
		if (puschHalfPiBPSK != null) {
			codeLength += puschHalfPiBPSK.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, PRIMITIVE, 30
			reverseOS.write(0x9E);
			codeLength += 1;
		}
		
		if (twoDifferentTPCLoopPUCCH != null) {
			codeLength += twoDifferentTPCLoopPUCCH.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, PRIMITIVE, 29
			reverseOS.write(0x9D);
			codeLength += 1;
		}
		
		if (twoDifferentTPCLoopPUSCH != null) {
			codeLength += twoDifferentTPCLoopPUSCH.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, PRIMITIVE, 28
			reverseOS.write(0x9C);
			codeLength += 1;
		}
		
		if (absoluteTPCCommand != null) {
			codeLength += absoluteTPCCommand.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, PRIMITIVE, 27
			reverseOS.write(0x9B);
			codeLength += 1;
		}
		
		if (tpcSRSRNTI != null) {
			codeLength += tpcSRSRNTI.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, PRIMITIVE, 26
			reverseOS.write(0x9A);
			codeLength += 1;
		}
		
		if (tpcPUCCHRNTI != null) {
			codeLength += tpcPUCCHRNTI.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, PRIMITIVE, 25
			reverseOS.write(0x99);
			codeLength += 1;
		}
		
		if (tpcPUSCHRNTI != null) {
			codeLength += tpcPUSCHRNTI.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, PRIMITIVE, 24
			reverseOS.write(0x98);
			codeLength += 1;
		}
		
		if (pdcchBlindDetectionCA != null) {
			codeLength += pdcchBlindDetectionCA.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, PRIMITIVE, 23
			reverseOS.write(0x97);
			codeLength += 1;
		}
		
		if (puschLBRM != null) {
			codeLength += puschLBRM.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, PRIMITIVE, 22
			reverseOS.write(0x96);
			codeLength += 1;
		}
		
		if (intraSlotFreqHoppingPUSCH != null) {
			codeLength += intraSlotFreqHoppingPUSCH.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, PRIMITIVE, 21
			reverseOS.write(0x95);
			codeLength += 1;
		}
		
		if (twoPUCCHAnyOthersInSlot != null) {
			codeLength += twoPUCCHAnyOthersInSlot.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, PRIMITIVE, 20
			reverseOS.write(0x94);
			codeLength += 1;
		}
		
		if (onePUCCHLongAndShortFormat != null) {
			codeLength += onePUCCHLongAndShortFormat.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, PRIMITIVE, 19
			reverseOS.write(0x93);
			codeLength += 1;
		}
		
		if (uciCodeBlockSegmentation != null) {
			codeLength += uciCodeBlockSegmentation.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, PRIMITIVE, 18
			reverseOS.write(0x92);
			codeLength += 1;
		}
		
		if (muxSRHARQACKCSIPUCCH != null) {
			codeLength += muxSRHARQACKCSIPUCCH.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, PRIMITIVE, 17
			reverseOS.write(0x91);
			codeLength += 1;
		}
		
		if (freqHoppingPUCCHF134 != null) {
			codeLength += freqHoppingPUCCHF134.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, PRIMITIVE, 16
			reverseOS.write(0x90);
			codeLength += 1;
		}
		
		if (freqHoppingPUCCHF02 != null) {
			codeLength += freqHoppingPUCCHF02.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, PRIMITIVE, 15
			reverseOS.write(0x8F);
			codeLength += 1;
		}
		
		if (pucchF4WithFH != null) {
			codeLength += pucchF4WithFH.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, PRIMITIVE, 14
			reverseOS.write(0x8E);
			codeLength += 1;
		}
		
		if (pucchF3WithFH != null) {
			codeLength += pucchF3WithFH.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, PRIMITIVE, 13
			reverseOS.write(0x8D);
			codeLength += 1;
		}
		
		if (pucchF2WithFH != null) {
			codeLength += pucchF2WithFH.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, PRIMITIVE, 12
			reverseOS.write(0x8C);
			codeLength += 1;
		}
		
		if (twoPUCCHF02ConsecSymbols != null) {
			codeLength += twoPUCCHF02ConsecSymbols.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, PRIMITIVE, 11
			reverseOS.write(0x8B);
			codeLength += 1;
		}
		
		if (onePortsPTRS != null) {
			codeLength += onePortsPTRS.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, PRIMITIVE, 10
			reverseOS.write(0x8A);
			codeLength += 1;
		}
		
		if (csiReportWithoutCQI != null) {
			codeLength += csiReportWithoutCQI.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, PRIMITIVE, 9
			reverseOS.write(0x89);
			codeLength += 1;
		}
		
		if (csiReportWithoutPMI != null) {
			codeLength += csiReportWithoutPMI.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, PRIMITIVE, 8
			reverseOS.write(0x88);
			codeLength += 1;
		}
		
		if (semiOpenLoopCSI != null) {
			codeLength += semiOpenLoopCSI.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, PRIMITIVE, 7
			reverseOS.write(0x87);
			codeLength += 1;
		}
		
		if (supportedDMRSTypeUL != null) {
			codeLength += supportedDMRSTypeUL.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, PRIMITIVE, 6
			reverseOS.write(0x86);
			codeLength += 1;
		}
		
		if (supportedDMRSTypeDL != null) {
			codeLength += supportedDMRSTypeDL.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, PRIMITIVE, 5
			reverseOS.write(0x85);
			codeLength += 1;
		}
		
		if (oneFLDMRSThreeAdditionalDMRS != null) {
			codeLength += oneFLDMRSThreeAdditionalDMRS.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, PRIMITIVE, 4
			reverseOS.write(0x84);
			codeLength += 1;
		}
		
		if (twoFLDMRSTwoAdditionalDMRS != null) {
			codeLength += twoFLDMRSTwoAdditionalDMRS.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, PRIMITIVE, 3
			reverseOS.write(0x83);
			codeLength += 1;
		}
		
		if (twoFLDMRS != null) {
			codeLength += twoFLDMRS.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, PRIMITIVE, 2
			reverseOS.write(0x82);
			codeLength += 1;
		}
		
		if (oneFLDMRSTwoAdditionalDMRS != null) {
			codeLength += oneFLDMRSTwoAdditionalDMRS.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, PRIMITIVE, 1
			reverseOS.write(0x81);
			codeLength += 1;
		}
		
		if (dynamicSFI != null) {
			codeLength += dynamicSFI.encode(reverseOS, false);
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
			dynamicSFI = new BerEnum();
			subCodeLength += dynamicSFI.decode(is, false);
			if (subCodeLength == totalLength) {
				return codeLength;
			}
			subCodeLength += berTag.decode(is);
		}
		
		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 1)) {
			oneFLDMRSTwoAdditionalDMRS = new BerBitString();
			subCodeLength += oneFLDMRSTwoAdditionalDMRS.decode(is, false);
			if (subCodeLength == totalLength) {
				return codeLength;
			}
			subCodeLength += berTag.decode(is);
		}
		
		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 2)) {
			twoFLDMRS = new BerBitString();
			subCodeLength += twoFLDMRS.decode(is, false);
			if (subCodeLength == totalLength) {
				return codeLength;
			}
			subCodeLength += berTag.decode(is);
		}
		
		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 3)) {
			twoFLDMRSTwoAdditionalDMRS = new BerBitString();
			subCodeLength += twoFLDMRSTwoAdditionalDMRS.decode(is, false);
			if (subCodeLength == totalLength) {
				return codeLength;
			}
			subCodeLength += berTag.decode(is);
		}
		
		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 4)) {
			oneFLDMRSThreeAdditionalDMRS = new BerBitString();
			subCodeLength += oneFLDMRSThreeAdditionalDMRS.decode(is, false);
			if (subCodeLength == totalLength) {
				return codeLength;
			}
			subCodeLength += berTag.decode(is);
		}
		
		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 5)) {
			supportedDMRSTypeDL = new BerEnum();
			subCodeLength += supportedDMRSTypeDL.decode(is, false);
			if (subCodeLength == totalLength) {
				return codeLength;
			}
			subCodeLength += berTag.decode(is);
		}
		
		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 6)) {
			supportedDMRSTypeUL = new BerEnum();
			subCodeLength += supportedDMRSTypeUL.decode(is, false);
			if (subCodeLength == totalLength) {
				return codeLength;
			}
			subCodeLength += berTag.decode(is);
		}
		
		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 7)) {
			semiOpenLoopCSI = new BerEnum();
			subCodeLength += semiOpenLoopCSI.decode(is, false);
			if (subCodeLength == totalLength) {
				return codeLength;
			}
			subCodeLength += berTag.decode(is);
		}
		
		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 8)) {
			csiReportWithoutPMI = new BerEnum();
			subCodeLength += csiReportWithoutPMI.decode(is, false);
			if (subCodeLength == totalLength) {
				return codeLength;
			}
			subCodeLength += berTag.decode(is);
		}
		
		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 9)) {
			csiReportWithoutCQI = new BerEnum();
			subCodeLength += csiReportWithoutCQI.decode(is, false);
			if (subCodeLength == totalLength) {
				return codeLength;
			}
			subCodeLength += berTag.decode(is);
		}
		
		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 10)) {
			onePortsPTRS = new BerBitString();
			subCodeLength += onePortsPTRS.decode(is, false);
			if (subCodeLength == totalLength) {
				return codeLength;
			}
			subCodeLength += berTag.decode(is);
		}
		
		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 11)) {
			twoPUCCHF02ConsecSymbols = new BerEnum();
			subCodeLength += twoPUCCHF02ConsecSymbols.decode(is, false);
			if (subCodeLength == totalLength) {
				return codeLength;
			}
			subCodeLength += berTag.decode(is);
		}
		
		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 12)) {
			pucchF2WithFH = new BerEnum();
			subCodeLength += pucchF2WithFH.decode(is, false);
			if (subCodeLength == totalLength) {
				return codeLength;
			}
			subCodeLength += berTag.decode(is);
		}
		
		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 13)) {
			pucchF3WithFH = new BerEnum();
			subCodeLength += pucchF3WithFH.decode(is, false);
			if (subCodeLength == totalLength) {
				return codeLength;
			}
			subCodeLength += berTag.decode(is);
		}
		
		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 14)) {
			pucchF4WithFH = new BerEnum();
			subCodeLength += pucchF4WithFH.decode(is, false);
			if (subCodeLength == totalLength) {
				return codeLength;
			}
			subCodeLength += berTag.decode(is);
		}
		
		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 15)) {
			freqHoppingPUCCHF02 = new BerEnum();
			subCodeLength += freqHoppingPUCCHF02.decode(is, false);
			if (subCodeLength == totalLength) {
				return codeLength;
			}
			subCodeLength += berTag.decode(is);
		}
		
		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 16)) {
			freqHoppingPUCCHF134 = new BerEnum();
			subCodeLength += freqHoppingPUCCHF134.decode(is, false);
			if (subCodeLength == totalLength) {
				return codeLength;
			}
			subCodeLength += berTag.decode(is);
		}
		
		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 17)) {
			muxSRHARQACKCSIPUCCH = new BerEnum();
			subCodeLength += muxSRHARQACKCSIPUCCH.decode(is, false);
			if (subCodeLength == totalLength) {
				return codeLength;
			}
			subCodeLength += berTag.decode(is);
		}
		
		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 18)) {
			uciCodeBlockSegmentation = new BerEnum();
			subCodeLength += uciCodeBlockSegmentation.decode(is, false);
			if (subCodeLength == totalLength) {
				return codeLength;
			}
			subCodeLength += berTag.decode(is);
		}
		
		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 19)) {
			onePUCCHLongAndShortFormat = new BerEnum();
			subCodeLength += onePUCCHLongAndShortFormat.decode(is, false);
			if (subCodeLength == totalLength) {
				return codeLength;
			}
			subCodeLength += berTag.decode(is);
		}
		
		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 20)) {
			twoPUCCHAnyOthersInSlot = new BerEnum();
			subCodeLength += twoPUCCHAnyOthersInSlot.decode(is, false);
			if (subCodeLength == totalLength) {
				return codeLength;
			}
			subCodeLength += berTag.decode(is);
		}
		
		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 21)) {
			intraSlotFreqHoppingPUSCH = new BerEnum();
			subCodeLength += intraSlotFreqHoppingPUSCH.decode(is, false);
			if (subCodeLength == totalLength) {
				return codeLength;
			}
			subCodeLength += berTag.decode(is);
		}
		
		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 22)) {
			puschLBRM = new BerEnum();
			subCodeLength += puschLBRM.decode(is, false);
			if (subCodeLength == totalLength) {
				return codeLength;
			}
			subCodeLength += berTag.decode(is);
		}
		
		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 23)) {
			pdcchBlindDetectionCA = new BerEnum();
			subCodeLength += pdcchBlindDetectionCA.decode(is, false);
			if (subCodeLength == totalLength) {
				return codeLength;
			}
			subCodeLength += berTag.decode(is);
		}
		
		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 24)) {
			tpcPUSCHRNTI = new BerEnum();
			subCodeLength += tpcPUSCHRNTI.decode(is, false);
			if (subCodeLength == totalLength) {
				return codeLength;
			}
			subCodeLength += berTag.decode(is);
		}
		
		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 25)) {
			tpcPUCCHRNTI = new BerEnum();
			subCodeLength += tpcPUCCHRNTI.decode(is, false);
			if (subCodeLength == totalLength) {
				return codeLength;
			}
			subCodeLength += berTag.decode(is);
		}
		
		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 26)) {
			tpcSRSRNTI = new BerEnum();
			subCodeLength += tpcSRSRNTI.decode(is, false);
			if (subCodeLength == totalLength) {
				return codeLength;
			}
			subCodeLength += berTag.decode(is);
		}
		
		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 27)) {
			absoluteTPCCommand = new BerEnum();
			subCodeLength += absoluteTPCCommand.decode(is, false);
			if (subCodeLength == totalLength) {
				return codeLength;
			}
			subCodeLength += berTag.decode(is);
		}
		
		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 28)) {
			twoDifferentTPCLoopPUSCH = new BerEnum();
			subCodeLength += twoDifferentTPCLoopPUSCH.decode(is, false);
			if (subCodeLength == totalLength) {
				return codeLength;
			}
			subCodeLength += berTag.decode(is);
		}
		
		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 29)) {
			twoDifferentTPCLoopPUCCH = new BerEnum();
			subCodeLength += twoDifferentTPCLoopPUCCH.decode(is, false);
			if (subCodeLength == totalLength) {
				return codeLength;
			}
			subCodeLength += berTag.decode(is);
		}
		
		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 30)) {
			puschHalfPiBPSK = new BerEnum();
			subCodeLength += puschHalfPiBPSK.decode(is, false);
			if (subCodeLength == totalLength) {
				return codeLength;
			}
			subCodeLength += berTag.decode(is);
		}
		
		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 31)) {
			pucchF34HalfPiBPSK = new BerEnum();
			subCodeLength += pucchF34HalfPiBPSK.decode(is, false);
			if (subCodeLength == totalLength) {
				return codeLength;
			}
			subCodeLength += berTag.decode(is);
		}
		
		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 32)) {
			almostContiguousCPOFDMUL = new BerEnum();
			subCodeLength += almostContiguousCPOFDMUL.decode(is, false);
			if (subCodeLength == totalLength) {
				return codeLength;
			}
			subCodeLength += berTag.decode(is);
		}
		
		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 33)) {
			spCSIRS = new BerEnum();
			subCodeLength += spCSIRS.decode(is, false);
			if (subCodeLength == totalLength) {
				return codeLength;
			}
			subCodeLength += berTag.decode(is);
		}
		
		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 34)) {
			spCSIIM = new BerEnum();
			subCodeLength += spCSIIM.decode(is, false);
			if (subCodeLength == totalLength) {
				return codeLength;
			}
			subCodeLength += berTag.decode(is);
		}
		
		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 35)) {
			tddMultiDLULSwitchPerSlot = new BerEnum();
			subCodeLength += tddMultiDLULSwitchPerSlot.decode(is, false);
			if (subCodeLength == totalLength) {
				return codeLength;
			}
			subCodeLength += berTag.decode(is);
		}
		
		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 36)) {
			multipleCORESET = new BerEnum();
			subCodeLength += multipleCORESET.decode(is, false);
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
		if (dynamicSFI != null) {
			sb.append("\n");
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("dynamicSFI: ").append(dynamicSFI);
			firstSelectedElement = false;
		}
		
		if (oneFLDMRSTwoAdditionalDMRS != null) {
			if (!firstSelectedElement) {
				sb.append(",\n");
			}
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("oneFLDMRSTwoAdditionalDMRS: ").append(oneFLDMRSTwoAdditionalDMRS);
			firstSelectedElement = false;
		}
		
		if (twoFLDMRS != null) {
			if (!firstSelectedElement) {
				sb.append(",\n");
			}
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("twoFLDMRS: ").append(twoFLDMRS);
			firstSelectedElement = false;
		}
		
		if (twoFLDMRSTwoAdditionalDMRS != null) {
			if (!firstSelectedElement) {
				sb.append(",\n");
			}
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("twoFLDMRSTwoAdditionalDMRS: ").append(twoFLDMRSTwoAdditionalDMRS);
			firstSelectedElement = false;
		}
		
		if (oneFLDMRSThreeAdditionalDMRS != null) {
			if (!firstSelectedElement) {
				sb.append(",\n");
			}
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("oneFLDMRSThreeAdditionalDMRS: ").append(oneFLDMRSThreeAdditionalDMRS);
			firstSelectedElement = false;
		}
		
		if (supportedDMRSTypeDL != null) {
			if (!firstSelectedElement) {
				sb.append(",\n");
			}
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("supportedDMRSTypeDL: ").append(supportedDMRSTypeDL);
			firstSelectedElement = false;
		}
		
		if (supportedDMRSTypeUL != null) {
			if (!firstSelectedElement) {
				sb.append(",\n");
			}
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("supportedDMRSTypeUL: ").append(supportedDMRSTypeUL);
			firstSelectedElement = false;
		}
		
		if (semiOpenLoopCSI != null) {
			if (!firstSelectedElement) {
				sb.append(",\n");
			}
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("semiOpenLoopCSI: ").append(semiOpenLoopCSI);
			firstSelectedElement = false;
		}
		
		if (csiReportWithoutPMI != null) {
			if (!firstSelectedElement) {
				sb.append(",\n");
			}
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("csiReportWithoutPMI: ").append(csiReportWithoutPMI);
			firstSelectedElement = false;
		}
		
		if (csiReportWithoutCQI != null) {
			if (!firstSelectedElement) {
				sb.append(",\n");
			}
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("csiReportWithoutCQI: ").append(csiReportWithoutCQI);
			firstSelectedElement = false;
		}
		
		if (onePortsPTRS != null) {
			if (!firstSelectedElement) {
				sb.append(",\n");
			}
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("onePortsPTRS: ").append(onePortsPTRS);
			firstSelectedElement = false;
		}
		
		if (twoPUCCHF02ConsecSymbols != null) {
			if (!firstSelectedElement) {
				sb.append(",\n");
			}
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("twoPUCCHF02ConsecSymbols: ").append(twoPUCCHF02ConsecSymbols);
			firstSelectedElement = false;
		}
		
		if (pucchF2WithFH != null) {
			if (!firstSelectedElement) {
				sb.append(",\n");
			}
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("pucchF2WithFH: ").append(pucchF2WithFH);
			firstSelectedElement = false;
		}
		
		if (pucchF3WithFH != null) {
			if (!firstSelectedElement) {
				sb.append(",\n");
			}
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("pucchF3WithFH: ").append(pucchF3WithFH);
			firstSelectedElement = false;
		}
		
		if (pucchF4WithFH != null) {
			if (!firstSelectedElement) {
				sb.append(",\n");
			}
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("pucchF4WithFH: ").append(pucchF4WithFH);
			firstSelectedElement = false;
		}
		
		if (freqHoppingPUCCHF02 != null) {
			if (!firstSelectedElement) {
				sb.append(",\n");
			}
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("freqHoppingPUCCHF02: ").append(freqHoppingPUCCHF02);
			firstSelectedElement = false;
		}
		
		if (freqHoppingPUCCHF134 != null) {
			if (!firstSelectedElement) {
				sb.append(",\n");
			}
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("freqHoppingPUCCHF134: ").append(freqHoppingPUCCHF134);
			firstSelectedElement = false;
		}
		
		if (muxSRHARQACKCSIPUCCH != null) {
			if (!firstSelectedElement) {
				sb.append(",\n");
			}
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("muxSRHARQACKCSIPUCCH: ").append(muxSRHARQACKCSIPUCCH);
			firstSelectedElement = false;
		}
		
		if (uciCodeBlockSegmentation != null) {
			if (!firstSelectedElement) {
				sb.append(",\n");
			}
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("uciCodeBlockSegmentation: ").append(uciCodeBlockSegmentation);
			firstSelectedElement = false;
		}
		
		if (onePUCCHLongAndShortFormat != null) {
			if (!firstSelectedElement) {
				sb.append(",\n");
			}
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("onePUCCHLongAndShortFormat: ").append(onePUCCHLongAndShortFormat);
			firstSelectedElement = false;
		}
		
		if (twoPUCCHAnyOthersInSlot != null) {
			if (!firstSelectedElement) {
				sb.append(",\n");
			}
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("twoPUCCHAnyOthersInSlot: ").append(twoPUCCHAnyOthersInSlot);
			firstSelectedElement = false;
		}
		
		if (intraSlotFreqHoppingPUSCH != null) {
			if (!firstSelectedElement) {
				sb.append(",\n");
			}
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("intraSlotFreqHoppingPUSCH: ").append(intraSlotFreqHoppingPUSCH);
			firstSelectedElement = false;
		}
		
		if (puschLBRM != null) {
			if (!firstSelectedElement) {
				sb.append(",\n");
			}
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("puschLBRM: ").append(puschLBRM);
			firstSelectedElement = false;
		}
		
		if (pdcchBlindDetectionCA != null) {
			if (!firstSelectedElement) {
				sb.append(",\n");
			}
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("pdcchBlindDetectionCA: ").append(pdcchBlindDetectionCA);
			firstSelectedElement = false;
		}
		
		if (tpcPUSCHRNTI != null) {
			if (!firstSelectedElement) {
				sb.append(",\n");
			}
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("tpcPUSCHRNTI: ").append(tpcPUSCHRNTI);
			firstSelectedElement = false;
		}
		
		if (tpcPUCCHRNTI != null) {
			if (!firstSelectedElement) {
				sb.append(",\n");
			}
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("tpcPUCCHRNTI: ").append(tpcPUCCHRNTI);
			firstSelectedElement = false;
		}
		
		if (tpcSRSRNTI != null) {
			if (!firstSelectedElement) {
				sb.append(",\n");
			}
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("tpcSRSRNTI: ").append(tpcSRSRNTI);
			firstSelectedElement = false;
		}
		
		if (absoluteTPCCommand != null) {
			if (!firstSelectedElement) {
				sb.append(",\n");
			}
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("absoluteTPCCommand: ").append(absoluteTPCCommand);
			firstSelectedElement = false;
		}
		
		if (twoDifferentTPCLoopPUSCH != null) {
			if (!firstSelectedElement) {
				sb.append(",\n");
			}
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("twoDifferentTPCLoopPUSCH: ").append(twoDifferentTPCLoopPUSCH);
			firstSelectedElement = false;
		}
		
		if (twoDifferentTPCLoopPUCCH != null) {
			if (!firstSelectedElement) {
				sb.append(",\n");
			}
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("twoDifferentTPCLoopPUCCH: ").append(twoDifferentTPCLoopPUCCH);
			firstSelectedElement = false;
		}
		
		if (puschHalfPiBPSK != null) {
			if (!firstSelectedElement) {
				sb.append(",\n");
			}
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("puschHalfPiBPSK: ").append(puschHalfPiBPSK);
			firstSelectedElement = false;
		}
		
		if (pucchF34HalfPiBPSK != null) {
			if (!firstSelectedElement) {
				sb.append(",\n");
			}
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("pucchF34HalfPiBPSK: ").append(pucchF34HalfPiBPSK);
			firstSelectedElement = false;
		}
		
		if (almostContiguousCPOFDMUL != null) {
			if (!firstSelectedElement) {
				sb.append(",\n");
			}
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("almostContiguousCPOFDMUL: ").append(almostContiguousCPOFDMUL);
			firstSelectedElement = false;
		}
		
		if (spCSIRS != null) {
			if (!firstSelectedElement) {
				sb.append(",\n");
			}
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("spCSIRS: ").append(spCSIRS);
			firstSelectedElement = false;
		}
		
		if (spCSIIM != null) {
			if (!firstSelectedElement) {
				sb.append(",\n");
			}
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("spCSIIM: ").append(spCSIIM);
			firstSelectedElement = false;
		}
		
		if (tddMultiDLULSwitchPerSlot != null) {
			if (!firstSelectedElement) {
				sb.append(",\n");
			}
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("tddMultiDLULSwitchPerSlot: ").append(tddMultiDLULSwitchPerSlot);
			firstSelectedElement = false;
		}
		
		if (multipleCORESET != null) {
			if (!firstSelectedElement) {
				sb.append(",\n");
			}
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("multipleCORESET: ").append(multipleCORESET);
			firstSelectedElement = false;
		}
		
		sb.append("\n");
		for (int i = 0; i < indentLevel; i++) {
			sb.append("\t");
		}
		sb.append("}");
	}

}
