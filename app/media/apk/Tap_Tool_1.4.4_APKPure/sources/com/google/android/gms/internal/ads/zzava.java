package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.BaseGmsClient;
import java.io.IOException;
import java.util.concurrent.Future;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzava implements BaseGmsClient.BaseConnectionCallbacks {
    public static final /* synthetic */ int zzd = 0;
    final /* synthetic */ zzaus zza;
    final /* synthetic */ zzcde zzb;
    final /* synthetic */ zzavc zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzava(zzavc zzavcVar, zzaus zzausVar, zzcde zzcdeVar) {
        this.zzc = zzavcVar;
        this.zza = zzausVar;
        this.zzb = zzcdeVar;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnected(Bundle bundle) {
        Object obj;
        boolean z;
        final zzaur zzaurVar;
        obj = this.zzc.zzd;
        synchronized (obj) {
            z = this.zzc.zzb;
            if (z) {
                return;
            }
            zzavc.zze(this.zzc, true);
            zzaurVar = this.zzc.zza;
            if (zzaurVar != null) {
                zzflb zzflbVar = zzccz.zza;
                final zzaus zzausVar = this.zza;
                final zzcde zzcdeVar = this.zzb;
                final zzfla<?> zza = zzflbVar.zza(new Runnable(this, zzaurVar, zzausVar, zzcdeVar) { // from class: com.google.android.gms.internal.ads.zzaux
                    private final zzava zza;
                    private final zzaur zzb;
                    private final zzaus zzc;
                    private final zzcde zzd;

                    /* JADX INFO: Access modifiers changed from: package-private */
                    {
                        this.zza = this;
                        this.zzb = zzaurVar;
                        this.zzc = zzausVar;
                        this.zzd = zzcdeVar;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        zzaup zze;
                        zzava zzavaVar = this.zza;
                        zzaur zzaurVar2 = this.zzb;
                        zzaus zzausVar2 = this.zzc;
                        zzcde zzcdeVar2 = this.zzd;
                        try {
                            zzauu zzq = zzaurVar2.zzq();
                            if (zzaurVar2.zzp()) {
                                zze = zzq.zzf(zzausVar2);
                            } else {
                                zze = zzq.zze(zzausVar2);
                            }
                            if (zze.zza()) {
                                zzauz zzauzVar = new zzauz(zzavaVar, zze.zzb(), 1);
                                int read = zzauzVar.read();
                                if (read == -1) {
                                    throw new IOException("Unable to read from cache.");
                                }
                                zzauzVar.unread(read);
                                zzcdeVar2.zzc(zzave.zza(zzauzVar, zze.zzd(), zze.zzg(), zze.zzf(), zze.zze()));
                                return;
                            }
                            zzcdeVar2.zzd(new RuntimeException("No entry contents."));
                            zzavc.zzb(zzavaVar.zzc);
                        } catch (RemoteException | IOException e) {
                            com.google.android.gms.ads.internal.util.zze.zzg("Unable to obtain a cache service instance.", e);
                            zzcdeVar2.zzd(e);
                            zzavc.zzb(zzavaVar.zzc);
                        }
                    }
                });
                final zzcde zzcdeVar2 = this.zzb;
                zzcdeVar2.zze(new Runnable(zzcdeVar2, zza) { // from class: com.google.android.gms.internal.ads.zzauy
                    private final zzcde zza;
                    private final Future zzb;

                    /* JADX INFO: Access modifiers changed from: package-private */
                    {
                        this.zza = zzcdeVar2;
                        this.zzb = zza;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        zzcde zzcdeVar3 = this.zza;
                        Future future = this.zzb;
                        int i = zzava.zzd;
                        if (zzcdeVar3.isCancelled()) {
                            future.cancel(true);
                        }
                    }
                }, zzccz.zzf);
            }
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnectionSuspended(int i) {
    }
}
