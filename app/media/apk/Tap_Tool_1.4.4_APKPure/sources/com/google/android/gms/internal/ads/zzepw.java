package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzcsn;
import com.google.android.gms.internal.ads.zzcvq;
import java.util.concurrent.Executor;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzepw<R extends zzcvq<AdT>, AdT extends zzcsn> implements zzeqj<R, zzepv<AdT>> {
    private final zzeuv zza;
    private final Executor zzb;
    private final zzfko<Void> zzc = new zzepu(this);

    public zzepw(zzeuv zzeuvVar, Executor executor) {
        this.zza = zzeuvVar;
        this.zzb = executor;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzfla zza(zzeqk zzeqkVar, zzeqi zzeqiVar, zzeqe zzeqeVar) throws Exception {
        zzevf zzevfVar = zzeqeVar.zzb;
        zzbxf zzbxfVar = zzeqeVar.zza;
        zzeve<?> zza = zzevfVar != null ? this.zza.zza(zzevfVar) : null;
        if (zzevfVar == null) {
            return zzfks.zza(null);
        }
        if (zza != null && zzbxfVar != null) {
            zzfks.zzp(((zzcvq) zzeqiVar.zza(zzeqkVar.zzb).zzf()).zzc().zzf(zzbxfVar), this.zzc, this.zzb);
        }
        return zzfks.zza(new zzepv(zzevfVar, zzbxfVar, zza));
    }

    @Override // com.google.android.gms.internal.ads.zzeqj
    public final zzfla<zzepv<AdT>> zzb(final zzeqk zzeqkVar, final zzeqi<R> zzeqiVar) {
        return zzfks.zzf(zzfks.zzi(zzfkj.zzw((zzfla) new zzeqf(this.zza, zzeqkVar.zzb, zzeqiVar, this.zzb).zza()), new zzfjz(this, zzeqkVar, zzeqiVar) { // from class: com.google.android.gms.internal.ads.zzeps
            private final zzepw zza;
            private final zzeqk zzb;
            private final zzeqi zzc;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = this;
                this.zzb = zzeqkVar;
                this.zzc = zzeqiVar;
            }

            @Override // com.google.android.gms.internal.ads.zzfjz
            public final zzfla zza(Object obj) {
                return this.zza.zza(this.zzb, this.zzc, (zzeqe) obj);
            }
        }, this.zzb), Exception.class, new zzept(this), this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzeqj
    public final /* bridge */ /* synthetic */ Object zzc() {
        return null;
    }
}
