package de.alekseipopov.fooddiary.data.model.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class DayRecordEntity (
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val date: Long
)