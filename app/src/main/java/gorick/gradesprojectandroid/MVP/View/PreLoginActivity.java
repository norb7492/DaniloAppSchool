package gorick.gradesprojectandroid.MVP.View;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import gorick.gradesprojectandroid.R;

public class PreLoginActivity extends AppCompatActivity {

    @BindView(R.id.ra)
    EditText ra;
    @BindView(R.id.pass)
    EditText pass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pre_login);
        ButterKnife.bind(this);

    }

    @OnClick(R.id.sign_in)
    public void sign_in() {
        //methods from presenter
    }

    @OnClick(R.id.forgot_pass)
    public void forgot_pass() {
        //methods from presenter
    }

}
