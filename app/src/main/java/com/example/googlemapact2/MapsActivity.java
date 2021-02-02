package com.example.googlemapact2;

import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // APVNHS Riego Rovelyn
        LatLng StoTomas = new LatLng(15.870465, 120.571128);
        mMap.addMarker(new MarkerOptions().position(StoTomas).title("Santo Tomas"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(StoTomas));
        LatLng Apv = new LatLng(15.877838556713254, 120.58145435445837);
        mMap.addMarker(new MarkerOptions().position(Apv).title("Antonio P. Villar National "));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Apv));




        //UCNHS Raymond Pablo
        LatLng Nancalobasan = new LatLng(16.001862052804643, 120.61098819895534);
        mMap.addMarker(new MarkerOptions().position(Nancalobasan).title("Nancalobasan"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Nancalobasan));
        LatLng Ucnhs = new LatLng(15.978707479524926, 120.56320614252176);
        mMap.addMarker(new MarkerOptions().position(Ucnhs).title("Urdaneta City National High School "));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Ucnhs));



        //Mataas na paaralan ng Juan C Laya ,Kristan Pacetes
        LatLng SanManuel = new LatLng(16.082435464544428, 120.68073157793239);
        mMap.addMarker(new MarkerOptions().position(SanManuel).title("San Manuel"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(SanManuel));

        LatLng Laya = new LatLng(16.063915380053032, 120.66544648275188);
        mMap.addMarker(new MarkerOptions().position(Laya).title("Mataas na Paaralan ng Juan C Laya"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Laya));

        //Saura John Michael
        LatLng Matulong = new LatLng(15.991995230709788, 120.49144335638519);
        mMap.addMarker(new MarkerOptions().position(Matulong).title("Matulong"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Matulong));







    }
}
