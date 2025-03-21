package com.google.android.gms.internal.ads;

import android.content.Context;
import android.util.SparseArray;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzzw implements zzaau {
    private final zzaee zza;
    private final SparseArray<zzaau> zzb;
    private final int[] zzc;

    public zzzw(Context context) {
        zzaep zzaepVar = new zzaep(context, null, null);
        zzpp zzppVar = new zzpp();
        this.zza = zzaepVar;
        SparseArray<zzaau> sparseArray = new SparseArray<>();
        try {
            sparseArray.put(0, (zzaau) Class.forName("com.google.android.exoplayer2.source.dash.DashMediaSource$Factory").asSubclass(zzaau.class).getConstructor(zzaee.class).newInstance(zzaepVar));
        } catch (Exception unused) {
        }
        try {
            sparseArray.put(1, (zzaau) Class.forName("com.google.android.exoplayer2.source.smoothstreaming.SsMediaSource$Factory").asSubclass(zzaau.class).getConstructor(zzaee.class).newInstance(zzaepVar));
        } catch (Exception unused2) {
        }
        try {
            sparseArray.put(2, (zzaau) Class.forName("com.google.android.exoplayer2.source.hls.HlsMediaSource$Factory").asSubclass(zzaau.class).getConstructor(zzaee.class).newInstance(zzaepVar));
        } catch (Exception unused3) {
        }
        sparseArray.put(3, new zzabn(zzaepVar, zzppVar));
        this.zzb = sparseArray;
        this.zzc = new int[sparseArray.size()];
        for (int i = 0; i < this.zzb.size(); i++) {
            this.zzc[i] = this.zzb.keyAt(i);
        }
    }
}
