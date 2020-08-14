package gers.robert.context_provider;

import android.app.Application;

public class ContextProviderFactory {

    public static ContextProvider createContextProvider(Application application) {
        return new ContextProviderImpl(application);
    }

}
