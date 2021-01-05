package com.example.map;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
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

//public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {
public class MapsActivity extends FragmentActivity {
//public class MapsActivity extends AppCompatActivity {

    //public static final String API_KEY_map = "AIzaSyCAYumamZGODLCMJH1lVtEIai6qSkGGi_Y";

    public static final String API_KEY1 = "AIzaSyDfpLhAh6x7VwCWOzmPVYRsLjiM4ZYJE1c";  //APIキー9 video1
    public static final String API_KEY2 = "AIzaSyAe5HZh70SjuIR12M9qusyPR-dOzSb_dCw";  //APIキー10 video2
    public static final String API_KEY3 = "AIzaSyBYI70DxljUAm6rBcV8p_I3zmBjg4Sbibs";    //APIキー11 video3
    public static final String API_KEY4 = "AIzaSyDIh0Ohakgcv2wuCm0isarw06tVLkk4sjo";    //APIキー12 video4
    public static final String API_KEY5 = "AIzaSyAmfg3dDX1v1bRaDatw-yjqXNyd_C06d-A";    //APIキー13 video5
    public static final String API_KEY6 = "AIzaSyC3bQAkpNdJ_8Oay48wHDHu0d_jJV2XkoU";    //APIキー15 video6

    public static final String VIDEO_ID = "CQ6dbUmU__o";

    public static final String VIDEO_ID1 = "I4BojnT4Zqo";         //浜比嘉島2
    public static final String VIDEO_ID2 = "8EZdi914dsU";         //薮地島
    public static final String VIDEO_ID3 = "XN_Gxf0d1oY";         //ウクの浜
    public static final String VIDEO_ID4 = "LOxURLadloE";      //アクナ浜
    public static final String VIDEO_ID5 = "AsKf_wNiqsc";    //white beach
    public static final String VIDEO_ID6 = "2ML7_q2Pksw&t=605s";   //white beach
    public static final String VIDEO_ID7 = "ZDKXsjWmZ4A";    //浜比嘉島1

    private GoogleMap mMap1;
    private GoogleMap mMap2;
    private GoogleMap mMap3;
    private GoogleMap mMap4;
    private GoogleMap mMap5;

//    private GoogleMap googleMap1;
//    private GoogleMap googleMap2;
//    private GoogleMap googleMap3;
//    private GoogleMap googleMap4;
//    private GoogleMap googleMap5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);

//        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        Log.i("log", "Main_onCreate");

        /**
         * 1
         */
        //video1
        YouTubePlayerFragment youTubePlayerFragment6 = (YouTubePlayerFragment) getFragmentManager()
                .findFragmentById(R.id.fragment6);

