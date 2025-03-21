package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzaas {
    public final int zza;
    public final zzaaj zzb;
    private final CopyOnWriteArrayList<zzaar> zzc;

    public zzaas() {
        this(new CopyOnWriteArrayList(), 0, null, 0L);
    }

    private zzaas(CopyOnWriteArrayList<zzaar> copyOnWriteArrayList, int i, zzaaj zzaajVar, long j) {
        this.zzc = copyOnWriteArrayList;
        this.zza = i;
        this.zzb = zzaajVar;
    }

    private static final long zzn(long j) {
        long zza = zzhx.zza(j);
        if (zza == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return zza;
    }

    public final zzaas zza(int i, zzaaj zzaajVar, long j) {
        return new zzaas(this.zzc, i, zzaajVar, 0L);
    }

    public final void zzb(Handler handler, zzaat zzaatVar) {
        this.zzc.add(new zzaar(handler, zzaatVar));
    }

    public final void zzc(zzaat zzaatVar) {
        Iterator<zzaar> it = this.zzc.iterator();
        while (it.hasNext()) {
            zzaar next = it.next();
            if (next.zzb == zzaatVar) {
                this.zzc.remove(next);
            }
        }
    }

    public final void zzd(zzaaa zzaaaVar, int i, int i2, zzjq zzjqVar, int i3, Object obj, long j, long j2) {
        zze(zzaaaVar, new zzaaf(1, -1, null, 0, null, zzn(j), zzn(j2)));
    }

    public final void zze(final zzaaa zzaaaVar, final zzaaf zzaafVar) {
        Iterator<zzaar> it = this.zzc.iterator();
        while (it.hasNext()) {
            zzaar next = it.next();
            final zzaat zzaatVar = next.zzb;
            zzaht.zzj(next.zza, new Runnable(this, zzaatVar, zzaaaVar, zzaafVar) { // from class: com.google.android.gms.internal.ads.zzaam
                private final zzaas zza;
                private final zzaat zzb;
                private final zzaaa zzc;
                private final zzaaf zzd;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zza = this;
                    this.zzb = zzaatVar;
                    this.zzc = zzaaaVar;
                    this.zzd = zzaafVar;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    zzaas zzaasVar = this.zza;
                    this.zzb.zza(zzaasVar.zza, zzaasVar.zzb, this.zzc, this.zzd);
                }
            });
        }
    }

    public final void zzf(zzaaa zzaaaVar, int i, int i2, zzjq zzjqVar, int i3, Object obj, long j, long j2) {
        zzg(zzaaaVar, new zzaaf(1, -1, null, 0, null, zzn(j), zzn(j2)));
    }

    public final void zzg(final zzaaa zzaaaVar, final zzaaf zzaafVar) {
        Iterator<zzaar> it = this.zzc.iterator();
        while (it.hasNext()) {
            zzaar next = it.next();
            final zzaat zzaatVar = next.zzb;
            zzaht.zzj(next.zza, new Runnable(this, zzaatVar, zzaaaVar, zzaafVar) { // from class: com.google.android.gms.internal.ads.zzaan
                private final zzaas zza;
                private final zzaat zzb;
                private final zzaaa zzc;
                private final zzaaf zzd;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zza = this;
                    this.zzb = zzaatVar;
                    this.zzc = zzaaaVar;
                    this.zzd = zzaafVar;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    zzaas zzaasVar = this.zza;
                    this.zzb.zzbs(zzaasVar.zza, zzaasVar.zzb, this.zzc, this.zzd);
                }
            });
        }
    }

    public final void zzh(zzaaa zzaaaVar, int i, int i2, zzjq zzjqVar, int i3, Object obj, long j, long j2) {
        zzi(zzaaaVar, new zzaaf(1, -1, null, 0, null, zzn(j), zzn(j2)));
    }

    public final void zzi(final zzaaa zzaaaVar, final zzaaf zzaafVar) {
        Iterator<zzaar> it = this.zzc.iterator();
        while (it.hasNext()) {
            zzaar next = it.next();
            final zzaat zzaatVar = next.zzb;
            zzaht.zzj(next.zza, new Runnable(this, zzaatVar, zzaaaVar, zzaafVar) { // from class: com.google.android.gms.internal.ads.zzaao
                private final zzaas zza;
                private final zzaat zzb;
                private final zzaaa zzc;
                private final zzaaf zzd;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zza = this;
                    this.zzb = zzaatVar;
                    this.zzc = zzaaaVar;
                    this.zzd = zzaafVar;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    zzaas zzaasVar = this.zza;
                    this.zzb.zzbt(zzaasVar.zza, zzaasVar.zzb, this.zzc, this.zzd);
                }
            });
        }
    }

    public final void zzj(zzaaa zzaaaVar, int i, int i2, zzjq zzjqVar, int i3, Object obj, long j, long j2, IOException iOException, boolean z) {
        zzk(zzaaaVar, new zzaaf(1, -1, null, 0, null, zzn(j), zzn(j2)), iOException, z);
    }

    public final void zzk(final zzaaa zzaaaVar, final zzaaf zzaafVar, final IOException iOException, final boolean z) {
        Iterator<zzaar> it = this.zzc.iterator();
        while (it.hasNext()) {
            zzaar next = it.next();
            final zzaat zzaatVar = next.zzb;
            zzaht.zzj(next.zza, new Runnable(this, zzaatVar, zzaaaVar, zzaafVar, iOException, z) { // from class: com.google.android.gms.internal.ads.zzaap
                private final zzaas zza;
                private final zzaat zzb;
                private final zzaaa zzc;
                private final zzaaf zzd;
                private final IOException zze;
                private final boolean zzf;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zza = this;
                    this.zzb = zzaatVar;
                    this.zzc = zzaaaVar;
                    this.zzd = zzaafVar;
                    this.zze = iOException;
                    this.zzf = z;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    zzaas zzaasVar = this.zza;
                    this.zzb.zzbr(zzaasVar.zza, zzaasVar.zzb, this.zzc, this.zzd, this.zze, this.zzf);
                }
            });
        }
    }

    public final void zzl(int i, zzjq zzjqVar, int i2, Object obj, long j) {
        zzm(new zzaaf(1, i, zzjqVar, 0, null, zzn(j), -9223372036854775807L));
    }

    public final void zzm(final zzaaf zzaafVar) {
        Iterator<zzaar> it = this.zzc.iterator();
        while (it.hasNext()) {
            zzaar next = it.next();
            final zzaat zzaatVar = next.zzb;
            zzaht.zzj(next.zza, new Runnable(this, zzaatVar, zzaafVar) { // from class: com.google.android.gms.internal.ads.zzaaq
                private final zzaas zza;
                private final zzaat zzb;
                private final zzaaf zzc;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zza = this;
                    this.zzb = zzaatVar;
                    this.zzc = zzaafVar;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    zzaas zzaasVar = this.zza;
                    this.zzb.zzbu(zzaasVar.zza, zzaasVar.zzb, this.zzc);
                }
            });
        }
    }
}
