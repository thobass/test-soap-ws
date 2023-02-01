package rocks.basset.soap.interceptor;

import org.apache.cxf.binding.soap.SoapMessage;
import org.apache.cxf.binding.soap.interceptor.AbstractSoapInterceptor;
import org.apache.cxf.interceptor.Fault;
import org.apache.cxf.phase.Phase;

public class MyInterceptor extends AbstractSoapInterceptor {
    public MyInterceptor() {
        super(Phase.SEND_ENDING);
    }

    @Override
    public void handleMessage(SoapMessage soapMessage) throws Fault {
        System.out.println("Interceptor");
    }
}
