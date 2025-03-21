package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzkc {
    public final Uri zza;
    public final List zze;
    public final List zzg;
    public final String zzb = null;
    public final zzjz zzc = null;
    public final zzjv zzd = null;
    public final String zzf = null;
    public final Object zzh = null;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzkc(Uri uri, String str, zzjz zzjzVar, zzjv zzjvVar, List list, String str2, List list2, Object obj, zzju zzjuVar) {
        this.zza = uri;
        this.zze = list;
        this.zzg = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzkc) {
            zzkc zzkcVar = (zzkc) obj;
            if (this.zza.equals(zzkcVar.zza)) {
                String str = zzkcVar.zzb;
                if (zzaht.zzc(null, null)) {
                    zzjz zzjzVar = zzkcVar.zzc;
                    if (zzaht.zzc(null, null)) {
                        zzjv zzjvVar = zzkcVar.zzd;
                        if (zzaht.zzc(null, null) && this.zze.equals(zzkcVar.zze)) {
                            String str2 = zzkcVar.zzf;
                            if (zzaht.zzc(null, null) && this.zzg.equals(zzkcVar.zzg)) {
                                Object obj2 = zzkcVar.zzh;
                                if (zzaht.zzc(null, null)) {
                                    return true;
                                }
                            }
                        }
                    }
                }
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.zza.hashCode() * 923521) + this.zze.hashCode()) * 961) + this.zzg.hashCode()) * 31;
    }
}
