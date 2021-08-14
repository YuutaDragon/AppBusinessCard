package com.application.bunsinesscard

import android.app.Application
import com.application.bunsinesscard.data.AppDatabase
import com.application.bunsinesscard.data.BusinessCardRepository

class App: Application() {
    val database by lazy { AppDatabase.getDatabase(this) }
    val repository by lazy { BusinessCardRepository(database.businessDao()) }
}