package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzgy extends zzhg {
    private final StackTraceElement[] zzi;

    public zzgy(zzfy zzfyVar, String str, String str2, zzcn zzcnVar, int i, int i2, StackTraceElement[] stackTraceElementArr) {
        super(zzfyVar, "xXLnjgvEO8a9Q7TcyZH/ERSXaKjHGr9nJbpUT2CESVYEc6tfesE8AizE0M+CGX/K", "BxojPJPaHa1Mei2UyOZREW/8Cm7FQISAUHyKKXUhyes=", zzcnVar, i, 45);
        this.zzi = stackTraceElementArr;
    }

    @Override // com.google.android.gms.internal.ads.zzhg
    protected final void zza() throws IllegalAccessException, InvocationTargetException {
        zzdm zzdmVar;
        StackTraceElement[] stackTraceElementArr = this.zzi;
        if (stackTraceElementArr != null) {
            zzfq zzfqVar = new zzfq((String) this.zzf.invoke(null, stackTraceElementArr));
            synchronized (this.zze) {
                this.zze.zzC(zzfqVar.zza.longValue());
                if (zzfqVar.zzb.booleanValue()) {
                    zzcn zzcnVar = this.zze;
                    if (!zzfqVar.zzc.booleanValue()) {
                        zzdmVar = zzdm.ENUM_TRUE;
                    } else {
                        zzdmVar = zzdm.ENUM_FALSE;
                    }
                    zzcnVar.zzK(zzdmVar);
                } else {
                    this.zze.zzK(zzdm.ENUM_FAILURE);
                }
            }
        }
    }
}
