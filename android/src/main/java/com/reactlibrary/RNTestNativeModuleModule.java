
package com.reactlibrary;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.Callback;
import com.reactlibrary.BuildConfig;
import com.facebook.react.bridge.Promise;

public class RNTestNativeModuleModule extends ReactContextBaseJavaModule {

  private final ReactApplicationContext reactContext;

  public RNTestNativeModuleModule(ReactApplicationContext reactContext) {
    super(reactContext);
    this.reactContext = reactContext;
  }

  @Override
  public String getName() {
    return "RNTestNativeModule";
  }

  @ReactMethod
  public void getAppVersionCallback(Callback callback) {
    callback.invoke(BuildConfig.VERSION_CODE);
  }

  @ReactMethod
  public void getAppVersionPromise(Promise promise) {
    promise.resolve(BuildConfig.VERSION_CODE);
  }
}