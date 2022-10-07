package retoQA.evidenciasWord;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

import java.awt.*;
import java.io.IOException;

public class PasoyEvidencia {

  PrintEvi impresion;

    public PasoyEvidencia (String descripcionPaso) throws InterruptedException, InvalidFormatException, IOException, HeadlessException, AWTException{
// TODO Auto-generated constructor stub
        impresion.OpenFile(1,descripcionPaso);
        impresion.screenshoot();
    }


}

