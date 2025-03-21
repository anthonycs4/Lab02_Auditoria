package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzbni implements zzv {
    private volatile zzbmv zza;
    private final Context zzb;

    public zzbni(Context context) {
        this.zzb = context;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzb(zzbni zzbniVar) {
        if (zzbniVar.zza == null) {
            return;
        }
        zzbniVar.zza.disconnect();
        Binder.flushPendingCommands();
    }

    @Override // com.google.android.gms.internal.ads.zzv
    public final zzy zza(zzac<?> zzacVar) throws zzal {
        Parcelable.Creator<zzbmw> creator = zzbmw.CREATOR;
        Map<String, String> zzm = zzacVar.zzm();
        int size = zzm.size();
        String[] strArr = new String[size];
        String[] strArr2 = new String[size];
        int i = 0;
        int i2 = 0;
        for (Map.Entry<String, String> entry : zzm.entrySet()) {
            strArr[i2] = entry.getKey();
            strArr2[i2] = entry.getValue();
            i2++;
        }
        zzbmw zzbmwVar = new zzbmw(zzacVar.zzh(), strArr, strArr2);
        long elapsedRealtime = com.google.android.gms.ads.internal.zzs.zzj().elapsedRealtime();
        try {
            zzcde zzcdeVar = new zzcde();
            this.zza = new zzbmv(this.zzb, com.google.android.gms.ads.internal.zzs.zzq().zza(), new zzbng(this, zzcdeVar), new zzbnh(this, zzcdeVar));
            this.zza.checkAvailabilityAndConnect();
            zzfla zzh = zzfks.zzh(zzfks.zzi(zzcdeVar, new zzbne(this, zzbmwVar), zzccz.zza), ((Integer) zzbba.zzc().zzb(zzbfq.zzcI)).intValue(), TimeUnit.MILLISECONDS, zzccz.zzd);
            zzh.zze(new zzbnf(this), zzccz.zza);
            ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) zzh.get();
            long elapsedRealtime2 = com.google.android.gms.ads.internal.zzs.zzj().elapsedRealtime();
            StringBuilder sb = new StringBuilder(52);
            sb.append("Http assets remote cache took ");
            sb.append(elapsedRealtime2 - elapsedRealtime);
            sb.append("ms");
            com.google.android.gms.ads.internal.util.zze.zza(sb.toString());
            zzbmy zzbmyVar = (zzbmy) new zzbxd(parcelFileDescriptor).zza(zzbmy.CREATOR);
            if (zzbmyVar == null) {
                return null;
            }
            if (zzbmyVar.zza) {
                throw new zzal(zzbmyVar.zzb);
            }
            if (zzbmyVar.zze.length != zzbmyVar.zzf.length) {
                return null;
            }
            HashMap hashMap = new HashMap();
            while (true) {
                String[] strArr3 = zzbmyVar.zze;
                if (i < strArr3.length) {
                    hashMap.put(strArr3[i], zzbmyVar.zzf[i]);
                    i++;
                } else {
                    return new zzy(zzbmyVar.zzc, zzbmyVar.zzd, hashMap, zzbmyVar.zzg, zzbmyVar.zzh);
                }
            }
        } catch (InterruptedException | ExecutionException unused) {
            long elapsedRealtime3 = com.google.android.gms.ads.internal.zzs.zzj().elapsedRealtime();
            StringBuilder sb2 = new StringBuilder(52);
            sb2.append("Http assets remote cache took ");
            sb2.append(elapsedRealtime3 - elapsedRealtime);
            sb2.append("ms");
            com.google.android.gms.ads.internal.util.zze.zza(sb2.toString());
            return null;
        } catch (Throwable th) {
            long elapsedRealtime4 = com.google.android.gms.ads.internal.zzs.zzj().elapsedRealtime();
            StringBuilder sb3 = new StringBuilder(52);
            sb3.append("Http assets remote cache took ");
            sb3.append(elapsedRealtime4 - elapsedRealtime);
            sb3.append("ms");
            com.google.android.gms.ads.internal.util.zze.zza(sb3.toString());
            throw th;
        }
    }
}
