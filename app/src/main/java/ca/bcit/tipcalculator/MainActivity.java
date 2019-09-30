package ca.bcit.tipcalculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onConstraintClick(View v) {
        Intent i = new Intent(this, ConstraintActivity.class);
        startActivity(i);
    }

    public void onLinearClick(View v) {
        Intent intent = new Intent(this, LinearActicity.class);
        startActivity(intent);
    }

    public void onRelativeClick(View v) {
        Intent intent = new Intent(this, RelativeActivity.class);
        startActivity(intent);
    }

    public void onGridClick(View v) {
        Intent intent = new Intent(this, GridActivity.class);
        startActivity(intent);
    }

    public void onTableClick(View v) {
        Intent intent = new Intent(this, TableActivity.class);
        startActivity(intent);
    }
}
