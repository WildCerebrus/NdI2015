package ndi2015.fr.ndi2015;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by scrutch on 04/12/15.
 */
public class AddPerson extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.add_person);

        Intent intent = getIntent();
        String[] str = intent.getStringExtra(MainActivity.EXTRA_MESSAGE).split("/");
        TextView t1 = (TextView)findViewById(R.id.textView3);
        TextView t2 = (TextView)findViewById(R.id.textView4);
        TextView t3 = (TextView)findViewById(R.id.textView5);
        t1.setText(str[0]);
        t2.setText(str[1]);
        t3.setText(str[2]+str[3]);

        Button b1 = (Button)findViewById(R.id.button2);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AddPerson.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
