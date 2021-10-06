
	 
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


import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;

	public class screen1_activity extends Activity {

	
	private View _bg__screen1_ek2;
	private ImageView grafik_1_ek4;
	private View rectangle_1_ek4;
	private ImageView brilhon_1_ek4;
	private View rectangle_15;
	private ImageView subtract_ek14;
	private ImageView subtract_ek15;
	private ImageView subtract_ek16;
	private View rectangle_3;
	private View rectangle_16;
	private ImageView hakchen_zeichnen_2;
	private View rectangle_17;
	private View rectangle_18;
	private View rectangle_19;
	private View rectangle_20;
	private View rectangle_21;
	private View rectangle_22;
	private View rectangle_23;
	private TextView select_all_parameter;
	private ImageView motoren_2_ek1;
	private ImageView schlussel_2_ek1;
	private ImageView platzhalter_2_ek1;
	private ImageView sportwagen_2_ek1;
	private ImageView hakchen_zeichnen_1;
	private ImageView hakchen_zeichnen_3;
	private ImageView hakchen_zeichnen_4;

	byte p1 = 0;
	byte p2 = 0;
	byte p3 = 0;
	byte p4 = 0;

	private final OkHttpClient client = new OkHttpClient();


	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.screen1);


		_bg__screen1_ek2 = (View) findViewById(R.id._bg__screen1_ek2);
		//grafik_1_ek4 = (ImageView) findViewById(R.id.grafik_1_ek4);
		rectangle_1_ek4 = (View) findViewById(R.id.rectangle_1_ek4);
		brilhon_1_ek4 = (ImageView) findViewById(R.id.brilhon_1_ek4);
		rectangle_15 = (View) findViewById(R.id.rectangle_15);
		subtract_ek14 = (ImageView) findViewById(R.id.subtract_ek14);
		subtract_ek15 = (ImageView) findViewById(R.id.subtract_ek15);
		subtract_ek16 = (ImageView) findViewById(R.id.subtract_ek16);
		rectangle_3 = (View) findViewById(R.id.rectangle_3);
		rectangle_16 = (View) findViewById(R.id.rectangle_16);
		hakchen_zeichnen_2 = (ImageView) findViewById(R.id.hakchen_zeichnen_2);
		rectangle_17 = (View) findViewById(R.id.rectangle_17);
		rectangle_18 = (View) findViewById(R.id.rectangle_18);
		rectangle_19 = (View) findViewById(R.id.rectangle_19);
		rectangle_20 = (View) findViewById(R.id.rectangle_20);
		rectangle_21 = (View) findViewById(R.id.rectangle_21);
		rectangle_22 = (View) findViewById(R.id.rectangle_22);
		rectangle_23 = (View) findViewById(R.id.rectangle_23);
		select_all_parameter = (TextView) findViewById(R.id.select_all_parameter);
		motoren_2_ek1 = (ImageView) findViewById(R.id.motoren_2_ek1);
		schlussel_2_ek1 = (ImageView) findViewById(R.id.schlussel_2_ek1);
		platzhalter_2_ek1 = (ImageView) findViewById(R.id.platzhalter_2_ek1);
		sportwagen_2_ek1 = (ImageView) findViewById(R.id.sportwagen_2_ek1);
		hakchen_zeichnen_1 = (ImageView) findViewById(R.id.hakchen_zeichnen_1);
		hakchen_zeichnen_3 = (ImageView) findViewById(R.id.hakchen_zeichnen_3);
		hakchen_zeichnen_4 = (ImageView) findViewById(R.id.hakchen_zeichnen_4);

		// Hide confirmation
		hakchen_zeichnen_1.setVisibility(View.INVISIBLE);
		hakchen_zeichnen_2.setVisibility(View.INVISIBLE);
		hakchen_zeichnen_3.setVisibility(View.INVISIBLE);
		hakchen_zeichnen_4.setVisibility(View.INVISIBLE);

		// Post Command
		subtract_ek16.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {

				OkHttpClient clientpost = new OkHttpClient();
				MediaType JSON = MediaType.get("application/json; charset=utf-8");

				String command = PostRepsonse("1",1,0);
				String url = "http://138.201.180.81:49002/set_command";

				RequestBody body = RequestBody.create(command, JSON);
				okhttp3.Request request = new okhttp3.Request.Builder()
						.url(url)
						.post(body)
						.build();

				clientpost.newCall(request).enqueue(new Callback() {
					@Override
					public void onFailure(@NotNull Call call, @NotNull IOException e) {
						Log.d("Mess:","#########################################################");
						Log.d("Mess:","Failure");
					}

					@Override
					public void onResponse(@NotNull Call call, @NotNull Response response) throws IOException {
						Log.d("Mess:","#########################################################");
						Log.d("Mess", command);
						Log.d("Mess", response.body().string());
					}
				});
			}
		});

		// Close app
		subtract_ek15.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				finishAffinity();
				System.exit(0);
			}
		});

		// Car parameter
		rectangle_3.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				// Deactive parameter
				if (p1==1) {
					// Hide confirmation
					hakchen_zeichnen_1.setVisibility(View.INVISIBLE);
					p1 = 0;
				}
				// Activate parameter
				else {
					// Show configrmation
					hakchen_zeichnen_1.setVisibility(View.VISIBLE);
					p1 = 1;
				}
			}
		});

		// GPS parameter
		rectangle_16.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				// Deactive parameter
				if (p2==1) {
					hakchen_zeichnen_2.setVisibility(View.INVISIBLE);
					// Hide confirmation
					p2 = 0;
				}
				// Activate parameter
				else {
					// Show configrmation
					hakchen_zeichnen_2.setVisibility(View.VISIBLE);
					p2 = 1;
				}
			}
		});

		// Engine parameter
		rectangle_17.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				// Deactive parameter
				if (p3==1) {
					hakchen_zeichnen_3.setVisibility(View.INVISIBLE);
					// Hide confirmation
					p3 = 0;
				}
				// Activate parameter
				else {
					// Show configrmation
					hakchen_zeichnen_3.setVisibility(View.VISIBLE);
					p3 = 1;
				}
			}
		});

		// Maintanance parameter
		rectangle_18.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				// Deactive parameter
				if (p4==1) {
					hakchen_zeichnen_4.setVisibility(View.INVISIBLE);
					// Hide confirmation
					p4 = 0;
				}
				// Activate parameter
				else {
					// Show configrmation
					hakchen_zeichnen_4.setVisibility(View.VISIBLE);
					p4 = 1;
				}
			}
		});

		// Select all
		rectangle_23.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				// Set all paramter true
				p1 = 1;
				p2 = 1;
				p3 = 1;
				p4 = 1;
				// Show confirmation
				hakchen_zeichnen_1.setVisibility(View.VISIBLE);
				hakchen_zeichnen_2.setVisibility(View.VISIBLE);
				hakchen_zeichnen_3.setVisibility(View.VISIBLE);
				hakchen_zeichnen_4.setVisibility(View.VISIBLE);
			}
		});

		// Confirmation
		subtract_ek14.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {

				String urlrequest = "http://138.201.180.81:49002/car_database/get_parameters/p1="+String.valueOf(p1)+"&p2="+String.valueOf(p2)+"&p3="+String.valueOf(p3)+"&p4="+String.valueOf(p4);
				Request request = new Request.Builder()
						.url(urlrequest)
						.build();

				client.newCall(request).enqueue(new Callback() {
					@Override
					public void onFailure(@NotNull Call call, @NotNull IOException e) {

					}

					@Override
					public void onResponse(@NotNull Call call, @NotNull Response response) throws IOException {
						ResponseBody responseBody = response.body();
						String message = responseBody.string();
						try {
							JSONObject obj = new JSONObject(message);

							// Request Car Parameter
							if (p1==1) {
								JSONArray arr = obj.getJSONArray("car");
								for (int i = 0; i < arr.length(); i++) {
									String s1 = arr.getJSONObject(i).getString("locked");
									String s2 = arr.getJSONObject(i).getString("engine");
									String s3 = arr.getJSONObject(i).getString("light");

									if (s1.equals("true"))
										screen2_activity.locked = 1;
									else
										screen2_activity.locked = 0;

									if (s2.equals("true"))
										screen2_activity.engine = 1;
									else
										screen2_activity.engine = 0;

									if (s3.equals("true"))
										screen2_activity.light = 1;
									else
										screen2_activity.light = 0;

									screen2_activity.p1 = 1;
								}
							}
							else {
								screen2_activity.p1 = 0;
							}

							// Request gps Parameter
							if (p2==1) {
								JSONArray arr = obj.getJSONArray("gps");
								for (int i = 0; i < arr.length(); i++) {
									String s1 = arr.getJSONObject(i).getString("lat");
									String s2 = arr.getJSONObject(i).getString("lon");
									String s3 = arr.getJSONObject(i).getString("height");
									String s4 = arr.getJSONObject(i).getString("speed");

									screen2_activity.lattitude = Float.parseFloat(s1);
									screen2_activity.longitude = Float.parseFloat(s2);
									screen2_activity.height = Float.parseFloat(s3);
									screen2_activity.speed = Float.parseFloat(s4);

									screen2_activity.p2 = 1;
								}
							}
							else {
								screen2_activity.p2 = 0;
							}

							// Request engine  Parameter
							if (p3==1) {
								JSONArray arr = obj.getJSONArray("engine");
								for (int i = 0; i < arr.length(); i++) {
									String s1 = arr.getJSONObject(i).getString("rpm");
									String s2 = arr.getJSONObject(i).getString("temp");

									screen2_activity.rpm = Integer.parseInt(s1);
									screen2_activity.temp = Integer.parseInt(s2);

									screen2_activity.p3 = 1;
								}
							}
							else {
								screen2_activity.p3 = 0;
							}

							// Request maintance  Parameter
							if (p4==1) {
								JSONArray arr = obj.getJSONArray("maintenance");
								for (int i = 0; i < arr.length(); i++) {
									String s1 = arr.getJSONObject(i).getString("oil");
									String s2 = arr.getJSONObject(i).getString("engine");

									if (s1.equals("true"))
										screen2_activity.oilm = 1;
									else
										screen2_activity.oilm = 0;

									if (s2.equals("true"))
										screen2_activity.enginetemp = 1;
									else
										screen2_activity.enginetemp = 0;

									screen2_activity.p4 = 1;

								}
							}
							else {
								screen2_activity.p4 = 0;
							}
							Intent intent;
							intent = new Intent(v.getContext(), screen2_activity.class);
							startActivity(intent);
						} catch (JSONException e) {
							e.printStackTrace();
						}


					}
				});

			}
		});

	
	}
		String PostRepsonse(String carID, int cmd, int value) {
			return "{'"+carID+"':{'command_int':"+ cmd +", 'command_value':"+value+"}}";
		}
}
	