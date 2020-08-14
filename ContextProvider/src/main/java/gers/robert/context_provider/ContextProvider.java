package gers.robert.context_provider;

import android.app.Activity;
import android.app.Application;
import android.content.Context;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public interface ContextProvider {

    @Nullable Context getContext();

    @Nullable Activity getActivity();

    @Nullable Context getApplicationContext();

    @NonNull Application getApplication();
}
