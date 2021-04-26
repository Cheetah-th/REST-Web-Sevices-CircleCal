/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package circlecalrestcliant;

import java.io.StringReader;
import javax.xml.bind.JAXB;
import model.Result;
import util.CircleCalJerseyClient;

/**
 *
 * @author Cheetah
 */
public class CircleCalRestCliant {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CircleCalJerseyClient obj = new CircleCalJerseyClient();
        String xml = obj.getXml("5");
        Result res = JAXB.unmarshal(new StringReader(xml), Result.class);
        System.out.println(res.getArea());
        System.out.println(res.getLineCircle());
    }
    
}
