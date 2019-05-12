package gabriel.ignacio.project;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

public class medium extends AppCompatActivity {

    Button BackM, SubmitM;
    RadioButton C1M, C2M, C3M, W1M, W2M, W3M, W4M, W5M, W6M;
    TextView S1M, S2M, S3M;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_medium);

        SubmitM = findViewById(R.id.SubmitM);
        BackM = findViewById(R.id.BackM);

        C1M = findViewById(R.id.C1M);
        C2M = findViewById(R.id.C2M);
        C3M = findViewById(R.id.C3M);
        W1M = findViewById(R.id.W1M);
        W2M = findViewById(R.id.W2M);
        W3M = findViewById(R.id.W3M);
        W4M = findViewById(R.id.W4M);
        W5M = findViewById(R.id.W5M);
        W6M = findViewById(R.id.W6M);

        S1M = findViewById(R.id.S1M);
        S2M = findViewById(R.id.S2M);
        S3M = findViewById(R.id.S3M);
    }

    public void Submit(View view){
        if  (C1M.isChecked()){
            S1M.setText("Correct");
        }else S1M.setText("Incorrect");
        if (C2M.isChecked()){
            S2M.setText("Correct");
        }else S2M.setText("Incorrect");
        if (C3M.isChecked()){
            S3M.setText("Correct");
        }else S3M.setText("Incorrect");
    }

    public void Back(View view){
        Intent Shift;

        if(BackM.getId() == R.id.BackM){
            Shift = new Intent(this, MainActivity.class);
            startActivity(Shift);
        }
    }

    public void C1(View view){
        W1M.setChecked(false);
        W2M.setChecked(false);
    }

    public void W1(View view){
        C1M.setChecked(false);
        W2M.setChecked(false);
    }

    public void W2(View view){
        C1M.setChecked(false);
        W1M.setChecked(false);
    }

    public void C2(View view){
        W3M.setChecked(false);
        W4M.setChecked(false);
    }

    public void W3(View view){
        C2M.setChecked(false);
        W4M.setChecked(false);
    }

    public void W4(View view){
        C2M.setChecked(false);
        W3M.setChecked(false);
    }

    public void C3(View view){
        W5M.setChecked(false);
        W6M.setChecked(false);
    }

    public void W5(View view){
        C3M.setChecked(false);
        W6M.setChecked(false);
    }

    public void W6(View view){
        C3M.setChecked(false);
        W5M.setChecked(false);
    }
}
