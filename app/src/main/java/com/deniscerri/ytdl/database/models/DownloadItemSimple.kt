package com.deniscerri.ytdl.database.models

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.deniscerri.ytdl.database.viewmodel.DownloadViewModel

@Entity(tableName = "downloads")
data class DownloadItemSimple(
    @PrimaryKey(autoGenerate = true)
    var id: Long,
    var url: String,
    var title: String,
    var playlistTitle: String,
    var author: String,
    var thumb: String,
    var duration: String,
    var format: Format,
    @ColumnInfo(defaultValue = "Queued")
    var status: String,
    var logID: Long?,
    var type: DownloadViewModel.Type,
    @ColumnInfo(defaultValue = "0")
    var downloadStartTime: Long,
)