package com.acadgild.fragments1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.transition.ChangeTransform;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
EditText editText;
    Button button;
    private String Mystring;
    private SimpleAddition firstFragment;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = (EditText) findViewById(R.id.et_enter_number);
        button = (Button) findViewById(R.id.button_show_in_fragment);
        firstFragment=new SimpleAddition();
        if (findViewById(R.id.fragment_container) != null){

            getSupportFragmentManager().beginTransaction()
                    .add(R.id.fragment_container, firstFragment).commit();
        }
        View.OnClickListener listener= new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                changeFragmentTextView(firstFragment, editText.getText().toString());
                Toast.makeText(getApplicationContext(), editText.getText().toString(), Toast.LENGTH_LONG).show();


            }


            public void changeFragmentTextView(SimpleAddition firstFragment, String s) {
                ((TextView) firstFragment.getView().findViewById(R.id.textViewInFragment)).setText(s);
            }
        };
        button.setOnClickListener(listener);
    }
}
