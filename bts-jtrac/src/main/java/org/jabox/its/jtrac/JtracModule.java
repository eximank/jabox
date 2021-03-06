package org.jabox.its.jtrac;

import org.jabox.apis.its.ITSConnector;

import com.google.inject.Binder;
import com.google.inject.Module;
import com.google.inject.multibindings.Multibinder;

public class JtracModule implements Module {

	@Override
	public void configure(Binder binder) {
		Multibinder<ITSConnector> uriBinder = Multibinder.newSetBinder(binder,
				ITSConnector.class);
		uriBinder.addBinding().to(JtracRepository.class);
	}
}
