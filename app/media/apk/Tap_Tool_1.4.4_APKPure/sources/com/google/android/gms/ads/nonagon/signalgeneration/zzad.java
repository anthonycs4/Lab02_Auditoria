package com.google.android.gms.ads.nonagon.signalgeneration;

import android.util.JsonReader;
import com.google.android.gms.internal.ads.zzbxf;
import com.google.android.gms.internal.ads.zzdtn;
import com.google.android.gms.internal.ads.zzfjz;
import com.google.android.gms.internal.ads.zzfks;
import com.google.android.gms.internal.ads.zzfla;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.concurrent.Executor;
import org.json.JSONException;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzad implements zzfjz<zzbxf, zzaf> {
    private final Executor zza;
    private final zzdtn zzb;

    public zzad(Executor executor, zzdtn zzdtnVar) {
        this.zza = executor;
        this.zzb = zzdtnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfjz
    public final /* bridge */ /* synthetic */ zzfla<zzaf> zza(zzbxf zzbxfVar) throws Exception {
        final zzbxf zzbxfVar2 = zzbxfVar;
        return zzfks.zzi(this.zzb.zza(zzbxfVar2), new zzfjz(zzbxfVar2) { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzac
            private final zzbxf zza;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = zzbxfVar2;
            }

            @Override // com.google.android.gms.internal.ads.zzfjz
            public final zzfla zza(Object obj) {
                zzbxf zzbxfVar3 = this.zza;
                zzaf zzafVar = new zzaf(new JsonReader(new InputStreamReader((InputStream) obj)));
                try {
                    zzafVar.zzb = com.google.android.gms.ads.internal.zzs.zzc().zzh(zzbxfVar3.zza).toString();
                } catch (JSONException unused) {
                    zzafVar.zzb = "{}";
                }
                return zzfks.zza(zzafVar);
            }
        }, this.zza);
    }
}
