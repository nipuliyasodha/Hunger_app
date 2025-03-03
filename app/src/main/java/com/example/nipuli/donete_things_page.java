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

public class donete_things_page extends AppCompatActivity {
    private Button button1;
    private Button buttonx;
    private Button buttonY;
    private Button buttonZ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_donete_things_page);

        button1=findViewById(R.id.button18);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(donete_things_page.this,Disaster_page.class);
                startActivity(intent);
            }
        });

        buttonx=findViewById(R.id.button16);
        buttonx.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(donete_things_page.this,feedback_page.class);
                startActivity(intent);
            }
        });

        buttonY=findViewById(R.id.button15);
        buttonY.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(donete_things_page.this,Donate_Page.class);
                startActivity(intent);
            }
        });
        buttonZ = findViewById(R.id.button12);

        // Set onClickListener
        buttonZ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Show a Toast message before navigating
                Toast.makeText(donete_things_page.this, "Submit Completed", Toast.LENGTH_SHORT).show();

// Navigate to Login_page after a small delay (Optional)
                Intent intent = new Intent(donete_things_page.this, Disaster_page.class);
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