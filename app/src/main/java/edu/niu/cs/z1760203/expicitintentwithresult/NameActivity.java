package edu.niu.cs.z1760203.expicitintentwithresult;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class NameActivity extends Activity {

    private Button returnBtn;
    private EditText nameET;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_name);

    returnBtn = (Button)findViewById(R.id.returnButton);
        nameET = (EditText)findViewById(R.id.nameEditText);

    }

    public void goBack(View view)
    {
        String nameInput;

        nameInput = nameET.getText().toString();

        Intent intent;
        intent = getIntent();

        intent.putExtra("nameId", nameInput);

        ((Activity) view.getContext()).setResult(RESULT_OK, intent);

        finish();
    }



}
