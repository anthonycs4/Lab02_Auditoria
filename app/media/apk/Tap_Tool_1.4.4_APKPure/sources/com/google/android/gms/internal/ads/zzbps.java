package com.google.android.gms.internal.ads;

import java.util.AbstractMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzbps implements zzboi, zzbpr {
    private final zzbpr zza;
    private final HashSet<AbstractMap.SimpleEntry<String, zzblp<? super zzbpr>>> zzb = new HashSet<>();

    public zzbps(zzbpr zzbprVar) {
        this.zza = zzbprVar;
    }

    @Override // com.google.android.gms.internal.ads.zzboi, com.google.android.gms.internal.ads.zzbou
    public final void zza(String str) {
        this.zza.zza(str);
    }

    @Override // com.google.android.gms.internal.ads.zzboi, com.google.android.gms.internal.ads.zzbou
    public final void zzb(String str, String str2) {
        zzboh.zzb(this, str, str2);
    }

    public final void zzc() {
        Iterator<AbstractMap.SimpleEntry<String, zzblp<? super zzbpr>>> it = this.zzb.iterator();
        while (it.hasNext()) {
            AbstractMap.SimpleEntry<String, zzblp<? super zzbpr>> next = it.next();
            String valueOf = String.valueOf(next.getValue().toString());
            com.google.android.gms.ads.internal.util.zze.zza(valueOf.length() != 0 ? "Unregistering eventhandler: ".concat(valueOf) : new String("Unregistering eventhandler: "));
            this.zza.zzm(next.getKey(), next.getValue());
        }
        this.zzb.clear();
    }

    @Override // com.google.android.gms.internal.ads.zzboi, com.google.android.gms.internal.ads.zzbog
    public final void zzd(String str, JSONObject jSONObject) {
        zzboh.zzc(this, str, jSONObject);
    }

    @Override // com.google.android.gms.internal.ads.zzbog
    public final void zze(String str, Map map) {
        zzboh.zzd(this, str, map);
    }

    @Override // com.google.android.gms.internal.ads.zzbpr
    public final void zzl(String str, zzblp<? super zzbpr> zzblpVar) {
        this.zza.zzl(str, zzblpVar);
        this.zzb.add(new AbstractMap.SimpleEntry<>(str, zzblpVar));
    }

    @Override // com.google.android.gms.internal.ads.zzbpr
    public final void zzm(String str, zzblp<? super zzbpr> zzblpVar) {
        this.zza.zzm(str, zzblpVar);
        this.zzb.remove(new AbstractMap.SimpleEntry(str, zzblpVar));
    }

    @Override // com.google.android.gms.internal.ads.zzbou
    public final void zzr(String str, JSONObject jSONObject) {
        zzboh.zza(this, str, jSONObject);
    }
}
