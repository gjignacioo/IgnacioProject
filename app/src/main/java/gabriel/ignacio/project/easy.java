package gabriel.ignacio.project;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

public class easy extends AppCompatActivity {

    Button BackE, SubmitE;
    RadioButton C1E, C2E, C3E, W1E, W2E, W3E, W4E, W5E, W6E;
    TextView S1E, S2E, S3E;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_easy);

        SubmitE = findViewById(R.id.SubmitE);
        BackE = findViewById(R.id.BackE);

        C1E = findViewById(R.id.C1E);
        C2E = findViewById(R.id.C2E);
        C3E = findViewById(R.id.C3E);
        W1E = findViewById(R.id.W1E);
        W2E = findViewById(R.id.W2E);
        W3E = findViewById(R.id.W3E);
        W4E = findViewById(R.id.W4E);
        W5E = findViewById(R.id.W5E);
        W6E = findViewById(R.id.W6E);

        S1E = findViewById(R.id.S1E);
        S2E = findViewById(R.id.S2E);
        S3E = findViewById(R.id.S3E);
    }

    public void Submit(View view){
        if  (C1E.isChecked()){
            S1E.setText("Correct");
        }else S1E.setText("Incorrect");
        if (C2E.isChecked()){
            S2E.setText("Correct");
        }else S2E.setText("Incorrect");
        if (C3E.isChecked()){
            S3E.setText("Correct");
        }else S3E.setText("Incorrect");
    }

    public void Back(View view){
        Intent Shift;

        if(BackE.getId() == R.id.BackE){
            Shift = new Intent(this, MainActivity.class);
            startActivity(Shift);
        }
    }

    public void C1(View view){
        W1E.setChecked(false);
        W2E.setChecked(false);
    }

    public void W1(View view){
        C1E.setChecked(false);
        W2E.setChecked(false);
    }

    public void W2(View view){
        C1E.setChecked(false);
        W1E.setChecked(false);
    }

    public void C2(View view){
        W3E.setChecked(false);
        W4E.setChecked(false);
    }

    public void W3(View view){
        C2E.setChecked(false);
        W4E.setChecked(false);
    }

    public void W4(View view){
        C2E.setChecked(false);
        W3E.setChecked(false);
    }

    public void C3(View view){
        W5E.setChecked(false);
        W6E.setChecked(false);
    }

    public void W5(View view){
        C3E.setChecked(false);
        W6E.setChecked(false);
    }

    public void W6(View view){
        C3E.setChecked(false);
        W5E.setChecked(false);
    }
}
