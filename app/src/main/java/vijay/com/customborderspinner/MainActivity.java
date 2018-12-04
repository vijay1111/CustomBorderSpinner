package vijay.com.customborderspinner;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import vijay.com.customborderspinner.helper.MaterialSpinner1;


public class MainActivity extends AppCompatActivity {
    MaterialSpinner1 spinner;
    private static final String[] ANDROID_VERSIONS = {
            "Cupcake", "Donut", "Eclair", "Froyo", "Gingerbread", "Honeycomb", "Ice Cream Sandwich", "Jelly Bean", "KitKat", "Lollipop", "Marshmallow", "Nougat", "Oreo"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinner = findViewById(R.id.spinner);
        spinner.setItems(ANDROID_VERSIONS);
        spinner.setOnItemSelectedListener(new MaterialSpinner1.OnItemSelectedListener<String>() {

            @Override
            public void onItemSelected(MaterialSpinner1 view, int position, long id, String item) {


            }

        });

    }

}
