package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.RequestConfiguration;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzexc<O> {
    final /* synthetic */ zzexd zza;
    private final Object zzb;
    private final String zzc;
    private final zzfla<?> zzd;
    private final List<zzfla<?>> zze;
    private final zzfla<O> zzf;

    private zzexc(zzexd zzexdVar, zzexd zzexdVar2, String str, zzfla zzflaVar, List<zzfla> list, zzfla<O> zzflaVar2) {
        this.zza = zzexdVar;
        this.zzb = zzexdVar2;
        this.zzc = str;
        this.zzd = zzflaVar;
        this.zze = list;
        this.zzf = zzflaVar2;
    }

    public final zzexc<O> zza(String str) {
        return new zzexc<>(this.zza, this.zzb, str, this.zzd, this.zze, this.zzf);
    }

    public final <O2> zzexc<O2> zzb(final zzewp<O, O2> zzewpVar) {
        return zzc(new zzfjz(zzewpVar) { // from class: com.google.android.gms.internal.ads.zzewx
            private final zzewp zza;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = zzewpVar;
            }

            @Override // com.google.android.gms.internal.ads.zzfjz
            public final zzfla zza(Object obj) {
                return zzfks.zza(this.zza.zza(obj));
            }
        });
    }

    public final <O2> zzexc<O2> zzc(zzfjz<O, O2> zzfjzVar) {
        zzflb zzflbVar;
        zzflbVar = this.zza.zzb;
        return zzd(zzfjzVar, zzflbVar);
    }

    public final <O2> zzexc<O2> zzd(zzfjz<O, O2> zzfjzVar, Executor executor) {
        return new zzexc<>(this.zza, this.zzb, this.zzc, this.zzd, this.zze, zzfks.zzi(this.zzf, zzfjzVar, executor));
    }

    public final <O2> zzexc<O2> zze(final zzfla<O2> zzflaVar) {
        return zzd(new zzfjz(zzflaVar) { // from class: com.google.android.gms.internal.ads.zzewy
            private final zzfla zza;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = zzflaVar;
            }

            @Override // com.google.android.gms.internal.ads.zzfjz
            public final zzfla zza(Object obj) {
                return this.zza;
            }
        }, zzccz.zzf);
    }

    public final <T extends Throwable> zzexc<O> zzf(Class<T> cls, final zzewp<T, O> zzewpVar) {
        return zzg(cls, new zzfjz(zzewpVar) { // from class: com.google.android.gms.internal.ads.zzewz
            private final zzewp zza;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = zzewpVar;
            }

            @Override // com.google.android.gms.internal.ads.zzfjz
            public final zzfla zza(Object obj) {
                Exception exc = (Exception) ((Throwable) obj);
                return zzfks.zza(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
            }
        });
    }

    public final <T extends Throwable> zzexc<O> zzg(Class<T> cls, zzfjz<T, O> zzfjzVar) {
        zzflb zzflbVar;
        zzexd zzexdVar = this.zza;
        Object obj = this.zzb;
        String str = this.zzc;
        zzfla<?> zzflaVar = this.zzd;
        List<zzfla<?>> list = this.zze;
        zzfla<O> zzflaVar2 = this.zzf;
        zzflbVar = zzexdVar.zzb;
        return new zzexc<>(zzexdVar, obj, str, zzflaVar, list, zzfks.zzg(zzflaVar2, cls, zzfjzVar, zzflbVar));
    }

    public final zzexc<O> zzh(long j, TimeUnit timeUnit) {
        ScheduledExecutorService scheduledExecutorService;
        zzexd zzexdVar = this.zza;
        Object obj = this.zzb;
        String str = this.zzc;
        zzfla<?> zzflaVar = this.zzd;
        List<zzfla<?>> list = this.zze;
        zzfla<O> zzflaVar2 = this.zzf;
        scheduledExecutorService = zzexdVar.zzc;
        return new zzexc<>(zzexdVar, obj, str, zzflaVar, list, zzfks.zzh(zzflaVar2, j, timeUnit, scheduledExecutorService));
    }

    public final zzewr zzi() {
        zzexe zzexeVar;
        Object obj = this.zzb;
        String str = this.zzc;
        if (str == null) {
            str = this.zza.zzc(obj);
        }
        final zzewr zzewrVar = new zzewr(obj, str, this.zzf);
        zzexeVar = this.zza.zzd;
        zzexeVar.zza(zzewrVar);
        this.zzd.zze(new Runnable(this, zzewrVar) { // from class: com.google.android.gms.internal.ads.zzexa
            private final zzexc zza;
            private final zzewr zzb;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = this;
                this.zzb = zzewrVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                zzexe zzexeVar2;
                zzexc zzexcVar = this.zza;
                zzewr zzewrVar2 = this.zzb;
                zzexeVar2 = zzexcVar.zza.zzd;
                zzexeVar2.zzb(zzewrVar2);
            }
        }, zzccz.zzf);
        zzfks.zzp(zzewrVar, new zzexb(this, zzewrVar), zzccz.zzf);
        return zzewrVar;
    }

    public final zzexc<O> zzj(Object obj) {
        return this.zza.zza(obj, zzi());
    }
}
