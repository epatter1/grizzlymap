package edu.ggc.epatter1.grizzlymap;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

//import com.google.android.gms.appindexing.Action;
//import com.google.android.gms.appindexing.AppIndex;
//import com.google.android.gms.common.api.GoogleApiClient;

public class MainActivity extends AppCompatActivity {

    //references- http://stackoverflow.com/questions/7873480/android-one-onclick-method-for-multiple-buttons
//   http://stackoverflow.com/questions/25905086/multiple-buttons-onclicklistener-android
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        ImageButton areaMap = (ImageButton) findViewById(R.id.btnAreaMap);
       areaMap.setOnClickListener(new View.OnClickListener() {

                public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Area_map.class));
            }
        });
//        ImageButton campusMap = (ImageButton) findViewById(R.id.btnCampusMap);
//        campusMap.setOnClickListener(new View.OnClickListener() {
//
//            @Override
//            public void onClick(View v) {
//                startActivity(new Intent(MainActivity.this, Campus_map.class));
//            }
//        });
//
//        ImageButton about = (ImageButton) findViewById(R.id.btnAbout);
//        about.setOnClickListener(new View.OnClickListener() {
//
//            @Override
//            public void onClick(View v) {
//                startActivity(new Intent(MainActivity.this,  About.class));
//            }
//        });









    }
}

//package edu.ggc.epatter1.grizzlymap;
//
//        import android.content.Intent;
//        import android.net.Uri;
//        import android.os.Bundle;
//        import android.support.design.widget.FloatingActionButton;
//        import android.support.design.widget.Snackbar;
//        import android.support.v7.app.AppCompatActivity;
//        import android.support.v7.widget.Toolbar;
//        import android.view.View;
//        import android.view.Menu;
//        import android.view.MenuItem;
//        import android.widget.Button;
//        import android.widget.ImageButton;
//        import android.widget.ImageView;
//
//        import com.google.android.gms.appindexing.Action;
//        import com.google.android.gms.appindexing.AppIndex;
//        import com.google.android.gms.common.api.GoogleApiClient;
//
//public class MainActivity extends AppCompatActivity {
//
//    //references- http://stackoverflow.com/questions/7873480/android-one-onclick-method-for-multiple-buttons
//    //http://stackoverflow.com/questions/25905086/multiple-buttons-onclicklistener-android
//
//    /**
//     * ATTENTION: This was auto-generated to implement the App Indexing API.
//     * See https://g.co/AppIndexing/AndroidStudio for more information.
//     */
//    private GoogleApiClient client;
//
//
//
//
//
////        ImageButton areaMap = (ImageButton) findViewById(R.id.btnAreaMap);
////        areaMap.setOnClickListener(new View.OnClickListener() {
//
//    View.OnClickListener onClickListener = new View.OnClickListener() {
//        @Override
//        public void onClick(View v) {
//
//
//            switch (v.getId()) {
//                case R.id.btnAreaMap:
//                    startActivity(new Intent(MainActivity.this, Area_map.class));
//                    break;
//                case R.id.btnCampusMap:
//                    startActivity(new Intent(MainActivity.this, Campus_map.class));
//                    break;
//                case R.id.btnAbout:
//                    startActivity(new Intent(MainActivity.this, About.class));
//                    break;
//            }
//
//        }
//
//
//    };
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//
//
//        setContentView(R.layout.activity_main);
//
////        ImageButton campusMap = (ImageButton) findViewById(R.id.btnCampusMap);
////        campusMap.setOnClickListener(new View.OnClickListener() {
////
////            @Override
////            public void onClick(View v) {
////                startActivity(new Intent(MainActivity.this, Campus_map.class));
////            }
////        });
////
////        ImageButton about = (ImageButton) findViewById(R.id.btnAbout);
////        about.setOnClickListener(new View.OnClickListener() {
////
////            @Override
////            public void onClick(View v) {
////                startActivity(new Intent(MainActivity.this,  About.class));
////            }
////        });
////
////
////
////
////
////
////
////
////
//    }
//    // ATTENTION: This was auto-generated to implement the App Indexing API.
//    // See https://g.co/AppIndexing/AndroidStudio for more information.
//    client = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();
//}
//
//    @Override
//    public void onStart() {
//        super.onStart();
//
//        // ATTENTION: This was auto-generated to implement the App Indexing API.
//        // See https://g.co/AppIndexing/AndroidStudio for more information.
//        client.connect();
//        Action viewAction = Action.newAction(
//                Action.TYPE_VIEW, // TODO: choose an action type.
//                "Main Page", // TODO: Define a title for the content shown.
//                // TODO: If you have web page content that matches this app activity's content,
//                // make sure this auto-generated web page URL is correct.
//                // Otherwise, set the URL to null.
//                Uri.parse("http://host/path"),
//                // TODO: Make sure this auto-generated app deep link URI is correct.
//                Uri.parse("android-app://edu.ggc.epatter1.grizzlymap/http/host/path")
//        );
//        AppIndex.AppIndexApi.start(client, viewAction);
//    }
//
//    @Override
//    public void onStop() {
//        super.onStop();
//
//        // ATTENTION: This was auto-generated to implement the App Indexing API.
//        // See https://g.co/AppIndexing/AndroidStudio for more information.
//        Action viewAction = Action.newAction(
//                Action.TYPE_VIEW, // TODO: choose an action type.
//                "Main Page", // TODO: Define a title for the content shown.
//                // TODO: If you have web page content that matches this app activity's content,
//                // make sure this auto-generated web page URL is correct.
//                // Otherwise, set the URL to null.
//                Uri.parse("http://host/path"),
//                // TODO: Make sure this auto-generated app deep link URI is correct.
//                Uri.parse("android-app://edu.ggc.epatter1.grizzlymap/http/host/path")
//        );
//        AppIndex.AppIndexApi.end(client, viewAction);
//        client.disconnect();
//    }
