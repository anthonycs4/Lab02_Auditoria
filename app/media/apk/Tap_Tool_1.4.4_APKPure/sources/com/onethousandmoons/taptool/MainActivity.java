package com.onethousandmoons.taptool;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.graphics.Typeface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.LinearInterpolator;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.google.android.material.timepicker.TimeModel;
import com.onethousandmoons.taptool.databinding.ActivityMainBinding;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: MainActivity.kt */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0019\u001a\u00020\u001aH\u0002J\b\u0010\u001b\u001a\u00020\u001cH\u0002J\b\u0010\u001d\u001a\u00020\u001cH\u0002J\b\u0010\u001e\u001a\u00020\u001cH\u0002J\b\u0010\u001f\u001a\u00020\u001cH\u0002J\u000e\u0010 \u001a\u00020\u001a2\u0006\u0010!\u001a\u00020\"J\b\u0010#\u001a\u00020\u001cH\u0002J\u0012\u0010$\u001a\u00020\u001a2\b\u0010%\u001a\u0004\u0018\u00010&H\u0014J\b\u0010'\u001a\u00020\u000bH\u0002J\b\u0010(\u001a\u00020\u000bH\u0002J\u0006\u0010)\u001a\u00020\u001aJ\u000e\u0010*\u001a\u00020\u001a2\u0006\u0010!\u001a\u00020\"J\u000e\u0010+\u001a\u00020\u001a2\u0006\u0010!\u001a\u00020\"J\u0010\u0010,\u001a\u00020\u001a2\u0006\u0010-\u001a\u00020\bH\u0002J\u000e\u0010.\u001a\u00020\u001a2\u0006\u0010!\u001a\u00020\"J\u0006\u0010/\u001a\u00020\u001aJ\b\u00100\u001a\u00020\u001aH\u0002J\u000e\u00101\u001a\u00020\u001a2\u0006\u0010!\u001a\u00020\"J\u0014\u00102\u001a\u00020\u001c*\u00020\u000b2\u0006\u00103\u001a\u000204H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082.¢\u0006\u0002\n\u0000R \u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u00065"}, d2 = {"Lcom/onethousandmoons/taptool/MainActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "binding", "Lcom/onethousandmoons/taptool/databinding/ActivityMainBinding;", "handler", "Landroid/os/Handler;", "isPaused", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "isPlaying", "pauseDurationTotal", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "pauseDurationTransient", "pauseEnd", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "pauseStart", "runnable", "Ljava/lang/Runnable;", "tapList", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "Ljava/util/Date;", "getTapList", "()Ljava/util/List;", "setTapList", "(Ljava/util/List;)V", "UpdateTimer", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "UseSimpleDateFormat", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "calculateAveragePeriod", "calculateRateAndUnits", "calculateTappingTime", "confirmReset", "view", "Landroid/view/View;", "formatDisplayText", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "realDurationToLastTap", "realDurationToNow", "resumeTimer", "runReset", "runTap", "setButtonFlash", "shouldFlash", "showAbout", "startTimer", "stopTimer", "togglePause", "roundTo", "n", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
    private Handler handler;
    private boolean isPaused;
    private boolean isPlaying;
    private double pauseDurationTotal;
    private double pauseDurationTransient;
    private long pauseEnd;
    private long pauseStart;
    private Runnable runnable;
    private List<Date> tapList = new ArrayList();

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onCreate$lambda-0  reason: not valid java name */
    public static final void m15onCreate$lambda0(InitializationStatus initializationStatus) {
    }

    public final List<Date> getTapList() {
        return this.tapList;
    }

    public final void setTapList(List<Date> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.tapList = list;
    }

    private final double realDurationToLastTap() {
        return ((((Date) CollectionsKt.last((List<? extends Object>) this.tapList)).getTime() - ((Date) CollectionsKt.first((List<? extends Object>) this.tapList)).getTime()) - this.pauseDurationTotal) / 1000;
    }

    private final double realDurationToNow() {
        return (((new Date().getTime() - ((Date) CollectionsKt.first((List<? extends Object>) this.tapList)).getTime()) - this.pauseDurationTotal) - this.pauseDurationTransient) / 1000;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ActivityMainBinding inflate = ActivityMainBinding.inflate(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(layoutInflater)");
        this.binding = inflate;
        if (inflate != null) {
            ConstraintLayout root = inflate.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "binding.root");
            setContentView(root);
            MobileAds.initialize(this, new OnInitializationCompleteListener() { // from class: com.onethousandmoons.taptool.MainActivity$$ExternalSyntheticLambda2
                @Override // com.google.android.gms.ads.initialization.OnInitializationCompleteListener
                public final void onInitializationComplete(InitializationStatus initializationStatus) {
                    MainActivity.m15onCreate$lambda0(initializationStatus);
                }
            });
            AdRequest build = new AdRequest.Builder().build();
            ActivityMainBinding activityMainBinding = this.binding;
            if (activityMainBinding != null) {
                activityMainBinding.adView.loadAd(build);
                return;
            } else {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                throw null;
            }
        }
        Intrinsics.throwUninitializedPropertyAccessException("binding");
        throw null;
    }

    public final void showAbout(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        new AboutWindow().show(getSupportFragmentManager(), "about");
    }

    public final void togglePause(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        boolean z = !this.isPaused;
        this.isPaused = z;
        if (z) {
            this.pauseStart = new Date().getTime();
            stopTimer();
            ActivityMainBinding activityMainBinding = this.binding;
            if (activityMainBinding == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                throw null;
            }
            activityMainBinding.btnPause.setText(getString(R.string.resume));
            setButtonFlash(true);
            return;
        }
        long time = new Date().getTime();
        this.pauseEnd = time;
        long j = time - this.pauseStart;
        if (j != 0) {
            this.pauseDurationTransient += j;
        }
        startTimer();
        setButtonFlash(false);
        ActivityMainBinding activityMainBinding2 = this.binding;
        if (activityMainBinding2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            throw null;
        }
        activityMainBinding2.btnPause.setText(getString(R.string.pause));
        ActivityMainBinding activityMainBinding3 = this.binding;
        if (activityMainBinding3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            throw null;
        }
        activityMainBinding3.btnPause.setTypeface(Typeface.MONOSPACE, 0);
        ActivityMainBinding activityMainBinding4 = this.binding;
        if (activityMainBinding4 != null) {
            activityMainBinding4.txtInfoPanel.setAlpha(1.0f);
        } else {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            throw null;
        }
    }

    public final void confirmReset(final View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle(getString(R.string.confirm_reset));
        builder.setMessage(getString(R.string.reset_confirmation_message));
        builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() { // from class: com.onethousandmoons.taptool.MainActivity$$ExternalSyntheticLambda0
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                MainActivity.m13confirmReset$lambda1(MainActivity.this, view, dialogInterface, i);
            }
        });
        builder.setNegativeButton("No", new DialogInterface.OnClickListener() { // from class: com.onethousandmoons.taptool.MainActivity$$ExternalSyntheticLambda1
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.cancel();
            }
        });
        builder.create().show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: confirmReset$lambda-1  reason: not valid java name */
    public static final void m13confirmReset$lambda1(MainActivity this$0, View view, DialogInterface dialogInterface, int i) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(view, "$view");
        this$0.runReset(view);
        dialogInterface.cancel();
    }

    public final void runReset(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        stopTimer();
        this.isPlaying = false;
        ActivityMainBinding activityMainBinding = this.binding;
        if (activityMainBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            throw null;
        }
        activityMainBinding.btnReset.setEnabled(false);
        ActivityMainBinding activityMainBinding2 = this.binding;
        if (activityMainBinding2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            throw null;
        }
        activityMainBinding2.btnPause.setEnabled(false);
        ActivityMainBinding activityMainBinding3 = this.binding;
        if (activityMainBinding3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            throw null;
        }
        activityMainBinding3.btnPause.setText(getString(R.string.pause));
        ActivityMainBinding activityMainBinding4 = this.binding;
        if (activityMainBinding4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            throw null;
        }
        activityMainBinding4.btnPause.clearAnimation();
        ActivityMainBinding activityMainBinding5 = this.binding;
        if (activityMainBinding5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            throw null;
        }
        activityMainBinding5.txtInfoPanel.setAlpha(1.0f);
        this.isPaused = false;
        this.tapList.clear();
        this.pauseStart = 0L;
        this.pauseEnd = 0L;
        this.pauseDurationTotal = 0.0d;
        this.pauseDurationTransient = 0.0d;
        ActivityMainBinding activityMainBinding6 = this.binding;
        if (activityMainBinding6 != null) {
            activityMainBinding6.txtInfoPanel.setText(formatDisplayText());
        } else {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            throw null;
        }
    }

    public final void runTap(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (this.isPaused) {
            return;
        }
        startTimer();
        this.pauseDurationTotal += this.pauseDurationTransient;
        this.pauseDurationTransient = 0.0d;
        this.tapList.add(new Date());
        ActivityMainBinding activityMainBinding = this.binding;
        if (activityMainBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            throw null;
        }
        activityMainBinding.txtInfoPanel.setText(formatDisplayText());
        ActivityMainBinding activityMainBinding2 = this.binding;
        if (activityMainBinding2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            throw null;
        }
        activityMainBinding2.btnReset.setEnabled(true);
        ActivityMainBinding activityMainBinding3 = this.binding;
        if (activityMainBinding3 != null) {
            activityMainBinding3.btnPause.setEnabled(true);
        } else {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            throw null;
        }
    }

    public final void startTimer() {
        if (this.isPlaying) {
            return;
        }
        this.handler = new Handler(Looper.getMainLooper());
        Runnable runnable = new Runnable() { // from class: com.onethousandmoons.taptool.MainActivity$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                MainActivity.m16startTimer$lambda3(MainActivity.this);
            }
        };
        this.runnable = runnable;
        Handler handler = this.handler;
        if (handler == null) {
            Intrinsics.throwUninitializedPropertyAccessException("handler");
            throw null;
        }
        handler.post(runnable);
        this.isPlaying = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: startTimer$lambda-3  reason: not valid java name */
    public static final void m16startTimer$lambda3(MainActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.UpdateTimer();
        Handler handler = this$0.handler;
        if (handler == null) {
            Intrinsics.throwUninitializedPropertyAccessException("handler");
            throw null;
        }
        Runnable runnable = this$0.runnable;
        if (runnable != null) {
            handler.postDelayed(runnable, 130L);
        } else {
            Intrinsics.throwUninitializedPropertyAccessException("runnable");
            throw null;
        }
    }

    private final void stopTimer() {
        Handler handler = this.handler;
        if (handler == null) {
            Intrinsics.throwUninitializedPropertyAccessException("handler");
            throw null;
        }
        Runnable runnable = this.runnable;
        if (runnable == null) {
            Intrinsics.throwUninitializedPropertyAccessException("runnable");
            throw null;
        }
        handler.removeCallbacks(runnable);
        this.isPlaying = false;
        ActivityMainBinding activityMainBinding = this.binding;
        if (activityMainBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            throw null;
        }
        activityMainBinding.btnPause.setTypeface(Typeface.MONOSPACE, 1);
        ActivityMainBinding activityMainBinding2 = this.binding;
        if (activityMainBinding2 != null) {
            activityMainBinding2.txtInfoPanel.setAlpha(0.4f);
        } else {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            throw null;
        }
    }

    public final void resumeTimer() {
        this.isPlaying = true;
        ActivityMainBinding activityMainBinding = this.binding;
        if (activityMainBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            throw null;
        }
        activityMainBinding.btnPause.setText(getString(R.string.pause));
        ActivityMainBinding activityMainBinding2 = this.binding;
        if (activityMainBinding2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            throw null;
        }
        activityMainBinding2.btnPause.setText(0);
        ActivityMainBinding activityMainBinding3 = this.binding;
        if (activityMainBinding3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            throw null;
        }
        activityMainBinding3.btnPause.setTypeface(Typeface.MONOSPACE, 0);
        ActivityMainBinding activityMainBinding4 = this.binding;
        if (activityMainBinding4 != null) {
            activityMainBinding4.txtInfoPanel.setAlpha(1.0f);
        } else {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            throw null;
        }
    }

    private final void UpdateTimer() {
        ActivityMainBinding activityMainBinding = this.binding;
        if (activityMainBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            throw null;
        }
        activityMainBinding.txtInfoPanel.setText(formatDisplayText());
        ActivityMainBinding activityMainBinding2 = this.binding;
        if (activityMainBinding2 != null) {
            activityMainBinding2.txtInfoPanel.invalidate();
        } else {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            throw null;
        }
    }

    private final String formatDisplayText() {
        String str;
        int size = this.tapList.size();
        if (size != 0) {
            if (size == 1) {
                str = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED + "Total: " + size + " tap";
            } else {
                str = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED + "Total: " + size + " taps";
            }
            String stringPlus = Intrinsics.stringPlus((Intrinsics.stringPlus(Intrinsics.stringPlus(str, "\n\n") + "Elapsed: " + UseSimpleDateFormat(), "\n\n") + "(Repeats: " + (this.tapList.size() - 1)) + " in " + calculateTappingTime() + ')', "\n\n");
            StringBuilder sb = new StringBuilder();
            sb.append(stringPlus);
            sb.append("Rate: ");
            sb.append(calculateRateAndUnits());
            return Intrinsics.stringPlus(Intrinsics.stringPlus(sb.toString(), "\n\n") + "Period: " + calculateAveragePeriod(), "\n\n");
        }
        return "Tap to start...";
    }

    private final String calculateTappingTime() {
        String format = String.format("%.3f", Arrays.copyOf(new Object[]{Double.valueOf(realDurationToLastTap())}, 1));
        Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(this, *args)");
        return Intrinsics.stringPlus(format, "s");
    }

    private final String calculateRateAndUnits() {
        int size = this.tapList.size();
        if (size < 2) {
            return "(waiting)";
        }
        return Intrinsics.stringPlus(roundTo(((size - 1) * 60) / realDurationToLastTap(), 2), " / min");
    }

    private final String calculateAveragePeriod() {
        int size = this.tapList.size();
        return size < 2 ? "(waiting)" : Intrinsics.stringPlus(roundTo(realDurationToLastTap() / (size - 1), 3), " s");
    }

    private final String roundTo(double d, int i) {
        String format = String.format("%." + i + 'f', Arrays.copyOf(new Object[]{Double.valueOf(d)}, 1));
        Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(this, *args)");
        return format;
    }

    private final String UseSimpleDateFormat() {
        long realDurationToNow = (long) (realDurationToNow() * 1000.0d);
        long hours = TimeUnit.MILLISECONDS.toHours(realDurationToNow);
        long minutes = TimeUnit.MILLISECONDS.toMinutes(realDurationToNow) - TimeUnit.HOURS.toMinutes(TimeUnit.MILLISECONDS.toHours(realDurationToNow));
        long seconds = TimeUnit.MILLISECONDS.toSeconds(realDurationToNow) - TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes(realDurationToNow));
        long millis = TimeUnit.MILLISECONDS.toMillis(realDurationToNow) - TimeUnit.SECONDS.toMillis(TimeUnit.MILLISECONDS.toSeconds(realDurationToNow));
        String str = hours + "h ";
        String str2 = minutes + "m ";
        String format = String.format(TimeModel.ZERO_LEADING_NUMBER_FORMAT, Arrays.copyOf(new Object[]{Long.valueOf(seconds)}, 1));
        Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(this, *args)");
        String format2 = String.format(".%02d", Arrays.copyOf(new Object[]{Long.valueOf(millis / 10)}, 1));
        Intrinsics.checkNotNullExpressionValue(format2, "java.lang.String.format(this, *args)");
        String str3 = "s";
        Intrinsics.stringPlus(format2, "s");
        String format3 = String.format(".%03d", Arrays.copyOf(new Object[]{Long.valueOf(millis)}, 1));
        Intrinsics.checkNotNullExpressionValue(format3, "java.lang.String.format(this, *args)");
        String stringPlus = Intrinsics.stringPlus(format3, "s");
        if (hours < 1) {
            if (minutes < 1) {
                str = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
                str2 = str;
            } else {
                str = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
            }
        }
        if (hours <= 0 && minutes <= 0) {
            str3 = stringPlus;
        }
        return str + str2 + format + str3;
    }

    private final void setButtonFlash(boolean z) {
        if (z) {
            AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
            alphaAnimation.setDuration(500L);
            alphaAnimation.setRepeatCount(-1);
            alphaAnimation.setInterpolator(new LinearInterpolator());
            alphaAnimation.setRepeatMode(2);
            ActivityMainBinding activityMainBinding = this.binding;
            if (activityMainBinding != null) {
                activityMainBinding.btnPause.startAnimation(alphaAnimation);
                return;
            } else {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                throw null;
            }
        }
        ActivityMainBinding activityMainBinding2 = this.binding;
        if (activityMainBinding2 != null) {
            activityMainBinding2.btnPause.clearAnimation();
        } else {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            throw null;
        }
    }
}
