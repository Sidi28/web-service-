
package services.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "chercher", namespace = "http://services/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "chercher", namespace = "http://services/", propOrder = {
    "nom",
    "qantite"
})
public class Met {

    @XmlElement(name = "nom", namespace = "")
    private String nom;
    @XmlElement(name = "qantite", namespace = "")
    private double qantite;

    /**
     * 
     * @return
     *     returns String
     */
    public String getNom() {
        return this.nom;
    }

    /**
     * 
     * @param nom
     *     the value for the nom property
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * 
     * @return
     *     returns double
     */
    public double getQantite() {
        return this.qantite;
    }

    /**
     * 
     * @param qantite
     *     the value for the qantite property
     */
    public void setQantite(double qantite) {
        this.qantite = qantite;
    }

}
