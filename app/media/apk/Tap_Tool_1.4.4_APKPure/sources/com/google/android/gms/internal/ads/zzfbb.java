package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzfbb {
    public static final /* synthetic */ int zza = 0;
    private static volatile zzca zzf = zzca.UNKNOWN;
    private final Context zzb;
    private final Executor zzc;
    private final Task<zzfdh> zzd;
    private final boolean zze;

    zzfbb(Context context, Executor executor, Task<zzfdh> task, boolean z) {
        this.zzb = context;
        this.zzc = executor;
        this.zzd = task;
        this.zze = z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void zza(zzca zzcaVar) {
        zzf = zzcaVar;
    }

    public static zzfbb zzb(final Context context, Executor executor, boolean z) {
        return new zzfbb(context, executor, Tasks.call(executor, new Callable(context) { // from class: com.google.android.gms.internal.ads.zzfay
            private final Context zza;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = context;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new zzfdh(this.zza, "GLAS", null);
            }
        }), z);
    }

    private final Task<Boolean> zzh(final int i, long j, Exception exc, String str, Map<String, String> map, String str2) {
        if (!this.zze) {
            return this.zzd.continueWith(this.zzc, zzfaz.zza);
        }
        final zzbv zza2 = zzcb.zza();
        zza2.zza(this.zzb.getPackageName());
        zza2.zzb(j);
        zza2.zzg(zzf);
        if (exc != null) {
            zza2.zzc(zzffc.zzb(exc));
            zza2.zzd(exc.getClass().getName());
        }
        if (str2 != null) {
            zza2.zze(str2);
        }
        if (str != null) {
            zza2.zzf(str);
        }
        return this.zzd.continueWith(this.zzc, new Continuation(zza2, i) { // from class: com.google.android.gms.internal.ads.zzfba
            private final zzbv zza;
            private final int zzb;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = zza2;
                this.zzb = i;
            }

            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                zzbv zzbvVar = this.zza;
                int i2 = this.zzb;
                int i3 = zzfbb.zza;
                if (task.isSuccessful()) {
                    zzfdg zza3 = ((zzfdh) task.getResult()).zza(zzbvVar.zzah().zzao());
                    zza3.zzc(i2);
                    zza3.zza();
                    return true;
                }
                return false;
            }
        });
    }

    public final Task<Boolean> zzc(int i, long j) {
        return zzh(i, j, null, null, null, null);
    }

    public final Task<Boolean> zzd(int i, long j, Exception exc) {
        return zzh(i, j, exc, null, null, null);
    }

    public final Task<Boolean> zze(int i, long j, String str, Map<String, String> map) {
        return zzh(i, j, null, str, null, null);
    }

    public final Task<Boolean> zzf(int i, String str) {
        return zzh(i, 0L, null, null, null, str);
    }

    public final Task<Boolean> zzg(int i, long j, String str) {
        return zzh(i, j, null, null, null, str);
    }
}
