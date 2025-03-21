package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzcsn;
import com.google.android.gms.internal.ads.zzcvq;
import java.util.Iterator;
import java.util.concurrent.Executor;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzepk<R extends zzcvq<AdT>, AdT extends zzcsn> implements zzeqj<R, zzeve<AdT>> {
    private R zza;
    private final Executor zzb = zzflh.zza();

    public final R zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzeqj
    public final zzfla<zzeve<AdT>> zzb(zzeqk zzeqkVar, zzeqi<R> zzeqiVar) {
        zzfla<zzete> zzb;
        zzcvp<R> zza = zzeqiVar.zza(zzeqkVar.zzb);
        zza.zzh(new zzeqp(true));
        R zzf = zza.zzf();
        this.zza = zzf;
        final zzctq zzc = zzf.zzc();
        final zzeve zzeveVar = new zzeve();
        zzbxf zzbxfVar = zzeqkVar.zza;
        if (zzbxfVar != null) {
            zzb = zzc.zza(zzfks.zza(zzbxfVar));
        } else {
            zzb = zzc.zzb();
        }
        return zzfks.zzj(zzfks.zzi(zzfkj.zzw((zzfla) zzb), new zzfjz(this, zzeveVar, zzc) { // from class: com.google.android.gms.internal.ads.zzepi
            private final zzepk zza;
            private final zzeve zzb;
            private final zzctq zzc;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = this;
                this.zzb = zzeveVar;
                this.zzc = zzc;
            }

            @Override // com.google.android.gms.internal.ads.zzfjz
            public final zzfla zza(Object obj) {
                zzeve zzeveVar2 = this.zzb;
                zzctq zzctqVar = this.zzc;
                zzete zzeteVar = (zzete) obj;
                zzeveVar2.zzb = zzeteVar;
                Iterator<zzess> it = zzeteVar.zzb.zza.iterator();
                boolean z = false;
                loop0: while (true) {
                    if (it.hasNext()) {
                        for (String str : it.next().zza) {
                            if (!str.contains("FirstPartyRenderer")) {
                                break loop0;
                            }
                            z = true;
                        }
                    } else if (z) {
                        return zzctqVar.zzc(zzfks.zza(zzeteVar));
                    }
                }
                return zzfks.zza(null);
            }
        }, this.zzb), new zzfei(zzeveVar) { // from class: com.google.android.gms.internal.ads.zzepj
            private final zzeve zza;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = zzeveVar;
            }

            @Override // com.google.android.gms.internal.ads.zzfei
            public final Object apply(Object obj) {
                zzeve zzeveVar2 = this.zza;
                zzeveVar2.zzc = (AdT) obj;
                return zzeveVar2;
            }
        }, this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzeqj
    public final /* bridge */ /* synthetic */ Object zzc() {
        return this.zza;
    }
}
