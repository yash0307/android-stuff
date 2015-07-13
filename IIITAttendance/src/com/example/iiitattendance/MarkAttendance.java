package com.example.iiitattendance;


import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.AdapterView.OnItemClickListener;

public class MarkAttendance extends Activity {
	
	GridView grid;

	static final String[] letters = new String[] {
		" ", " ", " ","A1","A2","A3","A4","A5"," ","A6","A7","A8","A9","A10"," ","A11","A12","A13","A14","A15"," "," "," ",
		"B1","B2"," ","B3","B4","B5","B6","B7"," ","B8","B9","B10","B11","B12"," ","B13","B14","B15","B16","B17"," ","B18","B19",
		"C1","C2"," ","C3","C4","C5","C6","C7"," ","C8","C9","C10","C11","C12"," ","C13","C14","C15","C16","C17"," ","C18","C19",
		"D1","D2"," ","D3","D4","D5","D6","D7"," ","D8","D9","D10","D11","D12"," ","D13","D14","D15","D16","D17"," ","D18","D19",
		"E1","E2"," ","E3","E4","E5","E6","E7"," ","E8","E9","E10","E11","E12"," ","E13","E14","E15","E16","E17"," ","E18","E19",
		"F1","F2"," ","F3","F4","F5","F6","F7"," ","F8","F9","F10","F11","F12"," ","F13","F14","F15","F16","F17"," ","F18","F19",
		"G1","G2"," ","G3","G4","G5","G6","G7"," ","G8","G9","G10","G11","G12"," ","G13","G14","G15","G16","G17"," ","G18","G19",
	};


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.activity_mark_attendance);

		grid = (GridView) findViewById(R.id.gridView);

		ArrayAdapter<?> adapter = new ArrayAdapter<Object>(this, android.R.layout.simple_list_item_1, letters);

		grid.setAdapter(adapter);

		grid.setOnItemClickListener(new OnItemClickListener() {
			public void onItemClick(AdapterView<?> parent, View v, int position, long id) {
			   Toast.makeText(getApplicationContext(),
				((TextView) v).getText(), Toast.LENGTH_SHORT).show();
			}
		});

		//setContentView(R.layout.activity_mark_attendance);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.mark_attendance, menu);
		return true;
	}

}
