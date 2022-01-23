package com.rifqiakmals_19104022.modul7

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
class MyData (
    var name: String,
    var description: String,
    var photo: String,
    val lat: Double,
    val lang: Double
): Parcelable