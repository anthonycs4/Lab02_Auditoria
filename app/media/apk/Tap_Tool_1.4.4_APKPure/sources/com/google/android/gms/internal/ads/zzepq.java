package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzcsn;
import com.google.android.gms.internal.ads.zzcvq;
import java.util.concurrent.Executor;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzepq<R extends zzcvq<AdT>, AdT extends zzcsn> implements zzeqj<R, AdT> {
    private final zzeqj<R, AdT> zza;
    private final zzeqj<R, zzepv<AdT>> zzb;
    private final zzevr<AdT> zzc;
    private R zzd;
    private final Executor zze;

    public zzepq(zzeqj<R, AdT> zzeqjVar, zzeqj<R, zzepv<AdT>> zzeqjVar2, zzevr<AdT> zzevrVar, Executor executor) {
        this.zza = zzeqjVar;
        this.zzb = zzeqjVar2;
        this.zzc = zzevrVar;
        this.zze = executor;
    }

    private final zzfla<AdT> zzf(zzeve<AdT> zzeveVar, zzeqk zzeqkVar, zzeqi<R> zzeqiVar) {
        final zzcvp<R> zza = zzeqiVar.zza(zzeqkVar.zzb);
        if (zzeveVar.zzc != null) {
            R zzf = zza.zzf();
            if (zzf.zzd() != null) {
                zzeveVar.zzc.zzn().zzo(zzf.zzd());
            }
            return zzfks.zza(zzeveVar.zzc);
        }
        zza.zzi(zzeveVar.zzb);
        zzfla<AdT> zzb = this.zza.zzb(zzeqkVar, new zzeqi(zza) { // from class: com.google.android.gms.internal.ads.zzepm
            private final zzcvp zza;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = zza;
            }

            @Override // com.google.android.gms.internal.ads.zzeqi
            public final zzcvp zza(zzeqh zzeqhVar) {
                return this.zza;
            }
        });
        this.zzd = (R) ((zzeqa) this.zza).zzc();
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzeqj
    /* renamed from: zza */
    public final synchronized R zzc() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzeqj
    public final synchronized zzfla<AdT> zzb(final zzeqk zzeqkVar, final zzeqi<R> zzeqiVar) {
        final zzepp zzeppVar;
        zzetk zza = zzeqiVar.zza(zzeqkVar.zzb).zzf().zza();
        zzeppVar = new zzepp(zzeqiVar, zzeqkVar, zza.zzd, zza.zzf, this.zze, zza.zzj, null);
        return zzfks.zzi(zzfkj.zzw((zzfla) this.zzb.zzb(zzeqkVar, zzeqiVar)), new zzfjz(this, zzeqkVar, zzeppVar, zzeqiVar) { // from class: com.google.android.gms.internal.ads.zzepl
            private final zzepq zza;
            private final zzeqk zzb;
            private final zzepp zzc;
            private final zzeqi zzd;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = this;
                this.zzb = zzeqkVar;
                this.zzc = zzeppVar;
                this.zzd = zzeqiVar;
            }

            @Override // com.google.android.gms.internal.ads.zzfjz
            public final zzfla zza(Object obj) {
                return this.zza.zze(this.zzb, this.zzc, this.zzd, (zzepv) obj);
            }
        }, this.zze);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzfla zze(zzeqk zzeqkVar, zzepp zzeppVar, final zzeqi zzeqiVar, zzepv zzepvVar) throws Exception {
        if (zzepvVar != null) {
            zzepp zzeppVar2 = new zzepp(zzeppVar.zza, zzeppVar.zzb, zzeppVar.zzc, zzeppVar.zzd, zzeppVar.zze, zzeppVar.zzf, zzepvVar.zza);
            if (zzepvVar.zzc != null) {
                this.zzd = null;
                this.zzc.zza(zzeppVar2);
                return zzf(zzepvVar.zzc, zzeqkVar, zzeqiVar);
            }
            zzfla<zzevo<AdT>> zzb = this.zzc.zzb(zzeppVar2);
            if (zzb != null) {
                this.zzd = (R) zzeqiVar.zza(zzeqkVar.zzb).zzf();
                return zzfks.zzi(zzb, new zzfjz(this, zzeqiVar) { // from class: com.google.android.gms.internal.ads.zzepn
                    private final zzepq zza;
                    private final zzeqi zzb;

                    /* JADX INFO: Access modifiers changed from: package-private */
                    {
                        this.zza = this;
                        this.zzb = zzeqiVar;
                    }

                    @Override // com.google.android.gms.internal.ads.zzfjz
                    public final zzfla zza(Object obj) {
                        return this.zza.zzd(this.zzb, (zzevo) obj);
                    }
                }, this.zze);
            }
            this.zzc.zza(zzeppVar2);
            zzeqkVar = new zzeqk(zzeqkVar.zzb, zzepvVar.zzb);
        }
        zzfla<AdT> zzb2 = this.zza.zzb(zzeqkVar, zzeqiVar);
        this.zzd = (R) ((zzeqa) this.zza).zzc();
        return zzb2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzfla zzd(zzeqi zzeqiVar, zzevo zzevoVar) throws Exception {
        zzevq zzevqVar;
        if (zzevoVar == null || zzevoVar.zza == null || (zzevqVar = zzevoVar.zzb) == null) {
            throw new zzdsp(1, "Empty prefetch");
        }
        zzavv zza = zzawd.zza();
        zzavt zza2 = zzavu.zza();
        zza2.zza(zzavy.IN_MEMORY);
        zza2.zzb(zzawa.zza());
        zza.zza(zza2);
        zzevoVar.zza.zza.zzd().zzm(zza.zzah());
        return zzf(zzevoVar.zza, ((zzepp) zzevqVar).zzb, zzeqiVar);
    }
}
