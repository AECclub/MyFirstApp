package comsci.alice.myfirstapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Detail extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        TextView titleTextView = (TextView) findViewById(R.id.txtTitleDetail);
        TextView detailTextview = (TextView) findViewById(R.id.txtDeailScroll);
        ImageView detailImageView = (ImageView) findViewById(R.id.imvlmageDetail);
        Button button = (Button) findViewById(R.id.btnBack);

        titleTextView.setText(getIntent().getStringExtra("Title"));
        detailTextview.setText(getIntent().getStringExtra("Detail"));
        detailImageView.setImageResource(getIntent().getIntExtra("Image",R.drawable.traffic_01));

        // รับข้อมูลจากเมนแอ็กคิววิตี้มาแสดงผลตรงดีเทล

        //อินทิเชี่ยววิว เป็นการผูกวิวในหน้าuiให้รู้จักตัวแปรในหน้าJava
    }// main method

    public void clickBack(View view) {
        finish();
    }
}//main class
