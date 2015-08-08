package firstapp.parse.parselistview;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseACL;
import com.parse.ParseUser;

public class ParseApplication extends Application {

	@Override
	public void onCreate() {
		super.onCreate();

		//Enable Local Datastore.
		Parse.enableLocalDatastore(this);

		Parse.initialize(this,
				"cn3nVuaPk3PnPSIHrN7pYRck6PUfu5tdzPfyjhWV",
				"XYlENm2JX9HESXROgBqMh4bBd6KNHkJws87NLd0i");


		ParseUser.enableAutomaticUser();
		ParseACL defaultACL = new ParseACL();
	    
		// If you would like all objects to be private by default, remove this line.
		defaultACL.setPublicReadAccess(true);
		
		ParseACL.setDefaultACL(defaultACL, true);
	}

}
