package CordovaPluginGreeter;

import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CallbackContext;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * This class generates a greeing message given a name from JavaScript.
 */
public class CordovaPluginGreeter extends CordovaPlugin {
    @Override
    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
        if (action.equals("greet")) {
            String name = args.getString(0);
            if (name != null && name.length() > 0)
                callbackContext.success("Greetings, " + name + "!");
            else
                callbackContext.error("Name must be non-null and non-empty.");
            return true;
        }
        return false;
    }
}
