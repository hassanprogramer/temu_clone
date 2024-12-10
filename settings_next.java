package com.hassan.temu_clone_2;

import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableString;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class settings_next extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content view for the activity
        setContentView(R.layout.activity_settings_next);

        // Find the Button in the activity's layout
        Button country = findViewById(R.id.country);

        String buttonText=country.getText().toString();
        String countryCode = getIntent().getStringExtra("COUNTRY_CODE");
        if (countryCode != null) {
            // Set the text of the Button to the country code
            country.append("                                                                "+countryCode);
        }else {
            country.append("                                                                PK");
        }


        Button currency = findViewById(R.id.currency);

        String currencyCode = getIntent().getStringExtra("CURRENCY_CODE");  // Get the currency code passed via the intent

        if (currencyCode != null) {
            // If currency code exists, append it to the button text
            currency.setText("Currency                                                                          " + currencyCode);
        } else {
            // If no currency code is found, set a default value (e.g., PKR)
            currency.setText("Currency                                                                          PKR");
        }



        // Set the OnClickListener
        country.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create an Intent to start another activity
                Intent intent = new Intent(settings_next.this, countries.class);
                startActivity(intent);
            }
        });
    }
}
