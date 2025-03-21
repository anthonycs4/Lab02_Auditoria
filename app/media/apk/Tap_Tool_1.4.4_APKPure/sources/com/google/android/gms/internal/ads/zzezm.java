package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzezm {
    private static final zzezm zza = new zzezm();
    private Context zzb;
    private BroadcastReceiver zzc;
    private boolean zzd;
    private boolean zze;
    private zzezr zzf;

    private zzezm() {
    }

    public static zzezm zza() {
        return zza;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzf(zzezm zzezmVar, boolean z) {
        if (zzezmVar.zze != z) {
            zzezmVar.zze = z;
            if (zzezmVar.zzd) {
                zzezmVar.zzh();
                if (zzezmVar.zzf != null) {
                    if (zzezmVar.zze()) {
                        zzfan.zzb().zzc();
                    } else {
                        zzfan.zzb().zze();
                    }
                }
            }
        }
    }

    private final void zzh() {
        boolean z = this.zze;
        for (zzeyz zzeyzVar : zzezk.zza().zze()) {
            zzezx zzh = zzeyzVar.zzh();
            if (zzh.zze()) {
                zzezq.zza().zzg(zzh.zzd(), "setState", true != z ? "foregrounded" : "backgrounded");
            }
        }
    }

    public final void zzb(Context context) {
        this.zzb = context.getApplicationContext();
    }

    public final void zzc() {
        this.zzc = new zzezl(this);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        intentFilter.addAction("android.intent.action.SCREEN_ON");
        intentFilter.addAction("android.intent.action.USER_PRESENT");
        this.zzb.registerReceiver(this.zzc, intentFilter);
        this.zzd = true;
        zzh();
    }

    public final void zzd() {
        BroadcastReceiver broadcastReceiver;
        Context context = this.zzb;
        if (context != null && (broadcastReceiver = this.zzc) != null) {
            context.unregisterReceiver(broadcastReceiver);
            this.zzc = null;
        }
        this.zzd = false;
        this.zze = false;
        this.zzf = null;
    }

    public final boolean zze() {
        return !this.zze;
    }

    public final void zzg(zzezr zzezrVar) {
        this.zzf = zzezrVar;
    }
}
