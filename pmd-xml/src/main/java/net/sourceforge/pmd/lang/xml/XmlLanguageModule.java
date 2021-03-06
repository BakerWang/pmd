/**
 * BSD-style license; for more info see http://pmd.sourceforge.net/license.html
 */

package net.sourceforge.pmd.lang.xml;

import net.sourceforge.pmd.lang.BaseLanguageModule;

/**
 * Created by christoferdutz on 20.09.14.
 */
public class XmlLanguageModule extends BaseLanguageModule {

    public static final String NAME = "XML";
    public static final String TERSE_NAME = "xml";

    public XmlLanguageModule() {
        super(NAME, null, TERSE_NAME, "xml");
        addVersion("", new XmlHandler(), true);
    }
}
