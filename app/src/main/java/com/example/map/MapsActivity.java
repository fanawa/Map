package com.example.map;

import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.UiSettings;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerFragment;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    //public static final String API_KEY_map = "AIzaSyCAYumamZGODLCMJH1lVtEIai6qSkGGi_Y";

    public static final String API_KEY = "AIzaSyDfpLhAh6x7VwCWOzmPVYRsLjiM4ZYJE1c";  //APIキー9
    public static final String API_KEY2 = "AIzaSyAe5HZh70SjuIR12M9qusyPR-dOzSb_dCw";  //APIキー10
    public static final String API_KEY3 = "AIzaSyBYI70DxljUAm6rBcV8p_I3zmBjg4Sbibs";    //APIキー11
    public static final String API_KEY4 = "AIzaSyDIh0Ohakgcv2wuCm0isarw06tVLkk4sjo";    //APIキー12
    public static final String API_KEY5 = "AIzaSyAmfg3dDX1v1bRaDatw-yjqXNyd_C06d-A";    //APIキー13

    public static final String VIDEO_ID = "CQ6dbUmU__o";

    public static final String VIDEO_ID1 = "I4BojnT4Zqo";         //浜比嘉島
    public static final String VIDEO_ID2 = "8EZdi914dsU";         //薮地島
    public static final String VIDEO_ID3 = "XN_Gxf0d1oY";         //ウクの浜
    public static final String VIDEO_ID4 = "LOxURLadloE&t=1s";         //アクナ浜
    public static final String VIDEO_ID5 ="AsKf_wNiqsc&t=26s";    //white beach


    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);

/**
 * 1
 */
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
                                    youTubePlayer.cueVideo(VIDEO_ID1);

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

        //map1
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map1);
        mapFragment.getMapAsync(this);
        //map1ここまで

/**
 * 2
 */
        //video2
        YouTubePlayerFragment youTubePlayerFragment2 = (YouTubePlayerFragment) getFragmentManager()
                .findFragmentById(R.id.fragment2);

        youTubePlayerFragment2.initialize
                (
                        API_KEY2,
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
        //video2 ここまで

        //map2
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment2 = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map2);
        mapFragment2.getMapAsync(this);
        //map2ここまで

        /**
         * 3
         */
        //video3
        YouTubePlayerFragment youTubePlayerFragment3 = (YouTubePlayerFragment) getFragmentManager()
                .findFragmentById(R.id.fragment3);

        youTubePlayerFragment3.initialize
                (
                        API_KEY3,
                        new YouTubePlayer.OnInitializedListener() {
                            @Override
                            public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean wasRestored) {
                                youTubePlayer.setFullscreenControlFlags(YouTubePlayer.FULLSCREEN_FLAG_CONTROL_ORIENTATION |
                                        YouTubePlayer.FULLSCREEN_FLAG_ALWAYS_FULLSCREEN_IN_LANDSCAPE);

                                if (!wasRestored) {
                                    youTubePlayer.cueVideo(VIDEO_ID3);

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
        //video3 ここまで

        //map3
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment3 = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map3);
        mapFragment.getMapAsync(this);
        //map1ここまで



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
        LatLng sydney = new LatLng(26.31283, 127.96045);
        mMap.addMarker(new MarkerOptions().position(sydney).title("Marker in Sydney"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney));

        //ズーム機能
        UiSettings us = mMap.getUiSettings();
        us.setZoomControlsEnabled(true);





    }
}