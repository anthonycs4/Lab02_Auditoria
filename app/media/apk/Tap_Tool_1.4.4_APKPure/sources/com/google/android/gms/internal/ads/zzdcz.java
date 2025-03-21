package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzdcz extends zzdbe<zzasi> implements zzasi {
    private final Map<View, zzasj> zzb;
    private final Context zzc;
    private final zzess zzd;

    public zzdcz(Context context, Set<zzdcx<zzasi>> set, zzess zzessVar) {
        super(set);
        this.zzb = new WeakHashMap(1);
        this.zzc = context;
        this.zzd = zzessVar;
    }

    public final synchronized void zza(View view) {
        zzasj zzasjVar = this.zzb.get(view);
        if (zzasjVar == null) {
            zzasjVar = new zzasj(this.zzc, view);
            zzasjVar.zza(this);
            this.zzb.put(view, zzasjVar);
        }
        if (this.zzd.zzR) {
            if (((Boolean) zzbba.zzc().zzb(zzbfq.zzaS)).booleanValue()) {
                zzasjVar.zzd(((Long) zzbba.zzc().zzb(zzbfq.zzaR)).longValue());
                return;
            }
        }
        zzasjVar.zze();
    }

    public final synchronized void zzb(View view) {
        if (this.zzb.containsKey(view)) {
            this.zzb.get(view).zzb(this);
            this.zzb.remove(view);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzasi
    public final synchronized void zzc(final zzash zzashVar) {
        zzr(new zzdbd(zzashVar) { // from class: com.google.android.gms.internal.ads.zzdcy
            private final zzash zza;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = zzashVar;
            }

            @Override // com.google.android.gms.internal.ads.zzdbd
            public final void zza(Object obj) {
                ((zzasi) obj).zzc(this.zza);
            }
        });
    }
}
