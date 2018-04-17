package andbas.ch10sysbroadcast;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button btEnd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buildViews();  //user define
    }
    private void buildViews() {
        btEnd = (Button) this.findViewById(R.id.btIdEnd);
        btEnd.setOnClickListener(btEndListener);
    }
    private View.OnClickListener btEndListener =
            new View.OnClickListener() {
                public void onClick(View v) {
                    System.exit(0);
                }
            };
}
