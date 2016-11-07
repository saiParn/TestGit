package th.co.creativeme.testgit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class ActivityParn extends AppCompatActivity {

    private final String TAG =  "ActivityParn";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parn);

        Log.i(TAG, "Show Log");
        Log.i(TAG, "Show Log2");
        Log.i(TAG, "Show Log3");
        Log.i(TAG, "Show Log4");
        Log.i(TAG, "Show Log5");
        Log.i(TAG, "Show Log6");

        Log.i(TAG, "onCreate: ");

        Log.i(TAG, "Show PARN");
    }
}
