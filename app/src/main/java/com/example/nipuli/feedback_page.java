package com.example.nipuli;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class feedback_page extends AppCompatActivity {
    private Button buttonx;
    private Button buttonY;
    private Button buttonZ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_feedback_page);

        buttonx=findViewById(R.id.button15);
        buttonx.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(feedback_page.this,donete_things_page.class);
                startActivity(intent);
            }
        });

        buttonY=findViewById(R.id.button);
        buttonY.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(feedback_page.this,Donate_Page.class);
                startActivity(intent);
            }
        });

        buttonZ = findViewById(R.id.button19);

        // Set onClickListener
        buttonZ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Show a Toast message before navigating
                Toast.makeText(feedback_page.this, "Submit Completed", Toast.LENGTH_SHORT).show();

                // Navigate to Login_page after a small delay (Optional)
                Intent intent = new Intent(feedback_page.this, donete_things_page.class);
                startActivity(intent);

            }
        });


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}