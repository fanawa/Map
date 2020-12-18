package com.example.map;

import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerFragment;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    //public static final String API_KEY_map = "AIzaSyCAYumamZGODLCMJH1lVtEIai6qSkGGi_Y";

    public static final String API_KEY = "AIzaSyDfpLhAh6x7VwCWOzmPVYRsLjiM4ZYJE1c";  //APIキー9
    public static final String API_KEY2 = "AIzaSyBttLfs4-WNNgqOBSMMKeY9NN7jPmvUJto";  //APIキー7
    public static final String API_KEY3 = "";
    public static final String API_KEY4 = "";

    public static final String VIDEO_ID = "CQ6dbUmU__o";
    public static final String VIDEO_ID1 ="AsKf_wNiqsc&t=26s";    //white beach
    public static final String VIDEO_ID2 = "I4BojnT4Zqo";         //浜比嘉島
    public static final String VIDEO_ID3 = "8EZdi914dsU";         //薮地島
    public static final String VIDEO_ID4 = "XN_Gxf0d1oY";         //ウクの浜
    public static final String VIDEO_ID5 = "LOxURLadloE";         //アクナ浜


    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);


        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map1);
        mapFragment.getMapAsync(this);


        //video1
        YouTubePlayerFragment youTubePlayerFragment = (YouTubePlayerFragment) getFragmentManager()
                .findFragmentById(R.id.fragment1);

        youTubePlayerFragment.initialize
                (
                        API_KEY,
                        new YouTubePlayer.OnInitializedListener() {
                            @Override
                            public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean wasRestored) {
                                youTubePlayer.setFullscreenControlFlags(YouTubePlayer.FULLSCREEN_FLAG_CONTROL_ORIENTATION |
                                        YouTubePlayer.FULLSCREEN_FLAG_ALWAYS_FULLSCREEN_IN_LANDSCAPE);

                                if (!wasRestored) {
                                    youTubePlayer.cueVideo(VIDEO_ID2);

                                    Log.i("log", "onInitializationSuccess");
                                }
                            }

                            @Override
                            public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult error) {
                                final int REQUEST_CODE = 1;

                                if (error.isUserRecoverableError()) {
                                    error.getErrorDialog(MapsActivity.this, REQUEST_CODE).show();
                                } else {
                                    String errorMessage = String.format("There was an error initializing the YoutubePlayer (%1$s)", error.toString());
                                    Toast.makeText(MapsActivity.this, errorMessage, Toast.LENGTH_LONG).show();
                                }
                            }
                        }
                );
        //video1 ここまで



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

        // Add a marker in Sydney and move the camera
        LatLng sydney = new LatLng(-34, 151);
        mMap.addMarker(new MarkerOptions().position(sydney).title("Marker in Sydney"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney));
    }
}