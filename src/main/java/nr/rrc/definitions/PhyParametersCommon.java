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


public class PhyParametersCommon implements BerType, Serializable {

	private static final long serialVersionUID = 1L;

	public static final BerTag tag = new BerTag(BerTag.UNIVERSAL_CLASS, BerTag.CONSTRUCTED, 16);

	public byte[] code = null;
	private BerEnum csiRSCFRAForHO = null;
	private BerEnum dynamicPRBBundlingDL = null;
	private BerEnum spCSIReportPUCCH = null;
	private BerEnum spCSIReportPUSCH = null;
	private BerEnum nzpCSIRSIntefMgmt = null;
	private BerEnum type2SPCSIFeedbackLongPUCCH = null;
	private BerEnum precoderGranularityCORESET = null;
	private BerEnum dynamicHARQACKCodebook = null;
	private BerEnum semiStaticHARQACKCodebook = null;
	private BerEnum spatialBundlingHARQACK = null;
	private BerEnum dynamicBetaOffsetIndHARQACKCSI = null;
	private BerEnum pucchRepetitionF134 = null;
	private BerEnum raType0PUSCH = null;
	private BerEnum dynamicSwitchRAType01PDSCH = null;
	private BerEnum dynamicSwitchRAType01PUSCH = null;
	private BerEnum pdschMappingTypeA = null;
	private BerEnum pdschMappingTypeB = null;
	private BerEnum interleavingVRBToPRBPDSCH = null;
	private BerEnum interSlotFreqHoppingPUSCH = null;
	private BerEnum type1PUSCHRepetitionMultiSlots = null;
	private BerEnum type2PUSCHRepetitionMultiSlots = null;
	private BerEnum puschRepetitionMultiSlots = null;
	private BerEnum pdschRepetitionMultiSlots = null;
	private BerEnum downlinkSPS = null;
	private BerEnum configuredULGrantType1 = null;
	private BerEnum configuredULGrantType2 = null;
	private BerEnum preEmptIndicationDL = null;
	private BerEnum cbgTransIndicationDL = null;
	private BerEnum cbgTransIndicationUL = null;
	private BerEnum cbgFlushIndicationDL = null;
	private BerEnum dynamicHARQACKCodeBCBGRetxDL = null;
	private BerEnum rateMatchingResrcSetSemiStatic = null;
	private BerEnum rateMatchingResrcSetDynamic = null;
	private BerEnum bwpSwitchingDelay = null;
	
	public PhyParametersCommon() {
	}

	public PhyParametersCommon(byte[] code) {
		this.code = code;
	}

	public void setCsiRSCFRAForHO(BerEnum csiRSCFRAForHO) {
		this.csiRSCFRAForHO = csiRSCFRAForHO;
	}

	public BerEnum getCsiRSCFRAForHO() {
		return csiRSCFRAForHO;
	}

	public void setDynamicPRBBundlingDL(BerEnum dynamicPRBBundlingDL) {
		this.dynamicPRBBundlingDL = dynamicPRBBundlingDL;
	}

	public BerEnum getDynamicPRBBundlingDL() {
		return dynamicPRBBundlingDL;
	}

	public void setSpCSIReportPUCCH(BerEnum spCSIReportPUCCH) {
		this.spCSIReportPUCCH = spCSIReportPUCCH;
	}

	public BerEnum getSpCSIReportPUCCH() {
		return spCSIReportPUCCH;
	}

	public void setSpCSIReportPUSCH(BerEnum spCSIReportPUSCH) {
		this.spCSIReportPUSCH = spCSIReportPUSCH;
	}

	public BerEnum getSpCSIReportPUSCH() {
		return spCSIReportPUSCH;
	}

	public void setNzpCSIRSIntefMgmt(BerEnum nzpCSIRSIntefMgmt) {
		this.nzpCSIRSIntefMgmt = nzpCSIRSIntefMgmt;
	}

	public BerEnum getNzpCSIRSIntefMgmt() {
		return nzpCSIRSIntefMgmt;
	}

	public void setType2SPCSIFeedbackLongPUCCH(BerEnum type2SPCSIFeedbackLongPUCCH) {
		this.type2SPCSIFeedbackLongPUCCH = type2SPCSIFeedbackLongPUCCH;
	}

	public BerEnum getType2SPCSIFeedbackLongPUCCH() {
		return type2SPCSIFeedbackLongPUCCH;
	}

	public void setPrecoderGranularityCORESET(BerEnum precoderGranularityCORESET) {
		this.precoderGranularityCORESET = precoderGranularityCORESET;
	}

	public BerEnum getPrecoderGranularityCORESET() {
		return precoderGranularityCORESET;
	}

	public void setDynamicHARQACKCodebook(BerEnum dynamicHARQACKCodebook) {
		this.dynamicHARQACKCodebook = dynamicHARQACKCodebook;
	}

