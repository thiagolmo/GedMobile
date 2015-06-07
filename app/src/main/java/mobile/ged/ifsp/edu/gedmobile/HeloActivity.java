package mobile.ged.ifsp.edu.gedmobile;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

/**
 * Created by Thiago on 30/05/2015.
 */
public class HeloActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_helo);
    }
    public void onEntrar (View v) {
        Intent intent = new Intent(this,LoginActivity.class);
        startActivity(intent);

    }
    public void onCadastrar (View v) {
        Intent intent = new Intent(this,CadastroActivity.class);
        startActivity(intent);

    }
}
