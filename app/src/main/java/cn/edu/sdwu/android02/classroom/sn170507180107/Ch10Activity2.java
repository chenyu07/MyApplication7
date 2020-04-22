package cn.edu.sdwu.android02.classroom.sn170507180107;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Ch10Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_ch10_2);

    }
    public void send_broadcast(View view){
        //发送广播
        Intent intent=new Intent("com.inspur.broadcast");
        intent.putExtra("key1","message");
        sendBroadcast(intent);//发送


    }
    public void startSubActivity(View view){
        Intent intent=new Intent(this,Ch10Activity3.class);
        startActivityForResult(intent,101);
    }
    public void ch10Activity(View view){
        Intent intent=new Intent(this,Ch10Activity1.class);
        EditText editText=(EditText)findViewById(R.id.ch10_2_et);
        intent.putExtra("text",editText.getText().toString());
        startActivity(intent);
    }
}
