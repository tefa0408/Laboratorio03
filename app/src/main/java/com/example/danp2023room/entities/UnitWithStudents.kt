package com.example.danp2023room.entities

import androidx.room.Embedded
import androidx.room.Junction
import androidx.room.Relation

data class UnitWithStudents(
    @Embedded val unit: UnitEntity,
    @Relation(
        parentColumn = "unitId",
        entityColumn = "studentId",
        associateBy = Junction(UnitWithStudentsCrossRef::class)
    )
    val students: List<StudentEntity>
)
