package com.example.danp2023room.entities

import androidx.room.Entity

@Entity(primaryKeys = ["unitId", "studentId"])
data class UnitWithStudentsCrossRef(
    val unitId: Int,
    val studentId: Int
)
