package sub;

import com.sun.xml.internal.bind.marshaller.NamespacePrefixMapper;

public class MyNamespaceMapper extends NamespacePrefixMapper {
  
    private static final String FOO_PREFIX = "q0"; // DEFAULT NAMESPACE
    private static final String FOO_URI = "http://www.mysamplecode.com/ws/v10";
  
    private static final String BAR_PREFIX = "xsi";
    private static final String BAR_URI = "http://www.w3.org/2001/XMLSchema-instance";
  
    @Override
    public String getPreferredPrefix(String namespaceUri, String suggestion, 
      boolean requirePrefix) {
        if(FOO_URI.equals(namespaceUri)) {
            return FOO_PREFIX;
        } else if(BAR_URI.equals(namespaceUri)) {
            return BAR_PREFIX;
        }
        return suggestion;
    }
  
    @Override
    public String[] getPreDeclaredNamespaceUris() {
        return new String[] { FOO_URI, BAR_URI };
    }
  
}
