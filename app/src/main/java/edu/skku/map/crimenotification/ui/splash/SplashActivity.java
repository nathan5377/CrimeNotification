package edu.skku.map.crimenotification.ui.splash;

import android.animation.Animator;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Bundle;
import android.util.Base64;
import android.util.Log;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.lifecycle.ViewModelProvider;

import edu.skku.map.crimenotification.R;
import edu.skku.map.crimenotification.base.BaseActivity;
import edu.skku.map.crimenotification.databinding.ActivitySplashBinding;
import edu.skku.map.crimenotification.ui.login.LoginActivity;

import org.jetbrains.annotations.NotNull;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import dagger.hilt.android.AndroidEntryPoint;

@AndroidEntryPoint
public final class SplashActivity extends BaseActivity {

    private boolean isRoute = false;

    private SplashViewModel splashViewModel;

    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getHashKey();
        initUi();
        initViewModel();
    }

    private void initViewModel() {
        splashViewModel = new ViewModelProvider(this).get(SplashViewModel.class);
        splashViewModel.checkSaveCriminals();

        splashViewModel.getViewStateLiveData().observe(SplashActivity.this, viewState -> {
            if (viewState instanceof SplashViewState) {
                onChangedViewState((SplashViewState) viewState);
            }
        });
    }

    private void onChangedViewState(SplashViewState viewState) {

        if (viewState instanceof SplashViewState.RouteHome) {
            isRoute = true;
        } else if (viewState instanceof SplashViewState.Error) {
            Toast.makeText(this, ((SplashViewState.Error) viewState).getMessage(), Toast.LENGTH_SHORT).show();
        }
    }


    private void initUi() {
        ((ActivitySplashBinding) this.getBinding()).lottieView.addAnimatorListener(new Animator.AnimatorListener() {
            public void onAnimationStart(@NotNull Animator animation) {
            }

            public void onAnimationEnd(@NotNull Animator animation) {
                if (SplashActivity.this.isRoute) {
                    Intent intent = new Intent(SplashActivity.this, LoginActivity.class);
                    intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
                    startActivity(intent);
                } else {
                    ((ActivitySplashBinding) getBinding()).tvLoading.setVisibility(View.VISIBLE);
                    ((ActivitySplashBinding) getBinding()).tvLoading.startAnimation(AnimationUtils.loadAnimation(SplashActivity.this.getApplicationContext(), R.anim.anim_brick));
                    ((ActivitySplashBinding) getBinding()).lottieView.playAnimation();
                }
            }

            public void onAnimationCancel(@NotNull Animator animation) {
            }

            public void onAnimationRepeat(@NotNull Animator animation) {
            }
        });
    }

    /**
     * 노트북마다 HashKey 가 다르므로 카카오맵의 해키시를 수정해주어야 한다.
     */
    private void getHashKey() {
        PackageInfo packageInfo = null;
        try {
            packageInfo = getPackageManager().getPackageInfo(getPackageName(), PackageManager.GET_SIGNATURES);
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
        }
        if (packageInfo == null)
            Log.e("KeyHash", "KeyHash:null");

        for (Signature signature : packageInfo.signatures) {
            try {
                MessageDigest md = MessageDigest.getInstance("SHA");
                md.update(signature.toByteArray());
                Log.d("KeyHash", Base64.encodeToString(md.digest(), Base64.DEFAULT));
            } catch (NoSuchAlgorithmException e) {
                Log.e("KeyHash", "Unable to get MessageDigest. signature=" + signature, e);
            }
        }
    }

    public SplashActivity() {
        super(R.layout.activity_splash);
        this.setBinding((ActivitySplashBinding) this.getBinding());
    }

}