	public BerEnum getDynamicHARQACKCodebook() {
		return dynamicHARQACKCodebook;
	}

	public void setSemiStaticHARQACKCodebook(BerEnum semiStaticHARQACKCodebook) {
		this.semiStaticHARQACKCodebook = semiStaticHARQACKCodebook;
	}

	public BerEnum getSemiStaticHARQACKCodebook() {
		return semiStaticHARQACKCodebook;
	}

	public void setSpatialBundlingHARQACK(BerEnum spatialBundlingHARQACK) {
		this.spatialBundlingHARQACK = spatialBundlingHARQACK;
	}

	public BerEnum getSpatialBundlingHARQACK() {
		return spatialBundlingHARQACK;
	}

	public void setDynamicBetaOffsetIndHARQACKCSI(BerEnum dynamicBetaOffsetIndHARQACKCSI) {
		this.dynamicBetaOffsetIndHARQACKCSI = dynamicBetaOffsetIndHARQACKCSI;
	}

	public BerEnum getDynamicBetaOffsetIndHARQACKCSI() {
		return dynamicBetaOffsetIndHARQACKCSI;
	}

	public void setPucchRepetitionF134(BerEnum pucchRepetitionF134) {
		this.pucchRepetitionF134 = pucchRepetitionF134;
	}

	public BerEnum getPucchRepetitionF134() {
		return pucchRepetitionF134;
	}

	public void setRaType0PUSCH(BerEnum raType0PUSCH) {
		this.raType0PUSCH = raType0PUSCH;
	}

	public BerEnum getRaType0PUSCH() {
		return raType0PUSCH;
	}

	public void setDynamicSwitchRAType01PDSCH(BerEnum dynamicSwitchRAType01PDSCH) {
		this.dynamicSwitchRAType01PDSCH = dynamicSwitchRAType01PDSCH;
	}

	public BerEnum getDynamicSwitchRAType01PDSCH() {
		return dynamicSwitchRAType01PDSCH;
	}

	public void setDynamicSwitchRAType01PUSCH(BerEnum dynamicSwitchRAType01PUSCH) {
		this.dynamicSwitchRAType01PUSCH = dynamicSwitchRAType01PUSCH;
	}

	public BerEnum getDynamicSwitchRAType01PUSCH() {
		return dynamicSwitchRAType01PUSCH;
	}

	public void setPdschMappingTypeA(BerEnum pdschMappingTypeA) {
		this.pdschMappingTypeA = pdschMappingTypeA;
	}

	public BerEnum getPdschMappingTypeA() {
		return pdschMappingTypeA;
	}

	public void setPdschMappingTypeB(BerEnum pdschMappingTypeB) {
		this.pdschMappingTypeB = pdschMappingTypeB;
	}

	public BerEnum getPdschMappingTypeB() {
		return pdschMappingTypeB;
	}

	public void setInterleavingVRBToPRBPDSCH(BerEnum interleavingVRBToPRBPDSCH) {
		this.interleavingVRBToPRBPDSCH = interleavingVRBToPRBPDSCH;
	}

	public BerEnum getInterleavingVRBToPRBPDSCH() {
		return interleavingVRBToPRBPDSCH;
	}

	public void setInterSlotFreqHoppingPUSCH(BerEnum interSlotFreqHoppingPUSCH) {
		this.interSlotFreqHoppingPUSCH = interSlotFreqHoppingPUSCH;
	}

	public BerEnum getInterSlotFreqHoppingPUSCH() {
		return interSlotFreqHoppingPUSCH;
	}

	public void setType1PUSCHRepetitionMultiSlots(BerEnum type1PUSCHRepetitionMultiSlots) {
		this.type1PUSCHRepetitionMultiSlots = type1PUSCHRepetitionMultiSlots;
	}

	public BerEnum getType1PUSCHRepetitionMultiSlots() {
		return type1PUSCHRepetitionMultiSlots;
	}

	public void setType2PUSCHRepetitionMultiSlots(BerEnum type2PUSCHRepetitionMultiSlots) {
		this.type2PUSCHRepetitionMultiSlots = type2PUSCHRepetitionMultiSlots;
	}

	public BerEnum getType2PUSCHRepetitionMultiSlots() {
		return type2PUSCHRepetitionMultiSlots;
	}

	public void setPuschRepetitionMultiSlots(BerEnum puschRepetitionMultiSlots) {
		this.puschRepetitionMultiSlots = puschRepetitionMultiSlots;
	}

	public BerEnum getPuschRepetitionMultiSlots() {
		return puschRepetitionMultiSlots;
	}

	public void setPdschRepetitionMultiSlots(BerEnum pdschRepetitionMultiSlots) {
		this.pdschRepetitionMultiSlots = pdschRepetitionMultiSlots;
	}

