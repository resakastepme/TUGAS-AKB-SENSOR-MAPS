package com.stepme.a10120132_resakomaraakbari;
// NIM: 10120132
// NAMA: RESA KOMARA AKBARI
// KELAS: IF4
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsFragment extends Fragment {

    private OnMapReadyCallback callback = new OnMapReadyCallback() {

        /**
         * Manipulates the map once available.
         * This callback is triggered when the map is ready to be used.
         * This is where we can add markers or lines, add listeners or move the camera.
         * In this case, we just add a marker near Sydney, Australia.
         * If Google Play services is not installed on the device, the user will be prompted to
         * install it inside the SupportMapFragment. This method will only be triggered once the
         * user has installed Google Play services and returned to the app.
         */

        @Override
        public void onMapReady(GoogleMap googleMap) {
            LatLng alamat = new LatLng(-6.912764, 107.638162);
            googleMap.addMarker(new MarkerOptions().position(alamat).title("Alamat saya"));
            googleMap.moveCamera(CameraUpdateFactory.newLatLng(alamat));

            LatLng makan1 = new LatLng(-6.911704, 107.637388);
            googleMap.addMarker(new MarkerOptions().position(makan1).title("Tempat favorit 1"));
            googleMap.moveCamera(CameraUpdateFactory.newLatLng(makan1));

            LatLng makan2 = new LatLng(-6.913649, -6.913649);
            googleMap.addMarker(new MarkerOptions().position(makan2).title("Tempat favorit 2"));
            googleMap.moveCamera(CameraUpdateFactory.newLatLng(makan2));

            LatLng makan3 = new LatLng(-6.912645, 107.635378);
            googleMap.addMarker(new MarkerOptions().position(makan3).title("Tempat favorit 3"));
            googleMap.moveCamera(CameraUpdateFactory.newLatLng(makan3));

            LatLng makan4 = new LatLng(-6.913175, 107.632827);
            googleMap.addMarker(new MarkerOptions().position(makan4).title("Tempat favorit 4"));
            googleMap.moveCamera(CameraUpdateFactory.newLatLng(makan4));

            LatLng makan5 = new LatLng(-6.912932, 107.634236);
            googleMap.addMarker(new MarkerOptions().position(makan5).title("Tempat favorit 5"));
            googleMap.moveCamera(CameraUpdateFactory.newLatLng(makan5));

        }
    };

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_maps, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        SupportMapFragment mapFragment =
                (SupportMapFragment) getChildFragmentManager().findFragmentById(R.id.map);
        if (mapFragment != null) {
            mapFragment.getMapAsync(callback);
        }
    }
}