package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.io.IOException;
import java.util.HashMap;
import java.util.Objects;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public abstract class zzzt<T> extends zzzm {
    private final HashMap<T, zzzs> zza = new HashMap<>();
    private Handler zzb;
    private zzafp zzc;

    @Override // com.google.android.gms.internal.ads.zzzm
    protected final void zzE() {
        for (zzzs zzzsVar : this.zza.values()) {
            zzzsVar.zza.zzo(zzzsVar.zzb);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzzm
    public void zza(zzafp zzafpVar) {
        this.zzc = zzafpVar;
        this.zzb = zzaht.zzh(null);
    }

    @Override // com.google.android.gms.internal.ads.zzzm
    protected final void zzc() {
        for (zzzs zzzsVar : this.zza.values()) {
            zzzsVar.zza.zzp(zzzsVar.zzb);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzzm
    public void zzd() {
        for (zzzs zzzsVar : this.zza.values()) {
            zzzsVar.zza.zzq(zzzsVar.zzb);
            zzzsVar.zza.zzl(zzzsVar.zzc);
        }
        this.zza.clear();
    }

    @Override // com.google.android.gms.internal.ads.zzaal
    public void zzt() throws IOException {
        for (zzzs zzzsVar : this.zza.values()) {
            zzzsVar.zza.zzt();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract void zzu(T t, zzaal zzaalVar, zzlq zzlqVar);

    /* JADX INFO: Access modifiers changed from: protected */
    public final void zzv(final T t, zzaal zzaalVar) {
        zzafs.zza(!this.zza.containsKey(t));
        zzaak zzaakVar = new zzaak(this, t) { // from class: com.google.android.gms.internal.ads.zzzq
            private final zzzt zza;
            private final Object zzb;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = this;
                this.zzb = t;
            }

            @Override // com.google.android.gms.internal.ads.zzaak
            public final void zza(zzaal zzaalVar2, zzlq zzlqVar) {
                this.zza.zzu(this.zzb, zzaalVar2, zzlqVar);
            }
        };
        zzzr zzzrVar = new zzzr(this, t);
        this.zza.put(t, new zzzs(zzaalVar, zzaakVar, zzzrVar));
        Handler handler = this.zzb;
        Objects.requireNonNull(handler);
        zzaalVar.zzk(handler, zzzrVar);
        Handler handler2 = this.zzb;
        Objects.requireNonNull(handler2);
        zzaalVar.zzm(handler2, zzzrVar);
        zzaalVar.zzn(zzaakVar, this.zzc);
        if (zzj()) {
            return;
        }
        zzaalVar.zzp(zzaakVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public zzaaj zzw(T t, zzaaj zzaajVar) {
        throw null;
    }
}
