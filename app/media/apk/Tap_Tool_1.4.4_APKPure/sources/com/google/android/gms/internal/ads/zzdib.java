package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.common.util.Clock;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzdib implements View.OnClickListener {
    String zza;
    Long zzb;
    WeakReference<View> zzc;
    private final zzdlt zzd;
    private final Clock zze;
    private zzbka zzf;
    private zzblp<Object> zzg;

    public zzdib(zzdlt zzdltVar, Clock clock) {
        this.zzd = zzdltVar;
        this.zze = clock;
    }

    private final void zzd() {
        View view;
        this.zza = null;
        this.zzb = null;
        WeakReference<View> weakReference = this.zzc;
        if (weakReference == null || (view = weakReference.get()) == null) {
            return;
        }
        view.setClickable(false);
        view.setOnClickListener(null);
        this.zzc = null;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        WeakReference<View> weakReference = this.zzc;
        if (weakReference == null || weakReference.get() != view) {
            return;
        }
        if (this.zza != null && this.zzb != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("id", this.zza);
            hashMap.put("time_interval", String.valueOf(this.zze.currentTimeMillis() - this.zzb.longValue()));
            hashMap.put("messageType", "onePointFiveClick");
            this.zzd.zzf("sendMessageToNativeJs", hashMap);
        }
        zzd();
    }

    public final void zza(final zzbka zzbkaVar) {
        this.zzf = zzbkaVar;
        zzblp<Object> zzblpVar = this.zzg;
        if (zzblpVar != null) {
            this.zzd.zze("/unconfirmedClick", zzblpVar);
        }
        zzblp<Object> zzblpVar2 = new zzblp(this, zzbkaVar) { // from class: com.google.android.gms.internal.ads.zzdia
            private final zzdib zza;
            private final zzbka zzb;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = this;
                this.zzb = zzbkaVar;
            }

            @Override // com.google.android.gms.internal.ads.zzblp
            public final void zza(Object obj, Map map) {
                zzdib zzdibVar = this.zza;
                zzbka zzbkaVar2 = this.zzb;
                try {
                    zzdibVar.zzb = Long.valueOf(Long.parseLong((String) map.get("timestamp")));
                } catch (NumberFormatException unused) {
                    com.google.android.gms.ads.internal.util.zze.zzf("Failed to call parse unconfirmedClickTimestamp.");
                }
                zzdibVar.zza = (String) map.get("id");
                String str = (String) map.get("asset_id");
                if (zzbkaVar2 == null) {
                    com.google.android.gms.ads.internal.util.zze.zzd("Received unconfirmed click but UnconfirmedClickListener is null.");
                    return;
                }
                try {
                    zzbkaVar2.zze(str);
                } catch (RemoteException e) {
                    zzccn.zzl("#007 Could not call remote method.", e);
                }
            }
        };
        this.zzg = zzblpVar2;
        this.zzd.zzd("/unconfirmedClick", zzblpVar2);
    }

    public final zzbka zzb() {
        return this.zzf;
    }

    public final void zzc() {
        if (this.zzf == null || this.zzb == null) {
            return;
        }
        zzd();
        try {
            this.zzf.zzf();
        } catch (RemoteException e) {
            zzccn.zzl("#007 Could not call remote method.", e);
        }
    }
}
