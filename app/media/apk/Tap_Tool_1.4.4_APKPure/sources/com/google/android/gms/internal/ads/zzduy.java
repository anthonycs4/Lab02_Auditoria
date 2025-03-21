package com.google.android.gms.internal.ads;

import android.os.Binder;
import java.io.InputStream;
import java.util.concurrent.ExecutionException;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzduy {
    private final zzflb zza;
    private final zzduh zzb;
    private final zzgdk<zzdvo> zzc;

    public zzduy(zzflb zzflbVar, zzduh zzduhVar, zzgdk<zzdvo> zzgdkVar) {
        this.zza = zzflbVar;
        this.zzb = zzduhVar;
        this.zzc = zzgdkVar;
    }

    private final <RetT> zzfla<RetT> zzg(final zzbxf zzbxfVar, zzdux<InputStream> zzduxVar, final zzdux<InputStream> zzduxVar2, final zzfjz<InputStream, RetT> zzfjzVar) {
        zzfla zzg;
        String str = zzbxfVar.zzd;
        com.google.android.gms.ads.internal.zzs.zzc();
        if (com.google.android.gms.ads.internal.util.zzr.zzF(str)) {
            zzg = zzfks.zzc(new zzduo(1));
        } else {
            zzg = zzfks.zzg(zzduxVar.zzb(zzbxfVar), ExecutionException.class, zzdup.zza, this.zza);
        }
        return zzfks.zzg(zzfks.zzi(zzfkj.zzw(zzg), zzfjzVar, this.zza), zzduo.class, new zzfjz(this, zzduxVar2, zzbxfVar, zzfjzVar) { // from class: com.google.android.gms.internal.ads.zzduq
            private final zzduy zza;
            private final zzdux zzb;
            private final zzbxf zzc;
            private final zzfjz zzd;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = this;
                this.zzb = zzduxVar2;
                this.zzc = zzbxfVar;
                this.zzd = zzfjzVar;
            }

            @Override // com.google.android.gms.internal.ads.zzfjz
            public final zzfla zza(Object obj) {
                return this.zza.zzf(this.zzb, this.zzc, this.zzd, (zzduo) obj);
            }
        }, this.zza);
    }

    public final zzfla<zzbxf> zza(final zzbxf zzbxfVar) {
        return zzg(zzbxfVar, zzdus.zza(this.zzb), new zzdux(this) { // from class: com.google.android.gms.internal.ads.zzdut
            private final zzduy zza;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = this;
            }

            @Override // com.google.android.gms.internal.ads.zzdux
            public final zzfla zzb(zzbxf zzbxfVar2) {
                return this.zza.zze(zzbxfVar2);
            }
        }, new zzfjz(zzbxfVar) { // from class: com.google.android.gms.internal.ads.zzdur
            private final zzbxf zza;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = zzbxfVar;
            }

            @Override // com.google.android.gms.internal.ads.zzfjz
            public final zzfla zza(Object obj) {
                zzbxf zzbxfVar2 = this.zza;
                zzbxfVar2.zzj = new String(zzfjd.zza((InputStream) obj), zzfeg.zzc);
                return zzfks.zza(zzbxfVar2);
            }
        });
    }

    public final zzfla<Void> zzb(zzbxf zzbxfVar) {
        if (zzgb.zzc(zzbxfVar.zzj)) {
            return zzfks.zzc(new zzdsp(2, "Pool key missing from removeUrl call."));
        }
        return zzg(zzbxfVar, new zzdux(this) { // from class: com.google.android.gms.internal.ads.zzduv
            private final zzduy zza;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = this;
            }

            @Override // com.google.android.gms.internal.ads.zzdux
            public final zzfla zzb(zzbxf zzbxfVar2) {
                return this.zza.zzd(zzbxfVar2);
            }
        }, new zzdux(this) { // from class: com.google.android.gms.internal.ads.zzduw
            private final zzduy zza;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = this;
            }

            @Override // com.google.android.gms.internal.ads.zzdux
            public final zzfla zzb(zzbxf zzbxfVar2) {
                return this.zza.zzc(zzbxfVar2);
            }
        }, zzduu.zza);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzfla zzc(zzbxf zzbxfVar) {
        return this.zzc.zzb().zzd(zzbxfVar.zzj);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzfla zzd(zzbxf zzbxfVar) {
        return this.zzb.zzc(zzbxfVar.zzj);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzfla zze(zzbxf zzbxfVar) {
        return this.zzc.zzb().zzc(zzbxfVar, Binder.getCallingUid());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzfla zzf(zzdux zzduxVar, zzbxf zzbxfVar, zzfjz zzfjzVar, zzduo zzduoVar) throws Exception {
        return zzfks.zzi(zzduxVar.zzb(zzbxfVar), zzfjzVar, this.zza);
    }
}
