package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.Map;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public interface zzdhh {
    void zza(View view, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2, View.OnTouchListener onTouchListener, View.OnClickListener onClickListener);

    void zzb(View view, Map<String, WeakReference<View>> map);

    void zzc(View view, View view2, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2, boolean z);

    void zzd(String str);

    void zze(Bundle bundle);

    void zzf(View view, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2, boolean z);

    void zzg();

    boolean zzh();

    void zzj(View view, MotionEvent motionEvent, View view2);

    void zzk(Bundle bundle);

    JSONObject zzl(View view, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2);

    void zzm();

    void zzn(View view);

    void zzo(zzbka zzbkaVar);

    void zzp();

    void zzq(zzbct zzbctVar);

    void zzr(zzbcp zzbcpVar);

    void zzs();

    void zzt(View view, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2);

    void zzu();

    boolean zzv(Bundle bundle);

    void zzw();
}
