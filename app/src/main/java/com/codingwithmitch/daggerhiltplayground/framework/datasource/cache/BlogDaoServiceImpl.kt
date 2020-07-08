package com.codingwithmitch.daggerhiltplayground.framework.datasource.cache

import com.codingwithmitch.daggerhiltplayground.framework.datasource.cache.database.BlogDao
import com.codingwithmitch.daggerhiltplayground.framework.datasource.cache.model.BlogCacheEntity
import javax.inject.Inject

class BlogDaoServiceImpl
@Inject
constructor(
    private val blogDao: BlogDao
): BlogDaoService {

    override suspend fun insert(blogEntity: BlogCacheEntity): Long {
        return blogDao.insert(blogEntity)
    }

    override suspend fun get(): List<BlogCacheEntity> {
        return blogDao.get()
    }
}