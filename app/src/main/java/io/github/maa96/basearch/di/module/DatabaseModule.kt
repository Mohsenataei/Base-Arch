package io.github.maa96.basearch.di.module

import android.content.Context
import androidx.room.Room
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import io.github.maa96.data.source.db.AppDataBase
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DatabaseModule {

    @Provides
    @Singleton
    fun provideRoomDatabase(context: Context): AppDataBase {
        return Room
            .databaseBuilder(context, AppDataBase::class.java, AppDataBase.DB_NAME)
            .fallbackToDestructiveMigration()
            .build()
    }
}