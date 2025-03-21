package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.HandlerThread;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
final class zzfbk implements BaseGmsClient.BaseConnectionCallbacks, BaseGmsClient.BaseOnConnectionFailedListener {
    protected final zzfcm zza;
    private final String zzb;
    private final String zzc;
    private final zzhj zzd;
    private final LinkedBlockingQueue<zzfcy> zze;
    private final HandlerThread zzf;
    private final zzfbb zzg;
    private final long zzh;

    public zzfbk(Context context, int i, zzhj zzhjVar, String str, String str2, String str3, zzfbb zzfbbVar) {
        this.zzb = str;
        this.zzd = zzhjVar;
        this.zzc = str2;
        this.zzg = zzfbbVar;
        HandlerThread handlerThread = new HandlerThread("GassDGClient");
        this.zzf = handlerThread;
        handlerThread.start();
        this.zzh = System.currentTimeMillis();
        zzfcm zzfcmVar = new zzfcm(context, handlerThread.getLooper(), this, this, 19621000);
        this.zza = zzfcmVar;
        this.zze = new LinkedBlockingQueue<>();
        zzfcmVar.checkAvailabilityAndConnect();
    }

    static zzfcy zzc() {
        return new zzfcy(null, 1);
    }

    private final void zze(int i, long j, Exception exc) {
        this.zzg.zzd(i, System.currentTimeMillis() - j, exc);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnected(Bundle bundle) {
        zzfcr zzd = zzd();
        if (zzd != null) {
            try {
                zzfcy zzg = zzd.zzg(new zzfcw(1, this.zzd, this.zzb, this.zzc));
                zze(5011, this.zzh, null);
                this.zze.put(zzg);
            } finally {
                try {
                } finally {
                }
            }
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener
    public final void onConnectionFailed(ConnectionResult connectionResult) {
        try {
            zze(4012, this.zzh, null);
            this.zze.put(zzc());
        } catch (InterruptedException unused) {
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnectionSuspended(int i) {
        try {
            zze(4011, this.zzh, null);
            this.zze.put(zzc());
        } catch (InterruptedException unused) {
        }
    }

    public final zzfcy zza(int i) {
        zzfcy zzfcyVar;
        try {
            zzfcyVar = this.zze.poll(50000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            zze(2009, this.zzh, e);
            zzfcyVar = null;
        }
        zze(3004, this.zzh, null);
        if (zzfcyVar != null) {
            if (zzfcyVar.zzc == 7) {
                zzfbb.zza(zzca.DISABLED);
            } else {
                zzfbb.zza(zzca.ENABLED);
            }
        }
        return zzfcyVar == null ? zzc() : zzfcyVar;
    }

    public final void zzb() {
        zzfcm zzfcmVar = this.zza;
        if (zzfcmVar != null) {
            if (zzfcmVar.isConnected() || this.zza.isConnecting()) {
                this.zza.disconnect();
            }
        }
    }

    protected final zzfcr zzd() {
        try {
            return this.zza.zzp();
        } catch (DeadObjectException | IllegalStateException unused) {
            return null;
        }
    }
}