	public BerEnum getPdschRepetitionMultiSlots() {
		return pdschRepetitionMultiSlots;
	}

	public void setDownlinkSPS(BerEnum downlinkSPS) {
		this.downlinkSPS = downlinkSPS;
	}

	public BerEnum getDownlinkSPS() {
		return downlinkSPS;
	}

	public void setConfiguredULGrantType1(BerEnum configuredULGrantType1) {
		this.configuredULGrantType1 = configuredULGrantType1;
	}

	public BerEnum getConfiguredULGrantType1() {
		return configuredULGrantType1;
	}

	public void setConfiguredULGrantType2(BerEnum configuredULGrantType2) {
		this.configuredULGrantType2 = configuredULGrantType2;
	}

	public BerEnum getConfiguredULGrantType2() {
		return configuredULGrantType2;
	}

	public void setPreEmptIndicationDL(BerEnum preEmptIndicationDL) {
		this.preEmptIndicationDL = preEmptIndicationDL;
	}

	public BerEnum getPreEmptIndicationDL() {
		return preEmptIndicationDL;
	}

	public void setCbgTransIndicationDL(BerEnum cbgTransIndicationDL) {
		this.cbgTransIndicationDL = cbgTransIndicationDL;
	}

	public BerEnum getCbgTransIndicationDL() {
		return cbgTransIndicationDL;
	}

	public void setCbgTransIndicationUL(BerEnum cbgTransIndicationUL) {
		this.cbgTransIndicationUL = cbgTransIndicationUL;
	}

	public BerEnum getCbgTransIndicationUL() {
		return cbgTransIndicationUL;
	}

	public void setCbgFlushIndicationDL(BerEnum cbgFlushIndicationDL) {
		this.cbgFlushIndicationDL = cbgFlushIndicationDL;
	}

	public BerEnum getCbgFlushIndicationDL() {
		return cbgFlushIndicationDL;
	}

	public void setDynamicHARQACKCodeBCBGRetxDL(BerEnum dynamicHARQACKCodeBCBGRetxDL) {
		this.dynamicHARQACKCodeBCBGRetxDL = dynamicHARQACKCodeBCBGRetxDL;
	}

	public BerEnum getDynamicHARQACKCodeBCBGRetxDL() {
		return dynamicHARQACKCodeBCBGRetxDL;
	}

	public void setRateMatchingResrcSetSemiStatic(BerEnum rateMatchingResrcSetSemiStatic) {
		this.rateMatchingResrcSetSemiStatic = rateMatchingResrcSetSemiStatic;
	}

	public BerEnum getRateMatchingResrcSetSemiStatic() {
		return rateMatchingResrcSetSemiStatic;
	}

	public void setRateMatchingResrcSetDynamic(BerEnum rateMatchingResrcSetDynamic) {
		this.rateMatchingResrcSetDynamic = rateMatchingResrcSetDynamic;
	}

	public BerEnum getRateMatchingResrcSetDynamic() {
		return rateMatchingResrcSetDynamic;
	}

	public void setBwpSwitchingDelay(BerEnum bwpSwitchingDelay) {
		this.bwpSwitchingDelay = bwpSwitchingDelay;
	}

