package com.google.android.gms.internal.ads;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;
import java.util.Map;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
final class zzdhx implements zzbhw {
    final /* synthetic */ zzdit zza;
    final /* synthetic */ ViewGroup zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdhx(zzdit zzditVar, ViewGroup viewGroup) {
        this.zza = zzditVar;
        this.zzb = viewGroup;
    }

    @Override // com.google.android.gms.internal.ads.zzbhw
    public final void zza() {
        zzdit zzditVar = this.zza;
        zzfgz<String> zzfgzVar = zzdhu.zza;
        Map<String, WeakReference<View>> zzk = zzditVar.zzk();
        if (zzk == null) {
            return;
        }
        int size = zzfgzVar.size();
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            if (zzk.get(zzfgzVar.get(i)) != null) {
                this.zza.onClick(this.zzb);
                return;
            }
            i = i2;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbhw
    public final void zzb(MotionEvent motionEvent) {
        this.zza.onTouch(null, motionEvent);
    }

    @Override // com.google.android.gms.internal.ads.zzbhw
    public final JSONObject zzc() {
        return this.zza.zzp();
    }
}
