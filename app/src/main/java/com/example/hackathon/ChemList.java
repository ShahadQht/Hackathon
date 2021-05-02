package com.example.hackathon;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class ChemList extends AppCompatActivity {

    ArrayList<TheList> elem = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chem_list);

      //  adapter = new ArrayAdapter<String>(this,R.layout.listcell,R.id.editTextTextPersonName,lv.setAdapet);
        EditText filter = (EditText)findViewById(R.id.editTextTextPersonName);

        final ListView listView = findViewById(R.id.lv);



        TheList elem1 = new TheList("Hydrogen","H",R.drawable.water,"1", "one");

        TheList elem2 = new TheList("Helium","He",R.drawable.ballon,"4.002602","two");

        TheList elem3 = new TheList("Lithium","Li",R.drawable.battery,"6.94","three");

        TheList elem4 = new TheList("Beryllium","Be",R.drawable.plane,"9.0121831","four");

        TheList elem5 = new TheList("Boron","B",R.drawable.bullet,"10.81","five");

        TheList elem6 = new TheList("Carbon", "C",R.drawable.carbon,"12.011","six");

        TheList elem7 = new TheList("Nitrogen","N",R.drawable.chips,"14.007", "seven");

        TheList elem8 = new TheList("Oxygen","O",R.drawable.o,"15.999", "eight");

        TheList elem9 = new TheList("Fluorine","F",R.drawable.tp,"18.998403163", "nine");

        TheList elem10 = new TheList("Neon","Ne",R.drawable.neon,"20.1797", "ten");

        TheList elem11= new TheList("Sodium","Na",R.drawable.salt,"22.98976928", "eleven");

        TheList elem12= new TheList("Magnesium","He",R.drawable.mg,"24.305", "twelve");

        TheList elem13= new TheList("Aluminium","Al",R.drawable.aluminium,"26.9815384", "thirteen");

        TheList elem14= new TheList("Silicon","Si",R.drawable.transitsor,"28.085", "fourteen");

        TheList elem15= new TheList("Phosphorus","P",R.drawable.fireworks,"30.973761998", "fifteen");

        TheList elem16= new TheList("Sulfur","S",R.drawable.matches,"32.06", "sixteen");

        TheList elem17 = new TheList("Chlorine","Cl",R.drawable.cl,"35.45", "seventeen");

        TheList elem18= new TheList("Argon","Ar",R.drawable.lb,"39.95", "eighteen");

        TheList elem19= new TheList("Potassium","K",R.drawable.salt,"39.0983", "nineteen");

        TheList elem20= new TheList("Calcium","Ca",R.drawable.ca,"40.078", "twenty");

        elem.add(elem1);
        elem.add(elem2);
        elem.add(elem3);
        elem.add(elem4);
        elem.add(elem5);
        elem.add(elem6);
        elem.add(elem7);
        elem.add(elem8);
        elem.add(elem9);
        elem.add(elem10);
        elem.add(elem11);
        elem.add(elem12);
        elem.add(elem13);
        elem.add(elem14);
        elem.add(elem15);
        elem.add(elem16);
        elem.add(elem17);
        elem.add(elem18);
        elem.add(elem19);
        elem.add(elem20);




        ListAdapter adapter = new ListAdapter(elem,this);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
           @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent i = new Intent(ChemList.this, Details.class);
                i.putExtra("elem", elem.get(position));
                startActivity(i);

            }
        });
    }
}
//filter.addTextChangedListener(new TextWatcher() {
//@Override
//public void beforeTextChanged(CharSequence s, int start, int count, int after) {



  //      }

//@Override
//public void onTextChanged(CharSequence charSequence, int start, int before, int count) {
//        ChemList.this.elem.getClass().
  //      }

//@Override
//public void afterTextChanged(Editable s) {
  //      theFilter(s.toString());
    //  }
     //   });
