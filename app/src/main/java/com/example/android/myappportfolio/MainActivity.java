package com.example.android.myappportfolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private LinearLayout linearLayout;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        linearLayout = (LinearLayout)findViewById(R.id.linear_layout);
    }

    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.spotify_button:
                button = (Button) linearLayout.findViewById(R.id.spotify_button);
                break;
            case R.id.scores_button:
                button = (Button) linearLayout.findViewById(R.id.scores_button);
                break;
            case R.id.library_button:
                button = (Button) linearLayout.findViewById(R.id.library_button);
                break;
            case R.id.bigeer_button:
                button = (Button) linearLayout.findViewById(R.id.bigeer_button);
                break;
            case R.id.xyz_button:
                button = (Button) linearLayout.findViewById(R.id.xyz_button);
                break;
            case R.id.capstone_button:
                button = (Button) linearLayout.findViewById(R.id.capstone_button);
                break;
        }
        builtMessage();
    }

        public void builtMessage() {
            final String text = "This button will launch ";
            final String msg = text + button.getText().toString();
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(MainActivity.this, msg, Toast.LENGTH_LONG).show();
                }
            });
        }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
