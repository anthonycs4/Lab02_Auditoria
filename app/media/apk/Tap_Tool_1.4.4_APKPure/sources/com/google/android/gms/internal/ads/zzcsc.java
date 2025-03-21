package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.view.ViewCompat;
import com.google.android.gms.ads.RequestConfiguration;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzcsc extends FrameLayout implements ViewTreeObserver.OnScrollChangedListener, ViewTreeObserver.OnGlobalLayoutListener {
    private final Context zza;
    private View zzb;

    private zzcsc(Context context) {
        super(context);
        this.zza = context;
    }

    public static zzcsc zza(Context context, View view, zzess zzessVar) {
        Resources resources;
        DisplayMetrics displayMetrics;
        zzcsc zzcscVar = new zzcsc(context);
        if (!zzessVar.zzt.isEmpty() && (resources = zzcscVar.zza.getResources()) != null && (displayMetrics = resources.getDisplayMetrics()) != null) {
            zzest zzestVar = zzessVar.zzt.get(0);
            zzcscVar.setLayoutParams(new FrameLayout.LayoutParams((int) (zzestVar.zza * displayMetrics.density), (int) (zzestVar.zzb * displayMetrics.density)));
        }
        zzcscVar.zzb = view;
        zzcscVar.addView(view);
        com.google.android.gms.ads.internal.zzs.zzz();
        zzcdm.zzb(zzcscVar, zzcscVar);
        com.google.android.gms.ads.internal.zzs.zzz();
        zzcdm.zza(zzcscVar, zzcscVar);
        JSONObject jSONObject = zzessVar.zzac;
        RelativeLayout relativeLayout = new RelativeLayout(zzcscVar.zza);
        JSONObject optJSONObject = jSONObject.optJSONObject("header");
        if (optJSONObject != null) {
            zzcscVar.zzb(optJSONObject, relativeLayout, 10);
        }
        JSONObject optJSONObject2 = jSONObject.optJSONObject("footer");
        if (optJSONObject2 != null) {
            zzcscVar.zzb(optJSONObject2, relativeLayout, 12);
        }
        zzcscVar.addView(relativeLayout);
        return zzcscVar;
    }

    private final void zzb(JSONObject jSONObject, RelativeLayout relativeLayout, int i) {
        TextView textView = new TextView(this.zza);
        textView.setTextColor(-1);
        textView.setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
        textView.setGravity(17);
        textView.setText(jSONObject.optString("text", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED));
        textView.setTextSize((float) jSONObject.optDouble("text_size", 11.0d));
        int zzc = zzc(jSONObject.optDouble("padding", 0.0d));
        textView.setPadding(0, zzc, 0, zzc);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, zzc(jSONObject.optDouble("height", 15.0d)));
        layoutParams.addRule(i);
        relativeLayout.addView(textView, layoutParams);
    }

    private final int zzc(double d) {
        zzbay.zza();
        return zzccg.zzs(this.zza, (int) d);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        int[] iArr = new int[2];
        getLocationInWindow(iArr);
        this.zzb.setY(-iArr[1]);
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        int[] iArr = new int[2];
        getLocationInWindow(iArr);
        this.zzb.setY(-iArr[1]);
    }
}
