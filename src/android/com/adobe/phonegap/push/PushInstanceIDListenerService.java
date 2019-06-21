package com.adobe.phonegap.push;
import android.util.Log;
import com.google.firebase.messaging.FirebaseMessagingService;

public class PushInstanceIDListenerService extends FirebaseMessagingService implements PushConstants {
    public static final String LOG_TAG = "Push_InsIdService";

    @Override
    public void onNewToken(String token) {
        super.onNewToken(token);
        // Get updated InstanceID token.
        String refreshedToken = token;
        Log.d(LOG_TAG, "Refreshed token: " + refreshedToken);
        // TODO: Implement this method to send any registration to your app's servers.
        //sendRegistrationToServer(refreshedToken);
    }
}
