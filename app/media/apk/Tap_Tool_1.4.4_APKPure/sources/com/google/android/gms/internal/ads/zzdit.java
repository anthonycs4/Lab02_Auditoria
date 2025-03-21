package com.google.android.gms.internal.ads;

import android.view.View;
import android.widget.FrameLayout;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.lang.ref.WeakReference;
import java.util.Map;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public interface zzdit extends View.OnClickListener, View.OnTouchListener {
    FrameLayout zzbE();

    View zzbI();

    zzasj zzh();

    void zzi(String str, View view, boolean z);

    Map<String, WeakReference<View>> zzj();

    Map<String, WeakReference<View>> zzk();

    Map<String, WeakReference<View>> zzl();

    View zzm(String str);

    String zzn();

    IObjectWrapper zzo();

    JSONObject zzp();
}
