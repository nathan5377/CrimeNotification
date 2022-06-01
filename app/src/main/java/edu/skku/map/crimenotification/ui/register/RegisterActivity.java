package edu.skku.map.crimenotification.ui.register;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.lifecycle.ViewModelProvider;

import edu.skku.map.crimenotification.R;
import edu.skku.map.crimenotification.base.BaseActivity;
import edu.skku.map.crimenotification.databinding.ActivityRegisterBinding;
import edu.skku.map.crimenotification.ui.home.HomeActivity;

import dagger.hilt.android.AndroidEntryPoint;

@AndroidEntryPoint
public class RegisterActivity extends BaseActivity {

    private RegisterViewModel registerViewModel;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initUi();
        initViewModel();
    }

    private void initUi() {
        ((ActivityRegisterBinding) getBinding()).inputPassRegisterOk.setOnEditorActionListener((v, actionId, event) -> {
            if (actionId == EditorInfo.IME_ACTION_DONE) {
                registerViewModel.register();
                return true;
            } else {
                return false;
            }
        });
    }

    private void initViewModel() {
        registerViewModel = new ViewModelProvider(this).get(RegisterViewModel.class);
        ((ActivityRegisterBinding) getBinding()).setViewModel(registerViewModel);

        registerViewModel.getViewStateLiveData().observe(RegisterActivity.this, viewState -> {
            if (viewState instanceof RegisterViewState) {
                onChangedViewState((RegisterViewState) viewState);
            }
        });
    }

    private void onChangedViewState(RegisterViewState viewState) {
        if (viewState instanceof RegisterViewState.RouteHome) {
            Intent intent = new Intent(RegisterActivity.this, HomeActivity.class);
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
            startActivity(intent);
        } else if (viewState instanceof RegisterViewState.Error) {
            Toast.makeText(this, ((RegisterViewState.Error) viewState).getMessage(), Toast.LENGTH_SHORT).show();
        } else if (viewState instanceof RegisterViewState.EnableInput) {
            ((ActivityRegisterBinding) getBinding()).inputEmailRegister.setEnabled(((RegisterViewState.EnableInput) viewState).isEnable());
            ((ActivityRegisterBinding) getBinding()).inputPassRegister.setEnabled(((RegisterViewState.EnableInput) viewState).isEnable());
            ((ActivityRegisterBinding) getBinding()).inputPassRegisterOk.setEnabled(((RegisterViewState.EnableInput) viewState).isEnable());
        } else if (viewState instanceof RegisterViewState.ShowProgress) {
            ((ActivityRegisterBinding) getBinding()).progressbar.bringToFront();
            ((ActivityRegisterBinding) getBinding()).progressbar.setVisibility(View.VISIBLE);
        } else if (viewState instanceof RegisterViewState.HideProgress) {
            ((ActivityRegisterBinding) getBinding()).progressbar.setVisibility(View.GONE);
        }
    }


    public RegisterActivity() {
        super(R.layout.activity_register);
        this.setBinding((ActivityRegisterBinding) this.getBinding());
    }
}
