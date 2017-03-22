package gorick.gradesprojectandroid.MVP.View;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import gorick.gradesprojectandroid.Dagger2.Component.DaggerUserLoginComponent;
import gorick.gradesprojectandroid.Dagger2.Component.UserLoginComponent;
import gorick.gradesprojectandroid.MVP.Presenter.Presenters.PreLoginPresenter;
import gorick.gradesprojectandroid.R;

public class PreLoginActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    @BindView(R.id.ra)
    EditText ra;
    @BindView(R.id.pass)
    EditText pass;

    Spinner spinner;

    String state;

    @Inject
    PreLoginPresenter preLoginPresenter;

    ArrayAdapter<CharSequence> arrayAdapterStates;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pre_login);
        ButterKnife.bind(this);

        spinner = (Spinner) findViewById(R.id.spinner);

        UserLoginComponent userLoginComponent = DaggerUserLoginComponent.builder()
                .build();

        preLoginPresenter = userLoginComponent.providePreLoginPresenter();
        //Now u instantiate to your activity
        userLoginComponent.injectPreLoginPresenterIntoPreLoginActivity(preLoginPresenter);

        //Intantiate spinner
        arrayAdapterStates = ArrayAdapter.createFromResource(this, R.array.opcoes, android.R.layout.simple_spinner_item);
        arrayAdapterStates.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(arrayAdapterStates);

        spinner.setOnItemSelectedListener(this);

    }

    @OnClick(R.id.sign_in)
    public void setSignIn() {
        String raReceived, passwordReceived;
        raReceived = ra.getText().toString().trim();
        passwordReceived = pass.getText().toString().trim();

        if (!(raReceived.equals("") || passwordReceived.equals("") || state.equals("--"))) {
            if (preLoginPresenter.login(raReceived, passwordReceived)){

                SharedPreferences sharedPreferences = PreLoginActivity.this.getSharedPreferences("text", PreLoginActivity.this.MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putString("ra", raReceived);
                editor.putString("password", passwordReceived);
                editor.apply();

                Intent intent = new Intent(this, MainActivity.class);
                startActivity(intent);

            } else {
                Toast.makeText(PreLoginActivity.this, "Login ou senha inválidos", Toast.LENGTH_LONG).show();
            }
        } else {
            Toast.makeText(getBaseContext(), "Preencha os campos", Toast.LENGTH_SHORT).show();
        }
    }

    @OnClick(R.id.forgot_pass)
    public void setForgotPass() {
        Toast.makeText(getBaseContext(), "Compareça a secretaria da sua escola.", Toast.LENGTH_LONG).show();
    }

    //Spinner states
    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        String TAG = "tag";
        Log.i(TAG, "onItemSelected: " + String.valueOf(parent.getItemAtPosition(position)));
        state = preLoginPresenter.onStateSelected(String.valueOf(parent.getItemAtPosition(position)));
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
