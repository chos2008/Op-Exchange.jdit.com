cd D:\home\admin\dev\workstation\j2ee\JustYou\commerce\cost
d:
java -cp %CLASSPATH%;D:\home\admin\dev\workstation\j2ee\JustYou\commerce\WebContent\WEB-INF\lib\axis.jar;D:\home\admin\dev\workstation\j2ee\JustYou\commerce\WebContent\WEB-INF\lib\commons-logging.jar;D:\home\admin\dev\workstation\j2ee\JustYou\commerce\WebContent\WEB-INF\lib\commons-collections.jar;D:\home\admin\dev\workstation\j2ee\JustYou\commerce\WebContent\WEB-INF\lib\jaxrpc.jar;D:\home\admin\dev\workstation\j2ee\JustYou\commerce\WebContent\WEB-INF\lib\commons-discovery-0.2.jar;D:\home\admin\dev\workstation\j2ee\JustYou\commerce\WebContent\WEB-INF\lib\saaj.jar;D:\home\admin\dev\workstation\j2ee\JustYou\commerce\WebContent\WEB-INF\lib\wsdl4j-1.5.1.jar org.apache.axis.wsdl.WSDL2Java -o . -d Session -s -S true -Nurn:System org.jdit.commerce.system org\jdit\commerce\system\System_auto.wsdl