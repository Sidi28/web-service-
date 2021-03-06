
package services.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "chercherResponse", namespace = "http://services/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "chercherResponse", namespace = "http://services/")
public class ChercherResponse {

    @XmlElement(name = "return", namespace = "")
    private Model.Produit _return;

    /**
     * 
     * @return
     *     returns Produit
     */
    public Model.Produit getReturn() {
        return this._return;
    }

    /**
     * 
     * @param _return
     *     the value for the _return property
     */
    public void setReturn(Model.Produit _return) {
        this._return = _return;
    }

}
