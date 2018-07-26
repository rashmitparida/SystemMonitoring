package SystemMailTracking.testcases.SystemEmails;

import java.util.Hashtable;
import org.testng.SkipException;
import org.testng.annotations.Test;
import SystemMailTracking.Base.BaseTest;
import SystemMailTracking.util.Constants;
import SystemMailTracking.util.DataUtil;
import com.aventstack.extentreports.Status;

public class deletecontact extends BaseTest
{
	@Test(dataProvider="getData")
	public void deletecontactTest(Hashtable<String,String> data) throws Exception{
		
		test.log(Status.INFO, "Starting "+ testName);

		if(DataUtil.isSkip(testName, xls) ||data.get(Constants.RUNMODE_COL).equals(Constants.RUNMODE_NO))
		{
			test.log(Status.SKIP, "Runmode is set to NO");
			throw new SkipException("Runmode is set to NO");
		}		
	    ds.executeKeywords(testName, xls, data);
	}
}
