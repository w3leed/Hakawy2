package waleed.we.hakawy;



import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;


public class spalsh extends AppCompatActivity {
    private  static  int splash_time_out=4000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent in = new Intent(spalsh.this,MainActivity.class);
                startActivity(in);
                finish();

            }
        },splash_time_out);

    }

}
