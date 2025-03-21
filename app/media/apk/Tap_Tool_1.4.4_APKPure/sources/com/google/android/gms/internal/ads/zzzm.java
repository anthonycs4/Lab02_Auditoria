package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Objects;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public abstract class zzzm implements zzaal {
    private final ArrayList<zzaak> zza = new ArrayList<>(1);
    private final HashSet<zzaak> zzb = new HashSet<>(1);
    private final zzaas zzc = new zzaas();
    private final zzou zzd = new zzou();
    private Looper zze;
    private zzlq zzf;

    protected void zzE() {
    }

    protected abstract void zza(zzafp zzafpVar);

    protected void zzc() {
    }

    protected abstract void zzd();

    /* JADX INFO: Access modifiers changed from: protected */
    public final void zze(zzlq zzlqVar) {
        this.zzf = zzlqVar;
        ArrayList<zzaak> arrayList = this.zza;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            arrayList.get(i).zza(this, zzlqVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final zzaas zzf(zzaaj zzaajVar) {
        return this.zzc.zza(0, zzaajVar, 0L);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final zzaas zzg(int i, zzaaj zzaajVar, long j) {
        return this.zzc.zza(i, zzaajVar, 0L);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final zzou zzh(zzaaj zzaajVar) {
        return this.zzd.zza(0, zzaajVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final zzou zzi(int i, zzaaj zzaajVar) {
        return this.zzd.zza(i, zzaajVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean zzj() {
        return !this.zzb.isEmpty();
    }

    @Override // com.google.android.gms.internal.ads.zzaal
    public final void zzl(zzaat zzaatVar) {
        this.zzc.zzc(zzaatVar);
    }

    @Override // com.google.android.gms.internal.ads.zzaal
    public final void zzn(zzaak zzaakVar, zzafp zzafpVar) {
        Looper myLooper = Looper.myLooper();
        Looper looper = this.zze;
        boolean z = true;
        if (looper != null && looper != myLooper) {
            z = false;
        }
        zzafs.zza(z);
        zzlq zzlqVar = this.zzf;
        this.zza.add(zzaakVar);
        if (this.zze == null) {
            this.zze = myLooper;
            this.zzb.add(zzaakVar);
            zza(zzafpVar);
        } else if (zzlqVar != null) {
            zzo(zzaakVar);
            zzaakVar.zza(this, zzlqVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaal
    public final void zzp(zzaak zzaakVar) {
        boolean isEmpty = this.zzb.isEmpty();
        this.zzb.remove(zzaakVar);
        if ((!isEmpty) && this.zzb.isEmpty()) {
            zzc();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaal
    public final void zzq(zzaak zzaakVar) {
        this.zza.remove(zzaakVar);
        if (this.zza.isEmpty()) {
            this.zze = null;
            this.zzf = null;
            this.zzb.clear();
            zzd();
            return;
        }
        zzp(zzaakVar);
    }

    @Override // com.google.android.gms.internal.ads.zzaal
    public final zzlq zzr() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzaal
    public final boolean zzs() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzaal
    public final void zzm(Handler handler, zzov zzovVar) {
        Objects.requireNonNull(zzovVar);
        this.zzd.zzb(handler, zzovVar);
    }

    @Override // com.google.android.gms.internal.ads.zzaal
    public final void zzk(Handler handler, zzaat zzaatVar) {
        Objects.requireNonNull(handler);
        Objects.requireNonNull(zzaatVar);
        this.zzc.zzb(handler, zzaatVar);
    }

    @Override // com.google.android.gms.internal.ads.zzaal
    public final void zzo(zzaak zzaakVar) {
        Objects.requireNonNull(this.zze);
        boolean isEmpty = this.zzb.isEmpty();
        this.zzb.add(zzaakVar);
        if (isEmpty) {
            zzE();
        }
    }
}
