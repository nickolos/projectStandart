
package SOAP.AdmpReplay.wsdl;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the SOAP.AdmpReplay.wsdl package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: SOAP.AdmpReplay.wsdl
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetDataFIO }
     * 
     */
    public GetDataFIO createGetDataFIO() {
        return new GetDataFIO();
    }

    /**
     * Create an instance of {@link GetDataFIOResponse }
     * 
     */
    public GetDataFIOResponse createGetDataFIOResponse() {
        return new GetDataFIOResponse();
    }

    /**
     * Create an instance of {@link Result }
     * 
     */
    public Result createResult() {
        return new Result();
    }

    /**
     * Create an instance of {@link ArrayOfResultItemResultItem }
     * 
     */
    public ArrayOfResultItemResultItem createArrayOfResultItemResultItem() {
        return new ArrayOfResultItemResultItem();
    }

    /**
     * Create an instance of {@link ResultItem }
     * 
     */
    public ResultItem createResultItem() {
        return new ResultItem();
    }

}