	public BerEnum getBwpSwitchingDelay() {
		return bwpSwitchingDelay;
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
		if (bwpSwitchingDelay != null) {
			codeLength += bwpSwitchingDelay.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, PRIMITIVE, 33
			reverseOS.write(0x21);
			reverseOS.write(0x9F);
			codeLength += 2;
		}
		
		if (rateMatchingResrcSetDynamic != null) {
			codeLength += rateMatchingResrcSetDynamic.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, PRIMITIVE, 32
			reverseOS.write(0x20);
			reverseOS.write(0x9F);
			codeLength += 2;
		}
		
		if (rateMatchingResrcSetSemiStatic != null) {
			codeLength += rateMatchingResrcSetSemiStatic.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, PRIMITIVE, 31
			reverseOS.write(0x1F);
			reverseOS.write(0x9F);
			codeLength += 2;
		}
		
		if (dynamicHARQACKCodeBCBGRetxDL != null) {
			codeLength += dynamicHARQACKCodeBCBGRetxDL.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, PRIMITIVE, 30
			reverseOS.write(0x9E);
			codeLength += 1;
		}
		
		if (cbgFlushIndicationDL != null) {
			codeLength += cbgFlushIndicationDL.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, PRIMITIVE, 29
			reverseOS.write(0x9D);
			codeLength += 1;
		}
		
		if (cbgTransIndicationUL != null) {
			codeLength += cbgTransIndicationUL.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, PRIMITIVE, 28
			reverseOS.write(0x9C);
			codeLength += 1;
		}
		
		if (cbgTransIndicationDL != null) {
			codeLength += cbgTransIndicationDL.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, PRIMITIVE, 27
			reverseOS.write(0x9B);
			codeLength += 1;
		}
		
		if (preEmptIndicationDL != null) {
			codeLength += preEmptIndicationDL.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, PRIMITIVE, 26
			reverseOS.write(0x9A);
			codeLength += 1;
		}
		
		if (configuredULGrantType2 != null) {
			codeLength += configuredULGrantType2.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, PRIMITIVE, 25
			reverseOS.write(0x99);
			codeLength += 1;
		}
		
		if (configuredULGrantType1 != null) {
			codeLength += configuredULGrantType1.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, PRIMITIVE, 24
			reverseOS.write(0x98);
			codeLength += 1;
		}
		
		if (downlinkSPS != null) {
			codeLength += downlinkSPS.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, PRIMITIVE, 23
			reverseOS.write(0x97);
			codeLength += 1;
		}
		
		if (pdschRepetitionMultiSlots != null) {
			codeLength += pdschRepetitionMultiSlots.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, PRIMITIVE, 22
			reverseOS.write(0x96);
			codeLength += 1;
		}
		
		if (puschRepetitionMultiSlots != null) {
			codeLength += puschRepetitionMultiSlots.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, PRIMITIVE, 21
			reverseOS.write(0x95);
			codeLength += 1;
		}
		
		if (type2PUSCHRepetitionMultiSlots != null) {
			codeLength += type2PUSCHRepetitionMultiSlots.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, PRIMITIVE, 20
			reverseOS.write(0x94);
			codeLength += 1;
		}
		
		if (type1PUSCHRepetitionMultiSlots != null) {
			codeLength += type1PUSCHRepetitionMultiSlots.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, PRIMITIVE, 19
			reverseOS.write(0x93);
			codeLength += 1;
		}
		
		if (interSlotFreqHoppingPUSCH != null) {
			codeLength += interSlotFreqHoppingPUSCH.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, PRIMITIVE, 18
			reverseOS.write(0x92);
			codeLength += 1;
		}
		
		if (interleavingVRBToPRBPDSCH != null) {
			codeLength += interleavingVRBToPRBPDSCH.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, PRIMITIVE, 17
			reverseOS.write(0x91);
			codeLength += 1;
		}
		
		if (pdschMappingTypeB != null) {
			codeLength += pdschMappingTypeB.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, PRIMITIVE, 16
			reverseOS.write(0x90);
			codeLength += 1;
		}
		
		if (pdschMappingTypeA != null) {
			codeLength += pdschMappingTypeA.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, PRIMITIVE, 15
			reverseOS.write(0x8F);
			codeLength += 1;
		}
		
		if (dynamicSwitchRAType01PUSCH != null) {
			codeLength += dynamicSwitchRAType01PUSCH.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, PRIMITIVE, 14
			reverseOS.write(0x8E);
			codeLength += 1;
		}
		
		if (dynamicSwitchRAType01PDSCH != null) {
			codeLength += dynamicSwitchRAType01PDSCH.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, PRIMITIVE, 13
			reverseOS.write(0x8D);
			codeLength += 1;
		}
		
		if (raType0PUSCH != null) {
			codeLength += raType0PUSCH.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, PRIMITIVE, 12
			reverseOS.write(0x8C);
			codeLength += 1;
		}
		
		if (pucchRepetitionF134 != null) {
			codeLength += pucchRepetitionF134.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, PRIMITIVE, 11
			reverseOS.write(0x8B);
			codeLength += 1;
		}
		
		if (dynamicBetaOffsetIndHARQACKCSI != null) {
			codeLength += dynamicBetaOffsetIndHARQACKCSI.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, PRIMITIVE, 10
			reverseOS.write(0x8A);
			codeLength += 1;
		}
		
		if (spatialBundlingHARQACK != null) {
			codeLength += spatialBundlingHARQACK.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, PRIMITIVE, 9
			reverseOS.write(0x89);
			codeLength += 1;
		}
		
		if (semiStaticHARQACKCodebook != null) {
			codeLength += semiStaticHARQACKCodebook.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, PRIMITIVE, 8
			reverseOS.write(0x88);
			codeLength += 1;
		}
		
		if (dynamicHARQACKCodebook != null) {
			codeLength += dynamicHARQACKCodebook.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, PRIMITIVE, 7
			reverseOS.write(0x87);
			codeLength += 1;
		}
		
		if (precoderGranularityCORESET != null) {
			codeLength += precoderGranularityCORESET.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, PRIMITIVE, 6
			reverseOS.write(0x86);
			codeLength += 1;
		}
		
		if (type2SPCSIFeedbackLongPUCCH != null) {
			codeLength += type2SPCSIFeedbackLongPUCCH.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, PRIMITIVE, 5
			reverseOS.write(0x85);
			codeLength += 1;
		}
		
		if (nzpCSIRSIntefMgmt != null) {
			codeLength += nzpCSIRSIntefMgmt.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, PRIMITIVE, 4
			reverseOS.write(0x84);
			codeLength += 1;
		}
		
		if (spCSIReportPUSCH != null) {
			codeLength += spCSIReportPUSCH.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, PRIMITIVE, 3
			reverseOS.write(0x83);
			codeLength += 1;
		}
		
		if (spCSIReportPUCCH != null) {
			codeLength += spCSIReportPUCCH.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, PRIMITIVE, 2
			reverseOS.write(0x82);
			codeLength += 1;
		}
		
		if (dynamicPRBBundlingDL != null) {
			codeLength += dynamicPRBBundlingDL.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, PRIMITIVE, 1
			reverseOS.write(0x81);
			codeLength += 1;
		}
		
		if (csiRSCFRAForHO != null) {
			codeLength += csiRSCFRAForHO.encode(reverseOS, false);
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
			csiRSCFRAForHO = new BerEnum();
			subCodeLength += csiRSCFRAForHO.decode(is, false);
			if (subCodeLength == totalLength) {
				return codeLength;
			}
			subCodeLength += berTag.decode(is);
		}
		
		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 1)) {
			dynamicPRBBundlingDL = new BerEnum();
			subCodeLength += dynamicPRBBundlingDL.decode(is, false);
			if (subCodeLength == totalLength) {
				return codeLength;
			}
			subCodeLength += berTag.decode(is);
		}
		
		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 2)) {
			spCSIReportPUCCH = new BerEnum();
			subCodeLength += spCSIReportPUCCH.decode(is, false);
			if (subCodeLength == totalLength) {
				return codeLength;
			}
			subCodeLength += berTag.decode(is);
		}
		
		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 3)) {
			spCSIReportPUSCH = new BerEnum();
			subCodeLength += spCSIReportPUSCH.decode(is, false);
			if (subCodeLength == totalLength) {
				return codeLength;
			}
			subCodeLength += berTag.decode(is);
		}
		
		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 4)) {
			nzpCSIRSIntefMgmt = new BerEnum();
			subCodeLength += nzpCSIRSIntefMgmt.decode(is, false);
			if (subCodeLength == totalLength) {
				return codeLength;
			}
			subCodeLength += berTag.decode(is);
		}
		
		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 5)) {
			type2SPCSIFeedbackLongPUCCH = new BerEnum();
			subCodeLength += type2SPCSIFeedbackLongPUCCH.decode(is, false);
			if (subCodeLength == totalLength) {
				return codeLength;
			}
			subCodeLength += berTag.decode(is);
		}
		
		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 6)) {
			precoderGranularityCORESET = new BerEnum();
			subCodeLength += precoderGranularityCORESET.decode(is, false);
			if (subCodeLength == totalLength) {
				return codeLength;
			}
			subCodeLength += berTag.decode(is);
		}
		
		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 7)) {
			dynamicHARQACKCodebook = new BerEnum();
			subCodeLength += dynamicHARQACKCodebook.decode(is, false);
			if (subCodeLength == totalLength) {
				return codeLength;
			}
			subCodeLength += berTag.decode(is);
		}
		
		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 8)) {
			semiStaticHARQACKCodebook = new BerEnum();
			subCodeLength += semiStaticHARQACKCodebook.decode(is, false);
			if (subCodeLength == totalLength) {
				return codeLength;
			}
			subCodeLength += berTag.decode(is);
		}
		
		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 9)) {
			spatialBundlingHARQACK = new BerEnum();
			subCodeLength += spatialBundlingHARQACK.decode(is, false);
			if (subCodeLength == totalLength) {
				return codeLength;
			}
			subCodeLength += berTag.decode(is);
		}
		
		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 10)) {
			dynamicBetaOffsetIndHARQACKCSI = new BerEnum();
			subCodeLength += dynamicBetaOffsetIndHARQACKCSI.decode(is, false);
			if (subCodeLength == totalLength) {
				return codeLength;
			}
			subCodeLength += berTag.decode(is);
		}
		
		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 11)) {
			pucchRepetitionF134 = new BerEnum();
			subCodeLength += pucchRepetitionF134.decode(is, false);
			if (subCodeLength == totalLength) {
				return codeLength;
			}
			subCodeLength += berTag.decode(is);
		}
		
		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 12)) {
			raType0PUSCH = new BerEnum();
			subCodeLength += raType0PUSCH.decode(is, false);
			if (subCodeLength == totalLength) {
				return codeLength;
			}
			subCodeLength += berTag.decode(is);
		}
		
		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 13)) {
			dynamicSwitchRAType01PDSCH = new BerEnum();
			subCodeLength += dynamicSwitchRAType01PDSCH.decode(is, false);
			if (subCodeLength == totalLength) {
				return codeLength;
			}
			subCodeLength += berTag.decode(is);
		}
		
		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 14)) {
			dynamicSwitchRAType01PUSCH = new BerEnum();
			subCodeLength += dynamicSwitchRAType01PUSCH.decode(is, false);
			if (subCodeLength == totalLength) {
				return codeLength;
			}
			subCodeLength += berTag.decode(is);
		}
		
		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 15)) {
			pdschMappingTypeA = new BerEnum();
			subCodeLength += pdschMappingTypeA.decode(is, false);
			if (subCodeLength == totalLength) {
				return codeLength;
			}
			subCodeLength += berTag.decode(is);
		}
		
		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 16)) {
			pdschMappingTypeB = new BerEnum();
			subCodeLength += pdschMappingTypeB.decode(is, false);
			if (subCodeLength == totalLength) {
				return codeLength;
			}
			subCodeLength += berTag.decode(is);
		}
		
		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 17)) {
			interleavingVRBToPRBPDSCH = new BerEnum();
			subCodeLength += interleavingVRBToPRBPDSCH.decode(is, false);
			if (subCodeLength == totalLength) {
				return codeLength;
			}
			subCodeLength += berTag.decode(is);
		}
		
		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 18)) {
			interSlotFreqHoppingPUSCH = new BerEnum();
			subCodeLength += interSlotFreqHoppingPUSCH.decode(is, false);
			if (subCodeLength == totalLength) {
				return codeLength;
			}
			subCodeLength += berTag.decode(is);
		}
		
		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 19)) {
			type1PUSCHRepetitionMultiSlots = new BerEnum();
			subCodeLength += type1PUSCHRepetitionMultiSlots.decode(is, false);
			if (subCodeLength == totalLength) {
				return codeLength;
			}
			subCodeLength += berTag.decode(is);
		}
		
		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 20)) {
			type2PUSCHRepetitionMultiSlots = new BerEnum();
			subCodeLength += type2PUSCHRepetitionMultiSlots.decode(is, false);
			if (subCodeLength == totalLength) {
				return codeLength;
			}
			subCodeLength += berTag.decode(is);
		}
		
		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 21)) {
			puschRepetitionMultiSlots = new BerEnum();
			subCodeLength += puschRepetitionMultiSlots.decode(is, false);
			if (subCodeLength == totalLength) {
				return codeLength;
			}
			subCodeLength += berTag.decode(is);
		}
		
		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 22)) {
			pdschRepetitionMultiSlots = new BerEnum();
			subCodeLength += pdschRepetitionMultiSlots.decode(is, false);
			if (subCodeLength == totalLength) {
				return codeLength;
			}
			subCodeLength += berTag.decode(is);
		}
		
		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 23)) {
			downlinkSPS = new BerEnum();
			subCodeLength += downlinkSPS.decode(is, false);
			if (subCodeLength == totalLength) {
				return codeLength;
			}
			subCodeLength += berTag.decode(is);
		}
		
		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 24)) {
			configuredULGrantType1 = new BerEnum();
			subCodeLength += configuredULGrantType1.decode(is, false);
			if (subCodeLength == totalLength) {
				return codeLength;
			}
			subCodeLength += berTag.decode(is);
		}
		
		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 25)) {
			configuredULGrantType2 = new BerEnum();
			subCodeLength += configuredULGrantType2.decode(is, false);
			if (subCodeLength == totalLength) {
				return codeLength;
			}
			subCodeLength += berTag.decode(is);
		}
		
		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 26)) {
			preEmptIndicationDL = new BerEnum();
			subCodeLength += preEmptIndicationDL.decode(is, false);
			if (subCodeLength == totalLength) {
				return codeLength;
			}
			subCodeLength += berTag.decode(is);
		}
		
		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 27)) {
			cbgTransIndicationDL = new BerEnum();
			subCodeLength += cbgTransIndicationDL.decode(is, false);
			if (subCodeLength == totalLength) {
				return codeLength;
			}
			subCodeLength += berTag.decode(is);
		}
		
		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 28)) {
			cbgTransIndicationUL = new BerEnum();
			subCodeLength += cbgTransIndicationUL.decode(is, false);
			if (subCodeLength == totalLength) {
				return codeLength;
			}
			subCodeLength += berTag.decode(is);
		}
		
		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 29)) {
			cbgFlushIndicationDL = new BerEnum();
			subCodeLength += cbgFlushIndicationDL.decode(is, false);
			if (subCodeLength == totalLength) {
				return codeLength;
			}
			subCodeLength += berTag.decode(is);
		}
		
		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 30)) {
			dynamicHARQACKCodeBCBGRetxDL = new BerEnum();
			subCodeLength += dynamicHARQACKCodeBCBGRetxDL.decode(is, false);
			if (subCodeLength == totalLength) {
				return codeLength;
			}
			subCodeLength += berTag.decode(is);
		}
		
		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 31)) {
			rateMatchingResrcSetSemiStatic = new BerEnum();
			subCodeLength += rateMatchingResrcSetSemiStatic.decode(is, false);
			if (subCodeLength == totalLength) {
				return codeLength;
			}
			subCodeLength += berTag.decode(is);
		}
		
		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 32)) {
			rateMatchingResrcSetDynamic = new BerEnum();
			subCodeLength += rateMatchingResrcSetDynamic.decode(is, false);
			if (subCodeLength == totalLength) {
				return codeLength;
			}
			subCodeLength += berTag.decode(is);
		}
		
		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 33)) {
			bwpSwitchingDelay = new BerEnum();
			subCodeLength += bwpSwitchingDelay.decode(is, false);
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
		if (csiRSCFRAForHO != null) {
			sb.append("\n");
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("csiRSCFRAForHO: ").append(csiRSCFRAForHO);
			firstSelectedElement = false;
		}
		
		if (dynamicPRBBundlingDL != null) {
			if (!firstSelectedElement) {
				sb.append(",\n");
			}
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("dynamicPRBBundlingDL: ").append(dynamicPRBBundlingDL);
			firstSelectedElement = false;
		}
		
		if (spCSIReportPUCCH != null) {
			if (!firstSelectedElement) {
				sb.append(",\n");
			}
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("spCSIReportPUCCH: ").append(spCSIReportPUCCH);
			firstSelectedElement = false;
		}
		
		if (spCSIReportPUSCH != null) {
			if (!firstSelectedElement) {
				sb.append(",\n");
			}
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("spCSIReportPUSCH: ").append(spCSIReportPUSCH);
			firstSelectedElement = false;
		}
		
		if (nzpCSIRSIntefMgmt != null) {
			if (!firstSelectedElement) {
				sb.append(",\n");
			}
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("nzpCSIRSIntefMgmt: ").append(nzpCSIRSIntefMgmt);
			firstSelectedElement = false;
		}
		
		if (type2SPCSIFeedbackLongPUCCH != null) {
			if (!firstSelectedElement) {
				sb.append(",\n");
			}
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("type2SPCSIFeedbackLongPUCCH: ").append(type2SPCSIFeedbackLongPUCCH);
			firstSelectedElement = false;
		}
		
		if (precoderGranularityCORESET != null) {
			if (!firstSelectedElement) {
				sb.append(",\n");
			}
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("precoderGranularityCORESET: ").append(precoderGranularityCORESET);
			firstSelectedElement = false;
		}
		
		if (dynamicHARQACKCodebook != null) {
			if (!firstSelectedElement) {
				sb.append(",\n");
			}
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("dynamicHARQACKCodebook: ").append(dynamicHARQACKCodebook);
			firstSelectedElement = false;
		}
		
		if (semiStaticHARQACKCodebook != null) {
			if (!firstSelectedElement) {
				sb.append(",\n");
			}
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("semiStaticHARQACKCodebook: ").append(semiStaticHARQACKCodebook);
			firstSelectedElement = false;
		}
		
		if (spatialBundlingHARQACK != null) {
			if (!firstSelectedElement) {
				sb.append(",\n");
			}
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("spatialBundlingHARQACK: ").append(spatialBundlingHARQACK);
			firstSelectedElement = false;
		}
		
		if (dynamicBetaOffsetIndHARQACKCSI != null) {
			if (!firstSelectedElement) {
				sb.append(",\n");
			}
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("dynamicBetaOffsetIndHARQACKCSI: ").append(dynamicBetaOffsetIndHARQACKCSI);
			firstSelectedElement = false;
		}
		
		if (pucchRepetitionF134 != null) {
			if (!firstSelectedElement) {
				sb.append(",\n");
			}
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("pucchRepetitionF134: ").append(pucchRepetitionF134);
			firstSelectedElement = false;
		}
		
		if (raType0PUSCH != null) {
			if (!firstSelectedElement) {
				sb.append(",\n");
			}
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("raType0PUSCH: ").append(raType0PUSCH);
			firstSelectedElement = false;
		}
		
		if (dynamicSwitchRAType01PDSCH != null) {
			if (!firstSelectedElement) {
				sb.append(",\n");
			}
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("dynamicSwitchRAType01PDSCH: ").append(dynamicSwitchRAType01PDSCH);
			firstSelectedElement = false;
		}
		
		if (dynamicSwitchRAType01PUSCH != null) {
			if (!firstSelectedElement) {
				sb.append(",\n");
			}
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("dynamicSwitchRAType01PUSCH: ").append(dynamicSwitchRAType01PUSCH);
			firstSelectedElement = false;
		}
		
		if (pdschMappingTypeA != null) {
			if (!firstSelectedElement) {
				sb.append(",\n");
			}
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("pdschMappingTypeA: ").append(pdschMappingTypeA);
			firstSelectedElement = false;
		}
		
		if (pdschMappingTypeB != null) {
			if (!firstSelectedElement) {
				sb.append(",\n");
			}
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("pdschMappingTypeB: ").append(pdschMappingTypeB);
			firstSelectedElement = false;
		}
		
		if (interleavingVRBToPRBPDSCH != null) {
			if (!firstSelectedElement) {
				sb.append(",\n");
			}
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("interleavingVRBToPRBPDSCH: ").append(interleavingVRBToPRBPDSCH);
			firstSelectedElement = false;
		}
		
		if (interSlotFreqHoppingPUSCH != null) {
			if (!firstSelectedElement) {
				sb.append(",\n");
			}
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("interSlotFreqHoppingPUSCH: ").append(interSlotFreqHoppingPUSCH);
			firstSelectedElement = false;
		}
		
		if (type1PUSCHRepetitionMultiSlots != null) {
			if (!firstSelectedElement) {
				sb.append(",\n");
			}
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("type1PUSCHRepetitionMultiSlots: ").append(type1PUSCHRepetitionMultiSlots);
			firstSelectedElement = false;
		}
		
		if (type2PUSCHRepetitionMultiSlots != null) {
			if (!firstSelectedElement) {
				sb.append(",\n");
			}
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("type2PUSCHRepetitionMultiSlots: ").append(type2PUSCHRepetitionMultiSlots);
			firstSelectedElement = false;
		}
		
		if (puschRepetitionMultiSlots != null) {
			if (!firstSelectedElement) {
				sb.append(",\n");
			}
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("puschRepetitionMultiSlots: ").append(puschRepetitionMultiSlots);
			firstSelectedElement = false;
		}
		
		if (pdschRepetitionMultiSlots != null) {
			if (!firstSelectedElement) {
				sb.append(",\n");
			}
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("pdschRepetitionMultiSlots: ").append(pdschRepetitionMultiSlots);
			firstSelectedElement = false;
		}
		
		if (downlinkSPS != null) {
			if (!firstSelectedElement) {
				sb.append(",\n");
			}
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("downlinkSPS: ").append(downlinkSPS);
			firstSelectedElement = false;
		}
		
		if (configuredULGrantType1 != null) {
			if (!firstSelectedElement) {
				sb.append(",\n");
			}
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("configuredULGrantType1: ").append(configuredULGrantType1);
			firstSelectedElement = false;
		}
		
		if (configuredULGrantType2 != null) {
			if (!firstSelectedElement) {
				sb.append(",\n");
			}
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("configuredULGrantType2: ").append(configuredULGrantType2);
			firstSelectedElement = false;
		}
		
		if (preEmptIndicationDL != null) {
			if (!firstSelectedElement) {
				sb.append(",\n");
			}
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("preEmptIndicationDL: ").append(preEmptIndicationDL);
			firstSelectedElement = false;
		}
		
		if (cbgTransIndicationDL != null) {
			if (!firstSelectedElement) {
				sb.append(",\n");
			}
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("cbgTransIndicationDL: ").append(cbgTransIndicationDL);
			firstSelectedElement = false;
		}
		
		if (cbgTransIndicationUL != null) {
			if (!firstSelectedElement) {
				sb.append(",\n");
			}
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("cbgTransIndicationUL: ").append(cbgTransIndicationUL);
			firstSelectedElement = false;
		}
		
		if (cbgFlushIndicationDL != null) {
			if (!firstSelectedElement) {
				sb.append(",\n");
			}
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("cbgFlushIndicationDL: ").append(cbgFlushIndicationDL);
			firstSelectedElement = false;
		}
		
		if (dynamicHARQACKCodeBCBGRetxDL != null) {
			if (!firstSelectedElement) {
				sb.append(",\n");
			}
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("dynamicHARQACKCodeBCBGRetxDL: ").append(dynamicHARQACKCodeBCBGRetxDL);
			firstSelectedElement = false;
		}
		
		if (rateMatchingResrcSetSemiStatic != null) {
			if (!firstSelectedElement) {
				sb.append(",\n");
			}
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("rateMatchingResrcSetSemiStatic: ").append(rateMatchingResrcSetSemiStatic);
			firstSelectedElement = false;
		}
		
		if (rateMatchingResrcSetDynamic != null) {
			if (!firstSelectedElement) {
				sb.append(",\n");
			}
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("rateMatchingResrcSetDynamic: ").append(rateMatchingResrcSetDynamic);
			firstSelectedElement = false;
		}
		
		if (bwpSwitchingDelay != null) {
			if (!firstSelectedElement) {
				sb.append(",\n");
			}
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("bwpSwitchingDelay: ").append(bwpSwitchingDelay);
			firstSelectedElement = false;
		}
		
		sb.append("\n");
		for (int i = 0; i < indentLevel; i++) {
			sb.append("\t");
		}
		sb.append("}");
	}

}
