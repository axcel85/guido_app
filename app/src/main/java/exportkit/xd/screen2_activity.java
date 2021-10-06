
	 
	/*
	 *	This content is generated from the API File Info.
	 *	(Alt+Shift+Ctrl+I).
	 *
	 *	@desc 		
	 *	@file 		home
	 *	@date 		1633125670290
	 *	@title 		Page 1
	 *	@author 	
	 *	@keywords 	
	 *	@generator 	Export Kit v1.3.figma
	 *
	 */
	

package exportkit.xd;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;


import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class screen2_activity extends Activity {

	// Car data
	static byte p1 = 0;
	static byte locked;
	static byte engine;
	static byte light;

	// GPS data
	static byte p2 = 0;
	static float lattitude;
	static float longitude;
	static float height;
	static float speed;

	// engine data
	static byte p3 = 0;
	static int rpm;
	static int temp;

	// Car data
	static byte p4 = 0;
	static byte oilm;
	static byte enginetemp;
	
	private View _bg__screen2_ek2;
	private ImageView grafik_1_ek3;
	private View rectangle_1_ek3;
	private ImageView brilhon_1_ek3;
	private View rectangle_24;
	private ImageView subtract_ek12;
	private View rectangle_25;
	private TextView value1;
	private View rectangle_26;
	private View rectangle_27;
	private View rectangle_28;
	private ImageView pfeilwinkel_nach_unten_1;
	private TextView parameter1;
	private TextView value2;
	private TextView parameter2;
	private TextView value3;
	private TextView parameter3;
	private TextView value4;
	private TextView parameter4;
	private ImageView subtract_ek13;
	private ImageView platzhalter_2;
	private ImageView sportwagen_2;
	private ImageView schlussel_2;
	private ImageView motoren_2;
	private ImageView pfeilwinkel_nach_oben_1;

	int counter;
	int pos = 0;
	String[][] DataList;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.screen2);

		
		_bg__screen2_ek2 = (View) findViewById(R.id._bg__screen2_ek2);
		//grafik_1_ek3 = (ImageView) findViewById(R.id.grafik_1_ek3);
		rectangle_1_ek3 = (View) findViewById(R.id.rectangle_1_ek3);
		brilhon_1_ek3 = (ImageView) findViewById(R.id.brilhon_1_ek3);
		rectangle_24 = (View) findViewById(R.id.rectangle_24);
		subtract_ek12 = (ImageView) findViewById(R.id.subtract_ek12);
		rectangle_25 = (View) findViewById(R.id.rectangle_25);
		value1 = (TextView) findViewById(R.id.value1);
		rectangle_26 = (View) findViewById(R.id.rectangle_26);
		rectangle_27 = (View) findViewById(R.id.rectangle_27);
		rectangle_28 = (View) findViewById(R.id.rectangle_28);
		pfeilwinkel_nach_unten_1 = (ImageView) findViewById(R.id.pfeilwinkel_nach_unten_1);
		parameter1 = (TextView) findViewById(R.id.parameter1);
		value2 = (TextView) findViewById(R.id.value2);
		parameter2 = (TextView) findViewById(R.id.parameter2);
		value3 = (TextView) findViewById(R.id.value3);
		parameter3 = (TextView) findViewById(R.id.parameter3);
		value4 = (TextView) findViewById(R.id.value4);
		parameter4 = (TextView) findViewById(R.id.parameter4);
		subtract_ek13 = (ImageView) findViewById(R.id.subtract_ek13);
		platzhalter_2 = (ImageView) findViewById(R.id.platzhalter_2);
		sportwagen_2 = (ImageView) findViewById(R.id.sportwagen_2);
		schlussel_2 = (ImageView) findViewById(R.id.schlussel_2);
		motoren_2 = (ImageView) findViewById(R.id.motoren_2);
		pfeilwinkel_nach_oben_1 = (ImageView) findViewById(R.id.pfeilwinkel_nach_oben_1);

		initData();
		repaint();

		// Forgot Access Listener
		subtract_ek13.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent intent;
				counter = counter+ 1;
				intent = new Intent(v.getContext(), screen1_activity.class);
				startActivity(intent);
			}
		});

		// Close app
		subtract_ek12.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				finishAffinity();
				System.exit(0);
			}
		});

		// Scroll up
		pfeilwinkel_nach_oben_1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				if (pos>0) {
					pos = pos - 1;
					repaint();
				}
			}
		});

		// Scroll down
		pfeilwinkel_nach_unten_1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				if (pos<(counter-4)) {
					pos = pos + 1;
					repaint();
				}
			}
		});


	}

	public void repaint() {
		parameter1.setText(DataList[1][pos]);
		value1.setText(DataList[2][pos]);
		if (DataList[0][pos] == "p1")
			platzhalter_2.setImageResource(R.drawable.sportwagen_2);
		else if (DataList[0][pos] == "p2")
			platzhalter_2.setImageResource(R.drawable.platzhalter_2);
		else if (DataList[0][pos] == "p3")
			platzhalter_2.setImageResource(R.drawable.motoren_2);
		else
			platzhalter_2.setImageResource(R.drawable.schlussel_2);

		parameter2.setText(DataList[1][pos+1]);
		value2.setText(DataList[2][pos+1]);
		if (DataList[0][pos+1] == "p1")
			sportwagen_2.setImageResource(R.drawable.sportwagen_2);
		else if (DataList[0][pos+1] == "p2")
			sportwagen_2.setImageResource(R.drawable.platzhalter_2);
		else if (DataList[0][pos+1] == "p3")
			sportwagen_2.setImageResource(R.drawable.motoren_2);
		else
			sportwagen_2.setImageResource(R.drawable.schlussel_2);

		if (counter>2) {
			pfeilwinkel_nach_oben_1.setVisibility(View.VISIBLE);
			pfeilwinkel_nach_unten_1.setVisibility(View.VISIBLE);
			parameter3.setVisibility(View.VISIBLE);
			value3.setVisibility(View.VISIBLE);
			schlussel_2.setVisibility(View.VISIBLE);
			rectangle_27.setVisibility(View.VISIBLE);
			parameter3.setText(DataList[1][pos+2]);
			value3.setText(DataList[2][pos+2]);
			if (DataList[0][pos+2] == "p1")
				schlussel_2.setImageResource(R.drawable.sportwagen_2);
			else if (DataList[0][pos+2] == "p2")
				schlussel_2.setImageResource(R.drawable.platzhalter_2);
			else if (DataList[0][pos+2] == "p3")
				schlussel_2.setImageResource(R.drawable.motoren_2);
			else
				schlussel_2.setImageResource(R.drawable.schlussel_2);

		}
		else {
			parameter3.setVisibility(View.INVISIBLE);
			value3.setVisibility(View.INVISIBLE);
			schlussel_2.setVisibility(View.INVISIBLE);
			rectangle_27.setVisibility(View.INVISIBLE);
			pfeilwinkel_nach_oben_1.setVisibility(View.INVISIBLE);
			pfeilwinkel_nach_unten_1.setVisibility(View.INVISIBLE);
		}

		if (counter>3) {
			pfeilwinkel_nach_oben_1.setVisibility(View.VISIBLE);
			pfeilwinkel_nach_unten_1.setVisibility(View.VISIBLE);
			parameter4.setVisibility(View.VISIBLE);
			value4.setVisibility(View.VISIBLE);
			motoren_2.setVisibility(View.VISIBLE);
			rectangle_28.setVisibility(View.VISIBLE);
			parameter4.setText(DataList[1][pos+3]);
			value4.setText(DataList[2][pos+3]);
			if (DataList[0][pos+3] == "p1")
				motoren_2.setImageResource(R.drawable.sportwagen_2);
			else if (DataList[0][pos+3] == "p2")
				motoren_2.setImageResource(R.drawable.platzhalter_2);
			else if (DataList[0][pos+3] == "p3")
				motoren_2.setImageResource(R.drawable.motoren_2);
			else
				motoren_2.setImageResource(R.drawable.schlussel_2);

		}
		else {
			parameter4.setVisibility(View.INVISIBLE);
			value4.setVisibility(View.INVISIBLE);
			motoren_2.setVisibility(View.INVISIBLE);
			rectangle_28.setVisibility(View.INVISIBLE);
			pfeilwinkel_nach_oben_1.setVisibility(View.INVISIBLE);
			pfeilwinkel_nach_unten_1.setVisibility(View.INVISIBLE);
		}

		if (counter>4) {
			pfeilwinkel_nach_oben_1.setVisibility(View.VISIBLE);
			pfeilwinkel_nach_unten_1.setVisibility(View.VISIBLE);
		}
		else {
			pfeilwinkel_nach_oben_1.setVisibility(View.INVISIBLE);
			pfeilwinkel_nach_unten_1.setVisibility(View.INVISIBLE);
		}

		//Log.d(TAG, "counter" + counter);


	}

	public void initData() {
		counter = 0;
		if (p1==1) {
			counter = counter + 3;
		}
		if (p2==1) {
			counter = counter + 4;
		}
		if (p3==1) {
			counter = counter + 2;
		}
		if (p4==1) {
			counter = counter + 2;
		}

		DataList = new String[3][counter];

		int counter2 = 0;
		if (p1==1) {
			DataList[0][counter2] = "p1";
			DataList[1][counter2] = "Car locked";
			if (locked == 1) {
				DataList[2][counter2] = "positive";
			}
			else {
				DataList[2][counter2] = "negative";
			}
			counter2 = counter2 + 1;

			DataList[0][counter2] = "p1";
			DataList[1][counter2] = "Engine running";
			if (engine == 1) {
				DataList[2][counter2] = "positive";
			}
			else {
				DataList[2][counter2] = "negative";
			}
			counter2 = counter2 + 1;

			DataList[0][counter2] = "p1";
			DataList[1][counter2] = "Lights on";
			if (light == 1) {
				DataList[2][counter2] = "positive";
			}
			else {
				DataList[2][counter2] = "negative";
			}
			counter2 = counter2 + 1;
		}

		if (p2==1) {
			DataList[0][counter2] = "p2";
			DataList[1][counter2] = "Lattitude";
			DataList[2][counter2] = String.valueOf(lattitude);
			counter2 = counter2 + 1;

			DataList[0][counter2] = "p2";
			DataList[1][counter2] = "Longitude";
			DataList[2][counter2] = String.valueOf(longitude);
			counter2 = counter2 + 1;

			DataList[0][counter2] = "p2";
			DataList[1][counter2] = "Height";
			DataList[2][counter2] = String.valueOf(height);
			counter2 = counter2 + 1;

			DataList[0][counter2] = "p2";
			DataList[1][counter2] = "Speed";
			DataList[2][counter2] = String.valueOf(speed);
			counter2 = counter2 + 1;
		}

		if (p3==1) {
			DataList[0][counter2] = "p3";
			DataList[1][counter2] = "RPM";
			DataList[2][counter2] = String.valueOf(rpm);
			counter2 = counter2 + 1;

			DataList[0][counter2] = "p3";
			DataList[1][counter2] = "Engine temp";
			DataList[2][counter2] = String.valueOf(temp);
			counter2 = counter2 + 1;
		}

		if (p4==1) {
			DataList[0][counter2] = "p4";
			DataList[1][counter2] = "Refill oil";
			if (oilm== 1) {
				DataList[2][counter2] = "positive";
			}
			else {
				DataList[2][counter2] = "negative";
			}
			counter2 = counter2 + 1;

			DataList[0][counter2] = "p4";
			DataList[1][counter2] = "Engine check";
			if (enginetemp == 1) {
				DataList[2][counter2] = "positive";
			}
			else {
				DataList[2][counter2] = "negative";
			}
		}
	}
}
	
	