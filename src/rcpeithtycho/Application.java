package rcpeithtycho;

import org.eclipse.equinox.app.IApplication;
import org.eclipse.equinox.app.IApplicationContext;

/**
 * This class controls all aspects of the application's execution
 */
public class Application implements IApplication {

	@Override
	public Object start(IApplicationContext context) throws Exception {
		System.out.println("START: Hello RCP World!");
		return IApplication.EXIT_OK;
	}

	@Override
	public void stop() {
		System.out.println("STOP: Hello RCP World!");
	}
}
