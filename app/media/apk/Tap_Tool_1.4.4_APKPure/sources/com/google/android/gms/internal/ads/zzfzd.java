package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzfzd extends zzfwu<String> implements RandomAccess, zzfze {
    public static final zzfze zza;
    private static final zzfzd zzb;
    private final List<Object> zzc;

    static {
        zzfzd zzfzdVar = new zzfzd(10);
        zzb = zzfzdVar;
        zzfzdVar.zzb();
        zza = zzfzdVar;
    }

    public zzfzd() {
        this(10);
    }

    private static String zzj(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof zzfxj) {
            return ((zzfxj) obj).zzA(zzfyw.zza);
        }
        return zzfyw.zzd((byte[]) obj);
    }

    @Override // com.google.android.gms.internal.ads.zzfwu, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ void add(int i, Object obj) {
        zzbU();
        this.zzc.add(i, (String) obj);
        this.modCount++;
    }

    @Override // com.google.android.gms.internal.ads.zzfwu, java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection<? extends String> collection) {
        zzbU();
        if (collection instanceof zzfze) {
            collection = ((zzfze) collection).zzh();
        }
        boolean addAll = this.zzc.addAll(i, collection);
        this.modCount++;
        return addAll;
    }

    @Override // com.google.android.gms.internal.ads.zzfwu, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        zzbU();
        this.zzc.clear();
        this.modCount++;
    }

    @Override // com.google.android.gms.internal.ads.zzfwu, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        zzbU();
        Object remove = this.zzc.remove(i);
        this.modCount++;
        return zzj(remove);
    }

    @Override // com.google.android.gms.internal.ads.zzfwu, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        zzbU();
        return zzj(this.zzc.set(i, (String) obj));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc.size();
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: zzd */
    public final String get(int i) {
        Object obj = this.zzc.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof zzfxj) {
            zzfxj zzfxjVar = (zzfxj) obj;
            String zzA = zzfxjVar.zzA(zzfyw.zza);
            if (zzfxjVar.zzm()) {
                this.zzc.set(i, zzA);
            }
            return zzA;
        }
        byte[] bArr = (byte[]) obj;
        String zzd = zzfyw.zzd(bArr);
        if (zzfyw.zzc(bArr)) {
            this.zzc.set(i, zzd);
        }
        return zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzfyv
    public final /* bridge */ /* synthetic */ zzfyv zze(int i) {
        if (i < size()) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList = new ArrayList(i);
        arrayList.addAll(this.zzc);
        return new zzfzd(arrayList);
    }

    @Override // com.google.android.gms.internal.ads.zzfze
    public final void zzf(zzfxj zzfxjVar) {
        zzbU();
        this.zzc.add(zzfxjVar);
        this.modCount++;
    }

    @Override // com.google.android.gms.internal.ads.zzfze
    public final Object zzg(int i) {
        return this.zzc.get(i);
    }

    @Override // com.google.android.gms.internal.ads.zzfze
    public final List<?> zzh() {
        return Collections.unmodifiableList(this.zzc);
    }

    @Override // com.google.android.gms.internal.ads.zzfze
    public final zzfze zzi() {
        return zza() ? new zzgbd(this) : this;
    }

    public zzfzd(int i) {
        this.zzc = new ArrayList(i);
    }

    private zzfzd(ArrayList<Object> arrayList) {
        this.zzc = arrayList;
    }

    @Override // com.google.android.gms.internal.ads.zzfwu, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends String> collection) {
        return addAll(size(), collection);
    }
}
