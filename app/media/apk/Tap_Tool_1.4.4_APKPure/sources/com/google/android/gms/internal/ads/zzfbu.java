package com.google.android.gms.internal.ads;

import android.content.Context;
import android.util.Base64;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.nio.ByteBuffer;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzfbu {
    private final Context zza;
    private final Executor zzb;
    private final zzfbb zzc;
    private final zzfbd zzd;
    private final zzfbt zze;
    private final zzfbt zzf;
    private Task<zzdc> zzg;
    private Task<zzdc> zzh;

    zzfbu(Context context, Executor executor, zzfbb zzfbbVar, zzfbd zzfbdVar, zzfbr zzfbrVar, zzfbs zzfbsVar) {
        this.zza = context;
        this.zzb = executor;
        this.zzc = zzfbbVar;
        this.zzd = zzfbdVar;
        this.zze = zzfbrVar;
        this.zzf = zzfbsVar;
    }

    public static zzfbu zza(Context context, Executor executor, zzfbb zzfbbVar, zzfbd zzfbdVar) {
        final zzfbu zzfbuVar = new zzfbu(context, executor, zzfbbVar, zzfbdVar, new zzfbr(), new zzfbs());
        if (zzfbuVar.zzd.zzb()) {
            zzfbuVar.zzg = zzfbuVar.zzg(new Callable(zzfbuVar) { // from class: com.google.android.gms.internal.ads.zzfbo
                private final zzfbu zza;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zza = zzfbuVar;
                }

                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.zza.zzf();
                }
            });
        } else {
            zzfbuVar.zzg = Tasks.forResult(zzfbuVar.zze.zza());
        }
        zzfbuVar.zzh = zzfbuVar.zzg(new Callable(zzfbuVar) { // from class: com.google.android.gms.internal.ads.zzfbp
            private final zzfbu zza;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = zzfbuVar;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.zza.zze();
            }
        });
        return zzfbuVar;
    }

    private final Task<zzdc> zzg(Callable<zzdc> callable) {
        return Tasks.call(this.zzb, callable).addOnFailureListener(this.zzb, new OnFailureListener(this) { // from class: com.google.android.gms.internal.ads.zzfbq
            private final zzfbu zza;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = this;
            }

            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception exc) {
                this.zza.zzd(exc);
            }
        });
    }

    private static zzdc zzh(Task<zzdc> task, zzdc zzdcVar) {
        return !task.isSuccessful() ? zzdcVar : task.getResult();
    }

    public final zzdc zzb() {
        return zzh(this.zzg, this.zze.zza());
    }

    public final zzdc zzc() {
        return zzh(this.zzh, this.zzf.zza());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzd(Exception exc) {
        if (exc instanceof InterruptedException) {
            Thread.currentThread().interrupt();
        }
        this.zzc.zzd(2025, -1L, exc);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzdc zze() throws Exception {
        Context context = this.zza;
        return zzfbj.zza(context, context.getPackageName(), Integer.toString(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzdc zzf() throws Exception {
        Context context = this.zza;
        zzcn zzj = zzdc.zzj();
        AdvertisingIdClient advertisingIdClient = new AdvertisingIdClient(context);
        advertisingIdClient.start();
        AdvertisingIdClient.Info info = advertisingIdClient.getInfo();
        String id = info.getId();
        if (id != null && id.matches("^[a-fA-F0-9]{8}-([a-fA-F0-9]{4}-){3}[a-fA-F0-9]{12}$")) {
            UUID fromString = UUID.fromString(id);
            byte[] bArr = new byte[16];
            ByteBuffer wrap = ByteBuffer.wrap(bArr);
            wrap.putLong(fromString.getMostSignificantBits());
            wrap.putLong(fromString.getLeastSignificantBits());
            id = Base64.encodeToString(bArr, 11);
        }
        if (id != null) {
            zzj.zzX(id);
            zzj.zzZ(info.isLimitAdTrackingEnabled());
            zzj.zzY(zzct.DEVICE_IDENTIFIER_ANDROID_AD_ID);
        }
        return zzj.zzah();
    }
}
