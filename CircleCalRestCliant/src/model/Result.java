/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Cheetah
 */
@XmlRootElement
public class Result {
    
    private double area;
    private double lineCircle;

    public Double getArea() {
        return area;
    }

    @XmlElement
    public void setArea(Double area) {
        this.area = area;
    }

    public double getLineCircle() {
        return lineCircle;
    }

    @XmlElement
    public void setLineCircle(double lineCircle) {
        this.lineCircle = lineCircle;
    }

    public boolean getlineCircle() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
