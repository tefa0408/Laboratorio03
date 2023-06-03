package com.example.danp2023room.model

import androidx.room.Dao
import androidx.room.Query
import androidx.room.Transaction
import com.example.danp2023room.entities.UnitWithStudents

@Dao
interface UnitDao {
    @Transaction
    @Query("SELECT * FROM unit")
    fun getUnitWithStudents(): List<UnitWithStudents>
}

