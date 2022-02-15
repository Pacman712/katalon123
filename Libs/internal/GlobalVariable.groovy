package internal

import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.main.TestCaseMain


/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */
public class GlobalVariable {
     
    /**
     * <p>Profile default : user name</p>
     */
    public static Object username
     
    /**
     * <p>Profile default : default password</p>
     */
    public static Object password
     
    /**
     * <p>Profile default : default url</p>
     */
    public static Object url
     
    /**
     * <p>Profile default : wait time</p>
     */
    public static Object waitTime
     
    /**
     * <p>Profile default : email</p>
     */
    public static Object email
     
    /**
     * <p>Profile default : dob</p>
     */
    public static Object dob
     

    static {
        try {
            def selectedVariables = TestCaseMain.getGlobalVariables("default")
			selectedVariables += TestCaseMain.getGlobalVariables(RunConfiguration.getExecutionProfile())
            selectedVariables += TestCaseMain.getParsedValues(RunConfiguration.getOverridingParameters())
    
            username = selectedVariables['username']
            password = selectedVariables['password']
            url = selectedVariables['url']
            waitTime = selectedVariables['waitTime']
            email = selectedVariables['email']
            dob = selectedVariables['dob']
            
        } catch (Exception e) {
            TestCaseMain.logGlobalVariableError(e)
        }
    }
}
