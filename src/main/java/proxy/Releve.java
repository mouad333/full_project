
package proxy;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java pour releve complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="releve">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dateReleve" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="solde" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="operations" type="{http://QuestionC/}operations" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="rib" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "releve", propOrder = {
    "dateReleve",
    "solde",
    "operations"
})
public class Releve {

    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateReleve;
    protected double solde;
    protected Operations operations;
    @XmlAttribute(name = "rib")
    protected String rib;

    /**
     * Obtient la valeur de la propri�t� dateReleve.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateReleve() {
        return dateReleve;
    }

    /**
     * D�finit la valeur de la propri�t� dateReleve.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateReleve(XMLGregorianCalendar value) {
        this.dateReleve = value;
    }

    /**
     * Obtient la valeur de la propri�t� solde.
     * 
     */
    public double getSolde() {
        return solde;
    }

    /**
     * D�finit la valeur de la propri�t� solde.
     * 
     */
    public void setSolde(double value) {
        this.solde = value;
    }

    /**
     * Obtient la valeur de la propri�t� operations.
     * 
     * @return
     *     possible object is
     *     {@link Operations }
     *     
     */
    public Operations getOperations() {
        return operations;
    }

    /**
     * D�finit la valeur de la propri�t� operations.
     * 
     * @param value
     *     allowed object is
     *     {@link Operations }
     *     
     */
    public void setOperations(Operations value) {
        this.operations = value;
    }

    /**
     * Obtient la valeur de la propri�t� rib.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRib() {
        return rib;
    }

    /**
     * D�finit la valeur de la propri�t� rib.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRib(String value) {
        this.rib = value;
    }

}
