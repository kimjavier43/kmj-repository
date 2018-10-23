package Jasn1EncodeDecode;

import hello.TestGroups;
import nr.rrc.definitions.*;
import org.openmuc.jasn1.ber.ReverseByteArrayOutputStream;
import org.openmuc.jasn1.ber.types.BerOctetString;
import org.openmuc.jasn1.util.HexConverter;
import org.testng.annotations.Test;

import java.io.ByteArrayInputStream;
import java.io.IOException;

@Test(groups = TestGroups.UNIT)
public class NRTests {
    @Test
    public void encodeObjectToASN1() throws IOException {

        ReverseByteArrayOutputStream berOS = new ReverseByteArrayOutputStream(1000);

        ULDCCHMessage uldcchMessage = new ULDCCHMessage();
        ULDCCHMessageType uldcchMessageType = new ULDCCHMessageType();
        ULDCCHMessageType.C1 c1 = new ULDCCHMessageType.C1();

        //given MessageReport object
        MeasurementReport measurementReport = new MeasurementReport();
        MeasurementReport.CriticalExtensions criticalExtensions = new MeasurementReport.CriticalExtensions();

        MeasurementReportIEs measurementReportIEs = new MeasurementReportIEs();

        //MeasResults
        MeasResults measResults = new MeasResults();
        MeasId measId = new MeasId(1003);
        MeasResultServMO measResultServMO = new MeasResultServMO();
        MeasResultNR.MeasResult measResult = new MeasResultNR.MeasResult();

        MeasQuantityResults measQuantityResults = new MeasQuantityResults();
        MeasResultNR.MeasResult.CellResults cellResults = new MeasResultNR.MeasResult.CellResults();

        measQuantityResults.setRsrp(new RSRPRange(1004));
        cellResults.setResultsCSIRSCell(measQuantityResults);
        measResult.setCellResults(cellResults);

        MeasResultNR measResultNR = new MeasResultNR();
        measResultNR.setMeasResult(measResult);
        measResultNR.setPhysCellId(new PhysCellId(1001));

        //MeasResultServMO setters
        measResultServMO.setServCellId(new ServCellIndex(1002));
        measResultServMO.setMeasResultServingCell(measResultNR);
        measResultServMO.setMeasResultBestNeighCell(measResultNR);

        MeasResultServMOList measResultServMOList = new MeasResultServMOList();
        measResultServMOList.getMeasResultServMO().add(measResultServMO);

        //MeasResults setters
        measResults.setMeasId(measId);
        measResults.setMeasResultServingMOList(measResultServMOList);


        //MeasurementReportIEs setters
        measurementReportIEs.setLateNonCriticalExtension(new BerOctetString("hello".getBytes()));
        measurementReportIEs.setMeasResults(measResults);

        //MeasurementReport setters
        criticalExtensions.setMeasurementReport(measurementReportIEs);
        measurementReport.setCriticalExtensions(criticalExtensions);
        c1.setMeasurementReport(measurementReport);

       // ULDCCHMessageType.MessageClassExtension messageClassExtension = new ULDCCHMessageType.MessageClassExtension();

        uldcchMessageType.setC1(c1);
        //uldcchMessageType.setMessageClassExtension(new ULDCCHMessageType.MessageClassExtension(new byte[] { (byte) 0x80,  (byte) 0x01, (byte) 0x02, (byte) 0x03, (byte) 0x84, (byte) 0x05, (byte) 0x06 } ));
        uldcchMessage.setMessage(uldcchMessageType);

        System.out.println(uldcchMessage.toString());

        uldcchMessage.encode(berOS, true);

        System.out.println("encoded structure:");
        System.out.println(getByteArrayString(berOS.getArray()));
        System.out.println(HexConverter.toShortHexString(berOS.getArray()));

        ByteArrayInputStream bais = new ByteArrayInputStream(berOS.getArray());

        ULDCCHMessage uldcchMessageDecoded = new ULDCCHMessage();
        uldcchMessageDecoded.decode(bais, true);
        System.out.println("Decoded MeasurementReport: ");
        System.out.println(uldcchMessageDecoded.toString());

    }

    public static String getByteArrayString(byte[] byteArray) {
        StringBuilder builder = new StringBuilder();
        int l = 1;
        for (byte b : byteArray) {
            if ((l != 1) && ((l - 1) % 8 == 0)) {
                builder.append(' ');
            }
            if ((l != 1) && ((l - 1) % 16 == 0)) {
                builder.append('\n');
            }
            l++;
            builder.append("0x");
            String hexString = Integer.toHexString(b & 0xff);
            if (hexString.length() == 1) {
                builder.append(0);
            }
            builder.append(hexString + " ");
        }
        return builder.toString();
    }

}
