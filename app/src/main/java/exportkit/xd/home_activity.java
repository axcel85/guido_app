
	 
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


import android.util.DisplayMetrics;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

	public class home_activity extends Activity {

	
	private View _bg__home_ek2;
	private ImageView grafik_1;
	private View rectangle_1;
	private ImageView brilhon_1;
	private View rectangle_2;
	private View ellipse_6;
	private View ellipse_5;
	private View ellipse_4;
	private TextView enter_your_pin;
	private View ellipse_3;
	private View ellipse_7;
	private View ellipse_8;
	private View ellipse_9;
	private View ellipse_10;
	private View ellipse_11;
	private View ellipse_12;
	private View ellipse_13;
	private View ellipse_14;
	private ImageView subtract;
	private ImageView subtract_ek1;
	private ImageView subtract_ek2;
	private ImageView subtract_ek3;
	private ImageView subtract_ek4;
	private ImageView subtract_ek5;
	private ImageView subtract_ek6;
	private ImageView subtract_ek7;
	private ImageView subtract_ek8;
	private ImageView subtract_ek9;
	private ImageView subtract_ek10;
	private ImageView subtract_ek11;

	// Code
	byte c1 = 0;
	byte c2 = 0;
	byte c3 = 0;
	byte c4 = 0;
	byte digits = 0;


	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.home);

		
		_bg__home_ek2 = (View) findViewById(R.id._bg__home_ek2);
		//grafik_1 = (ImageView) findViewById(R.id.grafik_1);
		rectangle_1 = (View) findViewById(R.id.rectangle_1);
		brilhon_1 = (ImageView) findViewById(R.id.brilhon_1);
		rectangle_2 = (View) findViewById(R.id.rectangle_2);
		ellipse_6 = (View) findViewById(R.id.ellipse_6);
		ellipse_5 = (View) findViewById(R.id.ellipse_5);
		ellipse_4 = (View) findViewById(R.id.ellipse_4);
		enter_your_pin = (TextView) findViewById(R.id.enter_your_pin);
		ellipse_3 = (View) findViewById(R.id.ellipse_3);
		ellipse_7 = (View) findViewById(R.id.ellipse_7);
		ellipse_8 = (View) findViewById(R.id.ellipse_8);
		ellipse_9 = (View) findViewById(R.id.ellipse_9);
		ellipse_10 = (View) findViewById(R.id.ellipse_10);
		ellipse_11 = (View) findViewById(R.id.ellipse_11);
		ellipse_12 = (View) findViewById(R.id.ellipse_12);
		ellipse_13 = (View) findViewById(R.id.ellipse_13);
		ellipse_14 = (View) findViewById(R.id.ellipse_14);
		subtract = (ImageView) findViewById(R.id.subtract);
		subtract_ek1 = (ImageView) findViewById(R.id.subtract_ek1);
		subtract_ek2 = (ImageView) findViewById(R.id.subtract_ek2);
		subtract_ek3 = (ImageView) findViewById(R.id.subtract_ek3);
		subtract_ek4 = (ImageView) findViewById(R.id.subtract_ek4);
		subtract_ek5 = (ImageView) findViewById(R.id.subtract_ek5);
		subtract_ek6 = (ImageView) findViewById(R.id.subtract_ek6);
		subtract_ek7 = (ImageView) findViewById(R.id.subtract_ek7);
		subtract_ek8 = (ImageView) findViewById(R.id.subtract_ek8);
		subtract_ek9 = (ImageView) findViewById(R.id.subtract_ek9);
		subtract_ek10 = (ImageView) findViewById(R.id.subtract_ek10);
		subtract_ek11 = (ImageView) findViewById(R.id.subtract_ek11);

		// Hide red dots
		ellipse_11.setVisibility(View.INVISIBLE);
		ellipse_12.setVisibility(View.INVISIBLE);
		ellipse_13.setVisibility(View.INVISIBLE);
		ellipse_14.setVisibility(View.INVISIBLE);

		// Hide black dots
		ellipse_7.setVisibility(View.INVISIBLE);
		ellipse_8.setVisibility(View.INVISIBLE);
		ellipse_9.setVisibility(View.INVISIBLE);
		ellipse_10.setVisibility(View.INVISIBLE);

		// TextView Listener Key 1
		subtract.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				// Code digit 1
				if (digits == 0) {
					// increase numer of digits
					digits++;
					// set first code digit
					c1 = 1;
					// show input
					ellipse_7.setVisibility(View.VISIBLE);
				}
				else if (digits == 1) {
					// increase numer of digits
					digits++;
					// set second code digit
					c2 = 1;
					// show input
					ellipse_8.setVisibility(View.VISIBLE);
				}
				else if (digits == 2) {
					// increase numer of digits
					digits++;
					// set thrid code digit
					c3 = 1;
					// show input
					ellipse_10.setVisibility(View.VISIBLE);
				}
				else if (digits == 3) {
					// increase numer of digits
					digits++;
					// set fourth code digit
					c4 = 1;
					// show input
					ellipse_9.setVisibility(View.VISIBLE);
					// check correctnes
					checkCode();
				}
			}
		});

		// TextView Listener Key 2
		subtract_ek1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				// Code digit 1
				if (digits == 0) {
					// increase numer of digits
					digits++;
					// set first code digit
					c1 = 2;
					// show input
					ellipse_7.setVisibility(View.VISIBLE);
				}
				else if (digits == 1) {
					// increase numer of digits
					digits++;
					// set second code digit
					c2 = 2;
					// show input
					ellipse_8.setVisibility(View.VISIBLE);
				}
				else if (digits == 2) {
					// increase numer of digits
					digits++;
					// set thrid code digit
					c3 = 2;
					// show input
					ellipse_10.setVisibility(View.VISIBLE);
				}
				else if (digits == 3) {
					// increase numer of digits
					digits++;
					// set fourth code digit
					c4 = 2;
					// show input
					ellipse_9.setVisibility(View.VISIBLE);
					// check correctnes
					checkCode();
				}
			}
		});

		// TextView Listener Key 3
		subtract_ek2.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				// Code digit 1
				if (digits == 0) {
					// increase numer of digits
					digits++;
					// set first code digit
					c1 = 3;
					// show input
					ellipse_7.setVisibility(View.VISIBLE);
				}
				else if (digits == 1) {
					// increase numer of digits
					digits++;
					// set second code digit
					c2 = 3;
					// show input
					ellipse_8.setVisibility(View.VISIBLE);
				}
				else if (digits == 2) {
					// increase numer of digits
					digits++;
					// set thrid code digit
					c3 = 3;
					// show input
					ellipse_10.setVisibility(View.VISIBLE);
				}
				else if (digits == 3) {
					// increase numer of digits
					digits++;
					// set fourth code digit
					c4 = 3;
					// show input
					ellipse_9.setVisibility(View.VISIBLE);
					// check correctnes
					checkCode();
				}
			}
		});

		// TextView Listener Key 4
		subtract_ek3.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				// Code digit 1
				if (digits == 0) {
					// increase numer of digits
					digits++;
					// set first code digit
					c1 = 4;
					// show input
					ellipse_7.setVisibility(View.VISIBLE);
				}
				else if (digits == 1) {
					// increase numer of digits
					digits++;
					// set second code digit
					c2 = 4;
					// show input
					ellipse_8.setVisibility(View.VISIBLE);
				}
				else if (digits == 2) {
					// increase numer of digits
					digits++;
					// set thrid code digit
					c3 = 4;
					// show input
					ellipse_10.setVisibility(View.VISIBLE);
				}
				else if (digits == 3) {
					// increase numer of digits
					digits++;
					// set fourth code digit
					c4 = 4;
					// show input
					ellipse_9.setVisibility(View.VISIBLE);
					// check correctnes
					checkCode();
				}
			}
		});

		// TextView Listener Key 5
		subtract_ek4.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				// Code digit 1
				if (digits == 0) {
					// increase numer of digits
					digits++;
					// set first code digit
					c1 = 5;
					// show input
					ellipse_7.setVisibility(View.VISIBLE);
				}
				else if (digits == 1) {
					// increase numer of digits
					digits++;
					// set second code digit
					c2 = 5;
					// show input
					ellipse_8.setVisibility(View.VISIBLE);
				}
				else if (digits == 2) {
					// increase numer of digits
					digits++;
					// set thrid code digit
					c3 = 5;
					// show input
					ellipse_10.setVisibility(View.VISIBLE);
				}
				else if (digits == 3) {
					// increase numer of digits
					digits++;
					// set fourth code digit
					c4 = 5;
					// show input
					ellipse_9.setVisibility(View.VISIBLE);
					// check correctnes
					checkCode();
				}
			}
		});

		// TextView Listener Key 6
		subtract_ek5.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				// Code digit 1
				if (digits == 0) {
					// increase numer of digits
					digits++;
					// set first code digit
					c1 = 6;
					// show input
					ellipse_7.setVisibility(View.VISIBLE);
				}
				else if (digits == 1) {
					// increase numer of digits
					digits++;
					// set second code digit
					c2 = 6;
					// show input
					ellipse_8.setVisibility(View.VISIBLE);
				}
				else if (digits == 2) {
					// increase numer of digits
					digits++;
					// set thrid code digit
					c3 = 6;
					// show input
					ellipse_10.setVisibility(View.VISIBLE);
				}
				else if (digits == 3) {
					// increase numer of digits
					digits++;
					// set fourth code digit
					c4 = 6;
					// show input
					ellipse_9.setVisibility(View.VISIBLE);
					// check correctnes
					checkCode();
				}
			}
		});

		// TextView Listener Key 7
		subtract_ek6.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				// Code digit 1
				if (digits == 0) {
					// increase numer of digits
					digits++;
					// set first code digit
					c1 = 7;
					// show input
					ellipse_7.setVisibility(View.VISIBLE);
				}
				else if (digits == 1) {
					// increase numer of digits
					digits++;
					// set second code digit
					c2 = 7;
					// show input
					ellipse_8.setVisibility(View.VISIBLE);
				}
				else if (digits == 2) {
					// increase numer of digits
					digits++;
					// set thrid code digit
					c3 = 7;
					// show input
					ellipse_10.setVisibility(View.VISIBLE);
				}
				else if (digits == 3) {
					// increase numer of digits
					digits++;
					// set fourth code digit
					c4 = 7;
					// show input
					ellipse_9.setVisibility(View.VISIBLE);
					// check correctnes
					checkCode();
				}
			}
		});

		// TextView Listener Key 8
		subtract_ek7.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				// Code digit 1
				if (digits == 0) {
					// increase numer of digits
					digits++;
					// set first code digit
					c1 = 8;
					// show input
					ellipse_7.setVisibility(View.VISIBLE);
				}
				else if (digits == 1) {
					// increase numer of digits
					digits++;
					// set second code digit
					c2 = 8;
					// show input
					ellipse_8.setVisibility(View.VISIBLE);
				}
				else if (digits == 2) {
					// increase numer of digits
					digits++;
					// set thrid code digit
					c3 = 8;
					// show input
					ellipse_10.setVisibility(View.VISIBLE);
				}
				else if (digits == 3) {
					// increase numer of digits
					digits++;
					// set fourth code digit
					c4 = 8;
					// show input
					ellipse_9.setVisibility(View.VISIBLE);
					// check correctnes
					checkCode();
				}
			}
		});

		// TextView Listener Key 9
		subtract_ek9.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				// Code digit 1
				if (digits == 0) {
					// increase numer of digits
					digits++;
					// set first code digit
					c1 = 9;
					// show input
					ellipse_7.setVisibility(View.VISIBLE);
				}
				else if (digits == 1) {
					// increase numer of digits
					digits++;
					// set second code digit
					c2 = 9;
					// show input
					ellipse_8.setVisibility(View.VISIBLE);
				}
				else if (digits == 2) {
					// increase numer of digits
					digits++;
					// set thrid code digit
					c3 = 9;
					// show input
					ellipse_10.setVisibility(View.VISIBLE);
				}
				else if (digits == 3) {
					// increase numer of digits
					digits++;
					// set fourth code digit
					c4 = 9;
					// show input
					ellipse_9.setVisibility(View.VISIBLE);
					// check correctnes
					checkCode();
				}
			}
		});

		// TextView Listener Key 0
		subtract_ek8.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				// Code digit 1
				if (digits == 0) {
					// increase numer of digits
					digits++;
					// set first code digit
					c1 = 0;
					// show input
					ellipse_7.setVisibility(View.VISIBLE);
				}
				else if (digits == 1) {
					// increase numer of digits
					digits++;
					// set second code digit
					c2 = 0;
					// show input
					ellipse_8.setVisibility(View.VISIBLE);
				}
				else if (digits == 2) {
					// increase numer of digits
					digits++;
					// set thrid code digit
					c3 = 0;
					// show input
					ellipse_10.setVisibility(View.VISIBLE);
				}
				else if (digits == 3) {
					// increase numer of digits
					digits++;
					// set fourth code digit
					c4 = 0;
					// show input
					ellipse_9.setVisibility(View.VISIBLE);
					// check correctnes
					checkCode();
				}
			}
		});

		// TextView Listener Clear
		subtract_ek10.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				// Code digit 1
				if (digits == 4) {
					// Cancel red dots
					ellipse_11.setVisibility(View.INVISIBLE);
					ellipse_12.setVisibility(View.INVISIBLE);
					ellipse_13.setVisibility(View.INVISIBLE);
					ellipse_14.setVisibility(View.INVISIBLE);
					// decrease numer of digits
					digits--;
					// hide input
					ellipse_9.setVisibility(View.INVISIBLE);
				}
				else if (digits == 3) {
					// decrease numer of digits
					digits--;
					// hide input
					ellipse_10.setVisibility(View.INVISIBLE);
				}
				else if (digits == 2) {
					// decrease numer of digits
					digits--;
					// hide input
					ellipse_8.setVisibility(View.INVISIBLE);
				}
				else if (digits == 1) {
					// decrease numer of digits
					digits--;
					// hide input
					ellipse_7.setVisibility(View.INVISIBLE);
				}
			}
		});

	}

	private void checkCode() {
		if ((c1==2) && (c2==0)  && (c3==1) && (c4==8)) {
			Intent intent;
			intent = new Intent(this, screen1_activity.class);
			startActivity(intent);
		}
		else {
			ellipse_11.setVisibility(View.VISIBLE);
			ellipse_12.setVisibility(View.VISIBLE);
			ellipse_13.setVisibility(View.VISIBLE);
			ellipse_14.setVisibility(View.VISIBLE);
		}

	}
}
	
	