package com.google.android.gms.internal.ads;

import android.content.Context;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzgj extends zzhg {
    private static final zzhh<zzdy> zzi = new zzhh<>();
    private final Context zzj;

    public zzgj(zzfy zzfyVar, String str, String str2, zzcn zzcnVar, int i, int i2, Context context, zzce zzceVar) {
        super(zzfyVar, "p0TRkXE/NcSM6BGJMq+2rh+IfZ8Yp9IA3qvak/Mk1iX+ge9M5970NOJ17+Rrke0X", "xE1tXj7CYUbdHr3leN0Im7M6KUUnC9YYnjqy9MQetUk=", zzcnVar, i, 27);
        this.zzj = context;
    }

    @Override // com.google.android.gms.internal.ads.zzhg
    protected final void zza() throws IllegalAccessException, InvocationTargetException {
        Boolean bool;
        zzcj zzcjVar;
        zzdy zzdyVar;
        AtomicReference<zzdy> zza = zzi.zza(this.zzj.getPackageName());
        synchronized (zza) {
            zzdy zzdyVar2 = zza.get();
            if (zzdyVar2 == null || zzgb.zzc(zzdyVar2.zza) || zzdyVar2.zza.equals("E") || zzdyVar2.zza.equals("0000000000000000000000000000000000000000000000000000000000000000")) {
                String str = null;
                if (!zzgb.zzc(null)) {
                    zzcjVar = zzcj.ENUM_SIGNAL_SOURCE_CALLER_PROVIDED;
                } else {
                    if (zzgb.zzc(null)) {
                        bool = false;
                    } else {
                        bool = false;
                    }
                    if (bool.booleanValue() && this.zzb.zzj()) {
                        zzcjVar = zzcj.ENUM_SIGNAL_SOURCE_GASS;
                    } else {
                        zzcjVar = zzcj.ENUM_SIGNAL_SOURCE_ADSHIELD;
                    }
                }
                zzdy zzdyVar3 = new zzdy((String) this.zzf.invoke(null, this.zzj, Boolean.valueOf(zzcjVar == zzcj.ENUM_SIGNAL_SOURCE_ADSHIELD), (Boolean) zzbba.zzc().zzb(zzbfq.zzbw), (String) zzbba.zzc().zzb(zzbfq.zzbx)));
                if (zzgb.zzc(zzdyVar3.zza) || zzdyVar3.zza.equals("E")) {
                    int ordinal = zzcjVar.ordinal();
                    if (ordinal == 3) {
                        try {
                            if (this.zzb.zzn() != null) {
                                this.zzb.zzn().get();
                            }
                            zzdc zzm = this.zzb.zzm();
                            if (zzm != null && zzm.zza()) {
                                str = zzm.zzc();
                            }
                        } catch (InterruptedException | ExecutionException unused) {
                        }
                        if (!zzgb.zzc(str)) {
                            zzdyVar3.zza = str;
                        }
                    } else if (ordinal == 4) {
                        throw null;
                    }
                }
                zza.set(zzdyVar3);
            }
            zzdyVar = zza.get();
        }
        synchronized (this.zze) {
            if (zzdyVar != null) {
                this.zze.zzo(zzdyVar.zza);
                this.zze.zzu(zzdyVar.zzb);
                this.zze.zzt(zzdyVar.zzc);
                this.zze.zzD(zzdyVar.zzd);
                this.zze.zzE(zzdyVar.zze);
            }
        }
    }
}
