package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzegw implements zzeld<zzegx> {
    private final zzflb zza;
    private final zzdnl zzb;
    private final zzdro zzc;
    private final zzegy zzd;

    public zzegw(zzflb zzflbVar, zzdnl zzdnlVar, zzdro zzdroVar, zzegy zzegyVar) {
        this.zza = zzflbVar;
        this.zzb = zzdnlVar;
        this.zzc = zzdroVar;
        this.zzd = zzegyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeld
    public final zzfla<zzegx> zza() {
        if (zzffa.zzc((String) zzbba.zzc().zzb(zzbfq.zzaW)) || this.zzd.zzb() || !this.zzc.zze()) {
            return zzfks.zza(new zzegx(new Bundle(), null));
        }
        this.zzd.zza(true);
        return this.zza.zzb(new Callable(this) { // from class: com.google.android.gms.internal.ads.zzegv
            private final zzegw zza;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.zza.zzb();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzegx zzb() throws Exception {
        List<String> asList = Arrays.asList(((String) zzbba.zzc().zzb(zzbfq.zzaW)).split(";"));
        Bundle bundle = new Bundle();
        for (String str : asList) {
            try {
                zzeub zzb = this.zzb.zzb(str, new JSONObject());
                zzb.zzn();
                Bundle bundle2 = new Bundle();
                try {
                    zzbty zzA = zzb.zzA();
                    if (zzA != null) {
                        bundle2.putString("sdk_version", zzA.toString());
                    }
                } catch (zzetp unused) {
                }
                try {
                    zzbty zzz = zzb.zzz();
                    if (zzz != null) {
                        bundle2.putString("adapter_version", zzz.toString());
                    }
                } catch (zzetp unused2) {
                }
                bundle.putBundle(str, bundle2);
            } catch (zzetp unused3) {
            }
        }
        return new zzegx(bundle, null);
    }
}
