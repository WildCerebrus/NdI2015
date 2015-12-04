package ndi2015.fr.ndi2015;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    public final static String EXTRA_MESSAGE = "MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText e1 = (EditText)findViewById(R.id.textView);
        final EditText e2 = (EditText)findViewById(R.id.textView2);
        final Spinner dropdown = (Spinner)findViewById(R.id.spinner);
        final Spinner dropdown2 = (Spinner)findViewById(R.id.spinner2);
        String[] items = new String[]{"", "A", "O","B","AB"};
        String[] items2 = new String[]{"", "+", "-"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, items);
        ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, items2);
        dropdown.setAdapter(adapter);
        dropdown2.setAdapter(adapter2);

        Button b1 = (Button)findViewById(R.id.button);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Spinner dropdown = (Spinner)findViewById(R.id.spinner);
                final Spinner dropdown2 = (Spinner)findViewById(R.id.spinner2);
                System.out.println("////////////////////////////////////////////////"+String.valueOf(dropdown.getSelectedItem()));
                Intent intent = new Intent(MainActivity.this, AddPerson.class);
                intent.putExtra(EXTRA_MESSAGE, e1.getText()+"/"+e2.getText()+"/"+String.valueOf(dropdown.getSelectedItem())+"/"+String.valueOf(dropdown2.getSelectedItem()));
                startActivity(intent);
            }
        });
    }
}
