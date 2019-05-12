package gabriel.ignacio.project;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

public class hard extends AppCompatActivity {

    Button BackH, SubmitH;
    RadioButton C1H, C2H, C3H, W1H, W2H, W3H, W4H, W5H, W6H;
    TextView S1H, S2H, S3H;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hard);

        SubmitH = findViewById(R.id.SubmitH);
        BackH = findViewById(R.id.BackH);

        C1H = findViewById(R.id.C1H);
        C2H = findViewById(R.id.C2H);
        C3H = findViewById(R.id.C3H);
        W1H = findViewById(R.id.W1H);
        W2H = findViewById(R.id.W2H);
        W3H = findViewById(R.id.W3H);
        W4H = findViewById(R.id.W4H);
        W5H = findViewById(R.id.W5H);
        W6H = findViewById(R.id.W6H);

        S1H = findViewById(R.id.S1H);
        S2H = findViewById(R.id.S2H);
        S3H = findViewById(R.id.S3H);
    }

    public void Submit(View view){
        if  (C1H.isChecked()){
            S1H.setText("Correct");
        }else S1H.setText("Incorrect");
        if (C2H.isChecked()){
            S2H.setText("Correct");
        }else S2H.setText("Incorrect");
        if (C3H.isChecked()){
            S3H.setText("Correct");
        }else S3H.setText("Incorrect");
    }

    public void Back(View view){
        Intent Shift;

        if(BackH.getId() == R.id.BackH){
            Shift = new Intent(this, MainActivity.class);
            startActivity(Shift);
        }
    }

    public void C1(View view){
        W1H.setChecked(false);
        W2H.setChecked(false);
    }

    public void W1(View view){
        C1H.setChecked(false);
        W2H.setChecked(false);
    }

    public void W2(View view){
        C1H.setChecked(false);
        W1H.setChecked(false);
    }

    public void C2(View view){
        W3H.setChecked(false);
        W4H.setChecked(false);
    }

    public void W3(View view){
        C2H.setChecked(false);
        W4H.setChecked(false);
    }

    public void W4(View view){
        C2H.setChecked(false);
        W3H.setChecked(false);
    }

    public void C3(View view){
        W5H.setChecked(false);
        W6H.setChecked(false);
    }

    public void W5(View view){
        C3H.setChecked(false);
        W6H.setChecked(false);
    }

    public void W6(View view){
        C3H.setChecked(false);
        W5H.setChecked(false);
    }
}
