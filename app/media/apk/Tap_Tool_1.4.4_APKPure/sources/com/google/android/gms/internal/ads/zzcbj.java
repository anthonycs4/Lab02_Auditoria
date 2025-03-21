package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.2.0 */
/* loaded from: classes.dex */
public interface zzcbj extends IInterface {
    void zze(IObjectWrapper iObjectWrapper, zzcbn zzcbnVar, zzcbg zzcbgVar) throws RemoteException;

    void zzf(IObjectWrapper iObjectWrapper) throws RemoteException;

    void zzg(List<Uri> list, IObjectWrapper iObjectWrapper, zzbwb zzbwbVar) throws RemoteException;

    void zzh(List<Uri> list, IObjectWrapper iObjectWrapper, zzbwb zzbwbVar) throws RemoteException;

    void zzi(zzbwi zzbwiVar) throws RemoteException;

    void zzj(IObjectWrapper iObjectWrapper) throws RemoteException;
}
