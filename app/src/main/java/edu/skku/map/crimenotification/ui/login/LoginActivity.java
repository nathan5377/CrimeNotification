package edu.skku.map.crimenotification.ui.login;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.lifecycle.ViewModelProvider;

import edu.skku.map.crimenotification.R;
import edu.skku.map.crimenotification.base.BaseActivity;
import edu.skku.map.crimenotification.databinding.ActivityLoginBinding;
import edu.skku.map.crimenotification.ui.home.HomeActivity;
import edu.skku.map.crimenotification.ui.register.RegisterActivity;

import dagger.hilt.android.AndroidEntryPoint;

@AndroidEntryPoint
public class LoginActivity extends BaseActivity {

    private LoginViewModel loginViewModel;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initUi();
        initViewModel();
    }

    private void initUi() {
        ((ActivityLoginBinding) getBinding()).inputPassLogin.setOnEditorActionListener((v, actionId, event) -> {
            if (actionId == EditorInfo.IME_ACTION_DONE) {
                loginViewModel.login();
                return true;
            } else {
                return false;
            }
        });
    }

    private void initViewModel() {
        loginViewModel = new ViewModelProvider(this).get(LoginViewModel.class);
        ((ActivityLoginBinding) getBinding()).setViewModel(loginViewModel);

        loginViewModel.getViewStateLiveData().observe(LoginActivity.this, viewState -> {
            if (viewState instanceof LoginViewState) {
                onChangedViewState((LoginViewState) viewState);
            }
        });
    }

    private void onChangedViewState(LoginViewState viewState) {
        if (viewState instanceof LoginViewState.RouteRegister) {
            Intent intent = new Intent(LoginActivity.this, RegisterActivity.class);
            startActivity(intent);
        } else if (viewState instanceof LoginViewState.RouteHome) {
            Intent intent = new Intent(LoginActivity.this, HomeActivity.class);
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
            startActivity(intent);
        } else if (viewState instanceof LoginViewState.Error) {
            Toast.makeText(this, ((LoginViewState.Error) viewState).getMessage(), Toast.LENGTH_SHORT).show();
        } else if (viewState instanceof LoginViewState.EnableInput) {
            ((ActivityLoginBinding) getBinding()).inputEmailLogin.setEnabled(((LoginViewState.EnableInput) viewState).isEnable());
            ((ActivityLoginBinding) getBinding()).inputPassLogin.setEnabled(((LoginViewState.EnableInput) viewState).isEnable());
        } else if (viewState instanceof LoginViewState.ShowProgress) {
            ((ActivityLoginBinding) getBinding()).progressbar.bringToFront();
            ((ActivityLoginBinding) getBinding()).progressbar.setVisibility(View.VISIBLE);
        } else if (viewState instanceof LoginViewState.HideProgress) {
            ((ActivityLoginBinding) getBinding()).progressbar.setVisibility(View.GONE);
        }
    }


    public LoginActivity() {
        super(R.layout.activity_login);
        this.setBinding((ActivityLoginBinding) this.getBinding());
    }
}
