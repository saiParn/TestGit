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
    }
}
