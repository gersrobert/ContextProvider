package gers.robert.context_provider;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

class ContextProviderImpl implements Application.ActivityLifecycleCallbacks, ContextProvider {
    private Application application;
    private Activity activity;

    ContextProviderImpl(Application application) {
        application.registerActivityLifecycleCallbacks(this);
        this.application = application;
    }

    @Nullable
    @Override
    public Context getContext() {
        return getActivity();
    }

    @Nullable
    @Override
    public Activity getActivity() {
        return activity;
    }

    @Nullable
    @Override
    public Context getApplicationContext() {
        return application.getApplicationContext();
    }

    @NonNull
    @Override
    public Application getApplication() {
        return application;
    }

    @Override
    public void onActivityCreated(@NonNull Activity activity, @Nullable Bundle savedInstanceState) {
    }

    @Override
    public void onActivityStarted(@NonNull Activity activity) {
    }

    @Override
    public void onActivityResumed(@NonNull Activity activity) {
        this.activity = activity;
    }

    @Override
    public void onActivityPaused(@NonNull Activity activity) {
    }

    @Override
    public void onActivityStopped(@NonNull Activity activity) {
    }

    @Override
    public void onActivitySaveInstanceState(@NonNull Activity activity, @NonNull Bundle outState) {
    }

    @Override
    public void onActivityDestroyed(@NonNull Activity activity) {
        if (activity.equals(this.activity)) {
            this.activity = null;
        }
    }
}
