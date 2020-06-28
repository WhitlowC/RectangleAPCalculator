package com.example.corey.rectangleapcalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class CalculatorActivity extends AppCompatActivity {

    TextView Length, Width, Area, Perimeter, areaOutput, perimeterOutput;
    Button Calculate;
    EditText lengthInput, widthInput;

    float areaOut;
    float perimeterOut;
    float len, wid;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);

        Length = findViewById(R.id.Length);
        Width = findViewById(R.id.Width);
        Area = findViewById(R.id.Area);
        Perimeter = findViewById(R.id.Perimeter);
        areaOutput = findViewById(R.id.areaOutput);
        perimeterOutput = findViewById(R.id.perimeterOutput);

        Calculate = findViewById(R.id.Calculate);

        lengthInput = findViewById(R.id.lengthInput);
        widthInput = findViewById(R.id.widthInput);





        Calculate.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){


                len = Float.parseFloat(lengthInput.getText().toString());
                wid = Float.parseFloat(widthInput.getText().toString());

                areaOut = len * wid;
                perimeterOut = (2 * len) + (2 * wid);

                areaOutput.setText(String.valueOf(areaOut));
                perimeterOutput.setText(String.valueOf(perimeterOut));

            }
        });

    }
}


