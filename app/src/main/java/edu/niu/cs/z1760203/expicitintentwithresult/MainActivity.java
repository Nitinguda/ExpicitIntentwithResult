package edu.niu.cs.z1760203.expicitintentwithresult;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {

    private Button namebutt;
    private TextView nameTV;

    static final int REQUEST_CODE = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        namebutt = (Button)findViewById(R.id.nameButton);
        nameTV = (TextView)findViewById(R.id.nameTextView);
    }




    public void getName(View view){
        Intent nameIntent = new Intent(MainActivity.this, NameActivity.class);
        startActivityForResult(nameIntent, REQUEST_CODE);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        //super.onActivityResult(requestCode, resultCode, data);
    String returnedString;

        if (requestCode == REQUEST_CODE && resultCode == RESULT_OK){
            returnedString = data.getStringExtra("nameId");

            nameTV.setText("Your name is : " + returnedString);
        }

    }
}
