package gabriel.ignacio.project;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button Easy, Medium, Hard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Easy = findViewById(R.id.Main_Easy);
        Medium = findViewById(R.id.Main_Medium);
        Hard = findViewById(R.id.Main_Hard);
    }

    public void Easy(View view){
        Intent Shift = new Intent(this, easy.class);
        startActivity(Shift);
    }

    public void Medium(View view){
        Intent Shift = new Intent(this, medium.class);
        startActivity(Shift);
    }

    public void Hard(View view){
        Intent Shift = new Intent(this, hard.class);
        startActivity(Shift);
    }
}
