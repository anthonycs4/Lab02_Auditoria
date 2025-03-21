package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import java.util.concurrent.Executor;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzcph implements zzasi {
    private zzcib zza;
    private final Executor zzb;
    private final zzcot zzc;
    private final Clock zzd;
    private boolean zze = false;
    private boolean zzf = false;
    private final zzcow zzg = new zzcow();

    public zzcph(Executor executor, zzcot zzcotVar, Clock clock) {
        this.zzb = executor;
        this.zzc = zzcotVar;
        this.zzd = clock;
    }

    private final void zzg() {
        try {
            final JSONObject zzb = this.zzc.zzb(this.zzg);
            if (this.zza != null) {
                this.zzb.execute(new Runnable(this, zzb) { // from class: com.google.android.gms.internal.ads.zzcpg
                    private final zzcph zza;
                    private final JSONObject zzb;

                    /* JADX INFO: Access modifiers changed from: package-private */
                    {
                        this.zza = this;
                        this.zzb = zzb;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        this.zza.zzf(this.zzb);
                    }
                });
            }
        } catch (JSONException e) {
            com.google.android.gms.ads.internal.util.zze.zzb("Failed to call video active view js", e);
        }
    }

    public final void zza(zzcib zzcibVar) {
        this.zza = zzcibVar;
    }

    public final void zzb() {
        this.zze = false;
    }

    public final void zzd() {
        this.zze = true;
        zzg();
    }

    public final void zze(boolean z) {
        this.zzf = z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzf(JSONObject jSONObject) {
        this.zza.zzr("AFMA_updateActiveView", jSONObject);
    }

    @Override // com.google.android.gms.internal.ads.zzasi
    public final void zzc(zzash zzashVar) {
        zzcow zzcowVar = this.zzg;
        zzcowVar.zza = this.zzf ? false : zzashVar.zzj;
        zzcowVar.zzd = this.zzd.elapsedRealtime();
        this.zzg.zzf = zzashVar;
        if (this.zze) {
            zzg();
        }
    }
}
