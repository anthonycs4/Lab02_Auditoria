package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzcba implements SharedPreferences.OnSharedPreferenceChangeListener {
    final /* synthetic */ zzcbc zza;
    private final String zzb;

    public zzcba(zzcbc zzcbcVar, String str) {
        this.zza = zzcbcVar;
        this.zzb = str;
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        List<zzcbb> list;
        synchronized (this.zza) {
            list = this.zza.zzb;
            for (zzcbb zzcbbVar : list) {
                zzcbbVar.zza(sharedPreferences, this.zzb, str);
            }
        }
    }
}
