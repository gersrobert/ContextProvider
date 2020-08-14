[![](https://jitpack.io/v/gersrobert/ContextProvider.svg)](https://jitpack.io/#gersrobert/ContextProvider)

# ContextProvider
A simple lifecycle aware Android library to share Application, current Activity and Context classes across your code.

## Usage
1. Add the JitPack repository to your root build.gradle file
```
allprojects {
  repositories {
    ...
    maven { url 'https://www.jitpack.io' }
  }
}
```

2. Add the dependency
```
dependencies {
  implementation 'com.github.gersrobert:ContextProvider:1.0.1'
}
```

3. Initialize ContextProvider
```
ContextProvider contextProvider = ContextProviderFactory.createContextProvider(myApplication);
```

4. Pass it along and use
```
contextProvider.getApplication();
contextProvider.getApplicationContext();
contextProvider.getActivity();
contextProvider.getContext();
```
