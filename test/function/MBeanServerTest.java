import javax.management.Attribute;
import javax.management.AttributeList;
import javax.management.AttributeNotFoundException;
import javax.management.DynamicMBean;
import javax.management.InstanceAlreadyExistsException;
import javax.management.InvalidAttributeValueException;
import javax.management.MBeanAttributeInfo;
import javax.management.MBeanConstructorInfo;
import javax.management.MBeanException;
import javax.management.MBeanInfo;
import javax.management.MBeanNotificationInfo;
import javax.management.MBeanOperationInfo;
import javax.management.MBeanRegistrationException;
import javax.management.MBeanServer;
import javax.management.MBeanServerFactory;
import javax.management.MalformedObjectNameException;
import javax.management.NotCompliantMBeanException;
import javax.management.ObjectName;
import javax.management.ReflectionException;

import junit.framework.TestCase;


class UserMBean implements DynamicMBean {

	public Object getAttribute(String attribute)
			throws AttributeNotFoundException, MBeanException,
			ReflectionException {
		return null;
	}

	public AttributeList getAttributes(String[] attributes) {
		return null;
	}

	public MBeanInfo getMBeanInfo() {
		MBeanInfo mBeanInfo = new MBeanInfo("UserMBean", 
				"UserMBean's description", 
				new MBeanAttributeInfo[0], 
				new MBeanConstructorInfo[0], 
				new MBeanOperationInfo[0], 
				new MBeanNotificationInfo[0]);
		return mBeanInfo;
	}

	public Object invoke(String actionName, Object[] params, String[] signature)
			throws MBeanException, ReflectionException {
		return null;
	}

	public void setAttribute(Attribute attribute)
			throws AttributeNotFoundException, InvalidAttributeValueException,
			MBeanException, ReflectionException {
		
	}

	public AttributeList setAttributes(AttributeList attributes) {
		return null;
	}
	
}
public class MBeanServerTest extends TestCase {

	@Override
	protected void setUp() throws Exception {
		// TODO Auto-generated method stub
		super.setUp();
	}
	
	public void testRegisterMBean() {
		UserMBean mo = new UserMBean();
		String moName = "mo";
		
		MBeanServer mBeanServer = null;
        if(MBeanServerFactory.findMBeanServer(null).size() > 0)
            mBeanServer = (MBeanServer)MBeanServerFactory.findMBeanServer(null).get(0);
        else
            mBeanServer = MBeanServerFactory.createMBeanServer();
        ObjectName objectName;
		try {
			objectName = new ObjectName("Catalina:type=ServerClassLoader,name=" + moName);
			mBeanServer.registerMBean(mo, objectName);
		} catch (MalformedObjectNameException e) {
			e.printStackTrace();
		} catch (NullPointerException e) {
			e.printStackTrace();
		} catch (InstanceAlreadyExistsException e) {
			e.printStackTrace();
		} catch (MBeanRegistrationException e) {
			e.printStackTrace();
		} catch (NotCompliantMBeanException e) {
			e.printStackTrace();
		}
	}

	@Override
	protected void tearDown() throws Exception {
		// TODO Auto-generated method stub
		super.tearDown();
	}
	
}
