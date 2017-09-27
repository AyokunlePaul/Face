package i.am.eipeks.face;

import android.content.Intent;
import android.net.Uri;
import android.os.Environment;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.io.File;
import java.io.InputStream;

public class Main extends AppCompatActivity {

    private static final int REQUEST_CODE = 1010;
    private Uri capturedImageUri;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        takePicture();
    }

    private void takePicture(){
        File photo = new File(Environment.getExternalStorageDirectory(), "picture.jpg");
        startActivityForResult(new Intent(MediaStore.ACTION_IMAGE_CAPTURE).putExtra(MediaStore.EXTRA_OUTPUT, Uri.fromFile(photo)),
                REQUEST_CODE);
        capturedImageUri = Uri.fromFile(photo);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {

    }
}