        youTubePlayerFragment6.initialize
                (
                        API_KEY6,
                        new YouTubePlayer.OnInitializedListener() {
                            @Override
                            public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean wasRestored) {
//                                youTubePlayer.setFullscreenControlFlags(YouTubePlayer.FULLSCREEN_FLAG_CONTROL_ORIENTATION |
//                                      YouTubePlayer.FULLSCREEN_FLAG_ALWAYS_FULLSCREEN_IN_LANDSCAPE);

                                youTubePlayer.setFullscreenControlFlags(YouTubePlayer.FULLSCREEN_FLAG_CONTROL_ORIENTATION );
//                                youTubePlayer.setFullscreenControlFlags(YouTubePlayer.FULLSCREEN_FLAG_ALWAYS_FULLSCREEN_IN_LANDSCAPE);

                                //   youTubePlayer.setFullscreenControlFlags(YouTubePlayer.FULLSCREEN_FLAG_CUSTOM_LAYOUT);


                                if (!wasRestored) {
                                    youTubePlayer.cueVideo(VIDEO_ID7);

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
        Log.i("log", "Main_onCreate_video1");
        //video1 ここまで

/**
 * 2
 */
        //video2
        YouTubePlayerFragment youTubePlayerFragment = (YouTubePlayerFragment) getFragmentManager()
                .findFragmentById(R.id.fragment1);

        youTubePlayerFragment.initialize
                (
                        API_KEY1,
                        new YouTubePlayer.OnInitializedListener() {
                            @Override
                            public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean wasRestored) {
//                                youTubePlayer.setFullscreenControlFlags(YouTubePlayer.FULLSCREEN_FLAG_CONTROL_ORIENTATION |
//                                      YouTubePlayer.FULLSCREEN_FLAG_ALWAYS_FULLSCREEN_IN_LANDSCAPE);

                                youTubePlayer.setFullscreenControlFlags(YouTubePlayer.FULLSCREEN_FLAG_CONTROL_ORIENTATION );
//                                youTubePlayer.setFullscreenControlFlags(YouTubePlayer.FULLSCREEN_FLAG_ALWAYS_FULLSCREEN_IN_LANDSCAPE);

                                //   youTubePlayer.setFullscreenControlFlags(YouTubePlayer.FULLSCREEN_FLAG_CUSTOM_LAYOUT);


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
        Log.i("log", "Main_onCreate_video2");
        //video2 ここまで


        /**
        //map1
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map1);
        mapFragment.getMapAsync(new OnMapReadyCallback() {
            @Override
            public void onMapReady(GoogleMap googleMap) {
                mMap1 = googleMap;

                // Add a marker in hamahiga and move the camera
                LatLng hamahiga = new LatLng(26.31283, 127.96045);
                mMap1.addMarker(new MarkerOptions().position(hamahiga).title("Marker in hamahiga"));
                mMap1.moveCamera(CameraUpdateFactory.newLatLng(hamahiga));

                //ズーム機能
                UiSettings us = mMap1.getUiSettings();
                us.setZoomControlsEnabled(true);

            }
        });
        Log.i("log", "Main_onCreate_map1");
        //map1ここまで

         **/

/**
 * 3
 */
        //video3
        YouTubePlayerFragment youTubePlayerFragment2 = (YouTubePlayerFragment) getFragmentManager()
                .findFragmentById(R.id.fragment2);

        youTubePlayerFragment2.initialize
                (
                        API_KEY2,
                        new YouTubePlayer.OnInitializedListener() {
                            @Override
                            public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean wasRestored) {
//                                youTubePlayer.setFullscreenControlFlags(YouTubePlayer.FULLSCREEN_FLAG_CONTROL_ORIENTATION |
//                                      YouTubePlayer.FULLSCREEN_FLAG_ALWAYS_FULLSCREEN_IN_LANDSCAPE);

                                youTubePlayer.setFullscreenControlFlags(YouTubePlayer.FULLSCREEN_FLAG_CONTROL_ORIENTATION );
//                                youTubePlayer.setFullscreenControlFlags(YouTubePlayer.FULLSCREEN_FLAG_ALWAYS_FULLSCREEN_IN_LANDSCAPE);

                                //   youTubePlayer.setFullscreenControlFlags(YouTubePlayer.FULLSCREEN_FLAG_CUSTOM_LAYOUT);


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
        Log.i("log", "Main_onCreate_video3");
        //video3 ここまで


        /**
        //map2
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        //26.322269,127.917837
        SupportMapFragment mapFragment2 = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map2);
        mapFragment2.getMapAsync(new OnMapReadyCallback() {
            @Override
            public void onMapReady(GoogleMap googleMap2) {
                mMap2 = googleMap2;

                // Add a marker in yabuchi and move the camera
                LatLng yabuchi = new LatLng(26.322269, 127.917837);
                mMap2.addMarker(new MarkerOptions().position(yabuchi).title("Marker in yabuchi"));
                mMap2.moveCamera(CameraUpdateFactory.newLatLng(yabuchi));

                //ズーム機能
                UiSettings us = mMap2.getUiSettings();
                us.setZoomControlsEnabled(true);

            }
        });
        Log.i("log", "Main_onCreate_map2");
        //map2ここまで
        */


        /**
         * 4
         */
        //video4
        YouTubePlayerFragment youTubePlayerFragment3 = (YouTubePlayerFragment) getFragmentManager()
                .findFragmentById(R.id.fragment3);

        youTubePlayerFragment3.initialize
                (
                        API_KEY3,
                        new YouTubePlayer.OnInitializedListener() {
                            @Override
                            public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean wasRestored) {
//                                youTubePlayer.setFullscreenControlFlags(YouTubePlayer.FULLSCREEN_FLAG_CONTROL_ORIENTATION |
//                                      YouTubePlayer.FULLSCREEN_FLAG_ALWAYS_FULLSCREEN_IN_LANDSCAPE);

                                youTubePlayer.setFullscreenControlFlags(YouTubePlayer.FULLSCREEN_FLAG_CONTROL_ORIENTATION );
//                                youTubePlayer.setFullscreenControlFlags(YouTubePlayer.FULLSCREEN_FLAG_ALWAYS_FULLSCREEN_IN_LANDSCAPE);

                                //   youTubePlayer.setFullscreenControlFlags(YouTubePlayer.FULLSCREEN_FLAG_CUSTOM_LAYOUT);

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
        Log.i("log", "Main_onCreate_video4");
        //video4 ここまで


        /**
        //map3
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        //26.367494617568482, 127.99358563080219
        SupportMapFragment mapFragment3 = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map3);
        mapFragment3.getMapAsync(new OnMapReadyCallback() {
            @Override
            public void onMapReady(GoogleMap googleMap3) {
                mMap3 = googleMap3;

                // Add a marker in uku and move the camera
                LatLng uku = new LatLng(26.367494617568482, 127.99358563080219);
                mMap3.addMarker(new MarkerOptions().position(uku).title("Marker in uku"));
                mMap3.moveCamera(CameraUpdateFactory.newLatLng(uku));

                //ズーム機能
                UiSettings us = mMap3.getUiSettings();
                us.setZoomControlsEnabled(true);

            }
        });
        Log.i("log", "Main_onCreate_map3");
        //map3ここまで
        */

        /**
         * 5
         */
        //video5
        YouTubePlayerFragment youTubePlayerFragment4 = (YouTubePlayerFragment) getFragmentManager()
                .findFragmentById(R.id.fragment4);

        youTubePlayerFragment4.initialize
                (
                        API_KEY4,
                        new YouTubePlayer.OnInitializedListener() {
                            @Override
                            public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean wasRestored) {
//                                youTubePlayer.setFullscreenControlFlags(YouTubePlayer.FULLSCREEN_FLAG_CONTROL_ORIENTATION |
//                                      YouTubePlayer.FULLSCREEN_FLAG_ALWAYS_FULLSCREEN_IN_LANDSCAPE);

                                youTubePlayer.setFullscreenControlFlags(YouTubePlayer.FULLSCREEN_FLAG_CONTROL_ORIENTATION );
//                                youTubePlayer.setFullscreenControlFlags(YouTubePlayer.FULLSCREEN_FLAG_ALWAYS_FULLSCREEN_IN_LANDSCAPE);

                                //   youTubePlayer.setFullscreenControlFlags(YouTubePlayer.FULLSCREEN_FLAG_CUSTOM_LAYOUT);

                                if (!wasRestored) {
                                    youTubePlayer.cueVideo(VIDEO_ID4);

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
        Log.i("log", "Main_onCreate_video5");
        //video5 ここまで

        /**
        //map4
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        //26.36386645542974, 127.994072544131
        SupportMapFragment mapFragment4 = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map4);
        mapFragment4.getMapAsync(new OnMapReadyCallback() {
            @Override
            public void onMapReady(GoogleMap googleMap4) {
                mMap4 = googleMap4;

                // Add a marker in akuna and move the camera
                LatLng akuna = new LatLng(26.36386645542974, 127.994072544131);
                mMap4.addMarker(new MarkerOptions().position(akuna).title("Marker in akuna"));
                mMap4.moveCamera(CameraUpdateFactory.newLatLng(akuna));

                //ズーム機能
                UiSettings us = mMap4.getUiSettings();
                us.setZoomControlsEnabled(true);
            }
        });
        Log.i("log", "Main_onCreate_map4");
        //map4ここまで
         */


        /**
         * 6
         */
        //video6
        YouTubePlayerFragment youTubePlayerFragment5 = (YouTubePlayerFragment) getFragmentManager()
                .findFragmentById(R.id.fragment5);

        youTubePlayerFragment5.initialize
                (
                        API_KEY5,
                        new YouTubePlayer.OnInitializedListener() {
                            @Override
                            public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean wasRestored) {
//                                youTubePlayer.setFullscreenControlFlags(YouTubePlayer.FULLSCREEN_FLAG_CONTROL_ORIENTATION |
//                                      YouTubePlayer.FULLSCREEN_FLAG_ALWAYS_FULLSCREEN_IN_LANDSCAPE);

                                youTubePlayer.setFullscreenControlFlags(YouTubePlayer.FULLSCREEN_FLAG_CONTROL_ORIENTATION );
//                                youTubePlayer.setFullscreenControlFlags(YouTubePlayer.FULLSCREEN_FLAG_ALWAYS_FULLSCREEN_IN_LANDSCAPE);

                             //   youTubePlayer.setFullscreenControlFlags(YouTubePlayer.FULLSCREEN_FLAG_CUSTOM_LAYOUT);

                                if (!wasRestored) {
                                    youTubePlayer.cueVideo(VIDEO_ID5);

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
        Log.i("log", "Main_onCreate_video6");
        //video6 ここまで

        /**
        //map5
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        //26.311742704026422, 127.89030250840678
        SupportMapFragment mapFragment5 = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map5);
        mapFragment5.getMapAsync(new OnMapReadyCallback() {
            @Override
            public void onMapReady(GoogleMap googleMap5) {
                mMap5 = googleMap5;

                // Add a marker in white beach and move the camera
                LatLng w_b = new LatLng(26.311742704026422, 127.89030250840678);
                mMap5.addMarker(new MarkerOptions().position(w_b).title("Marker in white beach"));
                mMap5.moveCamera(CameraUpdateFactory.newLatLng(w_b));

                //ズーム機能
                UiSettings us = mMap5.getUiSettings();
                us.setZoomControlsEnabled(true);
            }
        });
        Log.i("log", "Main_onCreate_map5");
        //map5ここまで
         */

    }



    /**
     * GoogleMapへのリンク
     */
    //1 hamahiga1
    public void button6_onClick(View view) {
        //26.32526839148512, 127.95127022462071
        Uri uri = Uri.parse("geo:26.32526839148512,127.95127022462071?q=浜比嘉ビーチ");

        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
    }

    //1 hamahiga2
    public void button1_onClick(View view) {
        // 26.31283,127.96045
        Uri uri = Uri.parse("geo:26.31283,127.96045?q=シルミチューの");

        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
    }

    //2 yabuchi
    public void button2_onClick(View view) {
        //26.322322676885126,127.91785436424348
        Uri uri = Uri.parse("geo:26.322269,127.917837?q=ヘーガニク");

        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
    }

    //3 uku
    public void button3_onClick(View view) {
    //26.367494617568482, 127.99358563080219
        Uri uri = Uri.parse("geo:26.367494617568482,127.99358563080219?q=ウクの浜");

        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
    }

    //4 アクナ浜
    public void button4_onClick(View view) {
    //26.36386645542974, 127.994072544131
        Uri uri = Uri.parse("geo:26.36386645542974,127.994072544131?q=アクナ浜");

        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
    }

    //5 white beach
    public void button5_onClick(View view) {
    //26.311742704026422, 127.89030250840678
        Uri uri = Uri.parse("geo:26.311742704026422,127.89030250840678?q=ホワイトビーチ");

        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
    }

}
