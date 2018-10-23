package hk.aho.inappbrowser;

import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CallbackContext;
import org.apache.cordova.LOG;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class HKAHOInAppBrowser extends CordovaPlugin {

    // @Override
    // public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
    //     if (action.equals("coolMethod")) {
    //         String message = args.getString(0);
    //         this.coolMethod(message, callbackContext);
    //         return true;
    //     }
    //     return false;
    // }

    // private void coolMethod(String message, CallbackContext callbackContext) {
    //     if (message != null && message.length() > 0) {
    //         callbackContext.success(message);
    //     } else {
    //         callbackContext.error("Expected one non-empty string argument.");
    //     }
    // }

    @Override
    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
        if (action.equals("openWebview")) {
            String message = args.getString(0);
            String url = args.getString(1);
            String title = args.getString(2);
            this.openWebview(message, url, title, callbackContext);
            return true;
        }
        return false;
    }

    private void openWebview(String message, String url, String title, CallbackContext callbackContext) {
        if (url != null && url.length() > 0) {
            LOG.i("message", message);
            LOG.i("url", message);
            LOG.i("title", message);
            callbackContext.success("SUCCESS");
        } else {
            callbackContext.error("Expected one non-empty string argument.");
        }
    }
}
