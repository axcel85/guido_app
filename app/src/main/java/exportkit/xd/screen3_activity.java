
	 
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
import android.os.Bundle;


import android.view.View;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentActivity;

import com.google.android.gms.maps.MapView;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;


import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.MarkerOptions;

	public class screen3_activity extends FragmentActivity implements OnMapReadyCallback {

	
	private View _bg__screen3_ek2;
	private ImageView grafik_1_ek2;
	private View rectangle_1_ek2;
	private ImageView brilhon_1_ek2;
	private MapView mMapView;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.screen3);

		
		_bg__screen3_ek2 = (View) findViewById(R.id._bg__screen3_ek2);
		grafik_1_ek2 = (ImageView) findViewById(R.id.grafik_1_ek2);
		rectangle_1_ek2 = (View) findViewById(R.id.rectangle_1_ek2);
		brilhon_1_ek2 = (ImageView) findViewById(R.id.brilhon_1_ek2);

		// Get the SupportMapFragment and request notification when the map is ready to be used.
		SupportMapFragment mapFragment = (SupportMapFragment) this.getSupportFragmentManager().findFragmentById(R.id.map);
		mapFragment.getMapAsync(this);


	}

		@Override
		public void onMapReady(GoogleMap googleMap) {
			// [START_EXCLUDE silent]
			// Add a marker in Sydney, Australia,
			// and move the map's camera to the same location.
			// [END_EXCLUDE]

			MarkerOptions marker = new MarkerOptions().position( new LatLng(-33.852, 151.211)).title("Car");

			marker.icon(BitmapDescriptorFactory.fromResource(R.drawable.sportwagen_black));
			marker.snippet("Population: 4,137,400\n Hallo");

			googleMap.addMarker(marker);
			googleMap.moveCamera(CameraUpdateFactory.newLatLng(new LatLng(-33.852, 151.211)));

			CameraPosition cameraPosition = new CameraPosition.Builder()
					.target(new LatLng(-33.852, 151.211))
					.zoom(17).build();

			googleMap.animateCamera(CameraUpdateFactory.newCameraPosition(cameraPosition));
			// [END_EXCLUDE]
		}
	}
	
	