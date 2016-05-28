package com.example.admin.downloadfile;

import android.app.Activity;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.graphics.drawable.Drawable;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Environment;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.util.AsyncListUtil;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.io.BufferedInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

/**
 * Created by Admin on 5/21/2016.
 */
public class AndroidDownloadFileByProgressBarActivity extends Activity {
/*    Button btn_process;
    private ProgressDialog dialog;
    ImageView img;
    private static final int process_bar_type = 0;
    private static final String file_url = "https://pixabay.com/static/uploads/photo/2012/05/29/00/43/car-49278_960_720.jpg";

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_process = (Button) findViewById(R.id.btn_process);
        img = (ImageView) findViewById(R.id.img);
        btn_process.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new DownloadFileFromURL().execute(file_url);
            }
        });
    }

    @Override
    protected Dialog onCreateDialog(int id) {
        switch (id) {
            case process_bar_type:
                dialog = new ProgressDialog(this);
                dialog.setMessage("Downloading file. Wait....");
                dialog.setIndeterminate(false);
                dialog.setMax(100);
                dialog.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);
                dialog.setCancelable(true);
                dialog.show();
                return dialog;
            default:
                return null;
        }
    }

    class DownloadFileFromURL extends AsyncTask<String, String, String>{
        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            showDialog(process_bar_type);
        }

        @Override
        protected String doInBackground(String... f_url) {
            int count;
            try {
                URL url = new URL(f_url[0]);
                URLConnection connection = url.openConnection();
                connection.connect();
                int lengthOfFile = connection.getContentLength();
                InputStream input = new BufferedInputStream(url.openStream(), 9000);
                OutputStream output = new FileOutputStream("/sdcard/image.jpg");
                byte data[] = new byte[1024];
                long total = 0;
                while ((count = input.read(data)) != -1){
                    total = total+count;
                    publishProgress("" + (int)((total*100)/lengthOfFile));
                    output.write(data, 0, count);
                }
                output.flush();
                output.close();
                input.close();
            } catch (MalformedURLException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return null;
        }

        @Override
        protected void onProgressUpdate(String... progress) {
            dialog.setProgress(Integer.parseInt(progress[0]));
        }

        @Override
        protected void onPostExecute(String file_url) {
            dismissDialog(process_bar_type);

            String imgpath = Environment.getExternalStorageDirectory().toString()+"/image.jpg";
            img.setImageDrawable(Drawable.createFromPath(imgpath));
        }
    }*/
}
