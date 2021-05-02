package com.example.hackathon;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Details extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        Bundle data = getIntent().getExtras();
        final TheList d = (TheList) data.getSerializable("elem");

        TextView name2 = findViewById(R.id.textName);
        name2.setText(d.getElement());

        ImageView img = findViewById(R.id.imageView3);
        img.setImageResource(d.getImageRefrence());

        TextView rmz = findViewById(R.id.textView2);
        rmz.setText(d.getRmz());

        TextView masss = findViewById(R.id.textView3);
        masss.setText(d.getMass());

        TextView num = findViewById(R.id.textView4);
        num.setText(d.getNumber());


        ImageView e = findViewById(R.id.imageView7);
       e.setOnClickListener(new View.OnClickListener() {
         @Override
        public void onClick(View v) {

                Intent iB = new Intent(Details.this,ChemList.class);

              startActivity(iB);

           }
    });
    }
}
