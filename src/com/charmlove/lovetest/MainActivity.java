package com.charmlove.lovetest;

import java.util.ArrayList;
import java.util.List;

import com.charmlove.lovetest.R;

import android.os.Bundle;
import android.os.Message;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends Activity {

	protected static final Message BUTTON_NEUTRAL = null;
	TextView tv;
	Button bt1;
	EditText name1, name2, age1, age2;
	private String obsrevation="";
	String obs="";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		name1 = (EditText) findViewById(R.id.first_name);
		name2 = (EditText) findViewById(R.id.second_name);

		age1 = (EditText) findViewById(R.id.first_age);
		age2 = (EditText) findViewById(R.id.second_age);

		bt1 = (Button) findViewById(R.id.button);
		tv = (TextView) findViewById(R.id.firsttext);

		final Spinner sp1 = (Spinner) findViewById(R.id.first_spinner);
		final Spinner sp2 = (Spinner) findViewById(R.id.second_spinner);

		List<String> list = new ArrayList<String>();
		list.add("Aries");
		list.add("Taurus");
		list.add("Gemini");
		list.add("Cancer");
		list.add("Leo");
		list.add("Virgo");
		list.add("Libra");
		list.add("Scorpio");
		list.add("Sagittarius");
		list.add("Capricorn");
		list.add("Aquarius");
		list.add("Pisces");

		ArrayAdapter<String> dataAd = new ArrayAdapter<String>(this,
				android.R.layout.simple_spinner_item, list);
		dataAd.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		sp1.setAdapter(dataAd);
		sp2.setAdapter(dataAd);

		bt1.setOnClickListener(new View.OnClickListener() {

			@SuppressWarnings("deprecation")
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if (name1.getText().toString().equals("")
						|| name2.getText().toString().equals("")
						|| age1.getText().toString().equals("")
						|| age2.getText().toString().equals("")) {
					AlertDialog alert = new AlertDialog.Builder(
							MainActivity.this).create();
					alert.setTitle("There is an error!");
					alert.setCanceledOnTouchOutside(true);
					alert.setCancelable(true);
					alert.setMessage("Please, fill in all of the blanks");
					alert.setButton("Back", BUTTON_NEUTRAL);
					alert.show();
				} else {

					String zod1 = sp1.getSelectedItem().toString();
					String zod2 = sp2.getSelectedItem().toString();

					int first_name = TextToNumber.txt(name1.getText()
							.toString());
					int second_name = TextToNumber.txt(name2.getText()
							.toString());
					int first_age = Integer.parseInt(age1.getText().toString());
					int second_age = Integer
							.parseInt(age2.getText().toString());

					if (first_name > 250 || first_name <= 3
							|| second_name > 250 || second_name <= 3) {
						AlertDialog alert = new AlertDialog.Builder(
								MainActivity.this).create();
						alert.setTitle("There is an error!");
						alert.setCanceledOnTouchOutside(true);
						alert.setCancelable(true);
						alert.setMessage("Please, change the name field with a meaningful name");
						alert.setButton("Back", BUTTON_NEUTRAL);
						alert.show();
					} else if (first_age >= 60 || first_age <= 15
							|| second_age >= 60 || second_age <= 15) {
						AlertDialog alert = new AlertDialog.Builder(
								MainActivity.this).create();
						alert.setTitle("There is an error!");
						alert.setCanceledOnTouchOutside(true);
						alert.setCancelable(true);
						alert.setMessage("Please, change the age field with a meaningful age (from 13 to 60)");
						alert.setButton("Back", BUTTON_NEUTRAL);
						alert.show();
					}

					else {

						int name_result = FindNumber.find_name(first_name,
								second_name);
						int age_result = FindNumber.find_age(first_age,
								second_age);
						int zodiac_result = FindZod.find(zod1, zod2);

						int final_result = FindNumber.generate(name_result,
								age_result, zodiac_result);

						if (final_result > 0) { obsrevation=getResources().getString(R.string.obs1);}
						if (final_result > 4) { obsrevation=getResources().getString(R.string.obs2);}
						if (final_result > 10) { obsrevation=getResources().getString(R.string.obs3);}
						if (final_result > 20) { obsrevation=getResources().getString(R.string.obs4);}
						if (final_result > 40) { obsrevation=getResources().getString(R.string.obs5);}
						if (final_result == 51) { obsrevation=getResources().getString(R.string.obs6);}
						if (final_result > 51) { obsrevation=getResources().getString(R.string.obs7);}
						if (final_result == 69) { obsrevation=getResources().getString(R.string.obs8);}
						if (final_result > 69) { obsrevation=getResources().getString(R.string.obs9);}
						if (final_result > 80) { obsrevation=getResources().getString(R.string.obs10);}
						if (final_result > 90) { obsrevation=getResources().getString(R.string.obs11);}
												
						obs=obsrevation;
						
						String message = "Amount of love:"+ final_result + "%"+"\n\n"+obs;	
						
						AlertDialog alert = new AlertDialog.Builder(
								MainActivity.this).create();					
						alert.setTitle("Love Results");
						alert.setIcon(R.drawable.ic_launcher);
						alert.setCanceledOnTouchOutside(true);
						alert.setCancelable(true);
						alert.setMessage(message);
						alert.setButton("Back", BUTTON_NEUTRAL);
						alert.show();
						TextView textView = ((TextView) alert.findViewById(android.R.id.message));  				       
				        textView.setTextSize(30);  
				
					}
				}

			}
		});

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}

	@SuppressWarnings("deprecation")
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Inflate the menu; this adds items to the action bar if it is present.

		switch (item.getItemId()) {
		case R.id.menu_help:
			startActivity(new Intent("com.lovetest.charmlove.HELP"));
			break;

		case R.id.menu_exit:
			System.runFinalizersOnExit(true);
			System.exit(0);
			break;
		}
		return true;
	}

}
