package com.example.sistemas.rusia;

import android.Manifest;
import android.content.Context;
import android.content.pm.PackageManager;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

/**
 * A simple {@link Fragment} subclass.
 */

public class Mapa extends FragmentActivity implements OnMapReadyCallback {

    public Mapa() {
        // Required empty public constructor
    }

    private GoogleMap mMap;
    public Marker marcador;
    public double lat = 0.0;
    public double lon = 0.0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mapa);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        Bundle bundle = getIntent().getExtras();
        int lugar = bundle.getInt("lugar");

        switch (lugar) {
            case 1:
                LatLng sydney = new LatLng(54.6981568, 20.53385879999996);
                mMap.addMarker(new MarkerOptions().position(sydney).title("Kaliningrad Stadium"));
                mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(sydney, 15));
                mMap.getUiSettings().setZoomControlsEnabled(true);
                mMap.getUiSettings().setZoomGesturesEnabled(true);
                mMap.setMapType(googleMap.MAP_TYPE_NORMAL);
                break;

            case 2:
                LatLng sydney2 = new LatLng(59.97304699999999, 30.220246599999996);
                mMap.addMarker(new MarkerOptions().position(sydney2).title("St. Petersburg Stadium"));
                mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(sydney2, 15));
                mMap.getUiSettings().setZoomControlsEnabled(true);
                mMap.getUiSettings().setZoomGesturesEnabled(true);
                mMap.setMapType(googleMap.MAP_TYPE_NORMAL);
                break;

            case 3:
                LatLng sydney3 = new LatLng(5.7188138, 37.5547934);
                mMap.addMarker(new MarkerOptions().position(sydney3).title("Estadio de Loujniki"));
                mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(sydney3, 15));
                mMap.getUiSettings().setZoomControlsEnabled(true);
                mMap.getUiSettings().setZoomGesturesEnabled(true);
                mMap.setMapType(googleMap.MAP_TYPE_NORMAL);
                break;

            case 4:
                LatLng sydney4 = new LatLng(47.20994160000001, 39.737528800000064);
                mMap.addMarker(new MarkerOptions().position(sydney4).title("Rostov Arena"));
                mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(sydney4, 15));
                mMap.getUiSettings().setZoomControlsEnabled(true);
                mMap.getUiSettings().setZoomGesturesEnabled(true);
                mMap.setMapType(googleMap.MAP_TYPE_NORMAL);
                break;

            case 5:
                LatLng sydney5 = new LatLng(43.4020114, 39.9557088999999);
                mMap.addMarker(new MarkerOptions().position(sydney5).title("Estadio Olímpico de Sochi"));
                mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(sydney5, 15));
                mMap.getUiSettings().setZoomControlsEnabled(true);
                mMap.getUiSettings().setZoomGesturesEnabled(true);
                mMap.setMapType(googleMap.MAP_TYPE_NORMAL);
                break;

            case 6:
                LatLng sydney6 = new LatLng(48.7345394, 44.548254799999995);
                mMap.addMarker(new MarkerOptions().position(sydney6).title("Volgogrado Arena"));
                mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(sydney6, 15));
                mMap.getUiSettings().setZoomControlsEnabled(true);
                mMap.getUiSettings().setZoomGesturesEnabled(true);
                mMap.setMapType(googleMap.MAP_TYPE_NORMAL);
                break;

            case 7:
                LatLng sydney7 = new LatLng(54.181867, 45.203711);
                mMap.addMarker(new MarkerOptions().position(sydney7).title("Mordovia Arena"));
                mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(sydney7, 15));
                mMap.getUiSettings().setZoomControlsEnabled(true);
                mMap.getUiSettings().setZoomGesturesEnabled(true);
                mMap.setMapType(googleMap.MAP_TYPE_NORMAL);
                break;

            case 8:
                LatLng sydney8 = new LatLng(56.3375844, 43.96321050000006);
                mMap.addMarker(new MarkerOptions().position(sydney8).title("Stadion Nizhny Novgorod"));
                mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(sydney8, 15));
                mMap.getUiSettings().setZoomControlsEnabled(true);
                mMap.getUiSettings().setZoomGesturesEnabled(true);
                mMap.setMapType(googleMap.MAP_TYPE_NORMAL);
                break;

            case 9:
                LatLng sydney9 = new LatLng(55.82096259999999, 49.16063099999997);
                mMap.addMarker(new MarkerOptions().position(sydney9).title("Kazan Arena"));
                mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(sydney9, 15));
                mMap.getUiSettings().setZoomControlsEnabled(true);
                mMap.getUiSettings().setZoomGesturesEnabled(true);
                mMap.setMapType(googleMap.MAP_TYPE_NORMAL);
                break;

            case 10:
                LatLng sydney10 = new LatLng(53.2779394, 50.23758539999994);
                mMap.addMarker(new MarkerOptions().position(sydney10).title("Kosmos Arena"));
                mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(sydney10, 15));
                mMap.getUiSettings().setZoomControlsEnabled(true);
                mMap.getUiSettings().setZoomGesturesEnabled(true);
                mMap.setMapType(googleMap.MAP_TYPE_NORMAL);
                break;

            case 11:
                LatLng sydney11 = new LatLng(56.8324733, 60.57358350000004);
                mMap.addMarker(new MarkerOptions().position(sydney11).title("Estadio Central"));
                mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(sydney11, 15));
                mMap.getUiSettings().setZoomControlsEnabled(true);
                mMap.getUiSettings().setZoomGesturesEnabled(true);
                mMap.setMapType(googleMap.MAP_TYPE_NORMAL);
                break;

            case 12:
                LatLng sydney12 = new LatLng(55.8155031, 37.4364917);
                mMap.addMarker(new MarkerOptions().position(sydney12).title("Otkrytie Arena"));
                mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney12));
                mMap.getUiSettings().setZoomControlsEnabled(true);
                mMap.getUiSettings().setZoomGesturesEnabled(true);
                mMap.setMapType(googleMap.MAP_TYPE_NORMAL);
                break;

            case 13:
                LatLng sydney13 = new LatLng(54.6981568, 20.53385879999996);
                mMap.addMarker(new MarkerOptions().position(sydney13).title("Kaliningrad Stadium"));
                mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney13));

                LatLng sydney14 = new LatLng(59.97304699999999, 30.220246599999996);
                mMap.addMarker(new MarkerOptions().position(sydney14).title("St. Petersburg Stadium"));
                mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney14));

                LatLng sydney15 = new LatLng(55.715765,37.551527);
                mMap.addMarker(new MarkerOptions().position(sydney15).title("Estadio de Loujniki"));
                mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney15));

                LatLng sydney16 = new LatLng(47.20994160000001, 39.737528800000064);
                mMap.addMarker(new MarkerOptions().position(sydney16).title("Rostov Arena"));
                mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney16));

                LatLng sydney17 = new LatLng(43.4020114, 39.9557088999999);
                mMap.addMarker(new MarkerOptions().position(sydney17).title("Estadio Olímpico de Sochi"));
                mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney17));

                LatLng sydney18 = new LatLng(48.7345394, 44.548254799999995);
                mMap.addMarker(new MarkerOptions().position(sydney18).title("Volgogrado Arena"));
                mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney18));

                LatLng sydney19 = new LatLng(54.181867, 45.203711);
                mMap.addMarker(new MarkerOptions().position(sydney19).title("Mordovia Arena"));
                mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney19));

                LatLng sydney20 = new LatLng(56.3375844, 43.96321050000006);
                mMap.addMarker(new MarkerOptions().position(sydney20).title("Stadion Nizhny Novgorod"));
                mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney20));

                LatLng sydney21 = new LatLng(55.82096259999999, 49.16063099999997);
                mMap.addMarker(new MarkerOptions().position(sydney21).title("Kazan Arena"));
                mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney21));

                LatLng sydney22 = new LatLng(53.2779394, 50.23758539999994);
                mMap.addMarker(new MarkerOptions().position(sydney22).title("Kosmos Arena"));
                mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney22));

                LatLng sydney23 = new LatLng(56.8324733, 60.57358350000004);
                mMap.addMarker(new MarkerOptions().position(sydney23).title("Estadio Central"));
                mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney23));

                LatLng sydney24 = new LatLng(55.8155031, 37.4364917);
                mMap.addMarker(new MarkerOptions().position(sydney24).title("Otkrytie Arena"));
                mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney24));

                mMap.getUiSettings().setZoomControlsEnabled(true);
                mMap.getUiSettings().setZoomGesturesEnabled(true);
                mMap.setMapType(googleMap.MAP_TYPE_NORMAL);
                break;
        }
    }

    public void agregarmark(double lat, double lon) {
        LatLng coor = new LatLng(lat, lon);
        CameraUpdate miubicacion = CameraUpdateFactory.newLatLngZoom(coor, 16);
        if (marcador != null) marcador.remove();
        {
            marcador = mMap.addMarker(new MarkerOptions().position(coor).title("tu estas aqui"));
            mMap.animateCamera(miubicacion);
        }
    }

    LocationListener locListe = new LocationListener() {
        @Override
        public void onLocationChanged(Location location) {
            actualizarubicacion(location);
        }

        @Override
        public void onStatusChanged(String s, int i, Bundle bundle) {

        }

        @Override
        public void onProviderEnabled(String s) {

        }

        @Override
        public void onProviderDisabled(String s) {

        }
    };

    public void actualizarubicacion(Location location) {
        if (location != null) {
            lat = location.getLatitude();
            lon = location.getLongitude();
            agregarmark(lat, lon);

        }
    }

    private void ub() {

        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
            return;
        }
        LocationManager locma = (LocationManager) getSystemService(Context.LOCATION_SERVICE);
        Location loca = locma.getLastKnownLocation(LocationManager.GPS_PROVIDER);
        actualizarubicacion(loca);
        locma.requestLocationUpdates(LocationManager.GPS_PROVIDER,15000,0,locListe);
    }
}
